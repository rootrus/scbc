package com.kofax.android.abc.machine_vision;

public class TrackedDocument {
    protected DetectedDocumentBoundary m_Boundary;
    protected String m_Category;
    protected int m_ConsecutiveFramesClassified;
    protected int m_ConsecutiveFramesStable;
    protected int m_ConsecutiveFramesUnclassified;
    protected String m_DetectorName;
    protected boolean m_IsActive;
    protected boolean m_IsComplete;
    protected boolean m_IsInternalContrastLow;
    protected DetectedReferenceFeature m_ReferenceFeature;
    protected long m_impl;

    public boolean IsActive() {
        return this.m_IsActive;
    }

    public boolean IsComplete() {
        return this.m_IsComplete;
    }

    public int ConsecutiveFramesStable() {
        return this.m_ConsecutiveFramesStable;
    }

    public int ConsecutiveFramesClassified() {
        return this.m_ConsecutiveFramesClassified;
    }

    public int ConsecutiveFramesUnclassified() {
        return this.m_ConsecutiveFramesUnclassified;
    }

    public boolean IsInternalContrastLow() {
        return this.m_IsInternalContrastLow;
    }

    public DetectedDocumentBoundary Boundary() {
        return this.m_Boundary;
    }

    public DetectedReferenceFeature ReferenceFeature() {
        return this.m_ReferenceFeature;
    }

    public String DetectorName() {
        return this.m_DetectorName;
    }

    public String Category() {
        return this.m_Category;
    }
}
