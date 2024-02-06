package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8551n;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bb */
public final class C8057bb implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3934LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8551n> f3935ad;

    public C8057bb(C0705ah ahVar, HmlReviewDocumentActivity<C8551n> hmlReviewDocumentActivity) {
        this.f3934LV = ahVar;
        this.f3935ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3934LV.mo11706a(this.f3935ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: n */
    public static C8057bb m4097n(C0705ah ahVar, HmlReviewDocumentActivity<C8551n> hmlReviewDocumentActivity) {
        return new C8057bb(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4096a(C0705ah ahVar, C8551n nVar) {
        C8342c a = ahVar.mo11706a(nVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
