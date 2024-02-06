package com.kofax.kmc.ken.engines;

import android.graphics.Rect;
import com.kofax.kmc.ken.engines.gpu.CaptureGuidance;

/* renamed from: com.kofax.kmc.ken.engines.f */
class C0442f implements INativeGuidance {

    /* renamed from: ag */
    private final CaptureGuidance f350ag;

    public C0442f(CaptureGuidance captureGuidance) {
        this.f350ag = captureGuidance;
    }

    public double getZoomGuidance(Rect rect, double d, double d2) {
        return this.f350ag.getZoomGuidance(rect, d, d2);
    }

    public double getTurnGuidance(double d) {
        return this.f350ag.getTurnGuidance(d);
    }

    public double getHorizontalMovementGuidance(Rect rect, double d) {
        return this.f350ag.getHorizontalMovementGuidance(rect, d);
    }

    public double getVerticalMovementGuidance(Rect rect, double d) {
        return this.f350ag.getVerticalMovementGuidance(rect, d);
    }
}
