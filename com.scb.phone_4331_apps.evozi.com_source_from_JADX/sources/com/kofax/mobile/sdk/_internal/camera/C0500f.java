package com.kofax.mobile.sdk._internal.camera;

import android.view.ViewGroup;
import com.kofax.kmc.kui.uicontrols.AutoFocusResultListener;
import com.kofax.kmc.kui.uicontrols.CameraInitializationFailedListener;
import com.kofax.kmc.kui.uicontrols.CameraInitializationListener;
import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;
import com.kofax.kmc.kui.uicontrols.LevelnessListener;
import com.kofax.kmc.kui.uicontrols.PreviewCallbackListener;
import com.kofax.kmc.kui.uicontrols.StabilityDelayListener;
import com.kofax.kmc.kui.uicontrols.data.Flash;

/* renamed from: com.kofax.mobile.sdk._internal.camera.f */
public interface C0500f {
    void addCameraInitializationFailedListener(CameraInitializationFailedListener cameraInitializationFailedListener);

    void addCameraInitializationListener(CameraInitializationListener cameraInitializationListener);

    void addLevelnessListener(LevelnessListener levelnessListener);

    void addOnAutoFocusResultListener(AutoFocusResultListener autoFocusResultListener);

    void addOnImageCapturedListener(ImageCapturedListener imageCapturedListener);

    void addPreviewCallbackListener(PreviewCallbackListener previewCallbackListener);

    void addStabilityDelayListener(StabilityDelayListener stabilityDelayListener);

    void forceTakePicture();

    void forceTakePicture(boolean z);

    void forceTakePictureForCaptureExperience(String str, boolean z);

    ViewGroup getViewGroup();

    void removeCameraInitializationFailedListener(CameraInitializationFailedListener cameraInitializationFailedListener);

    void removeCameraInitializationListener(CameraInitializationListener cameraInitializationListener);

    void removeLevelnessListener(LevelnessListener levelnessListener);

    void removeOnAutoFocusResultListener(AutoFocusResultListener autoFocusResultListener);

    void removeOnImageCapturedListener(ImageCapturedListener imageCapturedListener);

    void removePreviewCallbackListener(PreviewCallbackListener previewCallbackListener);

    void removeStabilityDelayListener(StabilityDelayListener stabilityDelayListener);

    void setCameraDelegate(ICameraDelegate iCameraDelegate);

    void setFlash(Flash flash);

    void setUseVideoFrame(boolean z);

    void takePictureForCaptureExperience(String str);

    void takePictureForCaptureExperience(String str, boolean z);
}
