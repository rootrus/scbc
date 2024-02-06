package com.kofax.mobile.sdk._internal.view;

import android.graphics.Point;
import android.view.ViewGroup;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;

/* renamed from: com.kofax.mobile.sdk._internal.view.n */
public interface C8238n {
    void clear();

    CaptureMessage getBlinkMessage();

    CaptureMessage getCapturedMessage();

    int getGuidanceFrameColor();

    int getOuterOverlayFrameColor();

    double getPaddingPercent();

    CaptureMessage getSteadyMessage();

    CaptureMessage getUserInstructionMessage();

    ViewGroup getView();

    void setBlinkMessage(CaptureMessage captureMessage);

    void setCapturedMessage(CaptureMessage captureMessage);

    void setCenter(Point point);

    void setDetectorOperationState(boolean z);

    void setGuidanceFrameColor(int i);

    void setOuterOverlayFrameColor(int i);

    void setOverlayAspectRatio(double d);

    void setPaddingPercent(double d);

    void setSteadyMessage(CaptureMessage captureMessage);

    void setUserInstructionMessage(CaptureMessage captureMessage);

    void showFitWithinFrameMessage();

    void startBlink();

    void startCapturedMessage();

    void startSteadyMessage();

    void stopMessages();
}
