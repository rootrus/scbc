package com.kofax.android.abc.document;

import android.graphics.Rect;

public class Element {
    private boolean m_owner;
    private long m_ptr;

    private native long nativeCreate();

    private native long nativeCreate(int i, int i2, Rect rect, String str);

    private native long nativeCreateCopy(long j);

    private native void nativeDispose();

    private native int nativeGetFieldIndex(long j);

    private native int nativeGetId();

    private native int nativeGetPageIndex();

    private native Rect nativeGetRectangle(long j, boolean z, boolean z2);

    private native String nativeGetToken();

    private native void nativeSetPageIndex(int i);

    private native void nativeSetRectangle(Rect rect);

    private native void nativeSetToken(String str);

    private static native boolean nativeStaticInitializer();

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.document.Element: Static initializer failed.");
        }
    }

    public Element() {
        this.m_ptr = nativeCreate();
        this.m_owner = true;
    }

    public Element(long j, boolean z) {
        if (j == 0) {
            throw new IllegalArgumentException("com.kofax.android.abc.document.Element: ptr value cannot be null.");
        } else if (z) {
            this.m_ptr = nativeCreateCopy(j);
            this.m_owner = z;
        } else {
            this.m_ptr = j;
            this.m_owner = z;
        }
    }

    public Element(int i, int i2, Rect rect, String str) {
        this.m_ptr = nativeCreate(i, i2, rect, str);
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
        return nativeGetRectangle(0, false, false);
    }

    public Rect getRectangle(Document document, boolean z, boolean z2) {
        return nativeGetRectangle(document.getPtr(), z, z2);
    }

    public void setRectangle(Rect rect) {
        nativeSetRectangle(rect);
    }

    public String getToken() {
        return nativeGetToken();
    }

    public void setToken(String str) {
        nativeSetToken(str);
    }

    public int getFieldIndex(Document document) {
        return nativeGetFieldIndex(document.getPtr());
    }

    public long getPtr() {
        return this.m_ptr;
    }
}
