package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p073c.C8300d;
import com.kofax.mobile.sdk.p077m.C8453a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cb */
public final class C8081cb implements OPRStatusRewardsLandingActivity_ViewBinding<C8300d> {

    /* renamed from: LV */
    private final C0705ah f3994LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8453a> f3995ad;

    public C8081cb(C0705ah ahVar, HmlReviewDocumentActivity<C8453a> hmlReviewDocumentActivity) {
        this.f3994LV = ahVar;
        this.f3995ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nP */
    public final C8300d get() {
        C8300d a = this.f3994LV.mo11675a(this.f3995ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: C */
    public static C8081cb m4169C(C0705ah ahVar, HmlReviewDocumentActivity<C8453a> hmlReviewDocumentActivity) {
        return new C8081cb(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8300d m4170a(C0705ah ahVar, C8453a aVar) {
        C8300d a = ahVar.mo11675a(aVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
