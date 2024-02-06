package com.kofax.mobile.sdk._internal.capture;

import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;
import com.kofax.kmc.kui.uicontrols.captureanimations.SelfieCaptureExperienceCriteriaHolder;
import com.kofax.mobile.sdk._internal.camera.C0500f;
import com.kofax.mobile.sdk._internal.detection.IFaceDetector;
import com.kofax.mobile.sdk._internal.view.C8238n;

/* renamed from: com.kofax.mobile.sdk._internal.capture.f */
public interface C7895f {
    /* renamed from: a */
    void mo54227a(C0500f fVar);

    /* renamed from: a */
    void mo54228a(IFaceDetector iFaceDetector);

    /* renamed from: a */
    void mo54229a(C8238n nVar);

    void addOnImageCapturedListener(ImageCapturedListener imageCapturedListener);

    /* renamed from: b */
    void mo54231b(SelfieCaptureExperienceCriteriaHolder selfieCaptureExperienceCriteriaHolder);

    /* renamed from: d */
    void mo54232d(boolean z);

    void destroy();

    int getFrameColor();

    int getOuterOverlayFrameColor();

    boolean isVibrationEnabled();

    void removeOnImageCapturedListener(ImageCapturedListener imageCapturedListener);

    void setFrameColor(int i);

    void setOuterOverlayFrameColor(int i);

    void setVibrationEnabled(boolean z);

    void stopCapture();
}
