package org.jmrtd.protocol;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import net.p088sf.scuba.smartcards.CardServiceException;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jmrtd.BACKeySpec;
import org.jmrtd.CANKey;
import org.jmrtd.JMRTDSecurityProvider;
import org.jmrtd.PACEException;
import org.jmrtd.PassportService;
import org.jmrtd.Util;
import org.jmrtd.lds.PACEInfo;
import p040o.AlertController$RecycleListView;

public class PACEProtocol {
    private static final Provider BC_PROVIDER = JMRTDSecurityProvider.getBouncyCastleProvider();
    private static final byte[] IV_FOR_PACE_CAM_DECRYPTION = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private Random random = new SecureRandom();
    private PassportService service;
    private SecureMessagingWrapper wrapper;

    private void pseudoRandomFunction(byte[] bArr, byte[] bArr2, Cipher cipher) {
    }

    public PACEProtocol(PassportService passportService, SecureMessagingWrapper secureMessagingWrapper) {
        this.service = passportService;
        this.wrapper = secureMessagingWrapper;
    }

    public PACEResult doPACE(KeySpec keySpec, String str, AlgorithmParameterSpec algorithmParameterSpec) throws PACEException {
        try {
            return doPACE(deriveStaticPACEKey(keySpec, str), str, algorithmParameterSpec);
        } catch (GeneralSecurityException unused) {
            throw new PACEException("PCD side error in key derivation step");
        }
    }

