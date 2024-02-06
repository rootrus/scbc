package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;

public class CaptureExperienceCriteriaHolder {

    /* renamed from: mr */
    private boolean f657mr = true;

    /* renamed from: ms */
    private int f658ms = 95;

    /* renamed from: mt */
    private boolean f659mt = true;

    /* renamed from: mu */
    private int f660mu = 15;

    /* renamed from: mv */
    private boolean f661mv = true;

    /* renamed from: mw */
    private int f662mw = 15;

    /* renamed from: mx */
    private boolean f663mx = true;

    /* renamed from: my */
    private boolean f664my = true;

    /* renamed from: mz */
    private boolean f665mz = true;

    public CaptureExperienceCriteriaHolder() {
    }

    CaptureExperienceCriteriaHolder(CaptureExperienceCriteriaHolder captureExperienceCriteriaHolder) {
        setFocusEnabled(captureExperienceCriteriaHolder.isFocusEnabled());
        setStabilityThresholdEnabled(captureExperienceCriteriaHolder.isStabilityThresholdEnabled());
        setStabilityThreshold(captureExperienceCriteriaHolder.getStabilityThreshold());
        setRollThresholdEnabled(captureExperienceCriteriaHolder.isRollThresholdEnabled());
        setRollThreshold(captureExperienceCriteriaHolder.getRollThreshold());
        setPitchThresholdEnabled(captureExperienceCriteriaHolder.isPitchThresholdEnabled());
        setPitchThreshold(captureExperienceCriteriaHolder.getPitchThreshold());
        setOrientationEnabled(captureExperienceCriteriaHolder.isOrientationEnabled());
    }

    public boolean isStabilityThresholdEnabled() {
        return this.f657mr;
    }

    public void setStabilityThresholdEnabled(boolean z) {
        this.f657mr = z;
    }

    public int getStabilityThreshold() {
        return this.f658ms;
    }

    public void setStabilityThreshold(int i) {
        if (i < 0 || i > 100) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_STABILITY_DELAY_ARGUMENT);
        }
        this.f658ms = i;
    }

    public boolean isPitchThresholdEnabled() {
        return this.f659mt;
    }

    public void setPitchThresholdEnabled(boolean z) {
        this.f659mt = z;
    }

    public int getPitchThreshold() {
        return this.f660mu;
    }

    public void setPitchThreshold(int i) {
        if (i < 0 || i > 45) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_THRESHOLD_ARGUMENT);
        }
        this.f660mu = i;
    }

    public boolean isRollThresholdEnabled() {
        return this.f661mv;
    }

    public void setRollThresholdEnabled(boolean z) {
        this.f661mv = z;
    }

    public int getRollThreshold() {
        return this.f662mw;
    }

    public void setRollThreshold(int i) {
        if (i < 0 || i > 45) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_THRESHOLD_ARGUMENT);
        }
        this.f662mw = i;
    }

    public boolean isFocusEnabled() {
        return this.f663mx;
    }

    public void setFocusEnabled(boolean z) {
        this.f663mx = z;
    }

    public boolean isOrientationEnabled() {
        return this.f664my;
    }

    public void setOrientationEnabled(boolean z) {
        this.f664my = z;
    }

    public void setRefocusEnabled(boolean z) {
        this.f665mz = z;
    }

    public boolean isRefocusBeforeCaptureEnabled() {
        return this.f665mz;
    }
}
