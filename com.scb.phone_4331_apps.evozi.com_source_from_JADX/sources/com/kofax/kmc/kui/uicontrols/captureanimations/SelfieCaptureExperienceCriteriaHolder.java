package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.kmc.ken.engines.data.SelfieDetectionSettings;

public class SelfieCaptureExperienceCriteriaHolder {

    /* renamed from: mx */
    private boolean f3586mx = true;

    /* renamed from: nq */
    private SelfieDetectionSettings f3587nq = new SelfieDetectionSettings();

    public void setDetectionSettings(SelfieDetectionSettings selfieDetectionSettings) {
        this.f3587nq = selfieDetectionSettings;
    }

    public boolean isFocusEnabled() {
        return this.f3586mx;
    }

    public void setFocusEnabled(boolean z) {
        this.f3586mx = z;
    }

    public SelfieDetectionSettings getDetectionSettings() {
        return this.f3587nq;
    }
}
