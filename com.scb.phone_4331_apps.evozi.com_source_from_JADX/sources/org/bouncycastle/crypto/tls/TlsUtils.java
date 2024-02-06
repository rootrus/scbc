package org.bouncycastle.crypto.tls;

import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import okhttp3.internal.p089ws.WebSocketProtocol;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.p062io.Streams;

public class TlsUtils {
    public static final byte[] EMPTY_BYTES = new byte[0];
    public static final int[] EMPTY_INTS = new int[0];
    public static final long[] EMPTY_LONGS = new long[0];
    public static final short[] EMPTY_SHORTS = new short[0];
    public static final Integer EXT_signature_algorithms = Integers.valueOf(13);
    static final byte[][] SSL3_CONST = genSSL3Const();
    static final byte[] SSL_CLIENT = {67, 76, 78, 84};
    static final byte[] SSL_SERVER = {83, 82, 86, 82};

    public static byte[] PRF(TlsContext tlsContext, byte[] bArr, String str, byte[] bArr2, int i) {
        if (!tlsContext.getServerVersion().isSSL()) {
            byte[] byteArray = Strings.toByteArray(str);
            byte[] concat = concat(byteArray, bArr2);
            int prfAlgorithm = tlsContext.getSecurityParameters().getPrfAlgorithm();
            if (prfAlgorithm == 0) {
                return PRF_legacy(bArr, byteArray, concat, i);
            }
            byte[] bArr3 = new byte[i];
            hmac_hash(createPRFHash(prfAlgorithm), bArr, concat, bArr3);
            return bArr3;
        }
        throw new IllegalStateException("No PRF available for SSLv3 session");
    }

    public static byte[] PRF_legacy(byte[] bArr, String str, byte[] bArr2, int i) {
        byte[] byteArray = Strings.toByteArray(str);
        return PRF_legacy(bArr, byteArray, concat(byteArray, bArr2), i);
    }

