package com.kofax.android.abc.vrs;

import android.graphics.Bitmap;
import org.bouncycastle.asn1.x509.DisplayText;

public class VrsImage {
    private long m_impl = nativeCreate();
    private int m_rc;

    private native long nativeCreate();

    private native void nativeDispose();

    private native int nativeFromBitmap(Bitmap bitmap, int i);

    private native int nativeFromFile(String str);

    private native void nativeScale(double d, int i, int i2, long j);

    private static native boolean nativeStaticInitializer();

    private native Bitmap nativeToBitmap();

    private native int nativeToFile(String str);

    private native int nativeToFile(String str, int i);

    public native int fromGrayscale(byte[] bArr, int i, int i2, int i3);

    public native int fromNv21(byte[] bArr, int i, int i2, int i3);

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.vrs.VrsImage: Static initializer failed.");
        }
    }

    public void dispose() {
        nativeDispose();
        this.m_impl = 0;
    }

    public long getPtr() {
        return this.m_impl;
    }

    public long getLastReturnCode() {
        return (long) this.m_rc;
    }

    public int fromFile(String str) {
        return nativeFromFile(str);
    }

    public int toFile(String str) {
        return nativeToFile(str);
    }

    public int toFile(String str, int i) {
        return nativeToFile(str, i);
    }

    public int fromBitmap(Bitmap bitmap) {
        return fromBitmap(bitmap, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
    }

    public int fromBitmap(Bitmap bitmap, int i) {
        return nativeFromBitmap(bitmap, i);
    }

    public Bitmap toBitmap() {
        return nativeToBitmap();
    }

    public VrsImage scale(double d, int i, int i2) {
        VrsImage vrsImage = new VrsImage();
        nativeScale(d, i, i2, vrsImage.getPtr());
        return vrsImage;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        dispose();
    }
}
