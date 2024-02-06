package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.camera.C0500f;
import com.kofax.mobile.sdk._internal.capture.C7895f;
import com.kofax.mobile.sdk._internal.view.C8238n;
import p040o.HmlPinActivity;

public class SelfieBaseCaptureExperience {
    protected Context _ctx;

    /* renamed from: nm */
    private SelfieCaptureExperienceCriteriaHolder f3580nm;
    @HmlPinActivity

    /* renamed from: nn */
    C7895f f3581nn;
    @HmlPinActivity

    /* renamed from: no */
    C8238n f3582no;

    public SelfieBaseCaptureExperience(ImageCaptureView imageCaptureView, SelfieCaptureExperienceCriteriaHolder selfieCaptureExperienceCriteriaHolder) {
        if (imageCaptureView == null || selfieCaptureExperienceCriteriaHolder == null) {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_NULL_POINTER_EXCEPTION);
        }
        this._ctx = imageCaptureView.getContext();
    }

    /* access modifiers changed from: protected */
    public void initBase(ImageCaptureView imageCaptureView, SelfieCaptureExperienceCriteriaHolder selfieCaptureExperienceCriteriaHolder) {
        this.f3581nn.mo54229a(this.f3582no);
        setCaptureCriteria(selfieCaptureExperienceCriteriaHolder);
        this.f3581nn.mo54227a((C0500f) imageCaptureView);
        setVibrationEnabled(true);
    }

    /* access modifiers changed from: package-private */
    public void setCaptureCriteria(SelfieCaptureExperienceCriteriaHolder selfieCaptureExperienceCriteriaHolder) {
        if (selfieCaptureExperienceCriteriaHolder != null) {
            this.f3580nm = selfieCaptureExperienceCriteriaHolder;
            this.f3581nn.mo54231b(selfieCaptureExperienceCriteriaHolder);
            return;
        }
        throw new IllegalArgumentException("criteria is null");
    }

    public SelfieCaptureExperienceCriteriaHolder getCaptureCriteria() {
        return this.f3580nm;
    }

    public void setVibrationEnabled(boolean z) {
        this.f3581nn.setVibrationEnabled(z);
    }

    public boolean isVibrationEnabled() {
        return this.f3581nn.isVibrationEnabled();
    }

    public CaptureMessage getUserInstructionMessage() {
        return new CaptureMessage(this.f3582no.getUserInstructionMessage());
    }

    public CaptureMessage getBlinkMessage() {
        return new CaptureMessage(this.f3582no.getBlinkMessage());
    }

    public CaptureMessage getHoldSteadyMessage() {
        return new CaptureMessage(this.f3582no.getSteadyMessage());
    }

    public CaptureMessage getCapturedMessage() {
        return new CaptureMessage(this.f3582no.getCapturedMessage());
    }

    public void setUserInstructionMessage(CaptureMessage captureMessage) {
        this.f3582no.setUserInstructionMessage(captureMessage.f681mM);
    }

    public void setBlinkMessage(CaptureMessage captureMessage) {
        this.f3582no.setBlinkMessage(captureMessage.f681mM);
    }

    public void setHoldSteadyMessage(CaptureMessage captureMessage) {
        this.f3582no.setSteadyMessage(captureMessage.f681mM);
    }

    public void setCapturedMessage(CaptureMessage captureMessage) {
        this.f3582no.setCapturedMessage(captureMessage.f681mM);
    }

    public void takePicture() {
        this.f3581nn.mo54232d(false);
    }

    public void stopCapture() {
        this.f3581nn.stopCapture();
    }

    public void setOuterViewFinderColor(int i) {
        this.f3581nn.setOuterOverlayFrameColor(i);
    }

    public int getOuterViewFinderColor() {
        return this.f3581nn.getOuterOverlayFrameColor();
    }

    public void setFrameColor(int i) {
        this.f3581nn.setFrameColor(i);
    }

    public int getFrameColor() {
        return this.f3581nn.getFrameColor();
    }

    public double getPaddingPercent() {
        return this.f3580nm.getDetectionSettings().getTargetFramePaddingPercent();
    }

    public final void addOnImageCapturedListener(ImageCapturedListener imageCapturedListener) {
        this.f3581nn.addOnImageCapturedListener(imageCapturedListener);
    }

    public final void removeOnImageCapturedListener(ImageCapturedListener imageCapturedListener) {
        this.f3581nn.removeOnImageCapturedListener(imageCapturedListener);
    }

    public void destroy() {
        this.f3581nn.destroy();
    }
}
