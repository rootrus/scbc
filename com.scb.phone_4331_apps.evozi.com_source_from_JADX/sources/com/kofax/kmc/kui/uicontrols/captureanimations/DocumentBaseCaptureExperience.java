package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import android.graphics.Bitmap;
import com.kofax.kmc.kui.uicontrols.AboutToCaptureListener;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;
import com.kofax.kmc.kui.uicontrols.JustCapturedListener;
import com.kofax.kmc.kui.uicontrols.PageDetectionListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.capture.C0514c;
import com.kofax.mobile.sdk.p015ak.C0860e;
import p040o.HmlPinActivity;

public abstract class DocumentBaseCaptureExperience extends CaptureExperience {
    @HmlPinActivity
    protected C0513a _captureController;
    protected Context _ctx;
    @HmlPinActivity
    protected IDocumentBaseOverlayView _overlayViewInternal;

    /* renamed from: mU */
    private DocumentBaseCaptureExperienceCriteriaHolder f683mU;

    /* access modifiers changed from: protected */
    public void addCameraEventListeners() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10654b(CaptureExperienceData captureExperienceData) {
    }

    /* access modifiers changed from: protected */
    public void removeAllViews() {
    }

    /* access modifiers changed from: protected */
    public void removeCameraEventListeners() {
    }

