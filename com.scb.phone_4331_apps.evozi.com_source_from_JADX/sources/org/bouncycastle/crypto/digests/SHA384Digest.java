package org.bouncycastle.crypto.digests;

import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public class SHA384Digest extends LongDigest {
    private static final int DIGEST_LENGTH = 48;

    public SHA384Digest() {
    }

    public SHA384Digest(SHA384Digest sHA384Digest) {
        super(sHA384Digest);
    }

    public SHA384Digest(byte[] bArr) {
        restoreState(bArr);
    }

    public Memoable copy() {
        return new SHA384Digest(this);
    }

    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.longToBigEndian(this.f5696H1, bArr, i);
        Pack.longToBigEndian(this.f5697H2, bArr, i + 8);
        Pack.longToBigEndian(this.f5698H3, bArr, i + 16);
        Pack.longToBigEndian(this.f5699H4, bArr, i + 24);
        Pack.longToBigEndian(this.f5700H5, bArr, i + 32);
        Pack.longToBigEndian(this.f5701H6, bArr, i + 40);
        reset();
        return 48;
    }

    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA384;
    }

    public int getDigestSize() {
        return 48;
    }

    public byte[] getEncodedState() {
        byte[] bArr = new byte[getEncodedStateSize()];
        super.populateState(bArr);
        return bArr;
    }

    public void reset() {
        super.reset();
        this.f5696H1 = -3766243637369397544L;
        this.f5697H2 = 7105036623409894663L;
        this.f5698H3 = -7973340178411365097L;
        this.f5699H4 = 1526699215303891257L;
        this.f5700H5 = 7436329637833083697L;
        this.f5701H6 = -8163818279084223215L;
        this.f5702H7 = -2662702644619276377L;
        this.f5703H8 = 5167115440072839076L;
    }

    public void reset(Memoable memoable) {
        super.copyIn((SHA384Digest) memoable);
    }
}
