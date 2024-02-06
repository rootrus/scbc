package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.capture.C0516e;
import com.kofax.mobile.sdk.p023k.C0954e;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.ac */
public final class C0813ac implements OPRStatusRewardsLandingActivity_ViewBinding<C0516e> {

    /* renamed from: Yi */
    private final C0844o f1988Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0954e> f1989ad;

    public C0813ac(C0844o oVar, HmlReviewDocumentActivity<C0954e> hmlReviewDocumentActivity) {
        this.f1988Yi = oVar;
        this.f1989ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sM */
    public final C0516e get() {
        C0516e a = this.f1988Yi.mo12077a(this.f1989ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: m */
    public static C0813ac m2019m(C0844o oVar, HmlReviewDocumentActivity<C0954e> hmlReviewDocumentActivity) {
        return new C0813ac(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0516e m2018a(C0844o oVar, C0954e eVar) {
        C0516e a = oVar.mo12077a(eVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
