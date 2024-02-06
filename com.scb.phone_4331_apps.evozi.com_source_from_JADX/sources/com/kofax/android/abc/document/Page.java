package com.kofax.android.abc.document;

public class Page {
    private boolean m_owner;
    private long m_ptr;

    private native long nativeCreate();

    private native long nativeCreateCopy(long j);

    private native void nativeDispose();

    private native int nativeGetHeight();

    private native String nativeGetPageImageFileName();

    private native int nativeGetPageIndex();

    private native int nativeGetWidth();

    private native void nativeSetPageImageFileName(String str);

    private static native boolean nativeStaticInitializer();

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.document.Page: Static initializer failed.");
        }
    }

    public Page() {
        this.m_ptr = nativeCreate();
        this.m_owner = true;
    }

    public Page(long j, boolean z) {
        if (j == 0) {
            throw new IllegalArgumentException("com.kofax.android.abc.document.Page: ptr value cannot be null.");
        } else if (z) {
            this.m_ptr = nativeCreateCopy(j);
            this.m_owner = z;
        } else {
            this.m_ptr = j;
            this.m_owner = z;
        }
    }

    public void dispose() {
        if (this.m_owner) {
            nativeDispose();
            this.m_ptr = 0;
        }
    }

    public int getPageIndex() {
        return nativeGetPageIndex();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public void setPageImageFileName(String str) {
        nativeSetPageImageFileName(str);
    }

    public String getPageImageFileName() {
        return nativeGetPageImageFileName();
    }

    public long getPtr() {
        return this.m_ptr;
    }
}
