package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p074d.C8339c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bf */
public final class C8061bf implements OPRStatusRewardsLandingActivity_ViewBinding<C8339c> {

    /* renamed from: LV */
    private final C0705ah f3945LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8139el> f3946ad;

    public C8061bf(C0705ah ahVar, HmlReviewDocumentActivity<C8139el> hmlReviewDocumentActivity) {
        this.f3945LV = ahVar;
        this.f3946ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nu */
    public final C8339c get() {
        C8339c a = this.f3945LV.mo11678a(this.f3946ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: o */
    public static C8061bf m4109o(C0705ah ahVar, HmlReviewDocumentActivity<C8139el> hmlReviewDocumentActivity) {
        return new C8061bf(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8339c m4108a(C0705ah ahVar, C8139el elVar) {
        C8339c a = ahVar.mo11678a(elVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