    public PACEResult doPACE(SecretKey secretKey, String str, AlgorithmParameterSpec algorithmParameterSpec) throws PACEException {
        byte[] bArr;
        byte[] bArr2;
        String str2 = str;
        PACEInfo.MappingType mappingType = PACEInfo.toMappingType(str);
        String keyAgreementAlgorithm = PACEInfo.toKeyAgreementAlgorithm(str);
        String cipherAlgorithm = PACEInfo.toCipherAlgorithm(str);
        String digestAlgorithm = PACEInfo.toDigestAlgorithm(str);
        int keyLength = PACEInfo.toKeyLength(str);
        Logger logger = LOGGER;
        StringBuilder sb = new StringBuilder();
        sb.append("DEBUG: PACE: oid = ");
        sb.append(str2);
        sb.append(" -> mappingType = ");
        sb.append(mappingType);
        sb.append(", agreementAlg = ");
        sb.append(keyAgreementAlgorithm);
        sb.append(", cipherAlg = ");
        sb.append(cipherAlgorithm);
        sb.append(", digestAlg = ");
        sb.append(digestAlgorithm);
        sb.append(", keyLength = ");
        sb.append(keyLength);
        logger.info(sb.toString());
        checkConsistency(keyAgreementAlgorithm, cipherAlgorithm, digestAlgorithm, keyLength, algorithmParameterSpec);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cipherAlgorithm);
            sb2.append("/CBC/NoPadding");
            Cipher instance = Cipher.getInstance(sb2.toString());
            try {
                this.service.sendMSESetATMutualAuth(this.wrapper, str2, 1, (byte[]) null);
                byte[] doPACEStep1 = doPACEStep1(secretKey, instance);
                AlgorithmParameterSpec doPACEStep2 = doPACEStep2(mappingType, keyAgreementAlgorithm, algorithmParameterSpec, doPACEStep1);
                KeyPair doPACEStep3GenerateKeyPair = doPACEStep3GenerateKeyPair(keyAgreementAlgorithm, doPACEStep2);
                PublicKey doPACEStep3ExchangePublicKeys = doPACEStep3ExchangePublicKeys(doPACEStep3GenerateKeyPair.getPublic(), doPACEStep2);
                byte[] doPACEStep3KeyAgreement = doPACEStep3KeyAgreement(keyAgreementAlgorithm, doPACEStep3GenerateKeyPair.getPrivate(), doPACEStep3ExchangePublicKeys);
                try {
                    SecretKey deriveKey = Util.deriveKey(doPACEStep3KeyAgreement, cipherAlgorithm, keyLength, 1);
                    SecretKey deriveKey2 = Util.deriveKey(doPACEStep3KeyAgreement, cipherAlgorithm, keyLength, 2);
                    byte[] bArr3 = doPACEStep3KeyAgreement;
                    SecretKey secretKey2 = deriveKey;
                    PublicKey publicKey = doPACEStep3ExchangePublicKeys;
                    AlgorithmParameterSpec algorithmParameterSpec2 = doPACEStep2;
                    byte[] doPACEStep4 = doPACEStep4(str, mappingType, doPACEStep3GenerateKeyPair, doPACEStep3ExchangePublicKeys, deriveKey2);
                    try {
                        if (cipherAlgorithm.startsWith("DESede")) {
                            this.wrapper = new DESedeSecureMessagingWrapper(secretKey2, deriveKey2);
                        } else {
                            SecretKey secretKey3 = deriveKey2;
                            if (cipherAlgorithm.startsWith("AES")) {
                                this.wrapper = new AESSecureMessagingWrapper(secretKey2, secretKey3, this.wrapper == null ? 0 : this.wrapper.getSendSequenceCounter());
                            }
                        }
                        if (PACEInfo.MappingType.CAM.equals(mappingType)) {
                            if (doPACEStep4 == null) {
                                LOGGER.severe("Encrypted Chip Authentication data is null");
                            }
                            try {
                                Cipher instance2 = Cipher.getInstance("AES/CBC/NoPadding");
                                instance2.init(2, secretKey2, new IvParameterSpec(IV_FOR_PACE_CAM_DECRYPTION));
                                bArr2 = Util.unpad(instance2.doFinal(doPACEStep4));
                                try {
                                    LOGGER.info("DEBUG: Including Chip Authentication data in PACE result");
                                } catch (GeneralSecurityException e) {
                                    e = e;
                                }
                            } catch (GeneralSecurityException e2) {
                                e = e2;
                                bArr2 = null;
                                LOGGER.log(Level.SEVERE, "Could not decrypt Chip Authentication data", e);
                                bArr = bArr2;
                                return new PACEResult(mappingType, keyAgreementAlgorithm, cipherAlgorithm, digestAlgorithm, keyLength, algorithmParameterSpec, doPACEStep1, algorithmParameterSpec2, doPACEStep3GenerateKeyPair, publicKey, bArr3, doPACEStep4, bArr, this.wrapper);
                            }
                            bArr = bArr2;
                        } else {
                            bArr = null;
                        }
                        return new PACEResult(mappingType, keyAgreementAlgorithm, cipherAlgorithm, digestAlgorithm, keyLength, algorithmParameterSpec, doPACEStep1, algorithmParameterSpec2, doPACEStep3GenerateKeyPair, publicKey, bArr3, doPACEStep4, bArr, this.wrapper);
                    } catch (GeneralSecurityException e3) {
                        Logger logger2 = LOGGER;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Exception: ");
                        sb3.append(e3.getMessage());
                        logger2.severe(sb3.toString());
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Security exception in secure messaging establishment: ");
                        sb4.append(e3.getMessage());
                        throw new IllegalStateException(sb4.toString());
                    }
                } catch (GeneralSecurityException e4) {
                    LOGGER.log(Level.SEVERE, "Security exception during secure messaging key derivation", e4);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Security exception during secure messaging key derivation: ");
                    sb5.append(e4.getMessage());
                    throw new PACEException(sb5.toString());
                }
            } catch (CardServiceException e5) {
                throw new PACEException("PICC side error in static PACE key derivation step", e5.getSW());
            }
        } catch (GeneralSecurityException unused) {
            throw new PACEException("PCD side error in static cipher construction during key derivation step");
        }
    }

    public byte[] doPACEStep1(SecretKey secretKey, Cipher cipher) throws PACEException {
        try {
            byte[] unwrapDO = Util.unwrapDO(ISOFileInfo.DATA_BYTES1, this.service.sendGeneralAuthenticate(this.wrapper, new byte[0], false));
            cipher.init(2, secretKey, new IvParameterSpec(new byte[cipher.getBlockSize()]));
            return cipher.doFinal(unwrapDO);
        } catch (GeneralSecurityException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PCD side exception in tranceiving nonce step: ");
            sb2.append(e.getMessage());
            throw new PACEException(sb2.toString());
        } catch (CardServiceException e2) {
            throw new PACEException("PICC side exception in tranceiving nonce step", e2.getSW());
        }
    }

    /* renamed from: org.jmrtd.protocol.PACEProtocol$1 */
    static /* synthetic */ class C105051 {
        static final /* synthetic */ int[] $SwitchMap$org$jmrtd$lds$PACEInfo$MappingType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                org.jmrtd.lds.PACEInfo$MappingType[] r0 = org.jmrtd.lds.PACEInfo.MappingType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jmrtd$lds$PACEInfo$MappingType = r0
                org.jmrtd.lds.PACEInfo$MappingType r1 = org.jmrtd.lds.PACEInfo.MappingType.CAM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$jmrtd$lds$PACEInfo$MappingType     // Catch:{ NoSuchFieldError -> 0x001d }
                org.jmrtd.lds.PACEInfo$MappingType r1 = org.jmrtd.lds.PACEInfo.MappingType.GM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$org$jmrtd$lds$PACEInfo$MappingType     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.jmrtd.lds.PACEInfo$MappingType r1 = org.jmrtd.lds.PACEInfo.MappingType.IM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.protocol.PACEProtocol.C105051.<clinit>():void");
        }
    }

    public AlgorithmParameterSpec doPACEStep2(PACEInfo.MappingType mappingType, String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr) throws PACEException {
        int i = C105051.$SwitchMap$org$jmrtd$lds$PACEInfo$MappingType[mappingType.ordinal()];
        if (i == 1 || i == 2) {
            return doPACEStep2GM(str, algorithmParameterSpec, bArr);
        }
        if (i == 3) {
            return doPACEStep2IM(str, algorithmParameterSpec, bArr);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported mapping type ");
        sb.append(mappingType);
        throw new PACEException(sb.toString());
    }

    public AlgorithmParameterSpec doPACEStep2GM(String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr) throws PACEException {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance(str, BC_PROVIDER);
            instance.initialize(algorithmParameterSpec);
            KeyPair generateKeyPair = instance.generateKeyPair();
            PublicKey publicKey = generateKeyPair.getPublic();
            PrivateKey privateKey = generateKeyPair.getPrivate();
            KeyAgreement instance2 = KeyAgreement.getInstance(str);
            instance2.init(privateKey);
            MyECDHKeyAgreement myECDHKeyAgreement = null;
            if ("ECDH".equals(str)) {
                myECDHKeyAgreement = new MyECDHKeyAgreement();
                myECDHKeyAgreement.init((ECPrivateKey) privateKey);
            }
            PublicKey decodePublicKeyFromSmartCard = Util.decodePublicKeyFromSmartCard(Util.unwrapDO((byte) -126, this.service.sendGeneralAuthenticate(this.wrapper, Util.wrapDO(ISOFileInfo.DATA_BYTES2, Util.encodePublicKeyForSmartCard(publicKey)), false)), algorithmParameterSpec);
            instance2.doPhase(decodePublicKeyFromSmartCard, true);
            byte[] generateSecret = instance2.generateSecret();
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("DEBUG: mappingSharedSecretBytes = ");
            sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(generateSecret));
            logger.info(sb.toString());
            if ("ECDH".equals(str) && myECDHKeyAgreement != null) {
                ECPoint doPhase = myECDHKeyAgreement.doPhase((ECPublicKey) decodePublicKeyFromSmartCard);
                LOGGER.info("DEBUG: calling mapNonceGMWithECDH directly");
                Logger logger2 = LOGGER;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DEBUG: Affine X = ");
                sb2.append(doPhase.getAffineX());
                logger2.info(sb2.toString());
                Logger logger3 = LOGGER;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("DEBUG: Affine Y = ");
                sb3.append(doPhase.getAffineY());
                logger3.info(sb3.toString());
                return Util.mapNonceGMWithECDH(Util.os2i(bArr), doPhase, (ECParameterSpec) algorithmParameterSpec);
            } else if ("DH".equals(str)) {
                return Util.mapNonceGMWithDH(Util.os2i(bArr), Util.os2i(generateSecret), (DHParameterSpec) algorithmParameterSpec);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Unsupported parameters for mapping nonce, expected ECParameterSpec or DHParameterSpec, found ");
                sb4.append(algorithmParameterSpec.getClass().getCanonicalName());
                throw new IllegalArgumentException(sb4.toString());
            }
        } catch (GeneralSecurityException e) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("PCD side error in mapping nonce step: ");
            sb5.append(e.getMessage());
            throw new PACEException(sb5.toString());
        } catch (CardServiceException e2) {
            throw new PACEException("PICC side exception in mapping nonce step", e2.getSW());
        }
    }

    public AlgorithmParameterSpec doPACEStep2IM(String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr) throws PACEException {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance(str, BC_PROVIDER);
            instance.initialize(algorithmParameterSpec);
            KeyPair generateKeyPair = instance.generateKeyPair();
            generateKeyPair.getPublic();
            KeyAgreement.getInstance(str).init(generateKeyPair.getPrivate());
            byte[] bArr2 = new byte[bArr.length];
            this.random.nextBytes(bArr2);
            pseudoRandomFunction(bArr, bArr2, (Cipher) null);
            throw new PACEException("Integrated Mapping not yet implemented");
        } catch (GeneralSecurityException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("PCD side error in mapping nonce step: ");
            sb.append(e.getMessage());
            throw new PACEException(sb.toString());
        } catch (CardServiceException e2) {
            throw new PACEException("PICC side exception in mapping nonce step", e2.getSW());
        }
    }

    public KeyPair doPACEStep3GenerateKeyPair(String str, AlgorithmParameterSpec algorithmParameterSpec) throws PACEException {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance(str, BC_PROVIDER);
            instance.initialize(algorithmParameterSpec);
            return instance.generateKeyPair();
        } catch (GeneralSecurityException unused) {
            throw new PACEException("PCD side error during generation of PCD key pair");
        }
    }

    public PublicKey doPACEStep3ExchangePublicKeys(PublicKey publicKey, AlgorithmParameterSpec algorithmParameterSpec) throws PACEException {
        try {
            PublicKey decodePublicKeyFromSmartCard = Util.decodePublicKeyFromSmartCard(Util.unwrapDO((byte) -124, this.service.sendGeneralAuthenticate(this.wrapper, Util.wrapDO(ISOFileInfo.FILE_IDENTIFIER, Util.encodePublicKeyForSmartCard(publicKey)), false)), algorithmParameterSpec);
            if (!publicKey.equals(decodePublicKeyFromSmartCard)) {
                return decodePublicKeyFromSmartCard;
            }
            throw new PACEException("PCD's public key and PICC's public key are the same in key agreement step!");
        } catch (IllegalStateException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("PCD side exception in key agreement step: ");
            sb.append(e.getMessage());
            throw new PACEException(sb.toString());
        } catch (GeneralSecurityException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PCD side exception in key agreement step: ");
            sb2.append(e2.getMessage());
            throw new PACEException(sb2.toString());
        } catch (CardServiceException e3) {
            throw new PACEException("PICC side exception in key agreement step", e3.getSW());
        }
    }

    public byte[] doPACEStep3KeyAgreement(String str, PrivateKey privateKey, PublicKey publicKey) throws PACEException {
        try {
            KeyAgreement instance = KeyAgreement.getInstance(str, BC_PROVIDER);
            instance.init(privateKey);
            instance.doPhase(updateParameterSpec(publicKey, privateKey), true);
            return instance.generateSecret();
        } catch (GeneralSecurityException e) {
            LOGGER.log(Level.SEVERE, "PCD side error during key agreement", e);
            throw new PACEException("PCD side error during key agreement");
        }
    }

    public byte[] doPACEStep4(String str, PACEInfo.MappingType mappingType, KeyPair keyPair, PublicKey publicKey, SecretKey secretKey) throws PACEException {
        try {
            byte[] wrapDO = Util.wrapDO(ISOFileInfo.PROP_INFO, generateAuthenticationToken(str, secretKey, publicKey));
            if (!Arrays.equals(generateAuthenticationToken(str, secretKey, keyPair.getPublic()), Util.unwrapDO((byte) -122, this.service.sendGeneralAuthenticate(this.wrapper, wrapDO, true)))) {
                throw new GeneralSecurityException("PICC authentication token mismatch");
            } else if (mappingType == PACEInfo.MappingType.CAM) {
                return Util.unwrapDO(ISOFileInfo.LCS_BYTE, wrapDO);
            } else {
                return null;
            }
        } catch (GeneralSecurityException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("PCD side exception in authentication token generation step: ");
            sb.append(e.getMessage());
            throw new PACEException(sb.toString());
        } catch (CardServiceException e2) {
            throw new PACEException("PICC side exception in authentication token generation step", e2.getSW());
        }
    }

    public static SecretKey deriveStaticPACEKey(KeySpec keySpec, String str) throws GeneralSecurityException {
        return Util.deriveKey(computeKeySeedForPACE(keySpec), PACEInfo.toCipherAlgorithm(str), PACEInfo.toKeyLength(str), 3);
    }

    public static byte[] computeKeySeedForPACE(KeySpec keySpec) throws GeneralSecurityException {
        if (keySpec instanceof BACKeySpec) {
            BACKeySpec bACKeySpec = (BACKeySpec) keySpec;
            String documentNumber = bACKeySpec.getDocumentNumber();
            String dateOfBirth = bACKeySpec.getDateOfBirth();
            String dateOfExpiry = bACKeySpec.getDateOfExpiry();
            if (dateOfBirth == null || dateOfBirth.length() != 6) {
                StringBuilder sb = new StringBuilder();
                sb.append("Wrong date format used for date of birth. Expected yyMMdd, found ");
                sb.append(dateOfBirth);
                throw new IllegalArgumentException(sb.toString());
            } else if (dateOfExpiry == null || dateOfExpiry.length() != 6) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Wrong date format used for date of expiry. Expected yyMMdd, found ");
                sb2.append(dateOfExpiry);
                throw new IllegalArgumentException(sb2.toString());
            } else if (documentNumber != null) {
                return computeKeySeedForPACE(fixDocumentNumber(documentNumber), dateOfBirth, dateOfExpiry);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Wrong document number. Found ");
                sb3.append(documentNumber);
                throw new IllegalArgumentException(sb3.toString());
            }
        } else if (keySpec instanceof CANKey) {
            return computeKeySeedForPACE(((CANKey) keySpec).getCardAccessNumber());
        } else {
            throw new IllegalArgumentException("Unsupported key spec, was expecting BAC or CAN key specification");
        }
    }

    public static PublicKey updateParameterSpec(PublicKey publicKey, PrivateKey privateKey) throws GeneralSecurityException {
        if ((publicKey instanceof ECPublicKey) && (privateKey instanceof ECPrivateKey)) {
            return KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(((ECPublicKey) publicKey).getW(), ((ECPrivateKey) privateKey).getParams()));
        }
        throw new NoSuchAlgorithmException("Unsupported key type");
    }

    private static byte[] computeKeySeedForPACE(String str, String str2, String str3) throws GeneralSecurityException {
        return Util.computeKeySeed(str, str2, str3, McElieceCCA2KeyGenParameterSpec.SHA1, false);
    }

    private static String fixDocumentNumber(String str) {
        String replace = str.replace('<', ' ').trim().replace(' ', '<');
        while (replace.length() < 9) {
            StringBuilder sb = new StringBuilder();
            sb.append(replace);
            sb.append("<");
            replace = sb.toString();
        }
        return replace;
    }

    public static byte[] computeKeySeedForPACE(String str) throws GeneralSecurityException {
        return Util.computeKeySeed(str, McElieceCCA2KeyGenParameterSpec.SHA1, false);
    }

    public static byte[] generateAuthenticationToken(String str, SecretKey secretKey, PublicKey publicKey) throws GeneralSecurityException {
        Mac instance = Mac.getInstance(inferMacAlgorithmFromCipherAlgorithm(PACEInfo.toCipherAlgorithm(str)), BC_PROVIDER);
        byte[] encodePublicKeyDataObject = Util.encodePublicKeyDataObject(str, publicKey);
        instance.init(secretKey);
        byte[] bArr = new byte[8];
        System.arraycopy(instance.doFinal(encodePublicKeyDataObject), 0, bArr, 0, 8);
        return bArr;
    }

    private void checkConsistency(String str, String str2, String str3, int i, AlgorithmParameterSpec algorithmParameterSpec) {
        if (str == null) {
            throw new IllegalArgumentException("Unknown agreement algorithm");
        } else if (!"ECDH".equalsIgnoreCase(str) && !"DH".equalsIgnoreCase(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported agreement algorithm, expected ECDH or DH, found \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        } else if (str2 == null) {
            throw new IllegalArgumentException("Unknown cipher algorithm");
        } else if (!"DESede".equalsIgnoreCase(str2) && !"AES".equalsIgnoreCase(str2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unsupported cipher algorithm, expected DESede or AES, found \"");
            sb2.append(str2);
            sb2.append("\"");
            throw new IllegalArgumentException(sb2.toString());
        } else if (!McElieceCCA2KeyGenParameterSpec.SHA1.equalsIgnoreCase(str3) && !"SHA1".equalsIgnoreCase(str3) && !McElieceCCA2KeyGenParameterSpec.SHA256.equalsIgnoreCase(str3) && !"SHA256".equalsIgnoreCase(str3)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unsupported cipher algorithm, expected DESede or AES, found \"");
            sb3.append(str3);
            sb3.append("\"");
            throw new IllegalArgumentException(sb3.toString());
        } else if (i != 128 && i != 192 && i != 256) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unsupported key length, expected 128, 192, or 256, found ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        } else if ("ECDH".equalsIgnoreCase(str) && !(algorithmParameterSpec instanceof ECParameterSpec)) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Expected ECParameterSpec for agreement algorithm \"");
            sb5.append(str);
            sb5.append("\", found ");
            sb5.append(algorithmParameterSpec.getClass().getCanonicalName());
            throw new IllegalArgumentException(sb5.toString());
        } else if ("DH".equalsIgnoreCase(str) && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Expected DHParameterSpec for agreement algorithm \"");
            sb6.append(str);
            sb6.append("\", found ");
            sb6.append(algorithmParameterSpec.getClass().getCanonicalName());
            throw new IllegalArgumentException(sb6.toString());
        }
    }

    private static String inferMacAlgorithmFromCipherAlgorithm(String str) throws InvalidAlgorithmParameterException {
        if (str == null) {
            throw new IllegalArgumentException("Cannot infer MAC algorithm from cipher algorithm null");
        } else if (str.startsWith("DESede")) {
            return "ISO9797Alg3Mac";
        } else {
            if (str.startsWith("AES")) {
                return "AESCMAC";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot infer MAC algorithm from cipher algorithm \"");
            sb.append(str);
            sb.append("\"");
            throw new InvalidAlgorithmParameterException(sb.toString());
        }
    }

    public class MyECDHKeyAgreement {
        private ECPrivateKey privateKey;

        public MyECDHKeyAgreement() {
        }

        public void init(ECPrivateKey eCPrivateKey) {
            this.privateKey = eCPrivateKey;
        }

        public ECPoint doPhase(ECPublicKey eCPublicKey) {
            org.bouncycastle.math.p099ec.ECPoint normalize = Util.toBouncyECPublicKeyParameters(eCPublicKey).getQ().multiply(Util.toBouncyECPrivateKeyParameters(this.privateKey).getD()).normalize();
            if (!normalize.isInfinity()) {
                return Util.fromBouncyCastleECPoint(normalize);
            }
            throw new IllegalStateException("Infinity");
        }
    }
}
