package com.kofax.kmc.ken.engines;

import android.graphics.Rect;
import com.kofax.android.abc.machine_vision.CaptureGuidance;

/* renamed from: com.kofax.kmc.ken.engines.k */
class C0465k implements INativeGuidance {

    /* renamed from: bL */
    private final CaptureGuidance f517bL;

    public C0465k(CaptureGuidance captureGuidance) {
        this.f517bL = captureGuidance;
    }

    public double getZoomGuidance(Rect rect, double d, double d2) {
        return this.f517bL.getZoomGuidance(rect, d, d2);
    }

    public double getTurnGuidance(double d) {
        return this.f517bL.getTurnGuidance(d);
    }

    public double getHorizontalMovementGuidance(Rect rect, double d) {
        return this.f517bL.getHorizontalMovementGuidance(rect, d);
    }

    public double getVerticalMovementGuidance(Rect rect, double d) {
        return this.f517bL.getVerticalMovementGuidance(rect, d);
    }
}
