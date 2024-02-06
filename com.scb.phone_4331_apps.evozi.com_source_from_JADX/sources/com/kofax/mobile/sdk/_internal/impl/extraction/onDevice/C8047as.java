package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8549l;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.as */
public final class C8047as implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3914LV;

    /* renamed from: Mc */
    private final HmlReviewDocumentActivity<C8549l> f3915Mc;

    public C8047as(C0705ah ahVar, HmlReviewDocumentActivity<C8549l> hmlReviewDocumentActivity) {
        this.f3914LV = ahVar;
        this.f3915Mc = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3914LV.mo11705a(this.f3915Mc.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: f */
    public static C8047as m4068f(C0705ah ahVar, HmlReviewDocumentActivity<C8549l> hmlReviewDocumentActivity) {
        return new C8047as(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4067a(C0705ah ahVar, C8549l lVar) {
        C8342c a = ahVar.mo11705a(lVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
