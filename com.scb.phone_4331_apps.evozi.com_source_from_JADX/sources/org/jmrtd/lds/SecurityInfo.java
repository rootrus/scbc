package org.jmrtd.lds;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.p061x9.X9ObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

public abstract class SecurityInfo extends AbstractLDSInfo {
    public static final String ID_AA = "2.23.136.1.1.5";
    private static final String ID_BSI = "0.4.0.127.0.7";
    public static final String ID_CA_DH_3DES_CBC_CBC = EACObjectIdentifiers.id_CA_DH_3DES_CBC_CBC.getId();
    public static final String ID_CA_DH_AES_CBC_CMAC_128 = "0.4.0.127.0.7.2.2.3.1.2";
    public static final String ID_CA_DH_AES_CBC_CMAC_192 = "0.4.0.127.0.7.2.2.3.1.3";
    public static final String ID_CA_DH_AES_CBC_CMAC_256 = "0.4.0.127.0.7.2.2.3.1.4";
    public static final String ID_CA_ECDH_3DES_CBC_CBC = EACObjectIdentifiers.id_CA_ECDH_3DES_CBC_CBC.getId();
    public static final String ID_CA_ECDH_AES_CBC_CMAC_128 = "0.4.0.127.0.7.2.2.3.2.2";
    public static final String ID_CA_ECDH_AES_CBC_CMAC_192 = "0.4.0.127.0.7.2.2.3.2.3";
    public static final String ID_CA_ECDH_AES_CBC_CMAC_256 = "0.4.0.127.0.7.2.2.3.2.4";
    public static final String ID_EC_PUBLIC_KEY = X9ObjectIdentifiers.id_ecPublicKey.getId();
    public static final String ID_EC_PUBLIC_KEY_TYPE = X9ObjectIdentifiers.id_publicKeyType.getId();
    public static final String ID_PACE = "0.4.0.127.0.7.2.2.4";
    public static final String ID_PACE_DH_GM = "0.4.0.127.0.7.2.2.4.1";
    public static final String ID_PACE_DH_GM_3DES_CBC_CBC = "0.4.0.127.0.7.2.2.4.1.1";
    public static final String ID_PACE_DH_GM_AES_CBC_CMAC_128 = "0.4.0.127.0.7.2.2.4.1.2";
    public static final String ID_PACE_DH_GM_AES_CBC_CMAC_192 = "0.4.0.127.0.7.2.2.4.1.3";
    public static final String ID_PACE_DH_GM_AES_CBC_CMAC_256 = "0.4.0.127.0.7.2.2.4.1.4";
    public static final String ID_PACE_DH_IM = "0.4.0.127.0.7.2.2.4.3";
    public static final String ID_PACE_DH_IM_3DES_CBC_CBC = "0.4.0.127.0.7.2.2.4.3.1";
    public static final String ID_PACE_DH_IM_AES_CBC_CMAC_128 = "0.4.0.127.0.7.2.2.4.3.2";
    public static final String ID_PACE_DH_IM_AES_CBC_CMAC_192 = "0.4.0.127.0.7.2.2.4.3.3";
    public static final String ID_PACE_DH_IM_AES_CBC_CMAC_256 = "0.4.0.127.0.7.2.2.4.3.4";
    public static final String ID_PACE_ECDH_CAM = "0.4.0.127.0.7.2.2.4.6";
    public static final String ID_PACE_ECDH_CAM_AES_CBC_CMAC_128 = "0.4.0.127.0.7.2.2.4.6.2";
    public static final String ID_PACE_ECDH_CAM_AES_CBC_CMAC_192 = "0.4.0.127.0.7.2.2.4.6.3";
    public static final String ID_PACE_ECDH_CAM_AES_CBC_CMAC_256 = "0.4.0.127.0.7.2.2.4.6.4";
    public static final String ID_PACE_ECDH_GM = "0.4.0.127.0.7.2.2.4.2";
    public static final String ID_PACE_ECDH_GM_3DES_CBC_CBC = "0.4.0.127.0.7.2.2.4.2.1";
    public static final String ID_PACE_ECDH_GM_AES_CBC_CMAC_128 = "0.4.0.127.0.7.2.2.4.2.2";
    public static final String ID_PACE_ECDH_GM_AES_CBC_CMAC_192 = "0.4.0.127.0.7.2.2.4.2.3";
    public static final String ID_PACE_ECDH_GM_AES_CBC_CMAC_256 = "0.4.0.127.0.7.2.2.4.2.4";
    public static final String ID_PACE_ECDH_IM = "0.4.0.127.0.7.2.2.4.4";
    public static final String ID_PACE_ECDH_IM_3DES_CBC_CBC = "0.4.0.127.0.7.2.2.4.4.1";
    public static final String ID_PACE_ECDH_IM_AES_CBC_CMAC_128 = "0.4.0.127.0.7.2.2.4.4.2";
    public static final String ID_PACE_ECDH_IM_AES_CBC_CMAC_192 = "0.4.0.127.0.7.2.2.4.4.3";
    public static final String ID_PACE_ECDH_IM_AES_CBC_CMAC_256 = "0.4.0.127.0.7.2.2.4.4.4";
    public static final String ID_PK_DH = EACObjectIdentifiers.id_PK_DH.getId();
    public static final String ID_PK_ECDH = EACObjectIdentifiers.id_PK_ECDH.getId();
    public static final String ID_TA = EACObjectIdentifiers.id_TA.getId();
    public static final String ID_TA_ECDSA = EACObjectIdentifiers.id_TA_ECDSA.getId();
    public static final String ID_TA_ECDSA_SHA_1 = EACObjectIdentifiers.id_TA_ECDSA_SHA_1.getId();
    public static final String ID_TA_ECDSA_SHA_224 = EACObjectIdentifiers.id_TA_ECDSA_SHA_224.getId();
    public static final String ID_TA_ECDSA_SHA_256 = EACObjectIdentifiers.id_TA_ECDSA_SHA_256.getId();
    public static final String ID_TA_RSA = EACObjectIdentifiers.id_TA_RSA.getId();
    public static final String ID_TA_RSA_PSS_SHA_1 = EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1.getId();
    public static final String ID_TA_RSA_PSS_SHA_256 = EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256.getId();
    public static final String ID_TA_RSA_V1_5_SHA_1 = EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1.getId();
    public static final String ID_TA_RSA_V1_5_SHA_256 = EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256.getId();
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -7919854443619069808L;

