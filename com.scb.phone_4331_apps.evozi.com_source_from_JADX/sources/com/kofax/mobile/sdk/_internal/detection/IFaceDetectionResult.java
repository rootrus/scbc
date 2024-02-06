package com.kofax.mobile.sdk._internal.detection;

import android.graphics.PointF;

public interface IFaceDetectionResult {
    float getEulerY();

    float getEulerZ();

    float getHeight();

    float getIsLeftEyeOpenProbability();

    float getIsRightEyeOpenProbability();

    float getIsSmilingProbability();

    PointF getPosition();

    float getWidth();
}
