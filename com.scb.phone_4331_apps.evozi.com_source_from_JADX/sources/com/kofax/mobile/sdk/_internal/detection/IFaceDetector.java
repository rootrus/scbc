package com.kofax.mobile.sdk._internal.detection;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.SelfieDetectionSettings;

public interface IFaceDetector {
    void destroy();

    IFaceDetectionResult detect(SelfieDetectionSettings selfieDetectionSettings, Bitmap bitmap, int i);

    IFaceDetectionResult detect(SelfieDetectionSettings selfieDetectionSettings, byte[] bArr, int i, int i2, int i3);

    boolean isOperational();
}
