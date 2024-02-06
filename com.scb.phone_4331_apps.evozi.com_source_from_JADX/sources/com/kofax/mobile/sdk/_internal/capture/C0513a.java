package com.kofax.mobile.sdk._internal.capture;

import android.graphics.Bitmap;
import com.kofax.kmc.kui.uicontrols.AboutToCaptureListener;
import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;
import com.kofax.kmc.kui.uicontrols.JustCapturedListener;
import com.kofax.kmc.kui.uicontrols.PageDetectionListener;
import com.kofax.mobile.sdk._internal.camera.C0500f;
import com.kofax.mobile.sdk._internal.camera.ICameraDelegate;
import com.kofax.mobile.sdk._internal.view.IOverlayView;

/* renamed from: com.kofax.mobile.sdk._internal.capture.a */
public interface C0513a extends ICameraDelegate {
    /* renamed from: a */
    void mo11267a(C0514c cVar, C0500f fVar, IOverlayView iOverlayView);

    void addAboutToCaptureListener(AboutToCaptureListener aboutToCaptureListener);

    void addJustCapturedListener(JustCapturedListener justCapturedListener);

    void addOnImageCapturedListener(ImageCapturedListener imageCapturedListener);

    void addPageDetectionListener(PageDetectionListener pageDetectionListener);

    /* renamed from: br */
    void mo11272br();

    /* renamed from: d */
    void mo11273d(boolean z);

    void destroy();

    void enableAnimationTutor(boolean z);

    Bitmap getDocumentSampleImage();

    int getGuidanceFrameColor();

    int getGuidanceFrameThickness();

    int getOuterOverlayFrameColor();

    boolean hasDocumentSampleImage();

    boolean isAnimationTutorEnable();

    boolean isDiagnosticsViewEnabled();

    boolean isVibrationEnabled();

    void removeAboutToCaptureListener(AboutToCaptureListener aboutToCaptureListener);

    void removeJustCapturedListener(JustCapturedListener justCapturedListener);

    void removeOnImageCapturedListener(ImageCapturedListener imageCapturedListener);

    void removePageDetectionListener(PageDetectionListener pageDetectionListener);

    void setCaptureCriteria(CaptureCriteria captureCriteria);

    void setCenterMessage(String str);

    void setDiagnosticsViewEnabled(boolean z);

    void setDocumentSampleImage(Bitmap bitmap);

    void setGuidanceFrameColor(int i);

    void setGuidanceFrameThickness(int i);

    void setOuterOverlayFrameColor(int i);

    void setSteadyGuidanceFrameColor(int i);

    void setUserInstructionMessage(String str);

    void setUserInstructionMessageTextSize(int i);

    void setVibrationEnabled(boolean z);

    void stopCapture();
}
