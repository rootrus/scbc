package com.kofax.android.abc.xvrs;

public class XVrsDocument {
    protected XVrsDocumentBoundary m_boundary;
    protected String m_detector;
    private long m_impl;
    protected XVrsDocumentLandmark m_landmark;

    private native long nativeCreate(long j);

    private static native boolean nativeStaticInitializer();

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.xvrs.XVrsDocument: Static initializer failed.");
        }
    }

    public XVrsDocument(long j) {
        this.m_impl = nativeCreate(j);
    }

    public XVrsDocumentBoundary Boundary() {
        return this.m_boundary;
    }

    public XVrsDocumentLandmark Landmark() {
        return this.m_landmark;
    }

    public String DetectorName() {
        return this.m_detector;
    }

    public long getPtr() {
        return this.m_impl;
    }
}
