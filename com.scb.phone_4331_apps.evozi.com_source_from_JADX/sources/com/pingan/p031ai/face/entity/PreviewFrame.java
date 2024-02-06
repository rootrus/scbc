package com.pingan.p031ai.face.entity;

import com.pingan.p031ai.C1033r;
import com.pingan.p031ai.C1035t;

/* renamed from: com.pingan.ai.face.entity.PreviewFrame */
public class PreviewFrame {
    public static C1033r<PreviewFrame> sPool = new C1035t(10);
    public int cameraMode;
    public int cameraOri;
    public byte[] data;
    public int height;
    public int tag;
    public int width;

    public PreviewFrame(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        this.data = bArr;
        this.width = i4;
        this.height = i3;
        this.cameraMode = i;
        this.cameraOri = i2;
        this.tag = i5;
    }

    public static native void destroyPool();

    public static native PreviewFrame obtain(int i, byte[] bArr, int i2, int i3, int i4, int i5);

    public native int getCameraMode();

    public native int getCameraOri();

    public native byte[] getData();

    public native int getHeight();

    public native int getTag();

    public native int getWidth();

    public native void recycle();

    public native void setCameraMode(int i);

    public native void setCameraOri(int i);

    public native void setData(byte[] bArr);

    public native void setEmpty();

    public native void setHeight(int i);

    public native void setTag(int i);

    public native void setWidth(int i);
}
