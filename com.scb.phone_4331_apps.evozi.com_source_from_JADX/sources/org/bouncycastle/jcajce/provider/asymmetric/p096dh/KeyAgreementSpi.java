package org.bouncycastle.jcajce.provider.asymmetric.p096dh;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.agreement.kdf.DHKEKGenerator;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;

/* renamed from: org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi */
public class KeyAgreementSpi extends BaseAgreementSpi {

    /* renamed from: g */
    private BigInteger f6107g;

    /* renamed from: p */
    private BigInteger f6108p;
    private BigInteger result;

    /* renamed from: x */
    private BigInteger f6109x;

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithRFC2631KDF */
    public static class DHwithRFC2631KDF extends KeyAgreementSpi {
        public DHwithRFC2631KDF() {
            super("DHwithRFC2631KDF", new DHKEKGenerator(new SHA1Digest()));
        }
    }

    public KeyAgreementSpi() {
        super("Diffie-Hellman", (DerivationFunction) null);
    }

    public KeyAgreementSpi(String str, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
    }

    /* access modifiers changed from: protected */
    public byte[] bigIntToBytes(BigInteger bigInteger) {
        int bitLength = (this.f6108p.bitLength() + 7) / 8;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == bitLength) {
            return byteArray;
        }
        if (byteArray[0] == 0 && byteArray.length == bitLength + 1) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            return bArr;
        }
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(byteArray, 0, bArr2, bitLength - byteArray.length, byteArray.length);
        return bArr2;
    }

    public byte[] calcSecret() {
        return bigIntToBytes(this.result);
    }

    /* access modifiers changed from: protected */
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        if (this.f6109x == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        } else if (key instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) key;
            if (!dHPublicKey.getParams().getG().equals(this.f6107g) || !dHPublicKey.getParams().getP().equals(this.f6108p)) {
                throw new InvalidKeyException("DHPublicKey not for this KeyAgreement!");
            } else if (z) {
                this.result = dHPublicKey.getY().modPow(this.f6109x, this.f6108p);
                return null;
            } else {
                BigInteger modPow = dHPublicKey.getY().modPow(this.f6109x, this.f6108p);
                this.result = modPow;
                return new BCDHPublicKey(modPow, dHPublicKey.getParams());
            }
        } else {
            throw new InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
        }
    }

    public int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        if (this.f6109x != null) {
            return super.engineGenerateSecret(bArr, i);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    public SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        if (this.f6109x != null) {
            return str.equals("TlsPremasterSecret") ? new SecretKeySpec(trimZeroes(bigIntToBytes(this.result)), str) : super.engineGenerateSecret(str);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.f6109x != null) {
            return super.engineGenerateSecret();
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    /* access modifiers changed from: protected */
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (key instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            this.f6108p = dHPrivateKey.getParams().getP();
            this.f6107g = dHPrivateKey.getParams().getG();
            BigInteger x = dHPrivateKey.getX();
            this.result = x;
            this.f6109x = x;
            return;
        }
        throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
    }

    /* access modifiers changed from: protected */
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        DHParameterSpec dHParameterSpec;
        if (key instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            if (algorithmParameterSpec == null) {
                this.f6108p = dHPrivateKey.getParams().getP();
                dHParameterSpec = dHPrivateKey.getParams();
            } else if (algorithmParameterSpec instanceof DHParameterSpec) {
                dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                this.f6108p = dHParameterSpec.getP();
            } else if (algorithmParameterSpec instanceof UserKeyingMaterialSpec) {
                this.f6108p = dHPrivateKey.getParams().getP();
                this.f6107g = dHPrivateKey.getParams().getG();
                this.ukmParameters = ((UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial();
                BigInteger x = dHPrivateKey.getX();
                this.result = x;
                this.f6109x = x;
                return;
            } else {
                throw new InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
            }
            this.f6107g = dHParameterSpec.getG();
            BigInteger x2 = dHPrivateKey.getX();
            this.result = x2;
            this.f6109x = x2;
            return;
        }
        throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
    }
}
