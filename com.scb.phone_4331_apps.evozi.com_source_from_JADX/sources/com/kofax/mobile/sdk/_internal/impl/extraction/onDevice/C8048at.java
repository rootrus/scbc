package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8554p;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.at */
public final class C8048at implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3916LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8554p> f3917ad;

    public C8048at(C0705ah ahVar, HmlReviewDocumentActivity<C8554p> hmlReviewDocumentActivity) {
        this.f3916LV = ahVar;
        this.f3917ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3916LV.mo11707a(this.f3917ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: g */
    public static C8048at m4071g(C0705ah ahVar, HmlReviewDocumentActivity<C8554p> hmlReviewDocumentActivity) {
        return new C8048at(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4070a(C0705ah ahVar, C8554p pVar) {
        C8342c a = ahVar.mo11707a(pVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
