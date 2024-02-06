package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.mobile.sdk._internal.capture.C0517g;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;
import com.kofax.mobile.sdk._internal.impl.detection.data.EdgeGuidance;
import com.kofax.mobile.sdk._internal.view.C0770c;
import com.kofax.mobile.sdk._internal.view.C0771d;
import com.kofax.mobile.sdk._internal.view.C0772e;
import com.kofax.mobile.sdk._internal.view.C0773f;
import com.kofax.mobile.sdk._internal.view.C0774g;
import com.kofax.mobile.sdk._internal.view.C0777k;
import com.kofax.mobile.sdk._internal.view.IMessageListener;
import com.kofax.mobile.sdk._internal.view.IOverlayView;
import com.kofax.mobile.sdk.p015ak.C0859c;
import com.kofax.mobile.sdk.p015ak.C0860e;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.aa */
public class C0735aa extends RelativeLayout implements IOverlayView {
    @HmlPinActivity

    /* renamed from: VR */
    C0517g f1705VR;
    /* access modifiers changed from: private */

    /* renamed from: WJ */
    public Bitmap f1706WJ;

    /* renamed from: Xl */
    private CaptureMessage f1707Xl;

    /* renamed from: Xm */
    private CaptureMessage f1708Xm;

    /* renamed from: Xn */
    private CaptureMessage f1709Xn;

    /* renamed from: Xo */
    private CaptureMessage f1710Xo;

    /* renamed from: Xp */
    private CaptureMessage f1711Xp;

    /* renamed from: Xq */
    private CaptureMessage f1712Xq;

    /* renamed from: Xr */
    private CaptureMessage f1713Xr;

    /* renamed from: Xs */
    private CaptureMessage f1714Xs;
    /* access modifiers changed from: private */

    /* renamed from: Xt */
    public CaptureMessage f1715Xt;
    @HmlPinActivity

    /* renamed from: Xu */
    C0777k f1716Xu;
    @HmlPinActivity
    protected C0770c _captureMessagesFrameView;
    @HmlPinActivity
    public C0771d _capturedImageView;
    @HmlPinActivity
    public C0772e _circleAnimationView;
    @HmlPinActivity
    public C0773f _debugView;
    @HmlPinActivity
    public C0774g _documentOverlayFrameView;

    public ViewGroup getView() {
        return this;
    }

