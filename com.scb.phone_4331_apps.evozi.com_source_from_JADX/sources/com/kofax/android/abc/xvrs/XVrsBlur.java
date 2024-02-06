package com.kofax.android.abc.xvrs;

public class XVrsBlur {
    private native float nativeDetect(long j);

    public float detect(XVrsImage xVrsImage) {
        return nativeDetect(xVrsImage.getPtr());
    }
}
