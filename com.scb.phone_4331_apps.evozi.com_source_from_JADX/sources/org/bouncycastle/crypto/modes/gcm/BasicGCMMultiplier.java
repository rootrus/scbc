package org.bouncycastle.crypto.modes.gcm;

public class BasicGCMMultiplier implements GCMMultiplier {

    /* renamed from: H */
    private int[] f6008H;

    public void init(byte[] bArr) {
        this.f6008H = GCMUtil.asInts(bArr);
    }

    public void multiplyH(byte[] bArr) {
        int[] asInts = GCMUtil.asInts(bArr);
        GCMUtil.multiply(asInts, this.f6008H);
        GCMUtil.asBytes(asInts, bArr);
    }
}
