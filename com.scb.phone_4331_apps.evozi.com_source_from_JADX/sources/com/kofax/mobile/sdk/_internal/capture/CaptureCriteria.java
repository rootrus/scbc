package com.kofax.mobile.sdk._internal.capture;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;

public class CaptureCriteria {

    /* renamed from: mr */
    private boolean f1045mr = true;

    /* renamed from: ms */
    private int f1046ms = 95;

    /* renamed from: mt */
    private boolean f1047mt = true;

    /* renamed from: mu */
    private int f1048mu = 15;

    /* renamed from: mv */
    private boolean f1049mv = true;

    /* renamed from: mw */
    private int f1050mw = 15;

    /* renamed from: mx */
    private boolean f1051mx = true;

    /* renamed from: my */
    private boolean f1052my = true;

    /* renamed from: ts */
    private boolean f1053ts = true;

    /* renamed from: tt */
    private double f1054tt = 1.0d;

    /* renamed from: tu */
    private boolean f1055tu = true;

    public CaptureCriteria() {
    }

    CaptureCriteria(CaptureCriteria captureCriteria) {
        setFocusEnabled(captureCriteria.isFocusEnabled());
        setStabilityThresholdEnabled(captureCriteria.isStabilityThresholdEnabled());
        setStabilityThreshold(captureCriteria.getStabilityThreshold());
        setRollThresholdEnabled(captureCriteria.isRollThresholdEnabled());
        setRollThreshold(captureCriteria.getRollThreshold());
        setPitchThresholdEnabled(captureCriteria.isPitchThresholdEnabled());
        setPitchThreshold(captureCriteria.getPitchThreshold());
        setOrientationEnabled(captureCriteria.isOrientationEnabled());
        setRefocusBeforeCaptureEnabled(captureCriteria.isRefocusBeforeCaptureEnabled());
    }

    public boolean isStabilityThresholdEnabled() {
        return this.f1045mr;
    }

    public void setStabilityThresholdEnabled(boolean z) {
        this.f1045mr = z;
    }

    public int getStabilityThreshold() {
        return this.f1046ms;
    }

    public void setStabilityThreshold(int i) {
        if (i < 0 || i > 100) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_STABILITY_DELAY_ARGUMENT);
        }
        this.f1046ms = i;
    }

    public boolean isPitchThresholdEnabled() {
        return this.f1047mt;
    }

    public void setPitchThresholdEnabled(boolean z) {
        this.f1047mt = z;
    }

    public int getPitchThreshold() {
        return this.f1048mu;
    }

    public void setPitchThreshold(int i) {
        if (i < 0 || i > 45) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_THRESHOLD_ARGUMENT);
        }
        this.f1048mu = i;
    }

    public boolean isRollThresholdEnabled() {
        return this.f1049mv;
    }

    public void setRollThresholdEnabled(boolean z) {
        this.f1049mv = z;
    }

    public int getRollThreshold() {
        return this.f1050mw;
    }

    public void setRollThreshold(int i) {
        if (i < 0 || i > 45) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_THRESHOLD_ARGUMENT);
        }
        this.f1050mw = i;
    }

    public boolean isFocusEnabled() {
        return this.f1051mx;
    }

    public void setFocusEnabled(boolean z) {
        this.f1051mx = z;
    }

    public boolean isOrientationEnabled() {
        return this.f1052my;
    }

    public void setOrientationEnabled(boolean z) {
        this.f1052my = z;
    }

    public void setRefocusBeforeCaptureEnabled(boolean z) {
        this.f1053ts = z;
    }

    public boolean isRefocusBeforeCaptureEnabled() {
        return this.f1053ts;
    }

    public void setHoldSteadyDelay(double d) {
        this.f1054tt = Math.min(Math.max(d, 0.0d), 3.0d);
    }

    public double getHoldSteadyDelay() {
        return this.f1054tt;
    }

    public void setPageDetectionEnabled(boolean z) {
        this.f1055tu = z;
    }

    public boolean isPageDetectionEnabled() {
        return this.f1055tu;
    }
}
