package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.kmc.ken.engines.data.FixedAspectRatioDetectionSettings;

public class FixedAspectRatioExperienceCriteriaHolder extends DocumentBaseCaptureExperienceCriteriaHolder {

    /* renamed from: ni */
    private FixedAspectRatioDetectionSettings f3558ni = new FixedAspectRatioDetectionSettings();

    public void setOrientationEnabled(boolean z) {
    }

    public FixedAspectRatioExperienceCriteriaHolder() {
        this.f684mV.setRollThresholdEnabled(false);
        this.f684mV.setPitchThresholdEnabled(false);
    }

    FixedAspectRatioExperienceCriteriaHolder(FixedAspectRatioExperienceCriteriaHolder fixedAspectRatioExperienceCriteriaHolder) {
        super(fixedAspectRatioExperienceCriteriaHolder);
        setDetectionSettings(new FixedAspectRatioDetectionSettings(fixedAspectRatioExperienceCriteriaHolder.getDetectionSettings()));
    }

    public void setDetectionSettings(FixedAspectRatioDetectionSettings fixedAspectRatioDetectionSettings) {
        this.f3558ni = fixedAspectRatioDetectionSettings;
    }

    public FixedAspectRatioDetectionSettings getDetectionSettings() {
        return this.f3558ni;
    }

    public boolean isOrientationEnabled() {
        return this.f684mV.isOrientationEnabled();
    }
}
