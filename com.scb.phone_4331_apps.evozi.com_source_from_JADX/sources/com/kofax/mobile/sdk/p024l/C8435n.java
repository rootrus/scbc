package com.kofax.mobile.sdk.p024l;

import com.kofax.mobile.sdk._internal.capture.C0515d;
import com.kofax.mobile.sdk._internal.capture.C7894b;
import com.kofax.mobile.sdk._internal.impl.detection.data.EdgeGuidance;
import com.kofax.mobile.sdk._internal.impl.detection.data.FixedAspectRatioDetectionResult;
import com.kofax.mobile.sdk.p023k.C8408a;

/* renamed from: com.kofax.mobile.sdk.l.n */
class C8435n implements C0515d {

    /* renamed from: Ha */
    private final FixedAspectRatioDetectionResult f5011Ha;

    /* renamed from: Hb */
    private final C8408a f5012Hb;

    /* renamed from: bu */
    public boolean mo11306bu() {
        return false;
    }

    /* renamed from: bv */
    public boolean mo11307bv() {
        return false;
    }

    /* renamed from: bw */
    public boolean mo11308bw() {
        return false;
    }

    /* renamed from: bx */
    public boolean mo11309bx() {
        return false;
    }

    /* renamed from: by */
    public boolean mo11310by() {
        return false;
    }

    public C8435n(FixedAspectRatioDetectionResult fixedAspectRatioDetectionResult, C8408a aVar) {
        this.f5011Ha = fixedAspectRatioDetectionResult;
        this.f5012Hb = aVar;
    }

    /* renamed from: l */
    public boolean mo11313l(boolean z) {
        return mo11311bz();
    }

    /* renamed from: bz */
    public boolean mo11311bz() {
        return this.f5012Hb.mo54224bs() != null;
    }

    public EdgeGuidance getEdgesGuidance() {
        return this.f5011Ha.getEdgesGuidance();
    }

    /* renamed from: bA */
    public C7894b mo11305bA() {
        return this.f5012Hb;
    }
}
