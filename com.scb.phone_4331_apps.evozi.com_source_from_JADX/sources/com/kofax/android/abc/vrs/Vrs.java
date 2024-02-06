package com.kofax.android.abc.vrs;

public class Vrs {
    private int m_rc;

    private native String nativeBinarize(long j, long j2, int i);

    private static native String nativeError(int i);

    private static native int nativeInitialize(String str);

    private native String nativeKtdxXML(long j, String str);

    private native String nativeProcessPage(long j, String str, long j2, int i);

    private static native boolean nativeStaticInitializer();

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.vrs.Vrs: Static initializer failed.");
        }
    }

    public static int initialize(String str) {
        return nativeInitialize(str);
    }

    public String processPage(VrsImage vrsImage, String str, VrsImage vrsImage2) {
        return nativeProcessPage(vrsImage.getPtr(), str, vrsImage2.getPtr(), -1);
    }

    public String processPage(VrsImage vrsImage, String str, VrsImage vrsImage2, int i) {
        return nativeProcessPage(vrsImage.getPtr(), str, vrsImage2.getPtr(), i);
    }

    public String getErrorMessage(int i) {
        return nativeError(i);
    }

    public int getLastReturnCode() {
        return this.m_rc;
    }

    public String binarize(VrsImage vrsImage, VrsImage vrsImage2) {
        return nativeBinarize(vrsImage.getPtr(), vrsImage2.getPtr(), -1);
    }

    public String getKtdxXML(VrsImage vrsImage, String str) {
        return nativeKtdxXML(vrsImage.getPtr(), str);
    }
}
