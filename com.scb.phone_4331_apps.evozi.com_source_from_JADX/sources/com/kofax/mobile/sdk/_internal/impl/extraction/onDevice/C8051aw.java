package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8562v;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.aw */
public final class C8051aw implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3923LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8562v> f3924ad;

    public C8051aw(C0705ah ahVar, HmlReviewDocumentActivity<C8562v> hmlReviewDocumentActivity) {
        this.f3923LV = ahVar;
        this.f3924ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3923LV.mo11708a(this.f3924ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: i */
    public static C8051aw m4080i(C0705ah ahVar, HmlReviewDocumentActivity<C8562v> hmlReviewDocumentActivity) {
        return new C8051aw(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4079a(C0705ah ahVar, C8562v vVar) {
        C8342c a = ahVar.mo11708a(vVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
