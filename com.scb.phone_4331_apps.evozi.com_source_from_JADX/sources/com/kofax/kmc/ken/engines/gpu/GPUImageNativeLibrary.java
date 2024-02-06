package com.kofax.kmc.ken.engines.gpu;

public class GPUImageNativeLibrary {
    public static native boolean ContrastFactor(byte[] bArr, int i, int i2, int[] iArr, boolean z, int i3, int[] iArr2);

    public static native boolean DetectBounds(byte[] bArr, int i, int i2, float f, float f2, float f3, boolean z, float[] fArr);

    public static native void OtsyThreshold(byte[] bArr, int i, int i2, float f, float f2);

    static {
        System.loadLibrary("opencv_java3");
        System.loadLibrary("detection_based_tracker");
    }
}
