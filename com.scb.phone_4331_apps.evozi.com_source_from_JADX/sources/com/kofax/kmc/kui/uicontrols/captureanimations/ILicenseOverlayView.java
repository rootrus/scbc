package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.mobile.sdk._internal.view.IOverlayView;

public interface ILicenseOverlayView extends IOverlayView {
    CaptureMessage getUserInstructionMessage();

    void init();

    void setUserInstructionMessage(CaptureMessage captureMessage);

    void showUserInstructionMessage();
}
