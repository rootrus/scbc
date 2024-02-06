package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.view.C0734a;
import com.kofax.mobile.sdk._internal.view.C0769a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.s */
public final class C0848s implements OPRStatusRewardsLandingActivity_ViewBinding<C0769a> {

    /* renamed from: Yi */
    private final C0844o f2051Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0734a> f2052ad;

    public C0848s(C0844o oVar, HmlReviewDocumentActivity<C0734a> hmlReviewDocumentActivity) {
        this.f2051Yi = oVar;
        this.f2052ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sD */
    public final C0769a get() {
        C0769a a = this.f2051Yi.mo12086a(this.f2052ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: d */
    public static C0848s m2170d(C0844o oVar, HmlReviewDocumentActivity<C0734a> hmlReviewDocumentActivity) {
        return new C0848s(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0769a m2169a(C0844o oVar, C0734a aVar) {
        C0769a a = oVar.mo12086a(aVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
