package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.mobile.sdk._internal.view.IOverlayView;

public interface IDocumentBaseOverlayView extends IOverlayView {
    CaptureMessage getCapturedMessage();

    CaptureMessage getCenterMessage();

    CaptureMessage getHoldParallelMessage();

    CaptureMessage getRotateMessage();

    CaptureMessage getSteadyMessage();

    CaptureMessage getTutorialDismissMessage();

    CaptureMessage getUserInstructionMessage();

    CaptureMessage getZoomInMessage();

    CaptureMessage getZoomOutMessage();

    void setCapturedMessage(CaptureMessage captureMessage);

    void setCenterMessage(CaptureMessage captureMessage);

    void setHoldParallelMessage(CaptureMessage captureMessage);

    void setRotateMessage(CaptureMessage captureMessage);

    void setSteadyMessage(CaptureMessage captureMessage);

    void setTutorialDismissMessage(CaptureMessage captureMessage);

    void setUserInstructionMessage(CaptureMessage captureMessage);

    void setZoomInMessage(CaptureMessage captureMessage);

    void setZoomOutMessage(CaptureMessage captureMessage);
}
