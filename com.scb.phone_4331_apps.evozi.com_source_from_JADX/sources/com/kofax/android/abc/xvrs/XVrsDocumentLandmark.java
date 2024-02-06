package com.kofax.android.abc.xvrs;

import android.graphics.Point;
import java.util.Vector;

public class XVrsDocumentLandmark {
    protected Vector<Point> m_corners;
    protected LandmarkType m_landmark_type;
    protected Vector<Point> m_projectedCorners;

    public enum LandmarkType {
        NOT_FOUND,
        MICR,
        MRZ,
        BARCODE
    }

    private native void nativeCreate(long j);

    private static native boolean nativeStaticInitializer();

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.xvrs.XVrsDocumentLandmark: Static initializer failed.");
        }
    }

    public LandmarkType getLandmark() {
        return this.m_landmark_type;
    }

    public Vector<Point> getCorners() {
        return this.m_corners;
    }

    public Vector<Point> getProjectedCorners() {
        return this.m_projectedCorners;
    }

    public XVrsDocumentLandmark(long j) {
        nativeCreate(j);
    }
}