    public abstract ASN1Primitive getDERObject();

    public abstract String getObjectIdentifier();

    public abstract String getProtocolOIDString();

    public void writeObject(OutputStream outputStream) throws IOException {
        ASN1Primitive dERObject = getDERObject();
        if (dERObject != null) {
            byte[] encoded = dERObject.getEncoded(ASN1Encoding.DER);
            if (encoded != null) {
                outputStream.write(encoded);
                return;
            }
            throw new IOException("Could not decode from DER.");
        }
        throw new IOException("Could not decode from DER.");
    }

    public static SecurityInfo getInstance(ASN1Primitive aSN1Primitive) {
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            String id = ((ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0)).getId();
            ASN1Primitive aSN1Primitive2 = aSN1Sequence.getObjectAt(1).toASN1Primitive();
            ASN1Primitive aSN1Primitive3 = aSN1Sequence.size() == 3 ? aSN1Sequence.getObjectAt(2).toASN1Primitive() : null;
            if (ActiveAuthenticationInfo.checkRequiredIdentifier(id)) {
                int intValue = ((ASN1Integer) aSN1Primitive2).getValue().intValue();
                if (aSN1Primitive3 == null) {
                    return new ActiveAuthenticationInfo(id, intValue, (String) null);
                }
                return new ActiveAuthenticationInfo(id, intValue, ((ASN1ObjectIdentifier) aSN1Primitive3).getId());
            } else if (ChipAuthenticationPublicKeyInfo.checkRequiredIdentifier(id)) {
                SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo((ASN1Sequence) aSN1Primitive2);
                if (aSN1Primitive3 == null) {
                    return new ChipAuthenticationPublicKeyInfo(id, subjectPublicKeyInfo);
                }
                return new ChipAuthenticationPublicKeyInfo(id, subjectPublicKeyInfo, ((ASN1Integer) aSN1Primitive3).getValue());
            } else if (ChipAuthenticationInfo.checkRequiredIdentifier(id)) {
                int intValue2 = ((ASN1Integer) aSN1Primitive2).getValue().intValue();
                if (aSN1Primitive3 == null) {
                    return new ChipAuthenticationInfo(id, intValue2);
                }
                return new ChipAuthenticationInfo(id, intValue2, ((ASN1Integer) aSN1Primitive3).getValue());
            } else if (TerminalAuthenticationInfo.checkRequiredIdentifier(id)) {
                int intValue3 = ((ASN1Integer) aSN1Primitive2).getValue().intValue();
                if (aSN1Primitive3 == null) {
                    return new TerminalAuthenticationInfo(id, intValue3);
                }
                return new TerminalAuthenticationInfo(id, intValue3, (ASN1Sequence) aSN1Primitive3);
            } else if (PACEInfo.checkRequiredIdentifier(id)) {
                int intValue4 = ((ASN1Integer) aSN1Primitive2).getValue().intValue();
                int i = -1;
                if (aSN1Primitive3 != null) {
                    i = ((ASN1Integer) aSN1Primitive3).getValue().intValue();
                }
                return new PACEInfo(id, intValue4, i);
            } else if (PACEDomainParameterInfo.checkRequiredIdentifier(id)) {
                AlgorithmIdentifier instance = AlgorithmIdentifier.getInstance(aSN1Primitive2);
                if (aSN1Primitive3 != null) {
                    return new PACEDomainParameterInfo(id, instance, ((ASN1Integer) aSN1Primitive3).getValue());
                }
                return new PACEDomainParameterInfo(id, instance);
            } else {
                Logger logger = LOGGER;
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported SecurityInfo, oid = ");
                sb.append(id);
                logger.warning(sb.toString());
                return null;
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Exception", e);
            throw new IllegalArgumentException("Malformed input stream.");
        }
    }
}
