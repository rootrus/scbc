package com.kofax.mobile.sdk.p024l;

import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.capture.C0514c;

/* renamed from: com.kofax.mobile.sdk.l.c */
public abstract class C0966c<Detector, Settings> implements C0514c {

    /* renamed from: GV */
    protected final Detector f2345GV;

    /* renamed from: GW */
    protected Settings f2346GW;

    /* renamed from: GX */
    protected C0513a f2347GX;

    C0966c(Detector detector, Settings settings) {
        this.f2345GV = detector;
        this.f2346GW = settings;
    }

    /* renamed from: c */
    public void mo12370c(Settings settings) {
        this.f2346GW = settings;
        C0513a aVar = this.f2347GX;
        if (aVar != null) {
            aVar.mo11272br();
        }
    }

    /* renamed from: a */
    public void mo11301a(C0513a aVar) {
        this.f2347GX = aVar;
    }
}
