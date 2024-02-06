package com.kofax.android.abc.configuration;

import java.util.ArrayList;

public class Configuration {
    private long m_ptr;

    private native long nativeCreate();

    private native void nativeDispose();

    private native String nativeGetStringValue(String str);

    private native ArrayList<String> nativeGetStringValues(String str);

    private native void nativeLoadFromFile(String str);

    private native void nativeLoadFromString(String str);

    private native void nativeSaveToFile(String str);

    private native String nativeSaveToString();

    private native void nativeSetBoolValue(String str, boolean z);

    private native void nativeSetStringValue(String str, String str2);

    private static native boolean nativeStaticInitializer();

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.document.Configuration: Static initializer failed.");
        }
    }

    public Configuration() {
        this.m_ptr = nativeCreate();
    }

    public Configuration(long j) {
        this.m_ptr = j;
    }

    public void dispose() {
        nativeDispose();
        this.m_ptr = 0;
    }

    public long getPtr() {
        return this.m_ptr;
    }

    public void loadFromFile(String str) {
        nativeLoadFromFile(str);
    }

    public void loadFromString(String str) {
        nativeLoadFromString(str);
    }

    public void saveToFile(String str) {
        nativeSaveToFile(str);
    }

    public String saveToString() {
        return nativeSaveToString();
    }

    public void setStringValue(String str, String str2) {
        nativeSetStringValue(str, str2);
    }

    public void setBoolValue(String str, boolean z) {
        nativeSetBoolValue(str, z);
    }

    public String getStringValue(String str) {
        return nativeGetStringValue(str);
    }

    public ArrayList<String> getStringValues(String str) {
        return nativeGetStringValues(str);
    }
}
