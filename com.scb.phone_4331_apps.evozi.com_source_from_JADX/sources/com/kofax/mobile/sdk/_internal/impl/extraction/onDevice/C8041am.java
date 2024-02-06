package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8535e;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.am */
public final class C8041am implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3895LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8535e> f3896ad;

    public C8041am(C0705ah ahVar, HmlReviewDocumentActivity<C8535e> hmlReviewDocumentActivity) {
        this.f3895LV = ahVar;
        this.f3896ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3895LV.mo11704a(this.f3896ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: d */
    public static C8041am m4050d(C0705ah ahVar, HmlReviewDocumentActivity<C8535e> hmlReviewDocumentActivity) {
        return new C8041am(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4049a(C0705ah ahVar, C8535e eVar) {
        C8342c a = ahVar.mo11704a(eVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
