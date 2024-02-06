package com.kofax.android.abc.image_classification;

import android.graphics.Bitmap;
import java.util.Vector;

public class ImageClassifier {
    private long m_ImageClassifierPtr;
    private boolean m_owner;

    private native void nativeClassify(int i, int i2, int i3, int i4, long j, int i5);

    private native void nativeClassify(Bitmap bitmap, int i);

    private native void nativeClassify(String str, int i);

    private native void nativeConfigure(String str);

    private native long nativeCreate();

    private native void nativeDispose();

    private native Vector<ResultPair> nativeGetClassificationResults();

    private static native String nativeGetVersion();

    private native void nativeLoadModel(String str);

    private static native boolean nativeStaticInitializer();

    static {
        if (nativeStaticInitializer()) {
            System.loadLibrary("sol_isg_mobile");
            return;
        }
        throw new RuntimeException("com.kofax.android.abc.image_classification: Static initializer failed.");
    }

    public ImageClassifier() {
        this.m_ImageClassifierPtr = nativeCreate();
        this.m_owner = true;
    }

    public ImageClassifier(long j) {
        this.m_ImageClassifierPtr = j;
        this.m_owner = false;
    }

    public void dispose() {
        if (this.m_owner) {
            nativeDispose();
        }
        this.m_ImageClassifierPtr = 0;
        this.m_owner = false;
    }

    public long getPtr() {
        return this.m_ImageClassifierPtr;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        dispose();
    }

    public static String getVersion() {
        return nativeGetVersion();
    }

    public void loadConfigurationFile(String str) {
        nativeConfigure(str);
    }

    public void loadModel(String str) {
        nativeLoadModel(str);
    }

    public void classify(String str, int i) {
        nativeClassify(str, i);
    }

    public void classify(int i, int i2, int i3, int i4, long j, int i5) {
        nativeClassify(i, i2, i3, i4, j, i5);
    }

    public void classify(Bitmap bitmap, int i) {
        nativeClassify(bitmap, i);
    }

    public Vector<ResultPair> getClassificationResults() {
        return nativeGetClassificationResults();
    }
}
