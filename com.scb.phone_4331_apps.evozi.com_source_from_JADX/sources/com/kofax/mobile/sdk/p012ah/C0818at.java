package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk.p010af.C0807j;
import com.kofax.mobile.sdk.p014aj.C0856b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.at */
public final class C0818at implements OPRStatusRewardsLandingActivity_ViewBinding<C0856b> {

    /* renamed from: Yi */
    private final C0844o f1998Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0807j> f1999ad;

    public C0818at(C0844o oVar, HmlReviewDocumentActivity<C0807j> hmlReviewDocumentActivity) {
        this.f1998Yi = oVar;
        this.f1999ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tb */
    public final C0856b get() {
        C0856b a = this.f1998Yi.mo12093a(this.f1999ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: D */
    public static C0818at m2033D(C0844o oVar, HmlReviewDocumentActivity<C0807j> hmlReviewDocumentActivity) {
        return new C0818at(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0856b m2034a(C0844o oVar, C0807j jVar) {
        C0856b a = oVar.mo12093a(jVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
