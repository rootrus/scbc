package org.jmrtd;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import javax.crypto.spec.SecretKeySpec;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.tlv.TLVOutputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.p061x9.X962NamedCurves;
import org.bouncycastle.asn1.p061x9.X9ECParameters;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.math.p099ec.ECFieldElement;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.SecurityInfo;
import org.jmrtd.lds.icao.MRZInfo;
import p040o.AlertController$RecycleListView;

public class Util {
    private static final Provider BC_PROVIDER = JMRTDSecurityProvider.getBouncyCastleProvider();
    public static final int ENC_MODE = 1;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int MAC_MODE = 2;
    public static final int PACE_MODE = 3;

    public static AlgorithmParameterSpec mapNonceIM(byte[] bArr, byte[] bArr2, byte[] bArr3, AlgorithmParameterSpec algorithmParameterSpec) {
        return null;
    }

    private Util() {
    }

    public static SecretKey deriveKey(byte[] bArr, int i) throws GeneralSecurityException {
        return deriveKey(bArr, "DESede", 128, i);
    }

    public static SecretKey deriveKey(byte[] bArr, String str, int i, int i2) throws GeneralSecurityException {
        return deriveKey(bArr, str, i, (byte[]) null, i2);
    }

    public static SecretKey deriveKey(byte[] bArr, String str, int i, byte[] bArr2, int i2) throws GeneralSecurityException {
        MessageDigest instance = MessageDigest.getInstance(inferDigestAlgorithmFromCipherAlgorithmForKeyDerivation(str, i));
        instance.reset();
        instance.update(bArr);
        if (bArr2 != null) {
            instance.update(bArr2);
        }
        instance.update(new byte[]{0, 0, 0, (byte) i2});
        byte[] digest = instance.digest();
        byte[] bArr3 = null;
        if ("DESede".equalsIgnoreCase(str) || "3DES".equalsIgnoreCase(str)) {
            if (i == 112 || i == 128) {
                bArr3 = new byte[24];
                System.arraycopy(digest, 0, bArr3, 0, 8);
                System.arraycopy(digest, 8, bArr3, 8, 8);
                System.arraycopy(digest, 0, bArr3, 16, 8);
            } else {
                throw new IllegalArgumentException("KDF can only use DESede with 128-bit key length");
            }
        } else if ("AES".equalsIgnoreCase(str) || str.startsWith("AES")) {
            if (i == 128) {
                bArr3 = new byte[16];
                System.arraycopy(digest, 0, bArr3, 0, 16);
            } else if (i == 192) {
                bArr3 = new byte[24];
                System.arraycopy(digest, 0, bArr3, 0, 24);
            } else if (i == 256) {
                bArr3 = new byte[32];
                System.arraycopy(digest, 0, bArr3, 0, 32);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("KDF can only use AES with 128-bit, 192-bit key or 256-bit length, found: ");
                sb.append(i);
                sb.append("-bit key length");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return new SecretKeySpec(bArr3, str);
    }

    public static byte[] computeKeySeed(String str, String str2, String str3, String str4, boolean z) throws GeneralSecurityException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(MRZInfo.checkDigit(str));
        sb.append(str2);
        sb.append(MRZInfo.checkDigit(str2));
        sb.append(str3);
        sb.append(MRZInfo.checkDigit(str3));
        return computeKeySeed(sb.toString(), str4, z);
    }

    public static byte[] computeKeySeed(String str, String str2, boolean z) throws GeneralSecurityException {
        MessageDigest instance = MessageDigest.getInstance(str2);
        instance.update(getBytes(str));
        byte[] digest = instance.digest();
        if (!z) {
            return digest;
        }
        byte[] bArr = new byte[16];
        System.arraycopy(digest, 0, bArr, 0, 16);
        return bArr;
    }

    public static byte[] pad(byte[] bArr, int i) {
        return pad(bArr, 0, bArr.length, i);
    }

    public static byte[] pad(byte[] bArr, int i, int i2, int i3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArr, i, i2);
        byteArrayOutputStream.write(-128);
        while (byteArrayOutputStream.size() % i3 != 0) {
            byteArrayOutputStream.write(0);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] unpad(byte[] bArr) throws BadPaddingException {
        int length = bArr.length - 1;
        while (length >= 0 && bArr[length] == 0) {
            length--;
        }
        if ((bArr[length] & 255) == 128) {
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected constant 0x80, found 0x");
        sb.append(Integer.toHexString(bArr[length] & 255));
        sb.append("\nDEBUG: in = ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(bArr));
        sb.append(", index = ");
        sb.append(length);
        throw new BadPaddingException(sb.toString());
    }

    public static byte[] recoverMessage(int i, byte[] bArr) {
        int i2;
        if (bArr == null || bArr.length <= 0) {
            throw new IllegalArgumentException("Plaintext is too short to recover message");
        } else if (((bArr[bArr.length - 1] & 15) ^ 12) == 0) {
            if (((bArr[bArr.length - 1] & 255) ^ PSSSigner.TRAILER_IMPLICIT) == 0) {
                i2 = 1;
            } else if (((bArr[bArr.length - 1] & 255) ^ 204) == 0) {
                i2 = 2;
            } else {
                throw new NumberFormatException("Not an ISO 9796-2 scheme 2 signature trailer");
            }
            if (((bArr[0] & ISO7816.INS_GET_RESPONSE) ^ 64) != 0) {
                throw new NumberFormatException("Could not get M1");
            } else if ((bArr[0] & 32) != 0) {
                int i3 = 0;
                while (i3 < bArr.length && ((bArr[i3] & 15) ^ 10) != 0) {
                    i3++;
                }
                int i4 = i3 + 1;
                int length = ((bArr.length - i2) - i) - i4;
                if (length > 0) {
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, i4, bArr2, 0, length);
                    return bArr2;
                }
                throw new NumberFormatException("Could not get M1");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not get M1, first byte indicates partial recovery not enabled: ");
                sb.append(Integer.toHexString(bArr[0]));
                throw new NumberFormatException(sb.toString());
            }
        } else {
            throw new NumberFormatException("Could not get M1, malformed trailer");
        }
    }

    public static byte[] getRawECDSASignature(byte[] bArr, int i) throws IOException {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Enumeration objects = ((ASN1Sequence) aSN1InputStream.readObject()).getObjects();
            while (objects.hasMoreElements()) {
                byteArrayOutputStream.write(alignKeyDataToSize(((ASN1Integer) objects.nextElement()).getValue().toByteArray(), i));
            }
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } finally {
            aSN1InputStream.close();
            byteArrayOutputStream.close();
        }
    }

    public static byte[] alignKeyDataToSize(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        int length = bArr.length < i ? bArr.length : i;
        System.arraycopy(bArr, bArr.length - length, bArr2, i - length, length);
        return bArr2;
    }

    public static byte[] i2os(BigInteger bigInteger, int i) {
        BigInteger valueOf = BigInteger.valueOf(256);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            BigInteger mod = bigInteger.mod(valueOf);
            bigInteger = bigInteger.divide(valueOf);
            bArr[(i - 1) - i2] = (byte) mod.intValue();
        }
        return bArr;
    }

