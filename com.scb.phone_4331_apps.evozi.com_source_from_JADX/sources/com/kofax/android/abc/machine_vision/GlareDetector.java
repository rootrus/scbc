package com.kofax.android.abc.machine_vision;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.util.Vector;

public class GlareDetector {
    private long m_frame;
    private long m_impl = nativeCreate();
    private boolean m_owner;

    private native void nativeAdornFrame();

    private native void nativeConfigure(String str, String str2);

    private native void nativeConfigureFromString(String str, String str2);

    private native long nativeCreate();

    private native double nativeDetectGlare();

    private native void nativeDispose();

    private native Vector<Point> nativeGetGlareContours();

    private native double nativeGetGlareFraction(Vector<Point> vector);

    private native Bitmap nativeGetProcessedImage();

    private static native String nativeGetVersion();

    private native void nativeGrabImageFrame(Bitmap bitmap);

    private native void nativeGrabVideoFrame(long j);

    private native void nativeReleaseFrame();

    private native void nativeRemoveGlare();

    private static native boolean nativeStaticInitializer();

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.machine_vision.GlareDetector: Static initializer failed.");
        }
    }

    public void dispose() {
        nativeDispose();
        this.m_impl = 0;
    }

    public long getPtr() {
        return this.m_impl;
    }

    public static String getVersion() {
        return nativeGetVersion();
    }

    public void loadConfigurationFile(String str, String str2) {
        nativeConfigure(str, str2);
    }

    public void loadConfigurationString(String str, String str2) {
        nativeConfigureFromString(str, str2);
    }

    public void grabVideoFrame(long j) {
        nativeGrabVideoFrame(j);
    }

    public void grabImageFrame(Bitmap bitmap) {
        nativeGrabImageFrame(bitmap);
    }

    public double detectGlare() {
        return nativeDetectGlare();
    }

    public Vector<Point> getGlareContours() {
        return nativeGetGlareContours();
    }

    public double getGlareFraction(Vector<Point> vector) {
        return nativeGetGlareFraction(vector);
    }

    public void removeGlare() {
        nativeRemoveGlare();
    }

    public void adornFrame() {
        nativeAdornFrame();
    }

    public Bitmap getProcessedImage() {
        return nativeGetProcessedImage();
    }

    public void releaseFrame() {
        nativeReleaseFrame();
    }
}