    public DocumentBaseCaptureExperience(ImageCaptureView imageCaptureView, DocumentBaseCaptureExperienceCriteriaHolder documentBaseCaptureExperienceCriteriaHolder) {
        super(imageCaptureView);
        if (imageCaptureView == null || documentBaseCaptureExperienceCriteriaHolder == null) {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_NULL_POINTER_EXCEPTION);
        }
        this._ctx = imageCaptureView.getContext();
    }

    /* access modifiers changed from: protected */
    public void initBase(ImageCaptureView imageCaptureView, C0514c cVar, DocumentBaseCaptureExperienceCriteriaHolder documentBaseCaptureExperienceCriteriaHolder) {
        this._captureController.mo11267a(cVar, imageCaptureView, this._overlayViewInternal);
        mo10747a(documentBaseCaptureExperienceCriteriaHolder);
        this._captureController.setUserInstructionMessage(C0860e.m2232b(this._ctx, "cap_guide_fill_with_doc"));
        this._captureController.setUserInstructionMessageTextSize(32);
        setVibrationEnabled(true);
    }

    public final void addOnImageCapturedListener(ImageCapturedListener imageCapturedListener) {
        this._captureController.addOnImageCapturedListener(imageCapturedListener);
    }

    public final void removeOnImageCapturedListener(ImageCapturedListener imageCapturedListener) {
        this._captureController.removeOnImageCapturedListener(imageCapturedListener);
    }

    public final void addAboutToCaptureListener(AboutToCaptureListener aboutToCaptureListener) {
        this._captureController.addAboutToCaptureListener(aboutToCaptureListener);
    }

    public final void removeAboutToCaptureListener(AboutToCaptureListener aboutToCaptureListener) {
        this._captureController.removeAboutToCaptureListener(aboutToCaptureListener);
    }

    public final void addJustCapturedListener(JustCapturedListener justCapturedListener) {
        this._captureController.addJustCapturedListener(justCapturedListener);
    }

    public final void removeJustCapturedListener(JustCapturedListener justCapturedListener) {
        this._captureController.removeJustCapturedListener(justCapturedListener);
    }

    public final void setVibrationEnabled(boolean z) {
        this._captureController.setVibrationEnabled(z);
    }

    public boolean isVibrationEnabled() {
        return this._captureController.isVibrationEnabled();
    }

    public final void setDiagnosticsViewEnabled(boolean z) {
        this._captureController.setDiagnosticsViewEnabled(z);
    }

    public boolean isDiagnosticsViewEnabled() {
        return this._captureController.isDiagnosticsViewEnabled();
    }

    public void takePicture() {
        this._captureController.mo11273d(false);
    }

    public void takePictureContinually() {
        this._captureController.mo11273d(true);
    }

    public void stopCapture() {
        this._captureController.stopCapture();
    }

    public void destroy() {
        this._captureController.destroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10747a(DocumentBaseCaptureExperienceCriteriaHolder documentBaseCaptureExperienceCriteriaHolder) {
        if (documentBaseCaptureExperienceCriteriaHolder != null) {
            this.f683mU = documentBaseCaptureExperienceCriteriaHolder;
            this._captureController.setCaptureCriteria(documentBaseCaptureExperienceCriteriaHolder.f684mV);
            return;
        }
        throw new IllegalArgumentException("criteria is null");
    }

    public void enableAnimationTutor(boolean z) {
        this._captureController.enableAnimationTutor(z);
    }

    public boolean isAnimationTutorEnable() {
        return this._captureController.isAnimationTutorEnable();
    }

    public CaptureMessage getUserInstructionMessage() {
        return this._overlayViewInternal.getUserInstructionMessage();
    }

    public void setUserInstructionMessage(CaptureMessage captureMessage) {
        this._overlayViewInternal.setUserInstructionMessage(captureMessage);
    }

    public CaptureMessage getTutorialDismissMessage() {
        return this._overlayViewInternal.getTutorialDismissMessage();
    }

    public void setTutorialDismissMessage(CaptureMessage captureMessage) {
        this._overlayViewInternal.setTutorialDismissMessage(captureMessage);
    }

    public CaptureMessage getHoldSteadyMessage() {
        return this._overlayViewInternal.getSteadyMessage();
    }

    public void setHoldSteadyMessage(CaptureMessage captureMessage) {
        this._overlayViewInternal.setSteadyMessage(captureMessage);
    }

    public void setCenterMessage(CaptureMessage captureMessage) {
        this._overlayViewInternal.setCenterMessage(captureMessage);
    }

    public CaptureMessage getCenterMessage() {
        return this._overlayViewInternal.getCenterMessage();
    }

    public void setZoomInMessage(CaptureMessage captureMessage) {
        this._overlayViewInternal.setZoomInMessage(captureMessage);
    }

    public CaptureMessage getZoomInMessage() {
        return this._overlayViewInternal.getZoomInMessage();
    }

    public void setZoomOutMessage(CaptureMessage captureMessage) {
        this._overlayViewInternal.setZoomOutMessage(captureMessage);
    }

    public CaptureMessage getZoomOutMessage() {
        return this._overlayViewInternal.getZoomOutMessage();
    }

    public void setRotateMessage(CaptureMessage captureMessage) {
        this._overlayViewInternal.setRotateMessage(captureMessage);
    }

    public CaptureMessage getRotateMessage() {
        return this._overlayViewInternal.getRotateMessage();
    }

    public void setHoldParallelMessage(CaptureMessage captureMessage) {
        this._overlayViewInternal.setHoldParallelMessage(captureMessage);
    }

    public CaptureMessage getHoldParallelMessage() {
        return this._overlayViewInternal.getHoldParallelMessage();
    }

    public void setCapturedMessage(CaptureMessage captureMessage) {
        this._overlayViewInternal.setCapturedMessage(captureMessage);
    }

    public CaptureMessage getCapturedMessage() {
        return this._overlayViewInternal.getCapturedMessage();
    }

    public void setOuterViewFinderColor(int i) {
        this._captureController.setOuterOverlayFrameColor(i);
    }

    public int getOuterViewFinderColor() {
        return this._captureController.getOuterOverlayFrameColor();
    }

    public void setGuidanceFrameColor(int i) {
        this._captureController.setGuidanceFrameColor(i);
    }

    public void setSteadyGuidanceFrameColor(int i) {
        this._captureController.setSteadyGuidanceFrameColor(i);
    }

    public int getGuidanceFrameColor() {
        return this._captureController.getGuidanceFrameColor();
    }

    public void setGuidanceFrameThickness(int i) {
        if (i >= 0 && i <= 100) {
            this._captureController.setGuidanceFrameThickness(i);
        }
    }

    public int getGuidanceFrameThickness() {
        return this._captureController.getGuidanceFrameThickness();
    }

    public Bitmap getDocumentSampleImage() {
        return this._captureController.getDocumentSampleImage();
    }

    public void setDocumentSampleImage(Bitmap bitmap) {
        this._captureController.setDocumentSampleImage(bitmap);
    }

    public void addPageDetectionListener(PageDetectionListener pageDetectionListener) {
        this._captureController.addPageDetectionListener(pageDetectionListener);
    }

    public void removePageDetectionListener(PageDetectionListener pageDetectionListener) {
        this._captureController.removePageDetectionListener(pageDetectionListener);
    }
}
