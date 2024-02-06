package com.kofax.kmc.ken.engines.data;

import android.graphics.Point;

public class FixedAspectRatioDetectionSettings {

    /* renamed from: cH */
    private Point f3350cH;

    /* renamed from: cI */
    private double f3351cI = 0.6296296119689941d;

    /* renamed from: cJ */
    private double f3352cJ = 8.0d;

    public FixedAspectRatioDetectionSettings() {
    }

    public FixedAspectRatioDetectionSettings(FixedAspectRatioDetectionSettings fixedAspectRatioDetectionSettings) {
        this.f3350cH = fixedAspectRatioDetectionSettings.f3350cH;
        this.f3351cI = fixedAspectRatioDetectionSettings.f3351cI;
        this.f3352cJ = fixedAspectRatioDetectionSettings.f3352cJ;
    }

    public Point getCenterPoint() {
        return this.f3350cH;
    }

    public void setCenterPoint(Point point) {
        this.f3350cH = point;
    }

    public double getTargetFrameAspectRatio() {
        return this.f3351cI;
    }

    public void setTargetFrameAspectRatio(double d) {
        if (d <= 0.0d) {
            this.f3351cI = 0.0d;
        } else {
            this.f3351cI = d;
        }
    }

    public double getTargetFramePaddingPercent() {
        return this.f3352cJ;
    }

    public void setTargetFramePaddingPercent(double d) {
        if (d < 0.0d) {
            this.f3352cJ = 0.0d;
        } else if (d > 50.0d) {
            this.f3352cJ = 50.0d;
        } else {
            this.f3352cJ = d;
        }
    }
}