    static byte[] PRF_legacy(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int length = (bArr.length + 1) / 2;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr, 0, bArr4, 0, length);
        System.arraycopy(bArr, bArr.length - length, bArr5, 0, length);
        byte[] bArr6 = new byte[i];
        byte[] bArr7 = new byte[i];
        hmac_hash(createHash(1), bArr4, bArr3, bArr6);
        hmac_hash(createHash(2), bArr5, bArr3, bArr7);
        for (int i2 = 0; i2 < i; i2++) {
            bArr6[i2] = (byte) (bArr6[i2] ^ bArr7[i2]);
        }
        return bArr6;
    }

    public static void addSignatureAlgorithmsExtension(Hashtable hashtable, Vector vector) throws IOException {
        hashtable.put(EXT_signature_algorithms, createSignatureAlgorithmsExtension(vector));
    }

    static byte[] calculateKeyBlock(TlsContext tlsContext, int i) {
        SecurityParameters securityParameters = tlsContext.getSecurityParameters();
        byte[] masterSecret = securityParameters.getMasterSecret();
        byte[] concat = concat(securityParameters.getServerRandom(), securityParameters.getClientRandom());
        return isSSL(tlsContext) ? calculateKeyBlock_SSL(masterSecret, concat, i) : PRF(tlsContext, masterSecret, "key expansion", concat, i);
    }

    static byte[] calculateKeyBlock_SSL(byte[] bArr, byte[] bArr2, int i) {
        Digest createHash = createHash(1);
        Digest createHash2 = createHash(2);
        int digestSize = createHash.getDigestSize();
        int digestSize2 = createHash2.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        byte[] bArr4 = new byte[(i + digestSize)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            byte[] bArr5 = SSL3_CONST[i3];
            createHash2.update(bArr5, 0, bArr5.length);
            createHash2.update(bArr, 0, bArr.length);
            createHash2.update(bArr2, 0, bArr2.length);
            createHash2.doFinal(bArr3, 0);
            createHash.update(bArr, 0, bArr.length);
            createHash.update(bArr3, 0, digestSize2);
            createHash.doFinal(bArr4, i2);
            i2 += digestSize;
            i3++;
        }
        return Arrays.copyOfRange(bArr4, 0, i);
    }

    static byte[] calculateMasterSecret(TlsContext tlsContext, byte[] bArr) {
        SecurityParameters securityParameters = tlsContext.getSecurityParameters();
        byte[] sessionHash = securityParameters.extendedMasterSecret ? securityParameters.getSessionHash() : concat(securityParameters.getClientRandom(), securityParameters.getServerRandom());
        if (isSSL(tlsContext)) {
            return calculateMasterSecret_SSL(bArr, sessionHash);
        }
        return PRF(tlsContext, bArr, securityParameters.extendedMasterSecret ? ExporterLabel.extended_master_secret : "master secret", sessionHash, 48);
    }

    static byte[] calculateMasterSecret_SSL(byte[] bArr, byte[] bArr2) {
        Digest createHash = createHash(1);
        Digest createHash2 = createHash(2);
        int digestSize = createHash.getDigestSize();
        int digestSize2 = createHash2.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        byte[] bArr4 = new byte[(digestSize * 3)];
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            byte[] bArr5 = SSL3_CONST[i2];
            createHash2.update(bArr5, 0, bArr5.length);
            createHash2.update(bArr, 0, bArr.length);
            createHash2.update(bArr2, 0, bArr2.length);
            createHash2.doFinal(bArr3, 0);
            createHash.update(bArr, 0, bArr.length);
            createHash.update(bArr3, 0, digestSize2);
            createHash.doFinal(bArr4, i);
            i += digestSize;
        }
        return bArr4;
    }

    static byte[] calculateVerifyData(TlsContext tlsContext, String str, byte[] bArr) {
        if (isSSL(tlsContext)) {
            return bArr;
        }
        SecurityParameters securityParameters = tlsContext.getSecurityParameters();
        return PRF(tlsContext, securityParameters.getMasterSecret(), str, bArr, securityParameters.getVerifyDataLength());
    }

    public static void checkUint16(int i) throws IOException {
        if (!isValidUint16(i)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void checkUint16(long j) throws IOException {
        if (!isValidUint16(j)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void checkUint24(int i) throws IOException {
        if (!isValidUint24(i)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void checkUint24(long j) throws IOException {
        if (!isValidUint24(j)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void checkUint32(long j) throws IOException {
        if (!isValidUint32(j)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void checkUint48(long j) throws IOException {
        if (!isValidUint48(j)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void checkUint64(long j) throws IOException {
        if (!isValidUint64(j)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void checkUint8(int i) throws IOException {
        if (!isValidUint8(i)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void checkUint8(long j) throws IOException {
        if (!isValidUint8(j)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static void checkUint8(short s) throws IOException {
        if (!isValidUint8(s)) {
            throw new TlsFatalAlert(80);
        }
    }

    public static Digest cloneHash(short s, Digest digest) {
        switch (s) {
            case 1:
                return new MD5Digest((MD5Digest) digest);
            case 2:
                return new SHA1Digest((SHA1Digest) digest);
            case 3:
                return new SHA224Digest((SHA224Digest) digest);
            case 4:
                return new SHA256Digest((SHA256Digest) digest);
            case 5:
                return new SHA384Digest((SHA384Digest) digest);
            case 6:
                return new SHA512Digest((SHA512Digest) digest);
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    public static Digest clonePRFHash(int i, Digest digest) {
        return i != 0 ? cloneHash(getHashAlgorithmForPRFAlgorithm(i), digest) : new CombinedHash((CombinedHash) digest);
    }

    static byte[] concat(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static Digest createHash(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        return signatureAndHashAlgorithm == null ? new CombinedHash() : createHash(signatureAndHashAlgorithm.getHash());
    }

    public static Digest createHash(short s) {
        switch (s) {
            case 1:
                return new MD5Digest();
            case 2:
                return new SHA1Digest();
            case 3:
                return new SHA224Digest();
            case 4:
                return new SHA256Digest();
            case 5:
                return new SHA384Digest();
            case 6:
                return new SHA512Digest();
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    public static Digest createPRFHash(int i) {
        return i != 0 ? createHash(getHashAlgorithmForPRFAlgorithm(i)) : new CombinedHash();
    }

    public static byte[] createSignatureAlgorithmsExtension(Vector vector) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encodeSupportedSignatureAlgorithms(vector, false, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static TlsSigner createTlsSigner(short s) {
        if (s == 1) {
            return new TlsRSASigner();
        }
        if (s == 2) {
            return new TlsDSSSigner();
        }
        if (s == 64) {
            return new TlsECDSASigner();
        }
        throw new IllegalArgumentException("'clientCertificateType' is not a type with signing capability");
    }

    public static byte[] encodeOpaque8(byte[] bArr) throws IOException {
        checkUint8(bArr.length);
        return Arrays.prepend(bArr, (byte) bArr.length);
    }

    public static void encodeSupportedSignatureAlgorithms(Vector vector, boolean z, OutputStream outputStream) throws IOException {
        if (vector == null || vector.size() <= 0 || vector.size() >= 32768) {
            throw new IllegalArgumentException("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)");
        }
        int size = vector.size() << 1;
        checkUint16(size);
        writeUint16(size, outputStream);
        int i = 0;
        while (i < vector.size()) {
            SignatureAndHashAlgorithm signatureAndHashAlgorithm = (SignatureAndHashAlgorithm) vector.elementAt(i);
            if (z || signatureAndHashAlgorithm.getSignature() != 0) {
                signatureAndHashAlgorithm.encode(outputStream);
                i++;
            } else {
                throw new IllegalArgumentException("SignatureAlgorithm.anonymous MUST NOT appear in the signature_algorithms extension");
            }
        }
    }

    public static byte[] encodeUint16ArrayWithUint16Length(int[] iArr) throws IOException {
        byte[] bArr = new byte[((iArr.length << 1) + 2)];
        writeUint16ArrayWithUint16Length(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] encodeUint8ArrayWithUint8Length(short[] sArr) throws IOException {
        byte[] bArr = new byte[(sArr.length + 1)];
        writeUint8ArrayWithUint8Length(sArr, bArr, 0);
        return bArr;
    }

    private static byte[][] genSSL3Const() {
        byte[][] bArr = new byte[10][];
        int i = 0;
        while (i < 10) {
            int i2 = i + 1;
            byte[] bArr2 = new byte[i2];
            Arrays.fill(bArr2, (byte) (i + 65));
            bArr[i] = bArr2;
            i = i2;
        }
        return bArr;
    }

    public static int getCipherType(int i) throws IOException {
        int encryptionAlgorithm = getEncryptionAlgorithm(i);
        switch (encryptionAlgorithm) {
            case 1:
            case 2:
                return 0;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
                return 1;
            case 10:
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return 2;
            default:
                switch (encryptionAlgorithm) {
                    case 102:
                    case 103:
                    case 104:
                        return 2;
                    default:
                        throw new TlsFatalAlert(80);
                }
        }
    }

    static short getClientCertificateType(Certificate certificate, Certificate certificate2) throws IOException {
        if (certificate.isEmpty()) {
            return -1;
        }
        Certificate certificateAt = certificate.getCertificateAt(0);
        try {
            AsymmetricKeyParameter createKey = PublicKeyFactory.createKey(certificateAt.getSubjectPublicKeyInfo());
            if (createKey.isPrivate()) {
                throw new TlsFatalAlert(80);
            } else if (createKey instanceof RSAKeyParameters) {
                validateKeyUsage(certificateAt, 128);
                return 1;
            } else if (createKey instanceof DSAPublicKeyParameters) {
                validateKeyUsage(certificateAt, 128);
                return 2;
            } else if (createKey instanceof ECPublicKeyParameters) {
                validateKeyUsage(certificateAt, 128);
                return 64;
            } else {
                throw new TlsFatalAlert(43);
            }
        } catch (Exception e) {
            throw new TlsFatalAlert(43, e);
        }
    }

    public static Vector getDefaultDSSSignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm(2, 2));
    }

    public static Vector getDefaultECDSASignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm(2, 3));
    }

    public static Vector getDefaultRSASignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm(2, 1));
    }

    public static Vector getDefaultSupportedSignatureAlgorithms() {
        short[] sArr = {2, 3, 4, 5, 6};
        short[] sArr2 = {1, 2, 3};
        Vector vector = new Vector();
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                vector.addElement(new SignatureAndHashAlgorithm(sArr[i2], sArr2[i]));
            }
        }
        return vector;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0077, code lost:
        return 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0078, code lost:
        return 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0079, code lost:
        return 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007a, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0084, code lost:
        return 10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getEncryptionAlgorithm(int r7) throws java.io.IOException {
        /*
            r0 = 0
            r1 = 1
            if (r7 == r1) goto L_0x0088
            r1 = 2
            if (r7 == r1) goto L_0x0088
            r2 = 4
            if (r7 == r2) goto L_0x0087
            r2 = 5
            if (r7 == r2) goto L_0x0087
            r2 = 10
            if (r7 == r2) goto L_0x0085
            r3 = 13
            if (r7 == r3) goto L_0x0085
            r4 = 16
            if (r7 == r4) goto L_0x0085
            r5 = 19
            if (r7 == r5) goto L_0x0085
            r6 = 22
            if (r7 == r6) goto L_0x0085
            r6 = 24
            if (r7 == r6) goto L_0x0087
            r6 = 12
            switch(r7) {
                case 168: goto L_0x0084;
                case 169: goto L_0x0081;
                case 170: goto L_0x0084;
                case 171: goto L_0x0081;
                case 172: goto L_0x0084;
                case 173: goto L_0x0081;
                case 174: goto L_0x007e;
                case 175: goto L_0x007b;
                case 176: goto L_0x007a;
                case 177: goto L_0x007a;
                case 178: goto L_0x007e;
                case 179: goto L_0x007b;
                case 180: goto L_0x007a;
                case 181: goto L_0x007a;
                case 182: goto L_0x007e;
                case 183: goto L_0x007b;
                case 184: goto L_0x007a;
                case 185: goto L_0x007a;
                case 186: goto L_0x0079;
                case 187: goto L_0x0079;
                case 188: goto L_0x0079;
                case 189: goto L_0x0079;
                case 190: goto L_0x0079;
                default: goto L_0x002a;
            }
        L_0x002a:
            switch(r7) {
                case 192: goto L_0x0078;
                case 193: goto L_0x0078;
                case 194: goto L_0x0078;
                case 195: goto L_0x0078;
                case 196: goto L_0x0078;
                default: goto L_0x002d;
            }
        L_0x002d:
            switch(r7) {
                case 49153: goto L_0x0088;
                case 49154: goto L_0x0087;
                case 49155: goto L_0x0085;
                case 49156: goto L_0x007e;
                case 49157: goto L_0x007b;
                case 49158: goto L_0x0088;
                case 49159: goto L_0x0087;
                case 49160: goto L_0x0085;
                case 49161: goto L_0x007e;
                case 49162: goto L_0x007b;
                case 49163: goto L_0x0088;
                case 49164: goto L_0x0087;
                case 49165: goto L_0x0085;
                case 49166: goto L_0x007e;
                case 49167: goto L_0x007b;
                case 49168: goto L_0x0088;
                case 49169: goto L_0x0087;
                case 49170: goto L_0x0085;
                case 49171: goto L_0x007e;
                case 49172: goto L_0x007b;
                case 49173: goto L_0x0088;
                case 49174: goto L_0x0087;
                case 49175: goto L_0x0085;
                case 49176: goto L_0x007e;
                case 49177: goto L_0x007b;
                case 49178: goto L_0x0085;
                case 49179: goto L_0x0085;
                case 49180: goto L_0x0085;
                case 49181: goto L_0x007e;
                case 49182: goto L_0x007e;
                case 49183: goto L_0x007e;
                case 49184: goto L_0x007b;
                case 49185: goto L_0x007b;
                case 49186: goto L_0x007b;
                case 49187: goto L_0x007e;
                case 49188: goto L_0x007b;
                case 49189: goto L_0x007e;
                case 49190: goto L_0x007b;
                case 49191: goto L_0x007e;
                case 49192: goto L_0x007b;
                case 49193: goto L_0x007e;
                case 49194: goto L_0x007b;
                case 49195: goto L_0x0084;
                case 49196: goto L_0x0081;
                case 49197: goto L_0x0084;
                case 49198: goto L_0x0081;
                case 49199: goto L_0x0084;
                case 49200: goto L_0x0081;
                case 49201: goto L_0x0084;
                case 49202: goto L_0x0081;
                case 49203: goto L_0x0087;
                case 49204: goto L_0x0085;
                case 49205: goto L_0x007e;
                case 49206: goto L_0x007b;
                case 49207: goto L_0x007e;
                case 49208: goto L_0x007b;
                case 49209: goto L_0x0088;
                case 49210: goto L_0x007a;
                case 49211: goto L_0x007a;
                default: goto L_0x0030;
            }
        L_0x0030:
            switch(r7) {
                case 49266: goto L_0x0079;
                case 49267: goto L_0x0078;
                case 49268: goto L_0x0079;
                case 49269: goto L_0x0078;
                case 49270: goto L_0x0079;
                case 49271: goto L_0x0078;
                case 49272: goto L_0x0079;
                case 49273: goto L_0x0078;
                case 49274: goto L_0x0077;
                case 49275: goto L_0x0074;
                case 49276: goto L_0x0077;
                case 49277: goto L_0x0074;
                case 49278: goto L_0x0077;
                case 49279: goto L_0x0074;
                case 49280: goto L_0x0077;
                case 49281: goto L_0x0074;
                case 49282: goto L_0x0077;
                case 49283: goto L_0x0074;
                default: goto L_0x0033;
            }
        L_0x0033:
            switch(r7) {
                case 49286: goto L_0x0077;
                case 49287: goto L_0x0074;
                case 49288: goto L_0x0077;
                case 49289: goto L_0x0074;
                case 49290: goto L_0x0077;
                case 49291: goto L_0x0074;
                case 49292: goto L_0x0077;
                case 49293: goto L_0x0074;
                case 49294: goto L_0x0077;
                case 49295: goto L_0x0074;
                case 49296: goto L_0x0077;
                case 49297: goto L_0x0074;
                case 49298: goto L_0x0077;
                case 49299: goto L_0x0074;
                case 49300: goto L_0x0079;
                case 49301: goto L_0x0078;
                case 49302: goto L_0x0079;
                case 49303: goto L_0x0078;
                case 49304: goto L_0x0079;
                case 49305: goto L_0x0078;
                case 49306: goto L_0x0079;
                case 49307: goto L_0x0078;
                case 49308: goto L_0x0071;
                case 49309: goto L_0x006e;
                case 49310: goto L_0x0071;
                case 49311: goto L_0x006e;
                case 49312: goto L_0x006d;
                case 49313: goto L_0x006a;
                case 49314: goto L_0x006d;
                case 49315: goto L_0x006a;
                case 49316: goto L_0x0071;
                case 49317: goto L_0x006e;
                case 49318: goto L_0x0071;
                case 49319: goto L_0x006e;
                case 49320: goto L_0x006d;
                case 49321: goto L_0x006a;
                case 49322: goto L_0x006d;
                case 49323: goto L_0x006a;
                case 49324: goto L_0x0071;
                case 49325: goto L_0x006e;
                case 49326: goto L_0x006d;
                case 49327: goto L_0x006a;
                default: goto L_0x0036;
            }
        L_0x0036:
            switch(r7) {
                case 52392: goto L_0x0067;
                case 52393: goto L_0x0067;
                case 52394: goto L_0x0067;
                case 52395: goto L_0x0067;
                case 52396: goto L_0x0067;
                case 52397: goto L_0x0067;
                case 52398: goto L_0x0067;
                default: goto L_0x0039;
            }
        L_0x0039:
            switch(r7) {
                case 65280: goto L_0x0064;
                case 65281: goto L_0x0061;
                case 65282: goto L_0x0064;
                case 65283: goto L_0x0061;
                case 65284: goto L_0x0064;
                case 65285: goto L_0x0061;
                default: goto L_0x003c;
            }
        L_0x003c:
            switch(r7) {
                case 65296: goto L_0x0064;
                case 65297: goto L_0x0061;
                case 65298: goto L_0x0064;
                case 65299: goto L_0x0061;
                case 65300: goto L_0x0064;
                case 65301: goto L_0x0061;
                default: goto L_0x003f;
            }
        L_0x003f:
            switch(r7) {
                case 44: goto L_0x0088;
                case 45: goto L_0x0088;
                case 46: goto L_0x0088;
                case 47: goto L_0x007e;
                case 48: goto L_0x007e;
                case 49: goto L_0x007e;
                case 50: goto L_0x007e;
                case 51: goto L_0x007e;
                default: goto L_0x0042;
            }
        L_0x0042:
            switch(r7) {
                case 53: goto L_0x007b;
                case 54: goto L_0x007b;
                case 55: goto L_0x007b;
                case 56: goto L_0x007b;
                case 57: goto L_0x007b;
                default: goto L_0x0045;
            }
        L_0x0045:
            switch(r7) {
                case 59: goto L_0x007a;
                case 60: goto L_0x007e;
                case 61: goto L_0x007b;
                case 62: goto L_0x007e;
                case 63: goto L_0x007e;
                case 64: goto L_0x007e;
                case 65: goto L_0x005c;
                case 66: goto L_0x005c;
                case 67: goto L_0x005c;
                case 68: goto L_0x005c;
                case 69: goto L_0x005c;
                default: goto L_0x0048;
            }
        L_0x0048:
            switch(r7) {
                case 103: goto L_0x007e;
                case 104: goto L_0x007b;
                case 105: goto L_0x007b;
                case 106: goto L_0x007b;
                case 107: goto L_0x007b;
                default: goto L_0x004b;
            }
        L_0x004b:
            switch(r7) {
                case 132: goto L_0x005d;
                case 133: goto L_0x005d;
                case 134: goto L_0x005d;
                case 135: goto L_0x005d;
                case 136: goto L_0x005d;
                default: goto L_0x004e;
            }
        L_0x004e:
            switch(r7) {
                case 138: goto L_0x0087;
                case 139: goto L_0x0085;
                case 140: goto L_0x007e;
                case 141: goto L_0x007b;
                case 142: goto L_0x0087;
                case 143: goto L_0x0085;
                case 144: goto L_0x007e;
                case 145: goto L_0x007b;
                case 146: goto L_0x0087;
                case 147: goto L_0x0085;
                case 148: goto L_0x007e;
                case 149: goto L_0x007b;
                case 150: goto L_0x005e;
                case 151: goto L_0x005e;
                case 152: goto L_0x005e;
                case 153: goto L_0x005e;
                case 154: goto L_0x005e;
                default: goto L_0x0051;
            }
        L_0x0051:
            switch(r7) {
                case 156: goto L_0x0084;
                case 157: goto L_0x0081;
                case 158: goto L_0x0084;
                case 159: goto L_0x0081;
                case 160: goto L_0x0084;
                case 161: goto L_0x0081;
                case 162: goto L_0x0084;
                case 163: goto L_0x0081;
                case 164: goto L_0x0084;
                case 165: goto L_0x0081;
                default: goto L_0x0054;
            }
        L_0x0054:
            org.bouncycastle.crypto.tls.TlsFatalAlert r7 = new org.bouncycastle.crypto.tls.TlsFatalAlert
            r0 = 80
            r7.<init>(r0)
            throw r7
        L_0x005c:
            return r6
        L_0x005d:
            return r3
        L_0x005e:
            r7 = 14
            return r7
        L_0x0061:
            r7 = 104(0x68, float:1.46E-43)
            return r7
        L_0x0064:
            r7 = 103(0x67, float:1.44E-43)
            return r7
        L_0x0067:
            r7 = 102(0x66, float:1.43E-43)
            return r7
        L_0x006a:
            r7 = 18
            return r7
        L_0x006d:
            return r4
        L_0x006e:
            r7 = 17
            return r7
        L_0x0071:
            r7 = 15
            return r7
        L_0x0074:
            r7 = 20
            return r7
        L_0x0077:
            return r5
        L_0x0078:
            return r3
        L_0x0079:
            return r6
        L_0x007a:
            return r0
        L_0x007b:
            r7 = 9
            return r7
        L_0x007e:
            r7 = 8
            return r7
        L_0x0081:
            r7 = 11
            return r7
        L_0x0084:
            return r2
        L_0x0085:
            r7 = 7
            return r7
        L_0x0087:
            return r1
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.tls.TlsUtils.getEncryptionAlgorithm(int):int");
    }

    public static byte[] getExtensionData(Hashtable hashtable, Integer num) {
        if (hashtable == null) {
            return null;
        }
        return (byte[]) hashtable.get(num);
    }

    public static short getHashAlgorithmForPRFAlgorithm(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("legacy PRF not a valid algorithm");
        } else if (i == 1) {
            return 4;
        } else {
            if (i == 2) {
                return 5;
            }
            throw new IllegalArgumentException("unknown PRFAlgorithm");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0062, code lost:
        return 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0069, code lost:
        return 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0070, code lost:
        return 13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getKeyExchangeAlgorithm(int r6) throws java.io.IOException {
        /*
            r0 = 1
            if (r6 == r0) goto L_0x0079
            r1 = 2
            if (r6 == r1) goto L_0x0079
            r1 = 4
            if (r6 == r1) goto L_0x0079
            r1 = 5
            if (r6 == r1) goto L_0x0079
            r2 = 10
            if (r6 == r2) goto L_0x0079
            r2 = 13
            if (r6 == r2) goto L_0x0077
            r3 = 16
            if (r6 == r3) goto L_0x0074
            r4 = 19
            if (r6 == r4) goto L_0x0072
            r5 = 22
            if (r6 == r5) goto L_0x0071
            switch(r6) {
                case 168: goto L_0x0070;
                case 169: goto L_0x0070;
                case 170: goto L_0x006d;
                case 171: goto L_0x006d;
                case 172: goto L_0x006a;
                case 173: goto L_0x006a;
                case 174: goto L_0x0070;
                case 175: goto L_0x0070;
                case 176: goto L_0x0070;
                case 177: goto L_0x0070;
                case 178: goto L_0x006d;
                case 179: goto L_0x006d;
                case 180: goto L_0x006d;
                case 181: goto L_0x006d;
                case 182: goto L_0x006a;
                case 183: goto L_0x006a;
                case 184: goto L_0x006a;
                case 185: goto L_0x006a;
                case 186: goto L_0x0079;
                case 187: goto L_0x0077;
                case 188: goto L_0x0074;
                case 189: goto L_0x0072;
                case 190: goto L_0x0071;
                default: goto L_0x0023;
            }
        L_0x0023:
            switch(r6) {
                case 192: goto L_0x0079;
                case 193: goto L_0x0077;
                case 194: goto L_0x0074;
                case 195: goto L_0x0072;
                case 196: goto L_0x0071;
                default: goto L_0x0026;
            }
        L_0x0026:
            switch(r6) {
                case 49153: goto L_0x0069;
                case 49154: goto L_0x0069;
                case 49155: goto L_0x0069;
                case 49156: goto L_0x0069;
                case 49157: goto L_0x0069;
                case 49158: goto L_0x0066;
                case 49159: goto L_0x0066;
                case 49160: goto L_0x0066;
                case 49161: goto L_0x0066;
                case 49162: goto L_0x0066;
                case 49163: goto L_0x0063;
                case 49164: goto L_0x0063;
                case 49165: goto L_0x0063;
                case 49166: goto L_0x0063;
                case 49167: goto L_0x0063;
                case 49168: goto L_0x0062;
                case 49169: goto L_0x0062;
                case 49170: goto L_0x0062;
                case 49171: goto L_0x0062;
                case 49172: goto L_0x0062;
                case 49173: goto L_0x005f;
                case 49174: goto L_0x005f;
                case 49175: goto L_0x005f;
                case 49176: goto L_0x005f;
                case 49177: goto L_0x005f;
                case 49178: goto L_0x005c;
                case 49179: goto L_0x0059;
                case 49180: goto L_0x0058;
                case 49181: goto L_0x005c;
                case 49182: goto L_0x0059;
                case 49183: goto L_0x0058;
                case 49184: goto L_0x005c;
                case 49185: goto L_0x0059;
                case 49186: goto L_0x0058;
                case 49187: goto L_0x0066;
                case 49188: goto L_0x0066;
                case 49189: goto L_0x0069;
                case 49190: goto L_0x0069;
                case 49191: goto L_0x0062;
                case 49192: goto L_0x0062;
                case 49193: goto L_0x0063;
                case 49194: goto L_0x0063;
                case 49195: goto L_0x0066;
                case 49196: goto L_0x0066;
                case 49197: goto L_0x0069;
                case 49198: goto L_0x0069;
                case 49199: goto L_0x0062;
                case 49200: goto L_0x0062;
                case 49201: goto L_0x0063;
                case 49202: goto L_0x0063;
                case 49203: goto L_0x0055;
                case 49204: goto L_0x0055;
                case 49205: goto L_0x0055;
                case 49206: goto L_0x0055;
                case 49207: goto L_0x0055;
                case 49208: goto L_0x0055;
                case 49209: goto L_0x0055;
                case 49210: goto L_0x0055;
                case 49211: goto L_0x0055;
                default: goto L_0x0029;
            }
        L_0x0029:
            switch(r6) {
                case 49266: goto L_0x0066;
                case 49267: goto L_0x0066;
                case 49268: goto L_0x0069;
                case 49269: goto L_0x0069;
                case 49270: goto L_0x0062;
                case 49271: goto L_0x0062;
                case 49272: goto L_0x0063;
                case 49273: goto L_0x0063;
                case 49274: goto L_0x0079;
                case 49275: goto L_0x0079;
                case 49276: goto L_0x0071;
                case 49277: goto L_0x0071;
                case 49278: goto L_0x0074;
                case 49279: goto L_0x0074;
                case 49280: goto L_0x0072;
                case 49281: goto L_0x0072;
                case 49282: goto L_0x0077;
                case 49283: goto L_0x0077;
                default: goto L_0x002c;
            }
        L_0x002c:
            switch(r6) {
                case 49286: goto L_0x0066;
                case 49287: goto L_0x0066;
                case 49288: goto L_0x0069;
                case 49289: goto L_0x0069;
                case 49290: goto L_0x0062;
                case 49291: goto L_0x0062;
                case 49292: goto L_0x0063;
                case 49293: goto L_0x0063;
                case 49294: goto L_0x0070;
                case 49295: goto L_0x0070;
                case 49296: goto L_0x006d;
                case 49297: goto L_0x006d;
                case 49298: goto L_0x006a;
                case 49299: goto L_0x006a;
                case 49300: goto L_0x0070;
                case 49301: goto L_0x0070;
                case 49302: goto L_0x006d;
                case 49303: goto L_0x006d;
                case 49304: goto L_0x006a;
                case 49305: goto L_0x006a;
                case 49306: goto L_0x0055;
                case 49307: goto L_0x0055;
                case 49308: goto L_0x0079;
                case 49309: goto L_0x0079;
                case 49310: goto L_0x0071;
                case 49311: goto L_0x0071;
                case 49312: goto L_0x0079;
                case 49313: goto L_0x0079;
                case 49314: goto L_0x0071;
                case 49315: goto L_0x0071;
                case 49316: goto L_0x0070;
                case 49317: goto L_0x0070;
                case 49318: goto L_0x006d;
                case 49319: goto L_0x006d;
                case 49320: goto L_0x0070;
                case 49321: goto L_0x0070;
                case 49322: goto L_0x006d;
                case 49323: goto L_0x006d;
                case 49324: goto L_0x0066;
                case 49325: goto L_0x0066;
                case 49326: goto L_0x0066;
                case 49327: goto L_0x0066;
                default: goto L_0x002f;
            }
        L_0x002f:
            switch(r6) {
                case 52392: goto L_0x0062;
                case 52393: goto L_0x0066;
                case 52394: goto L_0x0071;
                case 52395: goto L_0x0070;
                case 52396: goto L_0x0055;
                case 52397: goto L_0x006d;
                case 52398: goto L_0x006a;
                default: goto L_0x0032;
            }
        L_0x0032:
            switch(r6) {
                case 65280: goto L_0x0071;
                case 65281: goto L_0x0071;
                case 65282: goto L_0x0062;
                case 65283: goto L_0x0062;
                case 65284: goto L_0x0066;
                case 65285: goto L_0x0066;
                default: goto L_0x0035;
            }
        L_0x0035:
            switch(r6) {
                case 65296: goto L_0x0070;
                case 65297: goto L_0x0070;
                case 65298: goto L_0x006d;
                case 65299: goto L_0x006d;
                case 65300: goto L_0x0055;
                case 65301: goto L_0x0055;
                default: goto L_0x0038;
            }
        L_0x0038:
            switch(r6) {
                case 44: goto L_0x0070;
                case 45: goto L_0x006d;
                case 46: goto L_0x006a;
                case 47: goto L_0x0079;
                case 48: goto L_0x0077;
                case 49: goto L_0x0074;
                case 50: goto L_0x0072;
                case 51: goto L_0x0071;
                default: goto L_0x003b;
            }
        L_0x003b:
            switch(r6) {
                case 53: goto L_0x0079;
                case 54: goto L_0x0077;
                case 55: goto L_0x0074;
                case 56: goto L_0x0072;
                case 57: goto L_0x0071;
                default: goto L_0x003e;
            }
        L_0x003e:
            switch(r6) {
                case 59: goto L_0x0079;
                case 60: goto L_0x0079;
                case 61: goto L_0x0079;
                case 62: goto L_0x0077;
                case 63: goto L_0x0074;
                case 64: goto L_0x0072;
                case 65: goto L_0x0079;
                case 66: goto L_0x0077;
                case 67: goto L_0x0074;
                case 68: goto L_0x0072;
                case 69: goto L_0x0071;
                default: goto L_0x0041;
            }
        L_0x0041:
            switch(r6) {
                case 103: goto L_0x0071;
                case 104: goto L_0x0077;
                case 105: goto L_0x0074;
                case 106: goto L_0x0072;
                case 107: goto L_0x0071;
                default: goto L_0x0044;
            }
        L_0x0044:
            switch(r6) {
                case 132: goto L_0x0079;
                case 133: goto L_0x0077;
                case 134: goto L_0x0074;
                case 135: goto L_0x0072;
                case 136: goto L_0x0071;
                default: goto L_0x0047;
            }
        L_0x0047:
            switch(r6) {
                case 138: goto L_0x0070;
                case 139: goto L_0x0070;
                case 140: goto L_0x0070;
                case 141: goto L_0x0070;
                case 142: goto L_0x006d;
                case 143: goto L_0x006d;
                case 144: goto L_0x006d;
                case 145: goto L_0x006d;
                case 146: goto L_0x006a;
                case 147: goto L_0x006a;
                case 148: goto L_0x006a;
                case 149: goto L_0x006a;
                case 150: goto L_0x0079;
                case 151: goto L_0x0077;
                case 152: goto L_0x0074;
                case 153: goto L_0x0072;
                case 154: goto L_0x0071;
                default: goto L_0x004a;
            }
        L_0x004a:
            switch(r6) {
                case 156: goto L_0x0079;
                case 157: goto L_0x0079;
                case 158: goto L_0x0071;
                case 159: goto L_0x0071;
                case 160: goto L_0x0074;
                case 161: goto L_0x0074;
                case 162: goto L_0x0072;
                case 163: goto L_0x0072;
                case 164: goto L_0x0077;
                case 165: goto L_0x0077;
                default: goto L_0x004d;
            }
        L_0x004d:
            org.bouncycastle.crypto.tls.TlsFatalAlert r6 = new org.bouncycastle.crypto.tls.TlsFatalAlert
            r0 = 80
            r6.<init>(r0)
            throw r6
        L_0x0055:
            r6 = 24
            return r6
        L_0x0058:
            return r5
        L_0x0059:
            r6 = 23
            return r6
        L_0x005c:
            r6 = 21
            return r6
        L_0x005f:
            r6 = 20
            return r6
        L_0x0062:
            return r4
        L_0x0063:
            r6 = 18
            return r6
        L_0x0066:
            r6 = 17
            return r6
        L_0x0069:
            return r3
        L_0x006a:
            r6 = 15
            return r6
        L_0x006d:
            r6 = 14
            return r6
        L_0x0070:
            return r2
        L_0x0071:
            return r1
        L_0x0072:
            r6 = 3
            return r6
        L_0x0074:
            r6 = 9
            return r6
        L_0x0077:
            r6 = 7
            return r6
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.tls.TlsUtils.getKeyExchangeAlgorithm(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0055, code lost:
        return 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getMACAlgorithm(int r3) throws java.io.IOException {
        /*
            r0 = 1
            if (r3 == r0) goto L_0x005b
            r1 = 2
            if (r3 == r1) goto L_0x005a
            r2 = 4
            if (r3 == r2) goto L_0x005b
            r0 = 5
            if (r3 == r0) goto L_0x005a
            r0 = 10
            if (r3 == r0) goto L_0x005a
            r0 = 13
            if (r3 == r0) goto L_0x005a
            r0 = 16
            if (r3 == r0) goto L_0x005a
            r0 = 19
            if (r3 == r0) goto L_0x005a
            r0 = 22
            if (r3 == r0) goto L_0x005a
            switch(r3) {
                case 168: goto L_0x0058;
                case 169: goto L_0x0058;
                case 170: goto L_0x0058;
                case 171: goto L_0x0058;
                case 172: goto L_0x0058;
                case 173: goto L_0x0058;
                case 174: goto L_0x0056;
                case 175: goto L_0x0055;
                case 176: goto L_0x0056;
                case 177: goto L_0x0055;
                case 178: goto L_0x0056;
                case 179: goto L_0x0055;
                case 180: goto L_0x0056;
                case 181: goto L_0x0055;
                case 182: goto L_0x0056;
                case 183: goto L_0x0055;
                case 184: goto L_0x0056;
                case 185: goto L_0x0055;
                case 186: goto L_0x0056;
                case 187: goto L_0x0056;
                case 188: goto L_0x0056;
                case 189: goto L_0x0056;
                case 190: goto L_0x0056;
                default: goto L_0x0023;
            }
        L_0x0023:
            switch(r3) {
                case 192: goto L_0x0056;
                case 193: goto L_0x0056;
                case 194: goto L_0x0056;
                case 195: goto L_0x0056;
                case 196: goto L_0x0056;
                default: goto L_0x0026;
            }
        L_0x0026:
            switch(r3) {
                case 49153: goto L_0x005a;
                case 49154: goto L_0x005a;
                case 49155: goto L_0x005a;
                case 49156: goto L_0x005a;
                case 49157: goto L_0x005a;
                case 49158: goto L_0x005a;
                case 49159: goto L_0x005a;
                case 49160: goto L_0x005a;
                case 49161: goto L_0x005a;
                case 49162: goto L_0x005a;
                case 49163: goto L_0x005a;
                case 49164: goto L_0x005a;
                case 49165: goto L_0x005a;
                case 49166: goto L_0x005a;
                case 49167: goto L_0x005a;
                case 49168: goto L_0x005a;
                case 49169: goto L_0x005a;
                case 49170: goto L_0x005a;
                case 49171: goto L_0x005a;
                case 49172: goto L_0x005a;
                case 49173: goto L_0x005a;
                case 49174: goto L_0x005a;
                case 49175: goto L_0x005a;
                case 49176: goto L_0x005a;
                case 49177: goto L_0x005a;
                case 49178: goto L_0x005a;
                case 49179: goto L_0x005a;
                case 49180: goto L_0x005a;
                case 49181: goto L_0x005a;
                case 49182: goto L_0x005a;
                case 49183: goto L_0x005a;
                case 49184: goto L_0x005a;
                case 49185: goto L_0x005a;
                case 49186: goto L_0x005a;
                case 49187: goto L_0x0056;
                case 49188: goto L_0x0055;
                case 49189: goto L_0x0056;
                case 49190: goto L_0x0055;
                case 49191: goto L_0x0056;
                case 49192: goto L_0x0055;
                case 49193: goto L_0x0056;
                case 49194: goto L_0x0055;
                case 49195: goto L_0x0058;
                case 49196: goto L_0x0058;
                case 49197: goto L_0x0058;
                case 49198: goto L_0x0058;
                case 49199: goto L_0x0058;
                case 49200: goto L_0x0058;
                case 49201: goto L_0x0058;
                case 49202: goto L_0x0058;
                case 49203: goto L_0x005a;
                case 49204: goto L_0x005a;
                case 49205: goto L_0x005a;
                case 49206: goto L_0x005a;
                case 49207: goto L_0x0056;
                case 49208: goto L_0x0055;
                case 49209: goto L_0x005a;
                case 49210: goto L_0x0056;
                case 49211: goto L_0x0055;
                default: goto L_0x0029;
            }
        L_0x0029:
            switch(r3) {
                case 49266: goto L_0x0056;
                case 49267: goto L_0x0055;
                case 49268: goto L_0x0056;
                case 49269: goto L_0x0055;
                case 49270: goto L_0x0056;
                case 49271: goto L_0x0055;
                case 49272: goto L_0x0056;
                case 49273: goto L_0x0055;
                case 49274: goto L_0x0058;
                case 49275: goto L_0x0058;
                case 49276: goto L_0x0058;
                case 49277: goto L_0x0058;
                case 49278: goto L_0x0058;
                case 49279: goto L_0x0058;
                case 49280: goto L_0x0058;
                case 49281: goto L_0x0058;
                case 49282: goto L_0x0058;
                case 49283: goto L_0x0058;
                default: goto L_0x002c;
            }
        L_0x002c:
            switch(r3) {
                case 49286: goto L_0x0058;
                case 49287: goto L_0x0058;
                case 49288: goto L_0x0058;
                case 49289: goto L_0x0058;
                case 49290: goto L_0x0058;
                case 49291: goto L_0x0058;
                case 49292: goto L_0x0058;
                case 49293: goto L_0x0058;
                case 49294: goto L_0x0058;
                case 49295: goto L_0x0058;
                case 49296: goto L_0x0058;
                case 49297: goto L_0x0058;
                case 49298: goto L_0x0058;
                case 49299: goto L_0x0058;
                case 49300: goto L_0x0056;
                case 49301: goto L_0x0055;
                case 49302: goto L_0x0056;
                case 49303: goto L_0x0055;
                case 49304: goto L_0x0056;
                case 49305: goto L_0x0055;
                case 49306: goto L_0x0056;
                case 49307: goto L_0x0055;
                case 49308: goto L_0x0058;
                case 49309: goto L_0x0058;
                case 49310: goto L_0x0058;
                case 49311: goto L_0x0058;
                case 49312: goto L_0x0058;
                case 49313: goto L_0x0058;
                case 49314: goto L_0x0058;
                case 49315: goto L_0x0058;
                case 49316: goto L_0x0058;
                case 49317: goto L_0x0058;
                case 49318: goto L_0x0058;
                case 49319: goto L_0x0058;
                case 49320: goto L_0x0058;
                case 49321: goto L_0x0058;
                case 49322: goto L_0x0058;
                case 49323: goto L_0x0058;
                case 49324: goto L_0x0058;
                case 49325: goto L_0x0058;
                case 49326: goto L_0x0058;
                case 49327: goto L_0x0058;
                default: goto L_0x002f;
            }
        L_0x002f:
            switch(r3) {
                case 52392: goto L_0x0058;
                case 52393: goto L_0x0058;
                case 52394: goto L_0x0058;
                case 52395: goto L_0x0058;
                case 52396: goto L_0x0058;
                case 52397: goto L_0x0058;
                case 52398: goto L_0x0058;
                default: goto L_0x0032;
            }
        L_0x0032:
            switch(r3) {
                case 65280: goto L_0x0058;
                case 65281: goto L_0x0058;
                case 65282: goto L_0x0058;
                case 65283: goto L_0x0058;
                case 65284: goto L_0x0058;
                case 65285: goto L_0x0058;
                default: goto L_0x0035;
            }
        L_0x0035:
            switch(r3) {
                case 65296: goto L_0x0058;
                case 65297: goto L_0x0058;
                case 65298: goto L_0x0058;
                case 65299: goto L_0x0058;
                case 65300: goto L_0x0058;
                case 65301: goto L_0x0058;
                default: goto L_0x0038;
            }
        L_0x0038:
            switch(r3) {
                case 44: goto L_0x005a;
                case 45: goto L_0x005a;
                case 46: goto L_0x005a;
                case 47: goto L_0x005a;
                case 48: goto L_0x005a;
                case 49: goto L_0x005a;
                case 50: goto L_0x005a;
                case 51: goto L_0x005a;
                default: goto L_0x003b;
            }
        L_0x003b:
            switch(r3) {
                case 53: goto L_0x005a;
                case 54: goto L_0x005a;
                case 55: goto L_0x005a;
                case 56: goto L_0x005a;
                case 57: goto L_0x005a;
                default: goto L_0x003e;
            }
        L_0x003e:
            switch(r3) {
                case 59: goto L_0x0056;
                case 60: goto L_0x0056;
                case 61: goto L_0x0056;
                case 62: goto L_0x0056;
                case 63: goto L_0x0056;
                case 64: goto L_0x0056;
                case 65: goto L_0x005a;
                case 66: goto L_0x005a;
                case 67: goto L_0x005a;
                case 68: goto L_0x005a;
                case 69: goto L_0x005a;
                default: goto L_0x0041;
            }
        L_0x0041:
            switch(r3) {
                case 103: goto L_0x0056;
                case 104: goto L_0x0056;
                case 105: goto L_0x0056;
                case 106: goto L_0x0056;
                case 107: goto L_0x0056;
                default: goto L_0x0044;
            }
        L_0x0044:
            switch(r3) {
                case 132: goto L_0x005a;
                case 133: goto L_0x005a;
                case 134: goto L_0x005a;
                case 135: goto L_0x005a;
                case 136: goto L_0x005a;
                default: goto L_0x0047;
            }
        L_0x0047:
            switch(r3) {
                case 138: goto L_0x005a;
                case 139: goto L_0x005a;
                case 140: goto L_0x005a;
                case 141: goto L_0x005a;
                case 142: goto L_0x005a;
                case 143: goto L_0x005a;
                case 144: goto L_0x005a;
                case 145: goto L_0x005a;
                case 146: goto L_0x005a;
                case 147: goto L_0x005a;
                case 148: goto L_0x005a;
                case 149: goto L_0x005a;
                case 150: goto L_0x005a;
                case 151: goto L_0x005a;
                case 152: goto L_0x005a;
                case 153: goto L_0x005a;
                case 154: goto L_0x005a;
                default: goto L_0x004a;
            }
        L_0x004a:
            switch(r3) {
                case 156: goto L_0x0058;
                case 157: goto L_0x0058;
                case 158: goto L_0x0058;
                case 159: goto L_0x0058;
                case 160: goto L_0x0058;
                case 161: goto L_0x0058;
                case 162: goto L_0x0058;
                case 163: goto L_0x0058;
                case 164: goto L_0x0058;
                case 165: goto L_0x0058;
                default: goto L_0x004d;
            }
        L_0x004d:
            org.bouncycastle.crypto.tls.TlsFatalAlert r3 = new org.bouncycastle.crypto.tls.TlsFatalAlert
            r0 = 80
            r3.<init>(r0)
            throw r3
        L_0x0055:
            return r2
        L_0x0056:
            r3 = 3
            return r3
        L_0x0058:
            r3 = 0
            return r3
        L_0x005a:
            return r1
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.tls.TlsUtils.getMACAlgorithm(int):int");
    }

    public static ProtocolVersion getMinimumVersion(int i) {
        switch (i) {
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                break;
            default:
                switch (i) {
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                        break;
                    default:
                        switch (i) {
                            case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256:
                            case CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384:
                            case 158:
                            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384:
                            case 160:
                            case CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384:
                            case CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256:
                            case CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384:
                            case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256:
                            case CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384:
                                break;
                            default:
                                switch (i) {
                                    case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256:
                                    case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384:
                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256:
                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384:
                                    case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256:
                                    case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384:
                                        break;
                                    default:
                                        switch (i) {
                                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256:
                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256:
                                            case 188:
                                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256:
                                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256:
                                            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256:
                                            case 192:
                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256:
                                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256:
                                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256:
                                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256:
                                            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256:
                                                break;
                                            default:
                                                switch (i) {
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384:
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384:
                                                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256:
                                                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384:
                                                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256:
                                                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384:
                                                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_128_GCM_SHA256:
                                                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_GCM_SHA384:
                                                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256:
                                                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384:
                                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_GCM_SHA256:
                                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_GCM_SHA384:
                                                            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_GCM_SHA256:
                                                            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_GCM_SHA384:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384:
                                                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_GCM_SHA256:
                                                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_GCM_SHA384:
                                                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_GCM_SHA256:
                                                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_GCM_SHA384:
                                                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_GCM_SHA256:
                                                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_GCM_SHA384:
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case CipherSuite.DRAFT_TLS_PSK_WITH_AES_128_OCB:
                                                                    case CipherSuite.DRAFT_TLS_PSK_WITH_AES_256_OCB:
                                                                    case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_AES_128_OCB:
                                                                    case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_AES_256_OCB:
                                                                    case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_AES_128_OCB:
                                                                    case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_AES_256_OCB:
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case CipherSuite.TLS_RSA_WITH_AES_128_CCM:
                                                                            case CipherSuite.TLS_RSA_WITH_AES_256_CCM:
                                                                            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM:
                                                                            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM:
                                                                            case CipherSuite.TLS_RSA_WITH_AES_128_CCM_8:
                                                                            case CipherSuite.TLS_RSA_WITH_AES_256_CCM_8:
                                                                            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM_8:
                                                                            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM_8:
                                                                            case CipherSuite.TLS_PSK_WITH_AES_128_CCM:
                                                                            case CipherSuite.TLS_PSK_WITH_AES_256_CCM:
                                                                            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CCM:
                                                                            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CCM:
                                                                            case CipherSuite.TLS_PSK_WITH_AES_128_CCM_8:
                                                                            case CipherSuite.TLS_PSK_WITH_AES_256_CCM_8:
                                                                            case CipherSuite.TLS_PSK_DHE_WITH_AES_128_CCM_8:
                                                                            case CipherSuite.TLS_PSK_DHE_WITH_AES_256_CCM_8:
                                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM:
                                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM:
                                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8:
                                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8:
                                                                                break;
                                                                            default:
                                                                                switch (i) {
                                                                                    case CipherSuite.DRAFT_TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256:
                                                                                    case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256:
                                                                                    case CipherSuite.DRAFT_TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256:
                                                                                    case CipherSuite.DRAFT_TLS_PSK_WITH_CHACHA20_POLY1305_SHA256:
                                                                                    case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256:
                                                                                    case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_CHACHA20_POLY1305_SHA256:
                                                                                    case CipherSuite.DRAFT_TLS_RSA_PSK_WITH_CHACHA20_POLY1305_SHA256:
                                                                                        break;
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB:
                                                                                            case 65281:
                                                                                            case 65282:
                                                                                            case CipherSuite.DRAFT_TLS_ECDHE_RSA_WITH_AES_256_OCB:
                                                                                            case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_AES_128_OCB:
                                                                                            case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_AES_256_OCB:
                                                                                                break;
                                                                                            default:
                                                                                                return ProtocolVersion.SSLv3;
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
        return ProtocolVersion.TLSv12;
    }

    public static ASN1ObjectIdentifier getOIDForHashAlgorithm(short s) {
        switch (s) {
            case 1:
                return PKCSObjectIdentifiers.md5;
            case 2:
                return X509ObjectIdentifiers.id_SHA1;
            case 3:
                return NISTObjectIdentifiers.id_sha224;
            case 4:
                return NISTObjectIdentifiers.id_sha256;
            case 5:
                return NISTObjectIdentifiers.id_sha384;
            case 6:
                return NISTObjectIdentifiers.id_sha512;
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    public static Vector getSignatureAlgorithmsExtension(Hashtable hashtable) throws IOException {
        byte[] extensionData = getExtensionData(hashtable, EXT_signature_algorithms);
        if (extensionData == null) {
            return null;
        }
        return readSignatureAlgorithmsExtension(extensionData);
    }

    public static SignatureAndHashAlgorithm getSignatureAndHashAlgorithm(TlsContext tlsContext, TlsSignerCredentials tlsSignerCredentials) throws IOException {
        if (!isTLSv12(tlsContext)) {
            return null;
        }
        SignatureAndHashAlgorithm signatureAndHashAlgorithm = tlsSignerCredentials.getSignatureAndHashAlgorithm();
        if (signatureAndHashAlgorithm != null) {
            return signatureAndHashAlgorithm;
        }
        throw new TlsFatalAlert(80);
    }

    public static boolean hasExpectedEmptyExtensionData(Hashtable hashtable, Integer num, short s) throws IOException {
        byte[] extensionData = getExtensionData(hashtable, num);
        if (extensionData == null) {
            return false;
        }
        if (extensionData.length == 0) {
            return true;
        }
        throw new TlsFatalAlert(s);
    }

    public static boolean hasSigningCapability(short s) {
        return s == 1 || s == 2 || s == 64;
    }

    static void hmac_hash(Digest digest, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        HMac hMac = new HMac(digest);
        hMac.init(new KeyParameter(bArr));
        int digestSize = digest.getDigestSize();
        int length = ((bArr3.length + digestSize) - 1) / digestSize;
        int macSize = hMac.getMacSize();
        byte[] bArr4 = new byte[macSize];
        byte[] bArr5 = new byte[hMac.getMacSize()];
        byte[] bArr6 = bArr2;
        int i = 0;
        while (i < length) {
            hMac.update(bArr6, 0, bArr6.length);
            hMac.doFinal(bArr4, 0);
            hMac.update(bArr4, 0, macSize);
            hMac.update(bArr2, 0, bArr2.length);
            hMac.doFinal(bArr5, 0);
            int i2 = digestSize * i;
            System.arraycopy(bArr5, 0, bArr3, i2, Math.min(digestSize, bArr3.length - i2));
            i++;
            bArr6 = bArr4;
        }
    }

    public static TlsSession importSession(byte[] bArr, SessionParameters sessionParameters) {
        return new TlsSessionImpl(bArr, sessionParameters);
    }

    public static boolean isAEADCipherSuite(int i) throws IOException {
        return 2 == getCipherType(i);
    }

    public static boolean isBlockCipherSuite(int i) throws IOException {
        return 1 == getCipherType(i);
    }

    public static boolean isSSL(TlsContext tlsContext) {
        return tlsContext.getServerVersion().isSSL();
    }

    public static boolean isSignatureAlgorithmsExtensionAllowed(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isStreamCipherSuite(int i) throws IOException {
        return getCipherType(i) == 0;
    }

    public static boolean isTLSv11(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv11.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isTLSv11(TlsContext tlsContext) {
        return isTLSv11(tlsContext.getServerVersion());
    }

    public static boolean isTLSv12(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isTLSv12(TlsContext tlsContext) {
        return isTLSv12(tlsContext.getServerVersion());
    }

    public static boolean isValidCipherSuiteForVersion(int i, ProtocolVersion protocolVersion) {
        return getMinimumVersion(i).isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isValidUint16(int i) {
        return (65535 & i) == i;
    }

    public static boolean isValidUint16(long j) {
        return (WebSocketProtocol.PAYLOAD_SHORT_MAX & j) == j;
    }

    public static boolean isValidUint24(int i) {
        return (16777215 & i) == i;
    }

    public static boolean isValidUint24(long j) {
        return (16777215 & j) == j;
    }

    public static boolean isValidUint32(long j) {
        return (4294967295L & j) == j;
    }

    public static boolean isValidUint48(long j) {
        return (281474976710655L & j) == j;
    }

    public static boolean isValidUint64(long j) {
        return true;
    }

    public static boolean isValidUint8(int i) {
        return (i & 255) == i;
    }

    public static boolean isValidUint8(long j) {
        return (255 & j) == j;
    }

    public static boolean isValidUint8(short s) {
        return (s & 255) == s;
    }

    public static Vector parseSupportedSignatureAlgorithms(boolean z, InputStream inputStream) throws IOException {
        int readUint16 = readUint16(inputStream);
        if (readUint16 < 2 || (readUint16 & 1) != 0) {
            throw new TlsFatalAlert(50);
        }
        int i = readUint16 / 2;
        Vector vector = new Vector(i);
        int i2 = 0;
        while (i2 < i) {
            SignatureAndHashAlgorithm parse = SignatureAndHashAlgorithm.parse(inputStream);
            if (z || parse.getSignature() != 0) {
                vector.addElement(parse);
                i2++;
            } else {
                throw new TlsFatalAlert(47);
            }
        }
        return vector;
    }

    public static ASN1Primitive readASN1Object(byte[] bArr) throws IOException {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        ASN1Primitive readObject = aSN1InputStream.readObject();
        if (readObject == null) {
            throw new TlsFatalAlert(50);
        } else if (aSN1InputStream.readObject() == null) {
            return readObject;
        } else {
            throw new TlsFatalAlert(50);
        }
    }

    public static byte[] readAllOrNothing(int i, InputStream inputStream) throws IOException {
        if (i <= 0) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i];
        int readFully = Streams.readFully(inputStream, bArr);
        if (readFully == 0) {
            return null;
        }
        if (readFully == i) {
            return bArr;
        }
        throw new EOFException();
    }

    public static ASN1Primitive readDERObject(byte[] bArr) throws IOException {
        ASN1Primitive readASN1Object = readASN1Object(bArr);
        if (Arrays.areEqual(readASN1Object.getEncoded(ASN1Encoding.DER), bArr)) {
            return readASN1Object;
        }
        throw new TlsFatalAlert(50);
    }

    public static void readFully(byte[] bArr, InputStream inputStream) throws IOException {
        int length = bArr.length;
        if (length > 0 && length != Streams.readFully(inputStream, bArr)) {
            throw new EOFException();
        }
    }

    public static byte[] readFully(int i, InputStream inputStream) throws IOException {
        if (i <= 0) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i];
        if (i == Streams.readFully(inputStream, bArr)) {
            return bArr;
        }
        throw new EOFException();
    }

    public static byte[] readOpaque16(InputStream inputStream) throws IOException {
        return readFully(readUint16(inputStream), inputStream);
    }

    public static byte[] readOpaque24(InputStream inputStream) throws IOException {
        return readFully(readUint24(inputStream), inputStream);
    }

    public static byte[] readOpaque8(InputStream inputStream) throws IOException {
        return readFully((int) readUint8(inputStream), inputStream);
    }

    public static Vector readSignatureAlgorithmsExtension(byte[] bArr) throws IOException {
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            Vector parseSupportedSignatureAlgorithms = parseSupportedSignatureAlgorithms(false, byteArrayInputStream);
            TlsProtocol.assertEmpty(byteArrayInputStream);
            return parseSupportedSignatureAlgorithms;
        }
        throw new IllegalArgumentException("'extensionData' cannot be null");
    }

    public static int readUint16(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if (read2 >= 0) {
            return read2 | (read << 8);
        }
        throw new EOFException();
    }

    public static int readUint16(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public static int[] readUint16Array(int i, InputStream inputStream) throws IOException {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readUint16(inputStream);
        }
        return iArr;
    }

    public static int readUint24(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        if (read3 >= 0) {
            return read3 | (read << 16) | (read2 << 8);
        }
        throw new EOFException();
    }

    public static int readUint24(byte[] bArr, int i) {
        byte b = bArr[i];
        int i2 = i + 1;
        return (bArr[i2 + 1] & 255) | ((b & 255) << 16) | ((bArr[i2] & 255) << 8);
    }

    public static long readUint32(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        if (read4 >= 0) {
            return ((long) (read4 | (read << 24) | (read2 << 16) | (read3 << 8))) & 4294967295L;
        }
        throw new EOFException();
    }

    public static long readUint32(byte[] bArr, int i) {
        byte b = bArr[i];
        int i2 = i + 1;
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        return ((long) ((bArr[i3 + 1] & 255) | ((b & 255) << Ascii.CAN) | ((b2 & 255) << 16) | ((bArr[i3] & 255) << 8))) & 4294967295L;
    }

    public static long readUint48(InputStream inputStream) throws IOException {
        return ((((long) readUint24(inputStream)) & 4294967295L) << 24) | (4294967295L & ((long) readUint24(inputStream)));
    }

    public static long readUint48(byte[] bArr, int i) {
        return (((long) readUint24(bArr, i + 3)) & 4294967295L) | ((((long) readUint24(bArr, i)) & 4294967295L) << 24);
    }

    public static short readUint8(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read >= 0) {
            return (short) read;
        }
        throw new EOFException();
    }

    public static short readUint8(byte[] bArr, int i) {
        return (short) (bArr[i] & 255);
    }

    public static short[] readUint8Array(int i, InputStream inputStream) throws IOException {
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = readUint8(inputStream);
        }
        return sArr;
    }

    public static ProtocolVersion readVersion(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if (read2 >= 0) {
            return ProtocolVersion.get(read, read2);
        }
        throw new EOFException();
    }

    public static ProtocolVersion readVersion(byte[] bArr, int i) throws IOException {
        return ProtocolVersion.get(bArr[i] & 255, bArr[i + 1] & 255);
    }

    public static int readVersionRaw(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if (read2 >= 0) {
            return read2 | (read << 8);
        }
        throw new EOFException();
    }

    public static int readVersionRaw(byte[] bArr, int i) throws IOException {
        return bArr[i + 1] | (bArr[i] << 8);
    }

    static void trackHashAlgorithms(TlsHandshakeHash tlsHandshakeHash, Vector vector) {
        if (vector != null) {
            for (int i = 0; i < vector.size(); i++) {
                short hash = ((SignatureAndHashAlgorithm) vector.elementAt(i)).getHash();
                if (!HashAlgorithm.isPrivate(hash)) {
                    tlsHandshakeHash.trackHashAlgorithm(hash);
                }
            }
        }
    }

    static void validateKeyUsage(Certificate certificate, int i) throws IOException {
        KeyUsage fromExtensions;
        Extensions extensions = certificate.getTBSCertificate().getExtensions();
        if (extensions != null && (fromExtensions = KeyUsage.fromExtensions(extensions)) != null && (fromExtensions.getBytes()[0] & 255 & i) != i) {
            throw new TlsFatalAlert(46);
        }
    }

    private static Vector vectorOfOne(Object obj) {
        Vector vector = new Vector(1);
        vector.addElement(obj);
        return vector;
    }

    public static void verifySupportedSignatureAlgorithm(Vector vector, SignatureAndHashAlgorithm signatureAndHashAlgorithm) throws IOException {
        if (vector == null || vector.size() <= 0 || vector.size() >= 32768) {
            throw new IllegalArgumentException("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)");
        } else if (signatureAndHashAlgorithm != null) {
            if (signatureAndHashAlgorithm.getSignature() != 0) {
                int i = 0;
                while (i < vector.size()) {
                    SignatureAndHashAlgorithm signatureAndHashAlgorithm2 = (SignatureAndHashAlgorithm) vector.elementAt(i);
                    if (signatureAndHashAlgorithm2.getHash() != signatureAndHashAlgorithm.getHash() || signatureAndHashAlgorithm2.getSignature() != signatureAndHashAlgorithm.getSignature()) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            throw new TlsFatalAlert(47);
        } else {
            throw new IllegalArgumentException("'signatureAlgorithm' cannot be null");
        }
    }

    public static void writeGMTUnixTime(byte[] bArr, int i) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        bArr[i] = (byte) (currentTimeMillis >>> 24);
        bArr[i + 1] = (byte) (currentTimeMillis >>> 16);
        bArr[i + 2] = (byte) (currentTimeMillis >>> 8);
        bArr[i + 3] = (byte) currentTimeMillis;
    }

    public static void writeOpaque16(byte[] bArr, OutputStream outputStream) throws IOException {
        checkUint16(bArr.length);
        writeUint16(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeOpaque24(byte[] bArr, OutputStream outputStream) throws IOException {
        checkUint24(bArr.length);
        writeUint24(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeOpaque8(byte[] bArr, OutputStream outputStream) throws IOException {
        checkUint8(bArr.length);
        writeUint8(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeUint16(int i, OutputStream outputStream) throws IOException {
        outputStream.write(i >>> 8);
        outputStream.write(i);
    }

    public static void writeUint16(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    public static void writeUint16Array(int[] iArr, OutputStream outputStream) throws IOException {
        for (int writeUint16 : iArr) {
            writeUint16(writeUint16, outputStream);
        }
    }

    public static void writeUint16Array(int[] iArr, byte[] bArr, int i) throws IOException {
        for (int writeUint16 : iArr) {
            writeUint16(writeUint16, bArr, i);
            i += 2;
        }
    }

    public static void writeUint16ArrayWithUint16Length(int[] iArr, OutputStream outputStream) throws IOException {
        int length = iArr.length << 1;
        checkUint16(length);
        writeUint16(length, outputStream);
        writeUint16Array(iArr, outputStream);
    }

    public static void writeUint16ArrayWithUint16Length(int[] iArr, byte[] bArr, int i) throws IOException {
        int length = iArr.length << 1;
        checkUint16(length);
        writeUint16(length, bArr, i);
        writeUint16Array(iArr, bArr, i + 2);
    }

    public static void writeUint24(int i, OutputStream outputStream) throws IOException {
        outputStream.write((byte) (i >>> 16));
        outputStream.write((byte) (i >>> 8));
        outputStream.write((byte) i);
    }

    public static void writeUint24(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) i;
    }

    public static void writeUint32(long j, OutputStream outputStream) throws IOException {
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) j));
    }

    public static void writeUint32(long j, byte[] bArr, int i) {
        bArr[i] = (byte) ((int) (j >>> 24));
        bArr[i + 1] = (byte) ((int) (j >>> 16));
        bArr[i + 2] = (byte) ((int) (j >>> 8));
        bArr[i + 3] = (byte) ((int) j);
    }

    public static void writeUint48(long j, OutputStream outputStream) throws IOException {
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) j));
    }

    public static void writeUint48(long j, byte[] bArr, int i) {
        bArr[i] = (byte) ((int) (j >>> 40));
        bArr[i + 1] = (byte) ((int) (j >>> 32));
        bArr[i + 2] = (byte) ((int) (j >>> 24));
        bArr[i + 3] = (byte) ((int) (j >>> 16));
        bArr[i + 4] = (byte) ((int) (j >>> 8));
        bArr[i + 5] = (byte) ((int) j);
    }

    public static void writeUint64(long j, OutputStream outputStream) throws IOException {
        outputStream.write((byte) ((int) (j >>> 56)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) j));
    }

    public static void writeUint64(long j, byte[] bArr, int i) {
        bArr[i] = (byte) ((int) (j >>> 56));
        bArr[i + 1] = (byte) ((int) (j >>> 48));
        bArr[i + 2] = (byte) ((int) (j >>> 40));
        bArr[i + 3] = (byte) ((int) (j >>> 32));
        bArr[i + 4] = (byte) ((int) (j >>> 24));
        bArr[i + 5] = (byte) ((int) (j >>> 16));
        bArr[i + 6] = (byte) ((int) (j >>> 8));
        bArr[i + 7] = (byte) ((int) j);
    }

    public static void writeUint8(int i, OutputStream outputStream) throws IOException {
        outputStream.write(i);
    }

    public static void writeUint8(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
    }

    public static void writeUint8(short s, OutputStream outputStream) throws IOException {
        outputStream.write(s);
    }

    public static void writeUint8(short s, byte[] bArr, int i) {
        bArr[i] = (byte) s;
    }

    public static void writeUint8Array(short[] sArr, OutputStream outputStream) throws IOException {
        for (short writeUint8 : sArr) {
            writeUint8(writeUint8, outputStream);
        }
    }

    public static void writeUint8Array(short[] sArr, byte[] bArr, int i) throws IOException {
        for (short writeUint8 : sArr) {
            writeUint8(writeUint8, bArr, i);
            i++;
        }
    }

    public static void writeUint8ArrayWithUint8Length(short[] sArr, OutputStream outputStream) throws IOException {
        checkUint8(sArr.length);
        writeUint8(sArr.length, outputStream);
        writeUint8Array(sArr, outputStream);
    }

    public static void writeUint8ArrayWithUint8Length(short[] sArr, byte[] bArr, int i) throws IOException {
        checkUint8(sArr.length);
        writeUint8(sArr.length, bArr, i);
        writeUint8Array(sArr, bArr, i + 1);
    }

    public static void writeVersion(ProtocolVersion protocolVersion, OutputStream outputStream) throws IOException {
        outputStream.write(protocolVersion.getMajorVersion());
        outputStream.write(protocolVersion.getMinorVersion());
    }

    public static void writeVersion(ProtocolVersion protocolVersion, byte[] bArr, int i) {
        bArr[i] = (byte) protocolVersion.getMajorVersion();
        bArr[i + 1] = (byte) protocolVersion.getMinorVersion();
    }
}
