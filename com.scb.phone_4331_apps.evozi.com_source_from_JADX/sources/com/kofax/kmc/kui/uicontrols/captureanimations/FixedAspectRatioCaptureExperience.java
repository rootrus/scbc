package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kui.uicontrols.captureanimations.CaptureMessage;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.p015ak.C0859c;
import com.kofax.mobile.sdk.p015ak.C0860e;
import com.kofax.mobile.sdk.p024l.C8426d;
import p040o.HmlPinActivity;

public class FixedAspectRatioCaptureExperience extends DocumentBaseCaptureExperience {

    /* renamed from: ng */
    private FixedAspectRatioExperienceCriteriaHolder f3553ng;
    @HmlPinActivity

    /* renamed from: nh */
    C8426d f3554nh;

    public void setCenterMessage(CaptureMessage captureMessage) {
    }

    public void setRotateMessage(CaptureMessage captureMessage) {
    }

    public void setZoomInMessage(CaptureMessage captureMessage) {
    }

    public void setZoomOutMessage(CaptureMessage captureMessage) {
    }

    public FixedAspectRatioCaptureExperience(ImageCaptureView imageCaptureView) {
        this(imageCaptureView, m3791a((FixedAspectRatioExperienceCriteriaHolder) null), false);
    }

    public FixedAspectRatioCaptureExperience(ImageCaptureView imageCaptureView, FixedAspectRatioExperienceCriteriaHolder fixedAspectRatioExperienceCriteriaHolder) {
        this(imageCaptureView, m3791a(fixedAspectRatioExperienceCriteriaHolder), true);
    }

    /* renamed from: a */
    private static FixedAspectRatioExperienceCriteriaHolder m3791a(FixedAspectRatioExperienceCriteriaHolder fixedAspectRatioExperienceCriteriaHolder) {
        return fixedAspectRatioExperienceCriteriaHolder != null ? fixedAspectRatioExperienceCriteriaHolder : new FixedAspectRatioExperienceCriteriaHolder();
    }

    private FixedAspectRatioCaptureExperience(ImageCaptureView imageCaptureView, FixedAspectRatioExperienceCriteriaHolder fixedAspectRatioExperienceCriteriaHolder, boolean z) {
        super(imageCaptureView, fixedAspectRatioExperienceCriteriaHolder);
        Injector.getInjector(this._ctx.getApplicationContext()).injectMembers(this);
        initBase(imageCaptureView, this.f3554nh, fixedAspectRatioExperienceCriteriaHolder);
        m3792a(fixedAspectRatioExperienceCriteriaHolder, z);
        this._captureController.setUserInstructionMessage(C0860e.m2232b(imageCaptureView.getContext(), "cap_guide_fill_with_doc"));
        CaptureMessage centerMessage = this._overlayViewInternal.getCenterMessage();
        centerMessage.setVisibility(false);
        this._overlayViewInternal.setCenterMessage(centerMessage);
        CaptureMessage zoomInMessage = this._overlayViewInternal.getZoomInMessage();
        zoomInMessage.setVisibility(false);
        this._overlayViewInternal.setZoomInMessage(zoomInMessage);
        CaptureMessage zoomOutMessage = this._overlayViewInternal.getZoomOutMessage();
        zoomOutMessage.setVisibility(false);
        this._overlayViewInternal.setZoomOutMessage(zoomOutMessage);
        CaptureMessage rotateMessage = this._overlayViewInternal.getRotateMessage();
        rotateMessage.setVisibility(false);
        this._overlayViewInternal.setRotateMessage(rotateMessage);
        CaptureMessage steadyMessage = this._overlayViewInternal.getSteadyMessage();
        steadyMessage.setOrientation(CaptureMessage.KUIMessageOrientation.PORTRAIT);
        this._overlayViewInternal.setSteadyMessage(steadyMessage);
        CaptureMessage holdParallelMessage = this._overlayViewInternal.getHoldParallelMessage();
        holdParallelMessage.setOrientation(CaptureMessage.KUIMessageOrientation.PORTRAIT);
        this._overlayViewInternal.setHoldParallelMessage(holdParallelMessage);
        CaptureMessage capturedMessage = this._overlayViewInternal.getCapturedMessage();
        capturedMessage.setOrientation(CaptureMessage.KUIMessageOrientation.PORTRAIT);
        this._overlayViewInternal.setCapturedMessage(capturedMessage);
        CaptureMessage tutorialDismissMessage = this._overlayViewInternal.getTutorialDismissMessage();
        tutorialDismissMessage.setOrientation(CaptureMessage.KUIMessageOrientation.PORTRAIT);
        this._overlayViewInternal.setTutorialDismissMessage(tutorialDismissMessage);
        CaptureMessage userInstructionMessage = this._overlayViewInternal.getUserInstructionMessage();
        userInstructionMessage.setOrientation(CaptureMessage.KUIMessageOrientation.PORTRAIT);
        this._overlayViewInternal.setUserInstructionMessage(userInstructionMessage);
    }

    public void setCaptureCriteria(FixedAspectRatioExperienceCriteriaHolder fixedAspectRatioExperienceCriteriaHolder) {
        m3792a(fixedAspectRatioExperienceCriteriaHolder, true);
    }

    /* renamed from: a */
    private void m3792a(FixedAspectRatioExperienceCriteriaHolder fixedAspectRatioExperienceCriteriaHolder, boolean z) {
        if (fixedAspectRatioExperienceCriteriaHolder != null) {
            FixedAspectRatioExperienceCriteriaHolder fixedAspectRatioExperienceCriteriaHolder2 = new FixedAspectRatioExperienceCriteriaHolder(fixedAspectRatioExperienceCriteriaHolder);
            this.f3553ng = fixedAspectRatioExperienceCriteriaHolder2;
            super.mo10747a(fixedAspectRatioExperienceCriteriaHolder2);
            this.f3554nh.mo12370c(this.f3553ng.getDetectionSettings());
            if (!this._captureController.hasDocumentSampleImage() && z) {
                m3793c(this._ctx);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("criteria is null");
    }

    public FixedAspectRatioExperienceCriteriaHolder getCaptureCriteria() {
        return new FixedAspectRatioExperienceCriteriaHolder(this.f3553ng);
    }

    /* renamed from: c */
    private void m3793c(Context context) {
        setDocumentSampleImage(C0859c.m2231a(context, "document_sample"));
    }

    public CaptureMessage getHoldSteadyMessage() {
        return super.getHoldSteadyMessage();
    }

    public CaptureMessage getHoldParallelMessage() {
        return super.getHoldParallelMessage();
    }

    public CaptureMessage getCapturedMessage() {
        return super.getCapturedMessage();
    }
}
