package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk.p010af.C0798a;
import com.kofax.mobile.sdk.p014aj.C0855a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.ah */
public final class C0815ah implements OPRStatusRewardsLandingActivity_ViewBinding<C0855a> {

    /* renamed from: Yi */
    private final C0844o f1992Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0798a> f1993ad;

    public C0815ah(C0844o oVar, HmlReviewDocumentActivity<C0798a> hmlReviewDocumentActivity) {
        this.f1992Yi = oVar;
        this.f1993ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sP */
    public final C0855a get() {
        C0855a b = this.f1992Yi.mo12100b(this.f1993ad.get());
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: r */
    public static C0815ah m2025r(C0844o oVar, HmlReviewDocumentActivity<C0798a> hmlReviewDocumentActivity) {
        return new C0815ah(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0855a m2024a(C0844o oVar, C0798a aVar) {
        C0855a b = oVar.mo12100b(aVar);
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
