package com.kofax.android.abc.machine_vision;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.Vector;

public class CaptureGuidance {
    protected long m_docPointer;
    protected long m_impl = nativeCreate();
    protected int m_sourceValue;

    private native void nativeAreEdgesInView(boolean[] zArr, int i, int i2);

    private native long nativeCreate();

    private native Vector<Point> nativeGetDocumentRectangle();

    private native double nativeGetHorizontalMovementGuidance(int i, int i2, int i3, int i4, double d);

    private native double nativeGetTurnGuidance(double d);

    private native double nativeGetVerticalMovementGuidance(int i, int i2, int i3, int i4, double d);

    private native double nativeGetZoomGuidance(int i, int i2, int i3, int i4, double d, double d2);

    private native boolean nativeIsAspectRatioWithinLimits(double d, double d2);

    private native boolean nativeIsAspectRatioWithinLimits(double d, double d2, boolean z);

    private native boolean nativeIsEdgeSupportStrongerThanThreshold();

    private native boolean nativeIsGuidanceAvailable();

    private native boolean nativeIsInternalContrastLowerThanThreshold();

    private native boolean nativeIsTargetRectangleBottomEdgeFilled(int i, int i2, int i3, int i4, double d, double d2);

    private native boolean nativeIsTargetRectangleFilled(int i, int i2, int i3, int i4, double d, double d2);

    private static native boolean nativeStaticInitializer();

    public enum GuidanceSource {
        EDGES(0),
        REFERENCE_FEATURE(1),
        BEST_RECTANGLE(2);
        
        private int m_value;

        private GuidanceSource(int i) {
            this.m_value = i;
        }

        public final int value() {
            return this.m_value;
        }
    }

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.machine_vision.CaptureGuidance: Static initializer failed.");
        }
    }

    public CaptureGuidance(TrackedDocument trackedDocument, GuidanceSource guidanceSource) {
        this.m_docPointer = trackedDocument.m_impl;
        this.m_sourceValue = guidanceSource.value();
    }

    public boolean isGuidanceAvailable() {
        return nativeIsGuidanceAvailable();
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

    public boolean isAspectRatioWithinLimits(double d, double d2) {
        return nativeIsAspectRatioWithinLimits(d, d2);
    }

    public boolean isAspectRatioWithinLimits(double d, double d2, boolean z) {
        return nativeIsAspectRatioWithinLimits(d, d2, z);
    }

    public boolean isEdgeSupportStrongerThanThreshold() {
        return nativeIsEdgeSupportStrongerThanThreshold();
    }

    public boolean isInternalContrastLowerThanThreshold() {
        return nativeIsInternalContrastLowerThanThreshold();
    }

    public boolean isTargetRectangleFilled(Rect rect, double d, double d2) {
        return nativeIsTargetRectangleFilled(rect.left, rect.top, rect.width(), rect.height(), d, d2);
    }

    public boolean isTargetRectangleBottomEdgeFilled(Rect rect, double d, double d2) {
        return nativeIsTargetRectangleBottomEdgeFilled(rect.left, rect.top, rect.width(), rect.height(), d, d2);
    }

    public boolean[] areEdgesInView(int i, int i2) {
        boolean[] zArr = new boolean[5];
        nativeAreEdgesInView(zArr, i, i2);
        return zArr;
    }

    public Vector<Point> getDocumentRectangle() {
        return nativeGetDocumentRectangle();
    }
}
