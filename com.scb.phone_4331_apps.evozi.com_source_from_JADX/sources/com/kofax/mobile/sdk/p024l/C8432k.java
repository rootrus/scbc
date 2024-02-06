package com.kofax.mobile.sdk.p024l;

import com.kofax.kmc.ken.engines.data.DetectionResult;
import com.kofax.kmc.ken.engines.data.HorizontalGuidance;
import com.kofax.kmc.ken.engines.data.OrientationGuidance;
import com.kofax.kmc.ken.engines.data.TurnGuidance;
import com.kofax.kmc.ken.engines.data.VerticalGuidance;
import com.kofax.kmc.ken.engines.data.ZoomGuidance;
import com.kofax.mobile.sdk._internal.capture.C0515d;
import com.kofax.mobile.sdk._internal.capture.C7894b;
import com.kofax.mobile.sdk._internal.impl.detection.data.EdgeGuidance;
import com.kofax.mobile.sdk.p023k.C8408a;

/* renamed from: com.kofax.mobile.sdk.l.k */
class C8432k implements C0515d {

    /* renamed from: GY */
    private final DetectionResult f5008GY;

    /* renamed from: GZ */
    private final C8408a f5009GZ;

    public EdgeGuidance getEdgesGuidance() {
        return null;
    }

    C8432k(DetectionResult detectionResult, C8408a aVar) {
        this.f5008GY = detectionResult;
        this.f5009GZ = aVar;
    }

    /* renamed from: bu */
    public boolean mo11306bu() {
        return !m4991lJ();
    }

    /* renamed from: bw */
    public boolean mo11308bw() {
        return this.f5008GY.getZoomGuidance() == ZoomGuidance.ZOOM_OUT;
    }

    /* renamed from: bv */
    public boolean mo11307bv() {
        return this.f5008GY.getZoomGuidance() == ZoomGuidance.ZOOM_IN;
    }

    /* renamed from: bx */
    public boolean mo11309bx() {
        return this.f5008GY.getTurnGuidance() != TurnGuidance.TURN_OK;
    }

    /* renamed from: by */
    public boolean mo11310by() {
        return this.f5008GY.getOrientationGuidance() != OrientationGuidance.ORIENTATION_OK;
    }

    /* renamed from: l */
    public boolean mo11313l(boolean z) {
        return C8429h.m4984a(this, z);
    }

    /* renamed from: bz */
    public boolean mo11311bz() {
        return mo11305bA().mo54224bs() != null;
    }

    /* renamed from: lJ */
    private boolean m4991lJ() {
        return this.f5008GY.getHorizontalMovementGuidance() == HorizontalGuidance.HORIZONTAL_MOVE_OK && this.f5008GY.getVerticalMovementGuidance() == VerticalGuidance.VERTICAL_MOVE_OK;
    }

    /* renamed from: bA */
    public C7894b mo11305bA() {
        return this.f5009GZ;
    }
}
