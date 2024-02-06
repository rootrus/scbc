package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.C7901c;
import com.kofax.mobile.sdk._internal.impl.extraction.C7988d;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ce */
public final class C8084ce implements OPRStatusRewardsLandingActivity_ViewBinding<C7901c> {

    /* renamed from: LV */
    private final C0705ah f4001LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C7988d> f4002ad;

    public C8084ce(C0705ah ahVar, HmlReviewDocumentActivity<C7988d> hmlReviewDocumentActivity) {
        this.f4001LV = ahVar;
        this.f4002ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nS */
    public final C7901c get() {
        C7901c a = this.f4001LV.mo11640a(this.f4002ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: E */
    public static C8084ce m4178E(C0705ah ahVar, HmlReviewDocumentActivity<C7988d> hmlReviewDocumentActivity) {
        return new C8084ce(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7901c m4179a(C0705ah ahVar, C7988d dVar) {
        C7901c a = ahVar.mo11640a(dVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
