package com.kofax.kmc.ken.engines.data;

import android.graphics.Point;

public class CheckDetectionSettings extends DetectionSettings {

    /* renamed from: cD */
    private CheckSide f3347cD = CheckSide.FRONT;

    /* renamed from: cE */
    private double f3348cE = 0.0d;

    public CheckDetectionSettings() {
        setTargetFrameAspectRatio(2.1818181818181817d);
    }

    public CheckDetectionSettings(DetectionSettings detectionSettings) {
        super(detectionSettings);
    }

    public CheckDetectionSettings(CheckDetectionSettings checkDetectionSettings) {
        super(checkDetectionSettings);
        this.f3347cD = checkDetectionSettings.f3347cD;
    }

    public CheckDetectionSettings(Point point, double d, double d2) {
        super(point, d, d2);
    }

    public CheckSide getSide() {
        return this.f3347cD;
    }

    public void setSide(CheckSide checkSide) {
        if (checkSide != null) {
            this.f3347cD = checkSide;
            return;
        }
        throw new IllegalArgumentException("side is null");
    }

    public double getTargetFrameAspectRatio() {
        return super.getTargetFrameAspectRatio();
    }

    public void setTargetFrameAspectRatio(double d) {
        if (d > 0.0d && d < 1.0d) {
            d = 1.0d / d;
        }
        super.setTargetFrameAspectRatio(d);
    }

    public void setAspectRatioFraction(double d) {
        if (d >= 0.0d) {
            this.f3348cE = d;
        }
    }

    public double getAspectRatioFraction() {
        return this.f3348cE;
    }
}
