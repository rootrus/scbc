package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import com.kofax.mobile.sdk._internal.impl.view.C0735aa;
import p040o.HmlPinActivity;

class DocumentBaseOverlayView extends C0735aa implements IDocumentBaseOverlayView {
    @HmlPinActivity
    public DocumentBaseOverlayView(Context context) {
        super(context);
    }

    public CaptureMessage getUserInstructionMessage() {
        return new CaptureMessage(getInstructionMsg());
    }

    public void setUserInstructionMessage(CaptureMessage captureMessage) {
        setInstructionMsg(captureMessage.f681mM);
    }

    public CaptureMessage getSteadyMessage() {
        return new CaptureMessage(getSteadyMsg());
    }

    public void setSteadyMessage(CaptureMessage captureMessage) {
        setSteadyMsg(captureMessage.f681mM);
    }

    public void setCenterMessage(CaptureMessage captureMessage) {
        setCenterMsg(captureMessage.f681mM);
    }

    public CaptureMessage getCenterMessage() {
        return new CaptureMessage(getCenterMsg());
    }

    public void setZoomInMessage(CaptureMessage captureMessage) {
        setZoomInMsg(captureMessage.f681mM);
    }

    public CaptureMessage getZoomInMessage() {
        return new CaptureMessage(getZoomInMsg());
    }

    public void setZoomOutMessage(CaptureMessage captureMessage) {
        setZoomOutMsg(captureMessage.f681mM);
    }

    public CaptureMessage getZoomOutMessage() {
        return new CaptureMessage(getZoomOutMsg());
    }

    public void setRotateMessage(CaptureMessage captureMessage) {
        setRotateMsg(captureMessage.f681mM);
    }

    public CaptureMessage getRotateMessage() {
        return new CaptureMessage(getRotateMsg());
    }

    public void setHoldParallelMessage(CaptureMessage captureMessage) {
        setHoldParallelMsg(captureMessage.f681mM);
    }

    public CaptureMessage getHoldParallelMessage() {
        return new CaptureMessage(getHoldParallelMsg());
    }

    public void setCapturedMessage(CaptureMessage captureMessage) {
        setCapturedMsg(captureMessage.f681mM);
    }

    public CaptureMessage getCapturedMessage() {
        return new CaptureMessage(getCapturedMsg());
    }

    public CaptureMessage getTutorialDismissMessage() {
        return new CaptureMessage(getTutorialDismissMsg());
    }

    public void setTutorialDismissMessage(CaptureMessage captureMessage) {
        setTutorialDismissMsg(captureMessage.f681mM);
    }
}
