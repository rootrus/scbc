package org.jmrtd.protocol;

import java.io.ByteArrayOutputStream;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.List;
import java.util.logging.Logger;
import net.p088sf.scuba.smartcards.CardServiceException;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import net.p088sf.scuba.tlv.TLVOutputStream;
import org.bouncycastle.i18n.LocalizedMessage;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.jmrtd.PassportService;
import org.jmrtd.Util;
import org.jmrtd.cert.CVCAuthorizationTemplate;
import org.jmrtd.cert.CVCPrincipal;
import org.jmrtd.cert.CardVerifiableCertificate;
import org.jmrtd.lds.icao.MRZInfo;

public class TAProtocol {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final int TAG_CVCERTIFICATE_SIGNATURE = 24375;
    private PassportService service;
    private SecureMessagingWrapper wrapper;

    public TAProtocol(PassportService passportService, SecureMessagingWrapper secureMessagingWrapper) {
        this.service = passportService;
        this.wrapper = secureMessagingWrapper;
    }

    public TAResult doTA(CVCPrincipal cVCPrincipal, List<CardVerifiableCertificate> list, PrivateKey privateKey, String str, CAResult cAResult, String str2) throws CardServiceException {
        TAResult tAResult;
        synchronized (this) {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        byte[] keyHash = cAResult.getKeyHash();
                        if (keyHash != null) {
                            CardVerifiableCertificate cardVerifiableCertificate = list.get(0);
                            if (CVCAuthorizationTemplate.Role.CVCA.equals(cardVerifiableCertificate.getAuthorizationTemplate().getRole())) {
                                CVCPrincipal holderReference = cardVerifiableCertificate.getHolderReference();
                                if (cVCPrincipal != null) {
                                    if (!cVCPrincipal.equals(holderReference)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("First certificate holds wrong authority, found \"");
                                        sb.append(holderReference.getName());
                                        sb.append("\", expected \"");
                                        sb.append(cVCPrincipal.getName());
                                        sb.append("\"");
                                        throw new CardServiceException(sb.toString());
                                    }
                                }
                                if (cVCPrincipal == null) {
                                    cVCPrincipal = holderReference;
                                }
                                list.remove(0);
                            }
                            CVCPrincipal authorityReference = cardVerifiableCertificate.getAuthorityReference();
                            if (cVCPrincipal != null) {
                                if (!cVCPrincipal.equals(authorityReference)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("First certificate not signed by expected CA, found ");
                                    sb2.append(authorityReference.getName());
                                    sb2.append(",  expected ");
                                    sb2.append(cVCPrincipal.getName());
                                    throw new CardServiceException(sb2.toString());
                                }
                            }
                            CVCPrincipal cVCPrincipal2 = cVCPrincipal != null ? cVCPrincipal : authorityReference;
                            CardVerifiableCertificate cardVerifiableCertificate2 = list.get(list.size() - 1);
                            CVCAuthorizationTemplate.Role role = cardVerifiableCertificate2.getAuthorizationTemplate().getRole();
                            if (CVCAuthorizationTemplate.Role.IS.equals(role)) {
                                for (CardVerifiableCertificate next : list) {
                                    this.service.sendMSESetDST(this.wrapper, Util.wrapDO(ISOFileInfo.FILE_IDENTIFIER, next.getAuthorityReference().getName().getBytes(LocalizedMessage.DEFAULT_ENCODING)));
                                    byte[] certBodyData = next.getCertBodyData();
                                    byte[] signature = next.getSignature();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    TLVOutputStream tLVOutputStream = new TLVOutputStream(byteArrayOutputStream);
                                    tLVOutputStream.IconCompatParcelizer(24375);
                                    tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(signature);
                                    tLVOutputStream.close();
                                    this.service.sendPSOExtendedLengthMode(this.wrapper, certBodyData, byteArrayOutputStream.toByteArray());
                                }
                                if (privateKey != null) {
                                    this.service.sendMSESetATExtAuth(this.wrapper, Util.wrapDO(ISOFileInfo.FILE_IDENTIFIER, cardVerifiableCertificate2.getHolderReference().getName().getBytes(LocalizedMessage.DEFAULT_ENCODING)));
                                    byte[] sendGetChallenge = this.service.sendGetChallenge(this.wrapper);
                                    int length = str2.length() + 1;
                                    byte[] bArr = new byte[length];
                                    System.arraycopy(str2.getBytes(LocalizedMessage.DEFAULT_ENCODING), 0, bArr, 0, str2.length());
                                    bArr[length - 1] = (byte) MRZInfo.checkDigit(str2);
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    byteArrayOutputStream2.write(bArr);
                                    byteArrayOutputStream2.write(sendGetChallenge);
                                    byteArrayOutputStream2.write(keyHash);
                                    byteArrayOutputStream2.close();
                                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                    String sigAlgName = cardVerifiableCertificate2.getSigAlgName();
                                    if (sigAlgName != null) {
                                        Signature instance = Signature.getInstance(sigAlgName);
                                        instance.initSign(privateKey);
                                        instance.update(byteArray);
                                        byte[] sign = instance.sign();
                                        if (sigAlgName.toUpperCase().endsWith("ECDSA")) {
                                            sign = Util.getRawECDSASignature(sign, ((ECPrivateKey) privateKey).getParameters().getCurve().getFieldSize() / 8);
                                        }
                                        this.service.sendMutualAuthenticate(this.wrapper, sign);
                                        tAResult = new TAResult(cAResult, cVCPrincipal2, list, privateKey, str2, sendGetChallenge);
                                    } else {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("ERROR: Could not determine signature algorithm for terminal certificate ");
                                        sb3.append(cardVerifiableCertificate2.getHolderReference().getName());
                                        throw new IllegalStateException(sb3.toString());
                                    }
                                } else {
                                    throw new CardServiceException("No terminal key");
                                }
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Last certificate in chain (");
                                sb4.append(cardVerifiableCertificate2.getHolderReference().getName());
                                sb4.append(") does not have role IS, but has role ");
                                sb4.append(role);
                                throw new CardServiceException(sb4.toString());
                            }
                        } else {
                            throw new IllegalArgumentException("CA key hash is null");
                        }
                    }
                } catch (CardServiceException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new CardServiceException(e2.getMessage());
                } catch (CardServiceException e3) {
                    throw e3;
                } catch (Exception e4) {
                    throw new CardServiceException(e4.toString());
                }
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Need at least 1 certificate to perform TA, found: ");
            sb5.append(list);
            throw new IllegalArgumentException(sb5.toString());
        }
        return tAResult;
    }
}
