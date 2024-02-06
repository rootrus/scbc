package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.kmc.ken.engines.data.CheckDetectionSettings;

public class CheckCaptureExperienceCriteriaHolder extends DocumentBaseCaptureExperienceCriteriaHolder {

    /* renamed from: mQ */
    private CheckDetectionSettings f3542mQ = new CheckDetectionSettings();

    public CheckCaptureExperienceCriteriaHolder() {
    }

    CheckCaptureExperienceCriteriaHolder(CheckCaptureExperienceCriteriaHolder checkCaptureExperienceCriteriaHolder) {
        super(checkCaptureExperienceCriteriaHolder);
        setCheckDetectionSettings(new CheckDetectionSettings(checkCaptureExperienceCriteriaHolder.getCheckDetectionSettings()));
    }

    public void setCheckDetectionSettings(CheckDetectionSettings checkDetectionSettings) {
        this.f3542mQ = checkDetectionSettings;
    }

    public CheckDetectionSettings getCheckDetectionSettings() {
        return this.f3542mQ;
    }
}
