package com.kofax.android.abc.xvrs;

public class XVrsAutoCrop {
    private long m_impl = nativeCreate();

    private native long nativeCreate();

    private native void nativeDispose();

    private native XVrsImage nativeGetProcessedImage();

    private native void nativeInitializeFromFile(String str, String str2);

    private native void nativeInitializeFromString(String str, String str2);

    private native void nativeProcess(long j);

    private static native boolean nativeStaticInitializer();

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.xvrs.XVrsAutoOrientation: Static initializer failed.");
        }
    }

    public long getPtr() {
        return this.m_impl;
    }

    public void dispose() {
        nativeDispose();
        this.m_impl = 0;
    }

    public void loadConfigurationFile(String str, String str2) {
        nativeInitializeFromFile(str, str2);
    }

    public void loadConfigurationString(String str, String str2) {
        nativeInitializeFromString(str, str2);
    }

    public void process(XVrsImage xVrsImage) {
        nativeProcess(xVrsImage.getPtr());
    }

    public XVrsImage getProcessedImage() {
        return nativeGetProcessedImage();
    }
}
