package com.kofax.android.abc.xvrs;

public class XVrsOperations {
    private static native void nativeRotateImage(long j, long j2, int i);

    public static void rotate(XVrsImage xVrsImage, XVrsImage xVrsImage2, int i) {
        nativeRotateImage(xVrsImage.getPtr(), xVrsImage2.getPtr(), i);
    }
}
