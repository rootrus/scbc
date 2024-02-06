package com.kofax.kmc.ken.engines.iplib;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;

public class IpImage {
    int mBitDepth = 0;
    int mChannels = 0;
    public int mDoFakeCall = 0;
    public int mDpiX = 0;
    public int mDpiY = 0;
    public ErrorInfo mErrorInfo;
    int mHeight = 0;
    public int mJniImageHandle = -1;
    int mWidth = 0;

    public int getChannels() {
        return this.mChannels;
    }

    public int getBitDepth() {
        return this.mBitDepth;
    }

    public int getDpiX() {
        return this.mDpiX;
    }

    public int getDpiY() {
        return this.mDpiY;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getHeight() {
        return this.mHeight;
    }
}
