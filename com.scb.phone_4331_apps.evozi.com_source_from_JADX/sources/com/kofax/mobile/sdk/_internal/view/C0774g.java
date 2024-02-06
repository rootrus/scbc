package com.kofax.mobile.sdk._internal.view;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;
import com.kofax.mobile.sdk._internal.impl.detection.data.EdgeGuidance;

/* renamed from: com.kofax.mobile.sdk._internal.view.g */
public interface C0774g {
    /* renamed from: a */
    void mo11898a(Bitmap bitmap, CaptureMessage captureMessage);

    void clear();

    int getGuidanceFrameColor();

    int getGuidanceFrameThickness();

    int getOuterOverlayFrameColor();

    double getPaddingPercent();

    View getView();

    void setCenter(Point point);

    void setGuidanceFrameColor(int i);

    void setGuidanceFrameThickness(int i);

    void setOuterOverlayFrameColor(int i);

    void setOverlayAspectRatio(double d);

    void setPaddingPercent(double d);

    void setSteadyGuidanceFrameColor(int i);

    void showEdgesGuidance(EdgeGuidance edgeGuidance);

    /* renamed from: w */
    void mo11917w(boolean z);
}
