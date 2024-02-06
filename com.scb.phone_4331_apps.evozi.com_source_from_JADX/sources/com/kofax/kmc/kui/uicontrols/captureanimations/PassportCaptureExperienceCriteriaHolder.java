package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.kmc.ken.engines.data.PassportDetectionSettings;

public class PassportCaptureExperienceCriteriaHolder extends DocumentBaseCaptureExperienceCriteriaHolder {

    /* renamed from: nl */
    private PassportDetectionSettings f3576nl = new PassportDetectionSettings();

    public PassportCaptureExperienceCriteriaHolder() {
    }

    public PassportCaptureExperienceCriteriaHolder(PassportCaptureExperienceCriteriaHolder passportCaptureExperienceCriteriaHolder) {
        super(passportCaptureExperienceCriteriaHolder);
        setDetectionSettings(new PassportDetectionSettings(passportCaptureExperienceCriteriaHolder.getPassportDetectionSettings()));
    }

    public void setDetectionSettings(PassportDetectionSettings passportDetectionSettings) {
        this.f3576nl = passportDetectionSettings;
    }

    public PassportDetectionSettings getPassportDetectionSettings() {
        return this.f3576nl;
    }
}
