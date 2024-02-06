package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;
import com.kofax.mobile.sdk._internal.impl.view.C0735aa;
import com.kofax.mobile.sdk.p015ak.C0860e;
import p040o.HmlPinActivity;

public class LicenseOverlayView extends C0735aa implements ILicenseOverlayView {
    @HmlPinActivity
    public LicenseOverlayView(Context context) {
        super(context);
    }

    public void initMessages(Context context) {
        super.initMessages(context);
        setInstructionMsg(new CaptureMessage());
        getInstructionMsg().setTextColor(-1);
        getInstructionMsg().setBackgroundColor(0);
        getInstructionMsg().setMessage(C0860e.m2232b(getContext(), "cap_guide_license_user_instruction"));
        getInstructionMsg().setTextSize(18);
        getInstructionMsg().setOrientation(CaptureMessage.KUIMessageOrientation.PORTRAIT);
    }

    public void init() {
        this._capturedImageView.getView().setVisibility(4);
        this._circleAnimationView.getView().setVisibility(4);
        this._documentOverlayFrameView.setGuidanceFrameColor(0);
        this._debugView.getView().setVisibility(4);
        setOverlayAspectRatio(1.0d);
        showUserInstructionMessage();
    }

    public CaptureMessage getUserInstructionMessage() {
        return new CaptureMessage(getInstructionMsg());
    }

    public void setUserInstructionMessage(CaptureMessage captureMessage) {
        setInstructionMsg(captureMessage.f681mM);
    }

    public void showUserInstructionMessage() {
        showFitWithinFrameMessage(true);
    }
}
