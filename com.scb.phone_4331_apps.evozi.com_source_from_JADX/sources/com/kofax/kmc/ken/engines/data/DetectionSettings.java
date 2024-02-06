package com.kofax.kmc.ken.engines.data;

import android.graphics.Point;

public abstract class DetectionSettings {

    /* renamed from: cH */
    private Point f203cH;

    /* renamed from: cI */
    private double f204cI = 0.0d;

    /* renamed from: cJ */
    private double f205cJ = 5.0d;

    /* renamed from: cK */
    private double f206cK = 0.65d;

    /* renamed from: cL */
    private double f207cL = 1.3d;

    /* renamed from: cM */
    private double f208cM = 10.0d;

    /* renamed from: cN */
    private double f209cN = 0.15d;

    protected DetectionSettings() {
    }

    protected DetectionSettings(DetectionSettings detectionSettings) {
        this.f203cH = detectionSettings.f203cH;
        this.f204cI = detectionSettings.f204cI;
        this.f205cJ = detectionSettings.f205cJ;
        this.f206cK = detectionSettings.f206cK;
        this.f207cL = detectionSettings.f207cL;
        this.f208cM = detectionSettings.f208cM;
        this.f209cN = detectionSettings.f209cN;
    }

    public DetectionSettings(Point point, double d, double d2) {
        if (point != null) {
            this.f203cH = point;
        }
        if (d > 0.0d) {
            this.f204cI = d;
        }
        if (d2 >= 0.0d) {
            this.f205cJ = d2;
        }
    }

    public Point getCenterPoint() {
        return this.f203cH;
    }

    public void setCenterPoint(Point point) {
        this.f203cH = point;
    }

    public double getTargetFrameAspectRatio() {
        return this.f204cI;
    }

    public void setTargetFrameAspectRatio(double d) {
        if (d <= 0.0d) {
            this.f204cI = 0.0d;
        } else {
            this.f204cI = d;
        }
    }

    public double getTargetFramePaddingPercent() {
        return this.f205cJ;
    }

    public void setTargetFramePaddingPercent(double d) {
        if (d < 0.0d) {
            this.f205cJ = 0.0d;
        } else if (d > 50.0d) {
            this.f205cJ = 50.0d;
        } else {
            this.f205cJ = d;
        }
    }

    public double getMinFillFraction() {
        return this.f206cK;
    }

    public void setMinFillFraction(double d) {
        if (d >= 0.0d) {
            this.f206cK = d;
        }
    }

    public double getMaxFillFraction() {
        return this.f207cL;
    }

    public void setMaxFillFraction(double d) {
        if (d >= 0.0d) {
            this.f207cL = d;
        }
    }

    public double getMaxSkewAngle() {
        return this.f208cM;
    }

    public void setMaxSkewAngle(double d) {
        if (d >= 0.0d) {
            this.f208cM = d;
        }
    }

    public double getToleranceFraction() {
        return this.f209cN;
    }

    public void setToleranceFraction(double d) {
        if (d >= 0.0d) {
            this.f209cN = d;
        }
    }
}
