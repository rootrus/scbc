package com.pingan.p031ai.face.control;

import java.util.Map;
import org.jmrtd.cbeff.ISO781611;

/* renamed from: com.pingan.ai.face.control.LiveFaceConfig */
public class LiveFaceConfig {
    public float blurThr = 0.2f;
    public float brightnessThr = 240.0f;
    public float darkThr = 45.0f;
    public Map<String, String> extensionMap;
    public int faceCenterThr = ISO781611.BIOMETRIC_SUBTYPE_TAG;
    public float faceCloseThr = 0.55f;
    public float faceFarThr = 0.3f;
    public boolean gravitySwitch = false;
    public float gravityThr = 5.5f;
    public float minFaceThr = 4096.0f;
    public int pitchThr = 15;
    public int rollThr = 15;
    public int yawThr = 15;

    /* renamed from: com.pingan.ai.face.control.LiveFaceConfig$LiveFaceConfigBuilder */
    public static class LiveFaceConfigBuilder {
        public Map<String, String> extensionMap = null;
        public LiveFaceConfig mLiveFaceConfig = new LiveFaceConfig();
        public boolean paGravitySwitch = false;
        public float paThresholdBlur = 0.2f;
        public float paThresholdBrightness = 240.0f;
        public float paThresholdDark = 45.0f;
        public int paThresholdFaceCenter = ISO781611.BIOMETRIC_SUBTYPE_TAG;
        public float paThresholdFaceClose = 0.55f;
        public float paThresholdFaceFar = 0.3f;
        public float paThresholdGravity = 5.5f;
        public float paThresholdMinFaceArea = 4096.0f;
        public int paThresholdPitch = 15;
        public int paThresholdRoll = 15;
        public int paThresholdYaw = 15;

        public native LiveFaceConfigBuilder blurThreshold(float f);

        public native LiveFaceConfigBuilder brightnessThreshold(float f);

        public native LiveFaceConfig build();

        public native LiveFaceConfigBuilder centerDistanceThreshold(int i);

        public native LiveFaceConfigBuilder closeThreshold(float f);

        public native LiveFaceConfigBuilder darkThreshold(float f);

        public native LiveFaceConfigBuilder extensionMap(Map<String, String> map);

        public native LiveFaceConfigBuilder farThreshold(float f);

        public native LiveFaceConfigBuilder gravitySwitch(boolean z);

        public native LiveFaceConfigBuilder gravityThreshold(float f);

        public native LiveFaceConfigBuilder minFaceAreaThreshold(float f);

        public native LiveFaceConfigBuilder pitchThreshold(int i);

        public native LiveFaceConfigBuilder rollThreshold(int i);

        public native LiveFaceConfigBuilder yawThreshold(int i);
    }

    public native float getAntiSplitThr();

    public native float getBlurThr();

    public native float getBrightnessThr();

    public native float getDarkThr();

    public native Map<String, String> getExtensionMap();

    public native int getFaceCenterThr();

    public native float getFaceCloseThr();

    public native float getFaceFarThr();

    public native float getFeatureCompareThr();

    public native float getGravityThr();

    public native float getLightLivingThr();

    public native float getMinFaceThr();

    public native int getPitchThr();

    public native int getRollThr();

    public native float getSilentLivingThr();

    public native int getYawThr();

    public native boolean isGravitySwitch();

    public native void setFaceCloseThr(float f);

    public native void setFaceFarThr(float f);

    public native void setGravitySwitch(boolean z);
}
