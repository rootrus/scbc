package com.kofax.android.abc.document;

import android.graphics.Rect;

public class Field {
    private boolean m_owner;
    private long m_ptr;

    private native long nativeCreate();

    private native long nativeCreate(int i, int i2, Rect rect, String str, String str2, float f);

    private native long nativeCreateCopy(long j);

    private native void nativeDispose();

    private native float nativeGetConfidence();

    private native int nativeGetId();

    private native String nativeGetLabel();

    private native int nativeGetPageIndex();

    private native Rect nativeGetRectangle();

    private native String nativeGetValue();

    private native void nativeSetConfidence(float f);

    private native void nativeSetLabel(String str);

    private native void nativeSetPageIndex(int i);

    private native void nativeSetRectangle(Rect rect);

    private native void nativeSetValue(String str);

    private static native boolean nativeStaticInitializer();

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.document.Field: Static initializer failed.");
        }
    }

    public Field() {
        this.m_ptr = nativeCreate();
        this.m_owner = true;
    }

    public Field(long j, boolean z) {
        if (j == 0) {
            throw new IllegalArgumentException("com.kofax.android.abc.document.Field: ptr value cannot be null.");
        } else if (z) {
            this.m_ptr = nativeCreateCopy(j);
            this.m_owner = z;
        } else {
            this.m_ptr = j;
            this.m_owner = z;
        }
    }

    public Field(int i, int i2, Rect rect, String str, String str2, float f) {
        this.m_ptr = nativeCreate(i, i2, rect, str, str2, f);
    }

    public void dispose() {
        if (this.m_owner) {
            nativeDispose();
            this.m_ptr = 0;
        }
    }

    public int getId() {
        return nativeGetId();
    }

    public int getPageIndex() {
        return nativeGetPageIndex();
    }

    public void setPageIndex(int i) {
        nativeSetPageIndex(i);
    }

    public Rect getRectangle() {
        return nativeGetRectangle();
    }

    public void setRectangle(Rect rect) {
        nativeSetRectangle(rect);
    }

    public String getLabel() {
        return nativeGetLabel();
    }

    public void setLabel(String str) {
        nativeSetLabel(str);
    }

    public String getValue() {
        return nativeGetValue();
    }

    public void setValue(String str) {
        nativeSetValue(str);
    }

    public float getConfidence() {
        return nativeGetConfidence();
    }

    public void setConfidence(float f) {
        nativeSetConfidence(f);
    }

    public long getPtr() {
        return this.m_ptr;
    }
}
