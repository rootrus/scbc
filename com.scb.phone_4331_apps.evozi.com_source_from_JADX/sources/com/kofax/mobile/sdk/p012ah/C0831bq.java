package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C0511t;
import com.kofax.mobile.sdk._internal.impl.camera.C0564am;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.bq */
public final class C0831bq implements OPRStatusRewardsLandingActivity_ViewBinding<C0511t> {

    /* renamed from: Yo */
    private final C0830bn f2022Yo;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0564am> f2023ad;

    public C0831bq(C0830bn bnVar, HmlReviewDocumentActivity<C0564am> hmlReviewDocumentActivity) {
        this.f2022Yo = bnVar;
        this.f2023ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tx */
    public final C0511t get() {
        C0511t a = this.f2022Yo.mo12044a(this.f2023ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public static C0831bq m2074c(C0830bn bnVar, HmlReviewDocumentActivity<C0564am> hmlReviewDocumentActivity) {
        return new C0831bq(bnVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0511t m2073a(C0830bn bnVar, C0564am amVar) {
        C0511t a = bnVar.mo12044a(amVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
