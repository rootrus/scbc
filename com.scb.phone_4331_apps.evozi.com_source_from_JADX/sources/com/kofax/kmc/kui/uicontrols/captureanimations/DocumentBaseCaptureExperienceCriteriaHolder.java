package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.mobile.sdk._internal.capture.CaptureCriteria;

public abstract class DocumentBaseCaptureExperienceCriteriaHolder extends CaptureExperienceCriteriaHolder {

    /* renamed from: mV */
    CaptureCriteria f684mV;

    public DocumentBaseCaptureExperienceCriteriaHolder() {
        this.f684mV = new CaptureCriteria();
    }

    DocumentBaseCaptureExperienceCriteriaHolder(DocumentBaseCaptureExperienceCriteriaHolder documentBaseCaptureExperienceCriteriaHolder) {
        CaptureCriteria captureCriteria = new CaptureCriteria();
        this.f684mV = captureCriteria;
        captureCriteria.setFocusEnabled(documentBaseCaptureExperienceCriteriaHolder.f684mV.isFocusEnabled());
        this.f684mV.setStabilityThresholdEnabled(documentBaseCaptureExperienceCriteriaHolder.f684mV.isStabilityThresholdEnabled());
        this.f684mV.setStabilityThreshold(documentBaseCaptureExperienceCriteriaHolder.f684mV.getStabilityThreshold());
        this.f684mV.setRollThresholdEnabled(documentBaseCaptureExperienceCriteriaHolder.f684mV.isRollThresholdEnabled());
        this.f684mV.setRollThreshold(documentBaseCaptureExperienceCriteriaHolder.f684mV.getRollThreshold());
        this.f684mV.setPitchThresholdEnabled(documentBaseCaptureExperienceCriteriaHolder.f684mV.isPitchThresholdEnabled());
        this.f684mV.setPitchThreshold(documentBaseCaptureExperienceCriteriaHolder.f684mV.getPitchThreshold());
        this.f684mV.setOrientationEnabled(documentBaseCaptureExperienceCriteriaHolder.f684mV.isOrientationEnabled());
        this.f684mV.setRefocusBeforeCaptureEnabled(documentBaseCaptureExperienceCriteriaHolder.isRefocusBeforeCaptureEnabled());
        this.f684mV.setHoldSteadyDelay(documentBaseCaptureExperienceCriteriaHolder.getHoldSteadyDelay());
        this.f684mV.setPageDetectionEnabled(documentBaseCaptureExperienceCriteriaHolder.isPageDetectionEnabled());
    }

    public boolean isStabilityThresholdEnabled() {
        return this.f684mV.isStabilityThresholdEnabled();
    }

    public void setStabilityThresholdEnabled(boolean z) {
        this.f684mV.setStabilityThresholdEnabled(z);
    }

    public int getStabilityThreshold() {
        return this.f684mV.getStabilityThreshold();
    }

    public void setStabilityThreshold(int i) {
        this.f684mV.setStabilityThreshold(i);
    }

    public boolean isPitchThresholdEnabled() {
        return this.f684mV.isPitchThresholdEnabled();
    }

    public void setPitchThresholdEnabled(boolean z) {
        this.f684mV.setPitchThresholdEnabled(z);
    }

    public int getPitchThreshold() {
        return this.f684mV.getPitchThreshold();
    }

    public void setPitchThreshold(int i) {
        this.f684mV.setPitchThreshold(i);
    }

    public boolean isRollThresholdEnabled() {
        return this.f684mV.isRollThresholdEnabled();
    }

    public void setRollThresholdEnabled(boolean z) {
        this.f684mV.setRollThresholdEnabled(z);
    }

    public int getRollThreshold() {
        return this.f684mV.getRollThreshold();
    }

    public void setRollThreshold(int i) {
        this.f684mV.setRollThreshold(i);
    }

    public boolean isFocusEnabled() {
        return this.f684mV.isFocusEnabled();
    }

    public void setFocusEnabled(boolean z) {
        this.f684mV.setFocusEnabled(z);
    }

    public boolean isOrientationEnabled() {
        return this.f684mV.isOrientationEnabled();
    }

    public void setOrientationEnabled(boolean z) {
        this.f684mV.setOrientationEnabled(z);
    }

    public void setHoldSteadyDelay(double d) {
        this.f684mV.setHoldSteadyDelay(d);
    }

    public double getHoldSteadyDelay() {
        return this.f684mV.getHoldSteadyDelay();
    }

    public void setPageDetectionEnabled(boolean z) {
        this.f684mV.setPageDetectionEnabled(z);
    }

    public boolean isPageDetectionEnabled() {
        return this.f684mV.isPageDetectionEnabled();
    }
}
