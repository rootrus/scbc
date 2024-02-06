package com.kofax.kmc.ken.engines.gpu;

import android.graphics.Rect;

public class CaptureGuidance {
    protected long m_rectangle;

    private native long initRectangle(float[] fArr);

    private native void nativeFinalize();

    private native double nativeGetHorizontalMovementGuidance(int i, int i2, int i3, int i4, double d);

    private native double nativeGetTurnGuidance(double d);

    private native double nativeGetVerticalMovementGuidance(int i, int i2, int i3, int i4, double d);

    private native double nativeGetZoomGuidance(int i, int i2, int i3, int i4, double d, double d2);

    private static native boolean nativeStaticInitializer();

    static {
        System.loadLibrary("opencv_java3");
        System.loadLibrary("detection_based_tracker");
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.kmc.ken.engines.gpu.CaptureGuidance: Static initializer failed.");
        }
    }

    public CaptureGuidance(float[] fArr) {
        this.m_rectangle = initRectangle(fArr);
    }

    public double getZoomGuidance(Rect rect, double d, double d2) {
        return nativeGetZoomGuidance(rect.left, rect.top, rect.width(), rect.height(), d, d2);
    }

    public double getTurnGuidance(double d) {
        return nativeGetTurnGuidance(d);
    }

    public double getHorizontalMovementGuidance(Rect rect, double d) {
        return nativeGetHorizontalMovementGuidance(rect.left, rect.top, rect.width(), rect.height(), d);
    }

    public double getVerticalMovementGuidance(Rect rect, double d) {
        return nativeGetVerticalMovementGuidance(rect.left, rect.top, rect.width(), rect.height(), d);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        nativeFinalize();
        super.finalize();
    }
}
