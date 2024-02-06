package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.view.C0749i;
import com.kofax.mobile.sdk._internal.view.C0771d;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.z */
public final class C0852z implements OPRStatusRewardsLandingActivity_ViewBinding<C0771d> {

    /* renamed from: Yi */
    private final C0844o f2061Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0749i> f2062ad;

    public C0852z(C0844o oVar, HmlReviewDocumentActivity<C0749i> hmlReviewDocumentActivity) {
        this.f2061Yi = oVar;
        this.f2062ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sJ */
    public final C0771d get() {
        C0771d a = this.f2061Yi.mo12087a(this.f2062ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: j */
    public static C0852z m2182j(C0844o oVar, HmlReviewDocumentActivity<C0749i> hmlReviewDocumentActivity) {
        return new C0852z(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0771d m2181a(C0844o oVar, C0749i iVar) {
        C0771d a = oVar.mo12087a(iVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
