package com.kofax.android.abc.machine_vision;

import android.graphics.Bitmap;
import java.util.Vector;

public class DocumentTracker {
    public boolean ReuseLastInformation;
    public boolean RunBoundaryDetection;
    public boolean RunDetection;
    public boolean RunDirectionDetection;
    public boolean RunEdgeDetection;
    public boolean RunLocalSearch;
    public boolean RunRecognition;
    private long m_frame;
    private long m_impl = nativeCreate();

    private native long nativeCreate();

    private native void nativeDispose();

    private native Vector<TrackedDocument> nativeDocuments();

    private native Bitmap nativeGetProcessedImage();

    private static native String nativeGetVersion();

    private native void nativeGrabImageFrame(Bitmap bitmap);

    private native void nativeGrabVideoFrame(byte[] bArr, int i, int i2);

    private static native boolean nativeInit();

    private native void nativeInitializeFromFile(String str, String str2);

    private native void nativeInitializeFromString(String str, String str2);

    private native void nativeProcessFrame();

    private native void nativeReleaseFrame();

    private native void nativeReset();

    private native void nativeStartup();

    static {
        if (!nativeInit()) {
            throw new RuntimeException("com.kofax.android.abc.machine_vision: Static initializer failed.");
        }
    }

    public long getPtr() {
        return this.m_impl;
    }

    public static String getVersion() {
        return nativeGetVersion();
    }

    public void dispose() {
        nativeDispose();
        this.m_impl = 0;
    }

    public void initializeFile(String str, String str2) {
        nativeInitializeFromFile(str, str2);
    }

    public void initializeString(String str, String str2) {
        nativeInitializeFromString(str, str2);
    }

    public void reset() {
        nativeReset();
    }

    public void startup() {
        nativeStartup();
    }

    public void grabVideoFrame(byte[] bArr, int i, int i2, int i3) {
        if (i == 17) {
            nativeGrabVideoFrame(bArr, i2, i3);
            return;
        }
        throw new RuntimeException("DocumentTracker.grabVideoFrame: Invalid image format (must be NV21)");
    }

    public void grabImageFrame(Bitmap bitmap) {
        nativeGrabImageFrame(bitmap);
    }

    public void processFrame() {
        nativeProcessFrame();
    }

    public Bitmap getProcessedImage() {
        return nativeGetProcessedImage();
    }

    public void releaseFrame() {
        nativeReleaseFrame();
    }

    public Vector<TrackedDocument> Documents() {
        return nativeDocuments();
    }

    public long getInternalImage() {
        return this.m_frame;
    }
}
