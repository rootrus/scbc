package com.kofax.android.abc.xvrs;

import android.graphics.Point;
import java.util.Vector;

public class XVrsDocumentBoundary {
    protected float[] m_confidences;
    protected Vector<Point> m_corners;

    private native void nativeCreate(long j);

    private static native boolean nativeStaticInitializer();

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.xvrs.XVrsDocumentBoundary: Static initializer failed.");
        }
    }

    public XVrsDocumentBoundary(long j) {
        nativeCreate(j);
    }

    public Vector<Point> Corners() {
        return this.m_corners;
    }

    public float[] Confidences() {
        return this.m_confidences;
    }
}