    @HmlPinActivity
    public C0735aa(Context context) {
        super(context);
        initMessages(context);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addView(this._documentOverlayFrameView.getView());
        addView(this._captureMessagesFrameView.getView());
        addView(this.f1716Xu.getView());
        addView(this._capturedImageView.getView());
        addView(this._circleAnimationView.getView());
        addView(this._debugView.getView());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeView(this._documentOverlayFrameView.getView());
        removeView(this._captureMessagesFrameView.getView());
        removeView(this.f1716Xu.getView());
        removeView(this._capturedImageView.getView());
        removeView(this._circleAnimationView.getView());
        removeView(this._debugView.getView());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void initMessages(Context context) {
        CaptureMessage.KUIMessageOrientation kUIMessageOrientation = CaptureMessage.KUIMessageOrientation.LANDSCAPE;
        CaptureMessage captureMessage = new CaptureMessage();
        this.f1707Xl = captureMessage;
        captureMessage.setTextColor(-1);
        this.f1707Xl.setBackgroundColor(0);
        this.f1707Xl.setMessage(C0860e.m2232b(getContext(), "cap_guide_fill_with_doc"));
        this.f1707Xl.setTextSize(18);
        this.f1707Xl.setOrientation(kUIMessageOrientation);
        CaptureMessage captureMessage2 = new CaptureMessage();
        this.f1708Xm = captureMessage2;
        captureMessage2.setMessage(C0860e.m2232b(getContext(), "cap_guide_center_doc"));
        this.f1708Xm.setTextSize(20);
        this.f1708Xm.setTextColor(-1);
        this.f1708Xm.setBackgroundColor(Color.parseColor("#B2000000"));
        this.f1708Xm.setOrientation(kUIMessageOrientation);
        CaptureMessage captureMessage3 = new CaptureMessage();
        this.f1711Xp = captureMessage3;
        captureMessage3.setMessage(C0860e.m2232b(getContext(), "cap_guide_rotate"));
        this.f1711Xp.setTextSize(20);
        this.f1711Xp.setTextColor(-1);
        this.f1711Xp.setMessageIcons(new Bitmap[]{C0859c.m2231a(context, "i_rotate_off"), C0859c.m2231a(context, "i_rotate_on")});
        this.f1711Xp.setBackgroundColor(Color.parseColor("#B2000000"));
        this.f1711Xp.setOrientation(kUIMessageOrientation);
        CaptureMessage captureMessage4 = new CaptureMessage();
        this.f1712Xq = captureMessage4;
        captureMessage4.setMessage(C0860e.m2232b(getContext(), "cap_guide_hold_parallel"));
        this.f1712Xq.setTextSize(20);
        this.f1712Xq.setTextColor(-1);
        this.f1712Xq.setMessageIcons(new Bitmap[]{C0859c.m2231a(context, "i_hold_parallel_1"), C0859c.m2231a(context, "i_hold_parallel_2")});
        this.f1712Xq.setBackgroundColor(Color.parseColor("#B2000000"));
        this.f1712Xq.setOrientation(kUIMessageOrientation);
        CaptureMessage captureMessage5 = new CaptureMessage();
        this.f1710Xo = captureMessage5;
        captureMessage5.setMessage(C0860e.m2232b(getContext(), "cap_guide_move_back"));
        this.f1710Xo.setTextSize(20);
        this.f1710Xo.setTextColor(-1);
        this.f1710Xo.setMessageIcons(new Bitmap[]{C0859c.m2231a(context, "i_zoomout_off"), C0859c.m2231a(context, "i_zoomout_on")});
        this.f1710Xo.setBackgroundColor(Color.parseColor("#B2000000"));
        this.f1710Xo.setOrientation(kUIMessageOrientation);
        CaptureMessage captureMessage6 = new CaptureMessage();
        this.f1709Xn = captureMessage6;
        captureMessage6.setMessage(C0860e.m2232b(getContext(), "cap_guide_move_closer"));
        this.f1709Xn.setTextSize(20);
        this.f1709Xn.setTextColor(-1);
        this.f1709Xn.setMessageIcons(new Bitmap[]{C0859c.m2231a(context, "i_zoomin_off"), C0859c.m2231a(context, "i_zoomin_on")});
        this.f1709Xn.setBackgroundColor(Color.parseColor("#B2000000"));
        this.f1709Xn.setOrientation(kUIMessageOrientation);
        CaptureMessage captureMessage7 = new CaptureMessage();
        this.f1713Xr = captureMessage7;
        captureMessage7.setMessage(C0860e.m2232b(getContext(), "cap_guide_hold_steady"));
        this.f1713Xr.setTextSize(16);
        this.f1713Xr.setTextColor(-65536);
        this.f1713Xr.setMessageIcons(new Bitmap[]{C0859c.m2231a(context, "i_camera1"), C0859c.m2231a(context, "i_camera2")});
        this.f1713Xr.setBackgroundColor(Color.parseColor("#B2000000"));
        this.f1713Xr.setOrientation(kUIMessageOrientation);
        CaptureMessage captureMessage8 = new CaptureMessage();
        this.f1714Xs = captureMessage8;
        captureMessage8.setMessage(C0860e.m2232b(getContext(), "cap_guide_done"));
        this.f1714Xs.setTextSize(16);
        this.f1714Xs.setTextColor(Color.parseColor("#00F900"));
        this.f1714Xs.setMessageIcons(new Bitmap[]{C0859c.m2231a(context, "i_checkmark")});
        this.f1714Xs.setBackgroundColor(Color.parseColor("#B2000000"));
        this.f1714Xs.setOrientation(kUIMessageOrientation);
        CaptureMessage captureMessage9 = new CaptureMessage();
        this.f1715Xt = captureMessage9;
        captureMessage9.setMessage(C0860e.m2232b(getContext(), "cap_guide_tap_to_dismiss"));
        this.f1715Xt.setTextSize(20);
        this.f1715Xt.setTextColor(Color.parseColor("#FFFFFF"));
        this.f1715Xt.setOrientation(kUIMessageOrientation);
    }

    /* access modifiers changed from: protected */
    public void showTextMessage(CaptureMessage captureMessage) {
        this._captureMessagesFrameView.mo11851a(captureMessage);
    }

    public void startCenterMessage() {
        this._circleAnimationView.mo11873a(this.f1708Xm, (IMessageListener) null);
    }

    public void startZoomInMessage() {
        this._circleAnimationView.mo11873a(this.f1709Xn, (IMessageListener) null);
    }

    public void startZoomOutMessage() {
        this._circleAnimationView.mo11873a(this.f1710Xo, (IMessageListener) null);
    }

    public void startRotateMessage() {
        this._circleAnimationView.mo11873a(this.f1711Xp, (IMessageListener) null);
    }

    public void startHoldParallelMessage() {
        this._circleAnimationView.mo11873a(this.f1712Xq, (IMessageListener) null);
    }

    public void startSteadyMessage(final IMessageListener iMessageListener) {
        this._circleAnimationView.mo11874a(this.f1713Xr, new IMessageListener() {
            public void onStart() {
                C0735aa.this._documentOverlayFrameView.mo11917w(true);
                iMessageListener.onStart();
            }

            public void onStop() {
                C0735aa.this._documentOverlayFrameView.mo11917w(false);
                iMessageListener.onStop();
            }
        }, 1000);
    }

    public void startCapturedMessage(IMessageListener iMessageListener) {
        this._circleAnimationView.mo11875a(this.f1714Xs, iMessageListener, 1000, true);
    }

    public void stopMessages() {
        this._circleAnimationView.mo11873a((CaptureMessage) null, (IMessageListener) null);
    }

    public void setOverlayAspectRatio(double d) {
        this._documentOverlayFrameView.setOverlayAspectRatio(d);
    }

    public void setCenter(Point point) {
        this._documentOverlayFrameView.setCenter(point);
    }

    public void setPaddingPercent(double d) {
        this._documentOverlayFrameView.setPaddingPercent(d);
    }

    public double getPaddingPercent() {
        return this._documentOverlayFrameView.getPaddingPercent();
    }

    public void setInstructionOverlay(final boolean z) {
        post(new Runnable() {
            public void run() {
                if (z) {
                    C0735aa.this._documentOverlayFrameView.mo11898a(C0735aa.this.f1706WJ, C0735aa.this.f1715Xt);
                } else {
                    C0735aa.this._documentOverlayFrameView.mo11898a((Bitmap) null, (CaptureMessage) null);
                }
            }
        });
    }

    public boolean isMessageDisplayed() {
        return this._circleAnimationView.isMessageDisplayed();
    }

    public void showFitWithinFrameMessage(boolean z) {
        if (!z || !this.f1707Xl.getVisibility()) {
            this._captureMessagesFrameView.clear();
            return;
        }
        this._captureMessagesFrameView.mo11851a(this.f1707Xl);
        this.f1705VR.mo11322M(this.f1707Xl.getMessage());
    }

    public void clear() {
        this._captureMessagesFrameView.clear();
        this._circleAnimationView.clear();
        this._capturedImageView.clear();
    }

    public void setDocumentSampleImage(Bitmap bitmap) {
        this.f1706WJ = bitmap;
    }

    public boolean hasDocumentSampleImage() {
        return this.f1706WJ != null;
    }

    public Bitmap getDocumentSampleImage() {
        return this.f1706WJ;
    }

    public void displayImageCapturedEvent(ImageCapturedEvent imageCapturedEvent) {
        this._capturedImageView.displayImageCapturedEvent(imageCapturedEvent);
    }

    public void showDebugData(String... strArr) {
        this._debugView.showDebugData(strArr);
    }

    public void setBoundsData(BoundingTetragon boundingTetragon, int i, int i2) {
        this._debugView.setBoundsData(boundingTetragon, i, i2);
    }

    public void showFocusAreas(List<Rect> list, int i, int i2, boolean z) {
        this._debugView.showFocusAreas(list, i, i2, z);
    }

    public void showIndicators(boolean z, String str, boolean z2, String str2) {
        this._debugView.showIndicators(z, str, z2, str2);
    }

    public void setVisible(boolean z) {
        this._debugView.setVisible(z);
    }

    public void showRect(Rect rect) {
        this._debugView.showRect(rect);
    }

    public void setOuterOverlayFrameColor(int i) {
        this._documentOverlayFrameView.setOuterOverlayFrameColor(i);
    }

    public int getOuterOverlayFrameColor() {
        return this._documentOverlayFrameView.getOuterOverlayFrameColor();
    }

    public void setGuidanceFrameColor(int i) {
        this._documentOverlayFrameView.setGuidanceFrameColor(i);
    }

    public void setSteadyGuidanceFrameColor(int i) {
        this._documentOverlayFrameView.setSteadyGuidanceFrameColor(i);
    }

    public int getGuidanceFrameColor() {
        return this._documentOverlayFrameView.getGuidanceFrameColor();
    }

    public void showProgressBar() {
        this.f1716Xu.mo11839r(this._documentOverlayFrameView.getOuterOverlayFrameColor());
        this._documentOverlayFrameView.mo11917w(true);
    }

    public void hideProgressBar() {
        this.f1716Xu.hideProgressBar();
        this._documentOverlayFrameView.mo11917w(false);
    }

    public void showEdgesGuidance(EdgeGuidance edgeGuidance) {
        this._documentOverlayFrameView.showEdgesGuidance(edgeGuidance);
    }

    public void setGuidanceFrameThickness(int i) {
        this._documentOverlayFrameView.setGuidanceFrameThickness(i);
    }

    public int getGuidanceFrameThickness() {
        return this._documentOverlayFrameView.getGuidanceFrameThickness();
    }

    public void setUserInstructionMessageTextSize(int i) {
        this.f1707Xl.setTextSize(i);
    }

    public void setCenterMessage(String str) {
        this.f1708Xm.setMessage(str);
    }

    public void setUserInstructionMessage(String str) {
        this.f1707Xl.setMessage(str);
    }

    public CaptureMessage getTutorialDismissMsg() {
        return this.f1715Xt;
    }

    public void setTutorialDismissMsg(CaptureMessage captureMessage) {
        this.f1715Xt = captureMessage;
    }

    public CaptureMessage getSteadyMsg() {
        return this.f1713Xr;
    }

    public void setSteadyMsg(CaptureMessage captureMessage) {
        this.f1713Xr = captureMessage;
    }

    public CaptureMessage getCapturedMsg() {
        return this.f1714Xs;
    }

    public void setCapturedMsg(CaptureMessage captureMessage) {
        this.f1714Xs = captureMessage;
    }

    public CaptureMessage getHoldParallelMsg() {
        return this.f1712Xq;
    }

    public void setHoldParallelMsg(CaptureMessage captureMessage) {
        this.f1712Xq = captureMessage;
    }

    public CaptureMessage getRotateMsg() {
        return this.f1711Xp;
    }

    public void setRotateMsg(CaptureMessage captureMessage) {
        this.f1711Xp = captureMessage;
    }

    public CaptureMessage getZoomOutMsg() {
        return this.f1710Xo;
    }

    public void setZoomOutMsg(CaptureMessage captureMessage) {
        this.f1710Xo = captureMessage;
    }

    public CaptureMessage getZoomInMsg() {
        return this.f1709Xn;
    }

    public void setZoomInMsg(CaptureMessage captureMessage) {
        this.f1709Xn = captureMessage;
    }

    public CaptureMessage getCenterMsg() {
        return this.f1708Xm;
    }

    public void setCenterMsg(CaptureMessage captureMessage) {
        this.f1708Xm = captureMessage;
    }

    public CaptureMessage getInstructionMsg() {
        return this.f1707Xl;
    }

    public void setInstructionMsg(CaptureMessage captureMessage) {
        this.f1707Xl = captureMessage;
    }
}
