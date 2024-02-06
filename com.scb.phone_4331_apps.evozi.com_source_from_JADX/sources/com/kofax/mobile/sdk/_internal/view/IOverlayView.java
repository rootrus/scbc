package com.kofax.mobile.sdk._internal.view;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.ViewGroup;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;
import com.kofax.mobile.sdk._internal.impl.detection.data.EdgeGuidance;

public interface IOverlayView extends C0773f {
    void clear();

    void displayImageCapturedEvent(ImageCapturedEvent imageCapturedEvent);

    CaptureMessage getCapturedMsg();

    CaptureMessage getCenterMsg();

    Bitmap getDocumentSampleImage();

    int getGuidanceFrameColor();

    int getGuidanceFrameThickness();

    CaptureMessage getHoldParallelMsg();

    CaptureMessage getInstructionMsg();

    int getOuterOverlayFrameColor();

    double getPaddingPercent();

    CaptureMessage getRotateMsg();

    CaptureMessage getSteadyMsg();

    CaptureMessage getTutorialDismissMsg();

    ViewGroup getView();

    CaptureMessage getZoomInMsg();

    CaptureMessage getZoomOutMsg();

    boolean hasDocumentSampleImage();

    void hideProgressBar();

    boolean isMessageDisplayed();

    void setCapturedMsg(CaptureMessage captureMessage);

    void setCenter(Point point);

    void setCenterMessage(String str);

    void setCenterMsg(CaptureMessage captureMessage);

    void setDocumentSampleImage(Bitmap bitmap);

    void setGuidanceFrameColor(int i);

    void setGuidanceFrameThickness(int i);

    void setHoldParallelMsg(CaptureMessage captureMessage);

    void setInstructionMsg(CaptureMessage captureMessage);

    void setInstructionOverlay(boolean z);

    void setOuterOverlayFrameColor(int i);

    void setOverlayAspectRatio(double d);

    void setPaddingPercent(double d);

    void setRotateMsg(CaptureMessage captureMessage);

    void setSteadyGuidanceFrameColor(int i);

    void setSteadyMsg(CaptureMessage captureMessage);

    void setTutorialDismissMsg(CaptureMessage captureMessage);

    void setUserInstructionMessage(String str);

    void setUserInstructionMessageTextSize(int i);

    void setZoomInMsg(CaptureMessage captureMessage);

    void setZoomOutMsg(CaptureMessage captureMessage);

    void showEdgesGuidance(EdgeGuidance edgeGuidance);

    void showFitWithinFrameMessage(boolean z);

    void showProgressBar();

    void startCapturedMessage(IMessageListener iMessageListener);

    void startCenterMessage();

    void startHoldParallelMessage();

    void startRotateMessage();

    void startSteadyMessage(IMessageListener iMessageListener);

    void startZoomInMessage();

    void startZoomOutMessage();

    void stopMessages();
}