    public static byte[] i2os(BigInteger bigInteger) {
        int length = bigInteger.toString(16).length();
        if (length % 2 != 0) {
            length++;
        }
        return i2os(bigInteger, length / 2);
    }

    public static BigInteger os2i(byte[] bArr) {
        if (bArr != null) {
            return os2i(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException();
    }

    public static BigInteger os2i(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            BigInteger bigInteger = BigInteger.ZERO;
            BigInteger valueOf = BigInteger.valueOf(256);
            for (int i3 = i; i3 < i + i2; i3++) {
                bigInteger = bigInteger.multiply(valueOf).add(BigInteger.valueOf((long) (bArr[i3] & 255)));
            }
            return bigInteger;
        }
        throw new IllegalArgumentException();
    }

    public static BigInteger os2fe(byte[] bArr, BigInteger bigInteger) {
        return os2i(bArr).mod(bigInteger);
    }

    public static String inferDigestAlgorithmFromSignatureAlgorithm(String str) {
        if (str != null) {
            String upperCase = str.toUpperCase();
            String str2 = null;
            if (upperCase.contains("WITH")) {
                str2 = upperCase.split("WITH")[0];
            }
            if ("SHA1".equalsIgnoreCase(str2)) {
                str2 = McElieceCCA2KeyGenParameterSpec.SHA1;
            }
            if ("SHA224".equalsIgnoreCase(str2)) {
                str2 = McElieceCCA2KeyGenParameterSpec.SHA224;
            }
            if ("SHA256".equalsIgnoreCase(str2)) {
                str2 = McElieceCCA2KeyGenParameterSpec.SHA256;
            }
            if ("SHA384".equalsIgnoreCase(str2)) {
                str2 = McElieceCCA2KeyGenParameterSpec.SHA384;
            }
            return "SHA512".equalsIgnoreCase(str2) ? McElieceCCA2KeyGenParameterSpec.SHA512 : str2;
        }
        throw new IllegalArgumentException();
    }

    public static String inferDigestAlgorithmFromCipherAlgorithmForKeyDerivation(String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException();
        } else if ("DESede".equals(str) || "AES-128".equals(str)) {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        } else {
            if ("AES".equals(str) && i == 128) {
                return McElieceCCA2KeyGenParameterSpec.SHA1;
            }
            if ("AES-256".equals(str) || "AES-192".equals(str)) {
                return McElieceCCA2KeyGenParameterSpec.SHA256;
            }
            if ("AES".equals(str) && (i == 192 || i == 256)) {
                return McElieceCCA2KeyGenParameterSpec.SHA256;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported cipher algorithm or key length \"");
            sb.append(str);
            sb.append("\", ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static DHParameterSpec toExplicitDHParameterSpec(DHParameters dHParameters) {
        return new DHParameterSpec(dHParameters.getP(), dHParameters.getG(), dHParameters.getL());
    }

    public static String getDetailedPublicKeyAlgorithm(PublicKey publicKey) {
        String curveName;
        if (publicKey == null) {
            return "null";
        }
        String algorithm = publicKey.getAlgorithm();
        if (publicKey instanceof RSAPublicKey) {
            int bitLength = ((RSAPublicKey) publicKey).getModulus().bitLength();
            StringBuilder sb = new StringBuilder();
            sb.append(algorithm);
            sb.append(" [");
            sb.append(bitLength);
            sb.append(" bit]");
            return sb.toString();
        } else if (!(publicKey instanceof ECPublicKey) || (curveName = getCurveName(((ECPublicKey) publicKey).getParams())) == null) {
            return algorithm;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(algorithm);
            sb2.append(" [");
            sb2.append(curveName);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static String getDetailedPrivateKeyAlgorithm(PrivateKey privateKey) {
        String curveName;
        if (privateKey == null) {
            return "null";
        }
        String algorithm = privateKey.getAlgorithm();
        if (privateKey instanceof RSAPrivateKey) {
            int bitLength = ((RSAPrivateKey) privateKey).getModulus().bitLength();
            StringBuilder sb = new StringBuilder();
            sb.append(algorithm);
            sb.append(" [");
            sb.append(bitLength);
            sb.append(" bit]");
            return sb.toString();
        } else if (!(privateKey instanceof ECPrivateKey) || (curveName = getCurveName(((ECPrivateKey) privateKey).getParams())) == null) {
            return algorithm;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(algorithm);
            sb2.append(" [");
            sb2.append(curveName);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static String getCurveName(ECParameterSpec eCParameterSpec) {
        ECNamedCurveSpec namedCurveSpec = toNamedCurveSpec(eCParameterSpec);
        if (namedCurveSpec == null) {
            return null;
        }
        return namedCurveSpec.getName();
    }

    public static ECParameterSpec toExplicitECParameterSpec(ECNamedCurveParameterSpec eCNamedCurveParameterSpec) {
        return toExplicitECParameterSpec((ECParameterSpec) toECNamedCurveSpec(eCNamedCurveParameterSpec));
    }

    public static ECParameterSpec toExplicitECParameterSpec(ECParameterSpec eCParameterSpec) {
        try {
            ECPoint generator = eCParameterSpec.getGenerator();
            BigInteger order = eCParameterSpec.getOrder();
            int cofactor = eCParameterSpec.getCofactor();
            EllipticCurve curve = eCParameterSpec.getCurve();
            BigInteger a = curve.getA();
            BigInteger b = curve.getB();
            ECField field = curve.getField();
            if (field instanceof ECFieldFp) {
                return new ECParameterSpec(new EllipticCurve(new ECFieldFp(((ECFieldFp) field).getP()), a, b), generator, order, cofactor);
            }
            if (field instanceof ECFieldF2m) {
                return new ECParameterSpec(new EllipticCurve(new ECFieldF2m(((ECFieldF2m) field).getM()), a, b), generator, order, cofactor);
            }
            LOGGER.warning("Could not make named EC param spec explicit");
            return eCParameterSpec;
        } catch (Exception unused) {
            LOGGER.warning("Could not make named EC param spec explicit");
            return eCParameterSpec;
        }
    }

    private static ECNamedCurveSpec toNamedCurveSpec(ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec == null) {
            return null;
        }
        if (eCParameterSpec instanceof ECNamedCurveSpec) {
            return (ECNamedCurveSpec) eCParameterSpec;
        }
        ArrayList<String> list = Collections.list(ECNamedCurveTable.getNames());
        ArrayList arrayList = new ArrayList();
        for (String parameterSpec : list) {
            ECNamedCurveSpec eCNamedCurveSpec = toECNamedCurveSpec(ECNamedCurveTable.getParameterSpec(parameterSpec));
            if (eCNamedCurveSpec.getCurve().equals(eCParameterSpec.getCurve()) && eCNamedCurveSpec.getGenerator().equals(eCParameterSpec.getGenerator()) && eCNamedCurveSpec.getOrder().equals(eCParameterSpec.getOrder()) && eCNamedCurveSpec.getCofactor() == eCParameterSpec.getCofactor()) {
                arrayList.add(eCNamedCurveSpec);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (ECNamedCurveSpec) arrayList.get(0);
        }
        return (ECNamedCurveSpec) arrayList.get(0);
    }

    public static ECNamedCurveSpec toECNamedCurveSpec(ECNamedCurveParameterSpec eCNamedCurveParameterSpec) {
        return new ECNamedCurveSpec(eCNamedCurveParameterSpec.getName(), eCNamedCurveParameterSpec.getCurve(), eCNamedCurveParameterSpec.getG(), eCNamedCurveParameterSpec.getN(), eCNamedCurveParameterSpec.getH(), eCNamedCurveParameterSpec.getSeed());
    }

    public static SubjectPublicKeyInfo toSubjectPublicKeyInfo(PublicKey publicKey) {
        try {
            String algorithm = publicKey.getAlgorithm();
            if (!"EC".equals(algorithm) && !"ECDH".equals(algorithm)) {
                if (!(publicKey instanceof ECPublicKey)) {
                    if (!"DH".equals(algorithm)) {
                        if (!(publicKey instanceof DHPublicKey)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unrecognized key type, found ");
                            sb.append(publicKey.getAlgorithm());
                            sb.append(", should be DH or ECDH");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
                    DHParameterSpec params = dHPublicKey.getParams();
                    return new SubjectPublicKeyInfo(new AlgorithmIdentifier(EACObjectIdentifiers.id_PK_DH, new DHParameter(params.getP(), params.getG(), params.getL()).toASN1Primitive()), (ASN1Encodable) new ASN1Integer(dHPublicKey.getY()));
                }
            }
            ASN1InputStream aSN1InputStream = new ASN1InputStream(publicKey.getEncoded());
            SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo((ASN1Sequence) aSN1InputStream.readObject());
            aSN1InputStream.close();
            AlgorithmIdentifier algorithm2 = subjectPublicKeyInfo.getAlgorithm();
            String id = algorithm2.getAlgorithm().getId();
            if (SecurityInfo.ID_EC_PUBLIC_KEY.equals(id)) {
                ASN1Primitive aSN1Primitive = algorithm2.getParameters().toASN1Primitive();
                if (!(aSN1Primitive instanceof ASN1ObjectIdentifier)) {
                    return subjectPublicKeyInfo;
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Primitive;
                X9ECParameters byOID = X962NamedCurves.getByOID(aSN1ObjectIdentifier);
                if (byOID != null) {
                    org.bouncycastle.math.p099ec.ECPoint g = byOID.getG();
                    return publicKey instanceof org.bouncycastle.jce.interfaces.ECPublicKey ? new SubjectPublicKeyInfo(new AlgorithmIdentifier(subjectPublicKeyInfo.getAlgorithm().getAlgorithm(), new X9ECParameters(byOID.getCurve(), g.getCurve().createPoint(g.getX().toBigInteger(), g.getY().toBigInteger(), false), byOID.getN(), byOID.getH(), byOID.getSeed()).toASN1Primitive()), ((org.bouncycastle.jce.interfaces.ECPublicKey) publicKey).getQ().getEncoded()) : subjectPublicKeyInfo;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not find X9.62 named curve for OID ");
                sb2.append(aSN1ObjectIdentifier.getId());
                throw new IllegalStateException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Was expecting id-ecPublicKey (");
            sb3.append(SecurityInfo.ID_EC_PUBLIC_KEY_TYPE);
            sb3.append("), found ");
            sb3.append(id);
            throw new IllegalStateException(sb3.toString());
        } catch (Exception e) {
            Logger logger = LOGGER;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Exception: ");
            sb4.append(e.getMessage());
            logger.severe(sb4.toString());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        return java.security.KeyFactory.getInstance("EC", BC_PROVIDER).generatePublic(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r2 = LOGGER;
        r3 = new java.lang.StringBuilder();
        r3.append("Exception: ");
        r3.append(r4.getMessage());
        r2.severe(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026 A[ExcHandler: Exception (r4v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.PublicKey toPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo r4) {
        /*
            java.lang.String r0 = "Exception: "
            r1 = 0
            java.lang.String r2 = "DER"
            byte[] r4 = r4.getEncoded(r2)     // Catch:{ GeneralSecurityException -> 0x0040, Exception -> 0x0026 }
            java.security.spec.X509EncodedKeySpec r2 = new java.security.spec.X509EncodedKeySpec     // Catch:{ GeneralSecurityException -> 0x0040, Exception -> 0x0026 }
            r2.<init>(r4)     // Catch:{ GeneralSecurityException -> 0x0040, Exception -> 0x0026 }
            java.lang.String r4 = "DH"
            java.security.KeyFactory r4 = java.security.KeyFactory.getInstance(r4)     // Catch:{ GeneralSecurityException -> 0x0019, Exception -> 0x0026 }
            java.security.PublicKey r4 = r4.generatePublic(r2)     // Catch:{ GeneralSecurityException -> 0x0019, Exception -> 0x0026 }
            return r4
        L_0x0019:
            java.lang.String r4 = "EC"
            java.security.Provider r3 = BC_PROVIDER     // Catch:{ GeneralSecurityException -> 0x0040, Exception -> 0x0026 }
            java.security.KeyFactory r4 = java.security.KeyFactory.getInstance(r4, r3)     // Catch:{ GeneralSecurityException -> 0x0040, Exception -> 0x0026 }
            java.security.PublicKey r4 = r4.generatePublic(r2)     // Catch:{ GeneralSecurityException -> 0x0040, Exception -> 0x0026 }
            return r4
        L_0x0026:
            r4 = move-exception
            java.util.logging.Logger r2 = LOGGER
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r4 = r4.getMessage()
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            r2.severe(r4)
            return r1
        L_0x0040:
            r4 = move-exception
            java.util.logging.Logger r2 = LOGGER
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r4 = r4.getMessage()
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            r2.severe(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.Util.toPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo):java.security.PublicKey");
    }

    public static PublicKey reconstructPublicKey(PublicKey publicKey) {
        if (!(publicKey instanceof ECPublicKey)) {
            return publicKey;
        }
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            ECPoint w = eCPublicKey.getW();
            ECParameterSpec explicitECParameterSpec = toExplicitECParameterSpec(eCPublicKey.getParams());
            if (explicitECParameterSpec == null) {
                return publicKey;
            }
            return KeyFactory.getInstance("EC", BC_PROVIDER).generatePublic(new ECPublicKeySpec(w, explicitECParameterSpec));
        } catch (Exception unused) {
            LOGGER.warning("Could not make public key param spec explicit");
            return publicKey;
        }
    }

    public static byte[] encodePublicKeyDataObject(String str, PublicKey publicKey) throws InvalidKeyException {
        return encodePublicKeyDataObject(str, publicKey, true);
    }

    public static byte[] encodePublicKeyDataObject(String str, PublicKey publicKey, boolean z) throws InvalidKeyException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TLVOutputStream tLVOutputStream = new TLVOutputStream(byteArrayOutputStream);
        try {
            tLVOutputStream.IconCompatParcelizer(32585);
            if (publicKey instanceof DHPublicKey) {
                DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
                DHParameterSpec params = dHPublicKey.getParams();
                BigInteger p = params.getP();
                int l = params.getL();
                BigInteger g = params.getG();
                BigInteger y = dHPublicKey.getY();
                tLVOutputStream.write(new ASN1ObjectIdentifier(str).getEncoded());
                if (!z) {
                    tLVOutputStream.IconCompatParcelizer(129);
                    tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(i2os(p));
                    tLVOutputStream.IconCompatParcelizer(ISO781611.BIOMETRIC_SUBTYPE_TAG);
                    tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(i2os(BigInteger.valueOf((long) l)));
                    tLVOutputStream.IconCompatParcelizer(131);
                    tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(i2os(g));
                }
                tLVOutputStream.IconCompatParcelizer(132);
                tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(i2os(y));
            } else if (publicKey instanceof ECPublicKey) {
                ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
                ECParameterSpec params2 = eCPublicKey.getParams();
                BigInteger prime = getPrime(params2);
                EllipticCurve curve = params2.getCurve();
                BigInteger a = curve.getA();
                BigInteger b = curve.getB();
                ECPoint generator = params2.getGenerator();
                BigInteger order = params2.getOrder();
                int cofactor = params2.getCofactor();
                ECPoint w = eCPublicKey.getW();
                tLVOutputStream.write(new ASN1ObjectIdentifier(str).getEncoded());
                if (!z) {
                    tLVOutputStream.IconCompatParcelizer(129);
                    tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(i2os(prime));
                    tLVOutputStream.IconCompatParcelizer(ISO781611.BIOMETRIC_SUBTYPE_TAG);
                    tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(i2os(a));
                    tLVOutputStream.IconCompatParcelizer(131);
                    tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(i2os(b));
                    BigInteger affineX = generator.getAffineX();
                    BigInteger affineY = generator.getAffineY();
                    tLVOutputStream.IconCompatParcelizer(132);
                    tLVOutputStream.write(i2os(affineX));
                    tLVOutputStream.write(i2os(affineY));
                    tLVOutputStream.write();
                    tLVOutputStream.IconCompatParcelizer(133);
                    tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(i2os(order));
                }
                tLVOutputStream.IconCompatParcelizer(134);
                tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(ecPoint2OS(w));
                if (!z) {
                    tLVOutputStream.IconCompatParcelizer(135);
                    tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(i2os(BigInteger.valueOf((long) cofactor)));
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported public key: ");
                sb.append(publicKey.getClass().getCanonicalName());
                throw new InvalidKeyException(sb.toString());
            }
            tLVOutputStream.write();
            tLVOutputStream.flush();
            tLVOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            Logger logger = LOGGER;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception: ");
            sb2.append(e.getMessage());
            logger.severe(sb2.toString());
            throw new IllegalStateException("Error in encoding public key");
        }
    }

    public static byte[] encodePublicKeyForSmartCard(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey == null) {
            throw new IllegalArgumentException("Cannot encode null public key");
        } else if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(ecPoint2OS(eCPublicKey.getW()));
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Internal error writing to memory: ");
                sb.append(e.getMessage());
                throw new IllegalStateException(sb.toString());
            }
        } else if (publicKey instanceof DHPublicKey) {
            return i2os(((DHPublicKey) publicKey).getY());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unsupported public key: ");
            sb2.append(publicKey.getClass().getCanonicalName());
            throw new InvalidKeyException(sb2.toString());
        }
    }

    public static ECPoint os2ECPoint(byte[] bArr) {
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
            if (dataInputStream.read() == 4) {
                int length = (bArr.length - 1) / 2;
                byte[] bArr2 = new byte[length];
                byte[] bArr3 = new byte[length];
                dataInputStream.readFully(bArr2);
                dataInputStream.readFully(bArr3);
                dataInputStream.close();
                return new ECPoint(os2i(bArr2), os2i(bArr3));
            }
            throw new IllegalArgumentException("Expected encoded ECPoint to start with 0x04");
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Exception", e);
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public static byte[] ecPoint2OS(ECPoint eCPoint) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        try {
            byteArrayOutputStream.write(4);
            byteArrayOutputStream.write(i2os(affineX));
            byteArrayOutputStream.write(i2os(affineY));
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public static PublicKey decodePublicKeyFromSmartCard(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec == null) {
            throw new IllegalArgumentException("Params cannot be null");
        } else if (algorithmParameterSpec instanceof ECParameterSpec) {
            try {
                return KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(os2ECPoint(bArr), (ECParameterSpec) algorithmParameterSpec));
            } catch (IOException e) {
                Logger logger = LOGGER;
                StringBuilder sb = new StringBuilder();
                sb.append("Exception: ");
                sb.append(e.getMessage());
                logger.severe(sb.toString());
                throw new IllegalArgumentException(e.getMessage());
            } catch (GeneralSecurityException e2) {
                Logger logger2 = LOGGER;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Exception: ");
                sb2.append(e2.getMessage());
                logger2.severe(sb2.toString());
                throw new IllegalArgumentException(e2.getMessage());
            }
        } else if (algorithmParameterSpec instanceof DHParameterSpec) {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
            if (dataInputStream.read() == 4) {
                byte[] bArr2 = new byte[(bArr.length - 1)];
                dataInputStream.readFully(bArr2);
                dataInputStream.close();
                DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                return KeyFactory.getInstance("DH").generatePublic(new DHPublicKeySpec(os2i(bArr2), dHParameterSpec.getP(), dHParameterSpec.getG()));
            }
            throw new IllegalArgumentException("Expected encoded public key to start with 0x04");
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Expected ECParameterSpec or DHParameterSpec, found ");
            sb3.append(algorithmParameterSpec.getClass().getCanonicalName());
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public static String inferProtocolIdentifier(PublicKey publicKey) {
        String algorithm = publicKey.getAlgorithm();
        if ("EC".equals(algorithm) || "ECDH".equals(algorithm)) {
            return SecurityInfo.ID_PK_ECDH;
        }
        if ("DH".equals(algorithm)) {
            return SecurityInfo.ID_PK_DH;
        }
        throw new IllegalArgumentException("Wrong key type. Was expecting ECDH or DH public key.");
    }

    public static AlgorithmParameterSpec mapNonceGM(byte[] bArr, byte[] bArr2, AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec == null) {
            throw new IllegalArgumentException("Unsupported parameters for mapping nonce");
        } else if (algorithmParameterSpec instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            BigInteger os2i = os2i(bArr2);
            return mapNonceGMWithECDH(os2i(bArr), new ECPoint(os2i, computeAffineY(os2i, eCParameterSpec)), eCParameterSpec);
        } else if (algorithmParameterSpec instanceof DHParameterSpec) {
            return mapNonceGMWithDH(os2i(bArr), os2i(bArr2), (DHParameterSpec) algorithmParameterSpec);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported parameters for mapping nonce, expected ECParameterSpec or DHParameterSpec, found ");
            sb.append(algorithmParameterSpec.getClass().getCanonicalName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static ECParameterSpec mapNonceGMWithECDH(BigInteger bigInteger, ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        ECPoint generator = eCParameterSpec.getGenerator();
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a = curve.getA();
        BigInteger b = curve.getB();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        BigInteger order = eCParameterSpec.getOrder();
        int cofactor = eCParameterSpec.getCofactor();
        ECPoint add = add(multiply(bigInteger, generator, eCParameterSpec), eCPoint, eCParameterSpec);
        if (!toBouncyCastleECPoint(add, eCParameterSpec).isValid()) {
            LOGGER.info("ephemeralGenerator is not a valid point");
        }
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(p), a, b), add, order, cofactor);
    }

    public static DHParameterSpec mapNonceGMWithDH(BigInteger bigInteger, BigInteger bigInteger2, DHParameterSpec dHParameterSpec) {
        BigInteger p = dHParameterSpec.getP();
        return new DHParameterSpec(p, dHParameterSpec.getG().modPow(bigInteger, p).multiply(bigInteger2).mod(p), dHParameterSpec.getL());
    }

    private static ECPoint add(ECPoint eCPoint, ECPoint eCPoint2, ECParameterSpec eCParameterSpec) {
        return fromBouncyCastleECPoint(toBouncyCastleECPoint(eCPoint, eCParameterSpec).add(toBouncyCastleECPoint(eCPoint2, eCParameterSpec)));
    }

    public static ECPoint multiply(BigInteger bigInteger, ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        return fromBouncyCastleECPoint(toBouncyCastleECPoint(eCPoint, eCParameterSpec).multiply(bigInteger));
    }

    private static byte[] getBytes(String str) {
        byte[] bytes = str.getBytes();
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            return bytes;
        }
    }

    public static BigInteger getPrime(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec == null) {
            throw new IllegalArgumentException("Parameters null");
        } else if (algorithmParameterSpec instanceof DHParameterSpec) {
            return ((DHParameterSpec) algorithmParameterSpec).getP();
        } else {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                ECField field = ((ECParameterSpec) algorithmParameterSpec).getCurve().getField();
                if (field instanceof ECFieldFp) {
                    return ((ECFieldFp) field).getP();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Was expecting prime field of type ECFieldFp, found ");
                sb.append(field.getClass().getCanonicalName());
                throw new IllegalStateException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unsupported agreement algorithm, was expecting DHParameterSpec or ECParameterSpec, found ");
            sb2.append(algorithmParameterSpec.getClass().getCanonicalName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static byte[] wrapDO(byte b, byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[(bArr.length + 2)];
            bArr2[0] = b;
            bArr2[1] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
            return bArr2;
        }
        throw new IllegalArgumentException("Data to wrap is null");
    }

    public static byte[] unwrapDO(byte b, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            throw new IllegalArgumentException("Wrapped data is null or length < 2");
        }
        byte b2 = bArr[0];
        if (b2 == b) {
            int length = bArr.length - 2;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 2, bArr2, 0, length);
            return bArr2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected tag ");
        sb.append(Integer.toHexString(b));
        sb.append(", found tag ");
        sb.append(Integer.toHexString(b2));
        throw new IllegalArgumentException(sb.toString());
    }

    public static String inferKeyAgreementAlgorithm(PublicKey publicKey) {
        if (publicKey instanceof ECPublicKey) {
            return "ECDH";
        }
        if (publicKey instanceof DHPublicKey) {
            return "DH";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported public key: ");
        sb.append(publicKey);
        throw new IllegalArgumentException(sb.toString());
    }

    public static BigInteger computeAffineY(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        ECCurve bouncyCastleECCurve = toBouncyCastleECCurve(eCParameterSpec);
        ECFieldElement a = bouncyCastleECCurve.getA();
        ECFieldElement b = bouncyCastleECCurve.getB();
        ECFieldElement fromBigInteger = bouncyCastleECCurve.fromBigInteger(bigInteger);
        Logger logger = LOGGER;
        StringBuilder sb = new StringBuilder();
        sb.append("DEBUG: x.bitLength = ");
        sb.append(fromBigInteger.bitLength());
        logger.info(sb.toString());
        ECFieldElement sqrt = fromBigInteger.multiply(fromBigInteger).add(a).multiply(fromBigInteger).add(b).sqrt();
        Logger logger2 = LOGGER;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DEBUG: y.bitLength = ");
        sb2.append(sqrt.bitLength());
        logger2.info(sb2.toString());
        return sqrt.toBigInteger();
    }

    private static org.bouncycastle.math.p099ec.ECPoint toBouncyCastleECPoint(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        return toBouncyCastleECCurve(eCParameterSpec).createPoint(eCPoint.getAffineX(), eCPoint.getAffineY(), false);
    }

    public static ECPoint fromBouncyCastleECPoint(org.bouncycastle.math.p099ec.ECPoint eCPoint) {
        org.bouncycastle.math.p099ec.ECPoint normalize = eCPoint.normalize();
        if (!normalize.isValid()) {
            LOGGER.warning("point not valid");
        }
        return new ECPoint(normalize.getAffineXCoord().toBigInteger(), normalize.getAffineYCoord().toBigInteger());
    }

    public static boolean isValid(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        return toBouncyCastleECPoint(eCPoint, eCParameterSpec).isValid();
    }

    public static ECPoint normalize(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        return fromBouncyCastleECPoint(toBouncyCastleECPoint(eCPoint, eCParameterSpec).normalize());
    }

    private static ECCurve toBouncyCastleECCurve(ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECField field = curve.getField();
        if (field instanceof ECFieldFp) {
            int cofactor = eCParameterSpec.getCofactor();
            BigInteger order = eCParameterSpec.getOrder();
            return new ECCurve.C10477Fp(getPrime(eCParameterSpec), curve.getA(), curve.getB(), order, BigInteger.valueOf((long) cofactor));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Only prime field supported (for now), found ");
        sb.append(field.getClass().getCanonicalName());
        throw new IllegalArgumentException(sb.toString());
    }

    public static ECPublicKeyParameters toBouncyECPublicKeyParameters(ECPublicKey eCPublicKey) {
        ECParameterSpec params = eCPublicKey.getParams();
        return new ECPublicKeyParameters(toBouncyCastleECPoint(eCPublicKey.getW(), params), toBouncyECDomainParameters(params));
    }

    public static ECPrivateKeyParameters toBouncyECPrivateKeyParameters(ECPrivateKey eCPrivateKey) {
        return new ECPrivateKeyParameters(eCPrivateKey.getS(), toBouncyECDomainParameters(eCPrivateKey.getParams()));
    }

    public static ECDomainParameters toBouncyECDomainParameters(ECParameterSpec eCParameterSpec) {
        return new ECDomainParameters(toBouncyCastleECCurve(eCParameterSpec), toBouncyCastleECPoint(eCParameterSpec.getGenerator(), eCParameterSpec), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }
}
