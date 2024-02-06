package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;

public final class GOST3411_2012_256Digest extends GOST3411_2012Digest {

    /* renamed from: IV */
    private static final byte[] f5692IV = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public GOST3411_2012_256Digest() {
        super(f5692IV);
    }

    public GOST3411_2012_256Digest(GOST3411_2012_256Digest gOST3411_2012_256Digest) {
        super(f5692IV);
        reset(gOST3411_2012_256Digest);
    }

    public final Memoable copy() {
        return new GOST3411_2012_256Digest(this);
    }

    public final int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = new byte[64];
        super.doFinal(bArr2, 0);
        System.arraycopy(bArr2, 32, bArr, i, 32);
        return 32;
    }

    public final String getAlgorithmName() {
        return "GOST3411-2012-256";
    }

    public final int getDigestSize() {
        return 32;
    }
}
