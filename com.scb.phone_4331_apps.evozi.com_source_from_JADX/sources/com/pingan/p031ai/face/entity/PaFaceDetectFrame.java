package com.pingan.p031ai.face.entity;

import java.io.Serializable;

/* renamed from: com.pingan.ai.face.entity.PaFaceDetectFrame */
public class PaFaceDetectFrame implements Cloneable, Serializable {
    public float blurness;
    public float brightness;
    public int faceNum;
    public byte[] frame;
    public int frameHeight;
    public int frameOri;
    public int frameWidth;
    @Deprecated
    public int frmaeOri;
    @Deprecated
    public int frmaeWidth;
    public String imageBase64;
    public String imageDigest;
    public byte[] imageFrame;
    public float[] landmarkPosition;
    public float landmarkScore;
    public float lightLiveScore;
    public float liveScore;
    public float pitch;
    public int rectH;
    public int rectW;
    public int rectX;
    public int rectY;
    public float roll;
    public int trackingId;
    public float yaw;

    public native Object clone();

    public native String toString();
}
