package com.kofax.android.abc.machine_vision;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.util.Vector;

public class ShadowDetector {
    private long m_frame;
    private long m_impl = nativeCreate();

    private native void nativeAdornFrame();

    private native int nativeAverageLightness();

    private native void nativeConfigureFromFile(String str, String str2);

    private native void nativeConfigureFromString(String str, String str2);

    private native long nativeCreate();

    private native double nativeDetectShadows();

    private native double nativeDetectShadows(Vector<Point> vector);

    private native void nativeDispose();

    private native Bitmap nativeGetProcessedImage();

    private native Vector<Point> nativeGetShadowContours();

    private static native String nativeGetVersion();

    private native void nativeGrabImageFrame(Bitmap bitmap);

    private native void nativeGrabVideoFrame(long j);

    private native void nativeReleaseFrame();

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
        nativeConfigureFromFile(str, str2);
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

    public double detectShadows() {
        return nativeDetectShadows();
    }

    public double detectShadows(Vector<Point> vector) {
        return nativeDetectShadows(vector);
    }

    public Vector<Point> getShadowContours() {
        return nativeGetShadowContours();
    }

    public int averageLightness() {
        return nativeAverageLightness();
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
