package com.kofax.kmc.ken.engines.data;

import android.graphics.Point;

public class SelfieDetectionSettings {

    /* renamed from: cH */
    private Point f3353cH;

    /* renamed from: cI */
    private double f3354cI = 0.0d;

    /* renamed from: cJ */
    private double f3355cJ = 15.0d;

    /* renamed from: fq */
    private double f3356fq = 0.35d;

    /* renamed from: fr */
    private double f3357fr = 15.0d;

    public SelfieDetectionSettings() {
    }

    public SelfieDetectionSettings(SelfieDetectionSettings selfieDetectionSettings) {
        this.f3353cH = selfieDetectionSettings.f3353cH;
        this.f3354cI = selfieDetectionSettings.f3354cI;
        this.f3355cJ = selfieDetectionSettings.f3355cJ;
        this.f3356fq = selfieDetectionSettings.f3356fq;
        this.f3357fr = selfieDetectionSettings.f3357fr;
    }

    public void setMinimumFaceSize(double d) {
        if (d >= 0.0d && d <= 1.0d) {
            this.f3356fq = d;
        }
    }

    public double getMinimumFaceSize() {
        return this.f3356fq;
    }

    public Point getCenterPoint() {
        return this.f3353cH;
    }

    public void setCenterPoint(Point point) {
        this.f3353cH = point;
    }

    public double getTargetFrameAspectRatio() {
        return this.f3354cI;
    }

    public void setTargetFrameAspectRatio(double d) {
        if (d <= 0.0d) {
            this.f3354cI = 0.0d;
        } else {
            this.f3354cI = d;
        }
    }

    public double getTargetFramePaddingPercent() {
        return this.f3355cJ;
    }

    public void setTargetFramePaddingPercent(double d) {
        if (d < 0.0d) {
            this.f3355cJ = 0.0d;
        } else if (d > 50.0d) {
            this.f3355cJ = 50.0d;
        } else {
            this.f3355cJ = d;
        }
    }

    public double getFaceAngleTolerance() {
        return this.f3357fr;
    }

    public void setFaceAngleTolerance(double d) {
        if (d >= 0.0d || d <= 60.0d) {
            this.f3357fr = d;
        }
    }
}
