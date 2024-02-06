package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8522au;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dk */
public final class C8114dk implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4080LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8522au> f4081ad;

    public C8114dk(C0705ah ahVar, HmlReviewDocumentActivity<C8522au> hmlReviewDocumentActivity) {
        this.f4080LV = ahVar;
        this.f4081ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4080LV.mo11700a(this.f4081ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: W */
    public static C8114dk m4267W(C0705ah ahVar, HmlReviewDocumentActivity<C8522au> hmlReviewDocumentActivity) {
        return new C8114dk(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4268a(C0705ah ahVar, C8522au auVar) {
        C8342c a = ahVar.mo11700a(auVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
