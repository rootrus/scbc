package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p074d.C8337b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ay */
public final class C8053ay implements OPRStatusRewardsLandingActivity_ViewBinding<C8337b> {

    /* renamed from: LV */
    private final C0705ah f3927LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8165r> f3928ad;

    public C8053ay(C0705ah ahVar, HmlReviewDocumentActivity<C8165r> hmlReviewDocumentActivity) {
        this.f3927LV = ahVar;
        this.f3928ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nt */
    public final C8337b get() {
        C8337b a = this.f3927LV.mo11677a(this.f3928ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: k */
    public static C8053ay m4086k(C0705ah ahVar, HmlReviewDocumentActivity<C8165r> hmlReviewDocumentActivity) {
        return new C8053ay(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8337b m4085a(C0705ah ahVar, C8165r rVar) {
        C8337b a = ahVar.mo11677a(rVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
