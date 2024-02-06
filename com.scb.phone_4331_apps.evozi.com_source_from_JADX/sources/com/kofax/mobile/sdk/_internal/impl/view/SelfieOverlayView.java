package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;
import com.kofax.mobile.sdk._internal.view.C0770c;
import com.kofax.mobile.sdk._internal.view.C0772e;
import com.kofax.mobile.sdk._internal.view.C8237m;
import com.kofax.mobile.sdk._internal.view.C8238n;
import com.kofax.mobile.sdk._internal.view.IMessageListener;
import com.kofax.mobile.sdk.p015ak.C0859c;
import com.kofax.mobile.sdk.p015ak.C0860e;
import p040o.HmlPinActivity;

public class SelfieOverlayView extends RelativeLayout implements C8238n {

    /* renamed from: XT */
    private CaptureMessage f4252XT;

    /* renamed from: XU */
    private CaptureMessage f4253XU;

    /* renamed from: XV */
    private CaptureMessage f4254XV;

    /* renamed from: Xr */
    private CaptureMessage f4255Xr;

    /* renamed from: Xs */
    private CaptureMessage f4256Xs;
    @HmlPinActivity
    protected C0770c _captureMessagesFrameView;
    @HmlPinActivity
    protected C0772e _circleAnimationView;
    @HmlPinActivity
    protected C8237m _selfieOverlayFrameView;

    public ViewGroup getView() {
        return this;
    }

    @HmlPinActivity
    public SelfieOverlayView(Context context) {
        super(context);
        initMessages(context);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addView(this._selfieOverlayFrameView.getView());
        addView(this._captureMessagesFrameView.getView());
        addView(this._circleAnimationView.getView());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeView(this._selfieOverlayFrameView.getView());
        removeView(this._captureMessagesFrameView.getView());
        removeView(this._circleAnimationView.getView());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* access modifiers changed from: protected */
    public void initMessages(Context context) {
        CaptureMessage.KUIMessageOrientation kUIMessageOrientation = CaptureMessage.KUIMessageOrientation.PORTRAIT;
        CaptureMessage captureMessage = new CaptureMessage();
        this.f4254XV = captureMessage;
        captureMessage.setTextColor(-1);
        this.f4254XV.setBackgroundColor(0);
        this.f4254XV.setMessage(C0860e.m2232b(getContext(), "cap_guide_detector_dependencies"));
        this.f4254XV.setTextSize(18);
        this.f4254XV.setOrientation(kUIMessageOrientation);
        CaptureMessage captureMessage2 = new CaptureMessage();
        this.f4252XT = captureMessage2;
        captureMessage2.setMessage(C0860e.m2232b(context, "cap_guide_selfie_user_instruction"));
        this.f4252XT.setTextSize(20);
        this.f4252XT.setTextColor(-1);
        this.f4252XT.setBackgroundColor(Color.parseColor("#B2000000"));
        this.f4252XT.setOrientation(kUIMessageOrientation);
        CaptureMessage captureMessage3 = new CaptureMessage();
        this.f4253XU = captureMessage3;
        captureMessage3.setMessage(C0860e.m2232b(context, "cap_guide_blink_eyes"));
        this.f4253XU.setTextSize(20);
        this.f4253XU.setTextColor(-1);
        this.f4253XU.setBackgroundColor(Color.parseColor("#B2000000"));
        this.f4253XU.setOrientation(kUIMessageOrientation);
        CaptureMessage captureMessage4 = new CaptureMessage();
        this.f4255Xr = captureMessage4;
        captureMessage4.setMessage(C0860e.m2232b(getContext(), "cap_guide_hold_steady"));
        this.f4255Xr.setTextSize(20);
        this.f4255Xr.setTextColor(-1);
        this.f4255Xr.setBackgroundColor(Color.parseColor("#B2000000"));
        this.f4255Xr.setOrientation(kUIMessageOrientation);
        CaptureMessage captureMessage5 = new CaptureMessage();
        this.f4256Xs = captureMessage5;
        captureMessage5.setMessage(C0860e.m2232b(getContext(), "cap_guide_done"));
        this.f4256Xs.setTextSize(20);
        this.f4256Xs.setTextColor(Color.parseColor("#00F900"));
        this.f4256Xs.setMessageIcons(new Bitmap[]{C0859c.m2231a(context, "i_checkmark")});
        this.f4256Xs.setBackgroundColor(Color.parseColor("#B2000000"));
        this.f4256Xs.setOrientation(kUIMessageOrientation);
    }

    public void setOverlayAspectRatio(double d) {
        this._selfieOverlayFrameView.setOverlayAspectRatio(d);
    }

    public void setCenter(Point point) {
        this._selfieOverlayFrameView.setCenter(point);
    }

    public void setPaddingPercent(double d) {
        this._selfieOverlayFrameView.setPaddingPercent(d);
    }

    public void setOuterOverlayFrameColor(int i) {
        this._selfieOverlayFrameView.setOuterOverlayFrameColor(i);
    }

    public int getOuterOverlayFrameColor() {
        return this._selfieOverlayFrameView.getOuterOverlayFrameColor();
    }

    public double getPaddingPercent() {
        return this._selfieOverlayFrameView.getPaddingPercent();
    }

    public void setDetectorOperationState(boolean z) {
        if (!z) {
            this._captureMessagesFrameView.mo11851a(this.f4254XV);
        } else {
            this._captureMessagesFrameView.clear();
        }
    }

    public void showFitWithinFrameMessage() {
        this._circleAnimationView.mo11873a(this.f4252XT, (IMessageListener) null);
    }

    public void startBlink() {
        this._circleAnimationView.mo11873a(this.f4253XU, (IMessageListener) null);
    }

    public void startSteadyMessage() {
        this._circleAnimationView.mo11873a(this.f4255Xr, (IMessageListener) null);
    }

    public void startCapturedMessage() {
        this._circleAnimationView.mo11873a(this.f4256Xs, (IMessageListener) null);
    }

    public void setUserInstructionMessage(CaptureMessage captureMessage) {
        this.f4252XT = captureMessage;
    }

    public CaptureMessage getUserInstructionMessage() {
        return this.f4252XT;
    }

    public void setBlinkMessage(CaptureMessage captureMessage) {
        this.f4253XU = captureMessage;
    }

    public CaptureMessage getBlinkMessage() {
        return this.f4253XU;
    }

    public CaptureMessage getSteadyMessage() {
        return this.f4255Xr;
    }

    public void setSteadyMessage(CaptureMessage captureMessage) {
        this.f4255Xr = captureMessage;
    }

    public CaptureMessage getCapturedMessage() {
        return this.f4256Xs;
    }

    public void setCapturedMessage(CaptureMessage captureMessage) {
        this.f4256Xs = captureMessage;
    }

    public void setGuidanceFrameColor(int i) {
        this._selfieOverlayFrameView.setGuidanceFrameColor(i);
    }

    public int getGuidanceFrameColor() {
        return this._selfieOverlayFrameView.getGuidanceFrameColor();
    }

    public void stopMessages() {
        this._circleAnimationView.mo11873a((CaptureMessage) null, (IMessageListener) null);
    }

    public void clear() {
        this._captureMessagesFrameView.clear();
        this._circleAnimationView.clear();
    }
}
