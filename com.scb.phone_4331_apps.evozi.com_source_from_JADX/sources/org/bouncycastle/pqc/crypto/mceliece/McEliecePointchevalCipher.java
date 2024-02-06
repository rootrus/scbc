package org.bouncycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.prng.DigestRandomGenerator;
import org.bouncycastle.pqc.crypto.MessageEncryptor;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;

public class McEliecePointchevalCipher implements MessageEncryptor {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.2";
    private boolean forEncryption;

    /* renamed from: k */
    private int f6326k;
    McElieceCCA2KeyParameters key;
    private Digest messDigest;

    /* renamed from: n */
    private int f6327n;

    /* renamed from: sr */
    private SecureRandom f6328sr;

    /* renamed from: t */
    private int f6329t;

    /* access modifiers changed from: protected */
    public int decryptOutputSize(int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int encryptOutputSize(int i) {
        return 0;
    }

    public int getKeySize(McElieceCCA2KeyParameters mcElieceCCA2KeyParameters) throws IllegalArgumentException {
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PublicKeyParameters) {
            return ((McElieceCCA2PublicKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PrivateKeyParameters) {
            return ((McElieceCCA2PrivateKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        throw new IllegalArgumentException("unsupported type");
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncryption = z;
        if (!z) {
            McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (McElieceCCA2PrivateKeyParameters) cipherParameters;
            this.key = mcElieceCCA2PrivateKeyParameters;
            initCipherDecrypt(mcElieceCCA2PrivateKeyParameters);
        } else if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f6328sr = parametersWithRandom.getRandom();
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters) parametersWithRandom.getParameters();
            this.key = mcElieceCCA2PublicKeyParameters;
            initCipherEncrypt(mcElieceCCA2PublicKeyParameters);
        } else {
            this.f6328sr = new SecureRandom();
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters2 = (McElieceCCA2PublicKeyParameters) cipherParameters;
            this.key = mcElieceCCA2PublicKeyParameters2;
            initCipherEncrypt(mcElieceCCA2PublicKeyParameters2);
        }
    }

    public void initCipherDecrypt(McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters) {
        this.messDigest = Utils.getDigest(mcElieceCCA2PrivateKeyParameters.getDigest());
        this.f6327n = mcElieceCCA2PrivateKeyParameters.getN();
        this.f6326k = mcElieceCCA2PrivateKeyParameters.getK();
        this.f6329t = mcElieceCCA2PrivateKeyParameters.getT();
    }

    public void initCipherEncrypt(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        SecureRandom secureRandom = this.f6328sr;
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        this.f6328sr = secureRandom;
        this.messDigest = Utils.getDigest(mcElieceCCA2PublicKeyParameters.getDigest());
        this.f6327n = mcElieceCCA2PublicKeyParameters.getN();
        this.f6326k = mcElieceCCA2PublicKeyParameters.getK();
        this.f6329t = mcElieceCCA2PublicKeyParameters.getT();
    }

    public byte[] messageDecrypt(byte[] bArr) throws InvalidCipherTextException {
        if (!this.forEncryption) {
            int i = (this.f6327n + 7) >> 3;
            int length = bArr.length - i;
            byte[][] split = ByteUtils.split(bArr, i);
            byte[] bArr2 = split[0];
            byte[] bArr3 = split[1];
            GF2Vector[] decryptionPrimitive = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters) this.key, GF2Vector.OS2VP(this.f6327n, bArr2));
            byte[] encoded = decryptionPrimitive[0].getEncoded();
            GF2Vector gF2Vector = decryptionPrimitive[1];
            DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
            digestRandomGenerator.addSeedMaterial(encoded);
            byte[] bArr4 = new byte[length];
            digestRandomGenerator.nextBytes(bArr4);
            for (int i2 = 0; i2 < length; i2++) {
                bArr4[i2] = (byte) (bArr4[i2] ^ bArr3[i2]);
            }
            this.messDigest.update(bArr4, 0, length);
            byte[] bArr5 = new byte[this.messDigest.getDigestSize()];
            this.messDigest.doFinal(bArr5, 0);
            if (Conversions.encode(this.f6327n, this.f6329t, bArr5).equals(gF2Vector)) {
                return ByteUtils.split(bArr4, length - (this.f6326k >> 3))[0];
            }
            throw new InvalidCipherTextException("Bad Padding: Invalid ciphertext.");
        }
        throw new IllegalStateException("cipher initialised for decryption");
    }

    public byte[] messageEncrypt(byte[] bArr) {
        if (this.forEncryption) {
            int i = this.f6326k >> 3;
            byte[] bArr2 = new byte[i];
            this.f6328sr.nextBytes(bArr2);
            GF2Vector gF2Vector = new GF2Vector(this.f6326k, this.f6328sr);
            byte[] encoded = gF2Vector.getEncoded();
            byte[] concatenate = ByteUtils.concatenate(bArr, bArr2);
            this.messDigest.update(concatenate, 0, concatenate.length);
            byte[] bArr3 = new byte[this.messDigest.getDigestSize()];
            this.messDigest.doFinal(bArr3, 0);
            byte[] encoded2 = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters) this.key, gF2Vector, Conversions.encode(this.f6327n, this.f6329t, bArr3)).getEncoded();
            DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
            digestRandomGenerator.addSeedMaterial(encoded);
            byte[] bArr4 = new byte[(bArr.length + i)];
            digestRandomGenerator.nextBytes(bArr4);
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArr4[i2] = (byte) (bArr4[i2] ^ bArr[i2]);
            }
            for (int i3 = 0; i3 < i; i3++) {
                int length = bArr.length + i3;
                bArr4[length] = (byte) (bArr4[length] ^ bArr2[i3]);
            }
            return ByteUtils.concatenate(encoded2, bArr4);
        }
        throw new IllegalStateException("cipher initialised for decryption");
    }
}
