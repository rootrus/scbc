package org.jmrtd.protocol;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.logging.Logger;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPublicKey;
import net.p088sf.scuba.smartcards.CardServiceException;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jmrtd.PassportService;
import org.jmrtd.Util;
import org.jmrtd.lds.ChipAuthenticationInfo;
import org.jmrtd.lds.ChipAuthenticationPublicKeyInfo;

public class CAProtocol {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private PassportService service;
    private SecureMessagingWrapper wrapper;

    public CAProtocol(PassportService passportService, SecureMessagingWrapper secureMessagingWrapper) {
        this.service = passportService;
        this.wrapper = secureMessagingWrapper;
    }

    public CAResult doCA(BigInteger bigInteger, String str, String str2, PublicKey publicKey) throws CardServiceException {
        if (publicKey != null) {
            String keyAgreementAlgorithm = ChipAuthenticationInfo.toKeyAgreementAlgorithm(str);
            if (keyAgreementAlgorithm == null) {
                throw new IllegalArgumentException("Unknown agreement algorithm");
            } else if ("ECDH".equals(keyAgreementAlgorithm) || "DH".equals(keyAgreementAlgorithm)) {
                if (str == null) {
                    str = inferChipAuthenticationOIDfromPublicKeyOID(str2);
                }
                AlgorithmParameterSpec algorithmParameterSpec = null;
                try {
                    if ("DH".equals(keyAgreementAlgorithm)) {
                        algorithmParameterSpec = ((DHPublicKey) publicKey).getParams();
                    } else if ("ECDH".equals(keyAgreementAlgorithm)) {
                        algorithmParameterSpec = ((ECPublicKey) publicKey).getParams();
                    }
                    KeyPairGenerator instance = KeyPairGenerator.getInstance(keyAgreementAlgorithm);
                    instance.initialize(algorithmParameterSpec);
                    KeyPair generateKeyPair = instance.generateKeyPair();
                    PublicKey publicKey2 = generateKeyPair.getPublic();
                    PrivateKey privateKey = generateKeyPair.getPrivate();
                    sendPublicKey(this.service, this.wrapper, str, bigInteger, publicKey2);
                    byte[] keyHash = getKeyHash(keyAgreementAlgorithm, publicKey2);
                    SecureMessagingWrapper restartSecureMessaging = restartSecureMessaging(str, computeSharedSecret(keyAgreementAlgorithm, publicKey, privateKey));
                    this.wrapper = restartSecureMessaging;
                    return new CAResult(bigInteger, publicKey, keyHash, publicKey2, privateKey, restartSecureMessaging);
                } catch (GeneralSecurityException e) {
                    throw new CardServiceException(e.toString());
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported agreement algorithm, expected ECDH or DH, found ");
                sb.append(keyAgreementAlgorithm);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("PICC public key is null");
        }
    }

    public static void sendPublicKey(PassportService passportService, SecureMessagingWrapper secureMessagingWrapper, String str, BigInteger bigInteger, PublicKey publicKey) throws CardServiceException {
        String keyAgreementAlgorithm = ChipAuthenticationInfo.toKeyAgreementAlgorithm(str);
        String cipherAlgorithm = ChipAuthenticationInfo.toCipherAlgorithm(str);
        byte[] keyData = getKeyData(keyAgreementAlgorithm, publicKey);
        if (cipherAlgorithm.startsWith("DESede")) {
            byte[] bArr = null;
            if (bigInteger != null) {
                bArr = Util.wrapDO((byte) -124, bigInteger.toByteArray());
            }
            passportService.sendMSEKAT(secureMessagingWrapper, Util.wrapDO((byte) -111, keyData), bArr);
        } else if (cipherAlgorithm.startsWith("AES")) {
            passportService.sendMSESetATIntAuth(secureMessagingWrapper, str, bigInteger);
            passportService.sendGeneralAuthenticate(secureMessagingWrapper, Util.wrapDO(ISOFileInfo.DATA_BYTES1, keyData), true);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot set up secure channel with cipher ");
            sb.append(cipherAlgorithm);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static byte[] computeSharedSecret(String str, PublicKey publicKey, PrivateKey privateKey) throws NoSuchAlgorithmException, InvalidKeyException {
        KeyAgreement instance = KeyAgreement.getInstance(str);
        instance.init(privateKey);
        instance.doPhase(publicKey, true);
        return instance.generateSecret();
    }

    public static SecureMessagingWrapper restartSecureMessaging(String str, byte[] bArr) throws GeneralSecurityException {
        String cipherAlgorithm = ChipAuthenticationInfo.toCipherAlgorithm(str);
        int keyLength = ChipAuthenticationInfo.toKeyLength(str);
        SecretKey deriveKey = Util.deriveKey(bArr, cipherAlgorithm, keyLength, 1);
        SecretKey deriveKey2 = Util.deriveKey(bArr, cipherAlgorithm, keyLength, 2);
        if (cipherAlgorithm.startsWith("DESede")) {
            return new DESedeSecureMessagingWrapper(deriveKey, deriveKey2, 0);
        }
        if (cipherAlgorithm.startsWith("AES")) {
            return new AESSecureMessagingWrapper(deriveKey, deriveKey2, 0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported cipher algorithm ");
        sb.append(cipherAlgorithm);
        throw new IllegalStateException(sb.toString());
    }

    public SecureMessagingWrapper getWrapper() {
        return this.wrapper;
    }

    private static byte[] getKeyHash(String str, PublicKey publicKey) throws NoSuchAlgorithmException {
        if ("DH".equals(str)) {
            MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            return MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(getKeyData(str, publicKey));
        } else if ("ECDH".equals(str)) {
            org.bouncycastle.jce.interfaces.ECPublicKey eCPublicKey = (org.bouncycastle.jce.interfaces.ECPublicKey) publicKey;
            return Util.alignKeyDataToSize(Util.i2os(eCPublicKey.getQ().getX().toBigInteger()), eCPublicKey.getParameters().getCurve().getFieldSize() / 8);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported agreement algorithm ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static byte[] getKeyData(String str, PublicKey publicKey) {
        if ("DH".equals(str)) {
            return ((DHPublicKey) publicKey).getY().toByteArray();
        }
        if ("ECDH".equals(str)) {
            return ((org.bouncycastle.jce.interfaces.ECPublicKey) publicKey).getQ().getEncoded();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported agreement algorithm ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String inferChipAuthenticationOIDfromPublicKeyOID(String str) {
        if (ChipAuthenticationPublicKeyInfo.ID_PK_ECDH.equals(str)) {
            LOGGER.warning("Could not determine ChipAuthentication algorithm, defaulting to id-CA-ECDH-3DES-CBC-CBC");
            return ChipAuthenticationInfo.ID_CA_ECDH_3DES_CBC_CBC;
        } else if (ChipAuthenticationPublicKeyInfo.ID_PK_DH.equals(str)) {
            LOGGER.warning("Could not determine ChipAuthentication algorithm, defaulting to id-CA-DH-3DES-CBC-CBC");
            return ChipAuthenticationInfo.ID_CA_DH_3DES_CBC_CBC;
        } else {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("No ChipAuthenticationInfo and unsupported ChipAuthenticationPublicKeyInfo public key OID ");
            sb.append(str);
            logger.severe(sb.toString());
            return null;
        }
    }
}
