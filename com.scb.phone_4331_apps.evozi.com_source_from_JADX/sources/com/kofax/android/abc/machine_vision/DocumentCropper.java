package com.kofax.android.abc.machine_vision;

import android.graphics.Bitmap;

public class DocumentCropper {
    private long m_impl = nativeCreate();

    private native long nativeCreate();

    private native Bitmap nativeCropImage(Bitmap bitmap);

    private native void nativeDispose();

    private static native boolean nativeInit();

    private native void nativeInitializeFromFile(String str, String str2);

    private native void nativeInitializeFromString(String str, String str2);

    static {
        if (!nativeInit()) {
            throw new RuntimeException("com.kofax.android.abc.machine_vision: Static initializer failed.");
        }
    }

    public void dispose() {
        nativeDispose();
        this.m_impl = 0;
    }

    public void initializeFile(String str, String str2) {
        nativeInitializeFromFile(str, str2);
    }

    public void initializeString(String str, String str2) {
        nativeInitializeFromString(str, str2);
    }

    public Bitmap cropImage(Bitmap bitmap) {
        return nativeCropImage(bitmap);
    }
}
