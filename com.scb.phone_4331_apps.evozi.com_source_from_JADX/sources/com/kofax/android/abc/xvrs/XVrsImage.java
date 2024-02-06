package com.kofax.android.abc.xvrs;

import android.graphics.Bitmap;

public class XVrsImage {
    private long m_impl;
    private int m_rc;

    private native int nativeChannels();

    private native XVrsImage nativeClone();

    private native long nativeCreate();

    private native long nativeCreate(int i, int i2, int i3);

    private native long nativeCreate(Bitmap bitmap);

    private native long nativeCreate(String str);

    private native long nativeCreate(byte[] bArr, int i, int i2);

    private native void nativeDispose();

    private native int nativeFromBitmap(Bitmap bitmap);

    private native int nativeHeight();

    private static native boolean nativeStaticInitializer();

    private native Bitmap nativeToBitmap();

    private native boolean nativeToFile(String str);

    private native int nativeWidth();

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.xvrs.XvrsImage: Static initializer failed.");
        }
    }

    public XVrsImage() {
        this.m_impl = nativeCreate();
    }

    public XVrsImage(int i, int i2, int i3) {
        this.m_impl = nativeCreate(i, i2, i3);
    }

    public XVrsImage(String str) {
        this.m_impl = nativeCreate(str);
    }

    public XVrsImage(Bitmap bitmap) {
        this.m_impl = nativeCreate(bitmap);
    }

    public XVrsImage(byte[] bArr, int i, int i2) {
        this.m_impl = nativeCreate(bArr, i, i2);
    }

    public XVrsImage(long j) {
        this.m_impl = j;
    }

    public void dispose() {
        nativeDispose();
        this.m_impl = 0;
    }

    public XVrsImage copy() {
        return nativeClone();
    }

    public long getPtr() {
        return this.m_impl;
    }

    public void setPtr(long j) {
        this.m_impl = j;
    }

    public long getLastReturnCode() {
        return (long) this.m_rc;
    }

    public boolean toFile(String str) {
        return nativeToFile(str);
    }

    public int fromBitmap(Bitmap bitmap) {
        return nativeFromBitmap(bitmap);
    }

    public Bitmap toBitmap() {
        return nativeToBitmap();
    }

    public int channels() {
        return nativeChannels();
    }

    public int width() {
        return nativeWidth();
    }

    public int height() {
        return nativeHeight();
    }
}
