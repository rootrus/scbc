package com.kofax.android.abc.xvrs.Detection;

import com.kofax.android.abc.xvrs.XVrsDocument;
import com.kofax.android.abc.xvrs.XVrsImage;

public class XVrsDetectionVisualizer {
    private long m_impl;

    private static native void nativeAdornBoundary(long j, long j2);

    private static native void nativeAdornProjectedBoundary(long j, long j2);

    private static native void nativeAdornReferenceFeature(long j, long j2);

    public static void adornBoundary(XVrsImage xVrsImage, XVrsDocument xVrsDocument) {
        nativeAdornBoundary(xVrsImage.getPtr(), xVrsDocument.getPtr());
    }

    public static void adornProjectedBoundary(XVrsImage xVrsImage, XVrsDocument xVrsDocument) {
        nativeAdornProjectedBoundary(xVrsImage.getPtr(), xVrsDocument.getPtr());
    }

    public static void adornReferenceFeature(XVrsImage xVrsImage, XVrsDocument xVrsDocument) {
        nativeAdornReferenceFeature(xVrsImage.getPtr(), xVrsDocument.getPtr());
    }
}
