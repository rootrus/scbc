package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk._internal.impl.C8196u;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.am */
public final class C8261am implements OPRStatusRewardsLandingActivity_ViewBinding<C7919g> {

    /* renamed from: Yi */
    private final C0844o f4417Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8196u> f4418ad;

    public C8261am(C0844o oVar, HmlReviewDocumentActivity<C8196u> hmlReviewDocumentActivity) {
        this.f4417Yi = oVar;
        this.f4418ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sU */
    public final C7919g get() {
        C7919g a = this.f4417Yi.mo12080a(this.f4418ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: w */
    public static C8261am m4592w(C0844o oVar, HmlReviewDocumentActivity<C8196u> hmlReviewDocumentActivity) {
        return new C8261am(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7919g m4591a(C0844o oVar, C8196u uVar) {
        C7919g a = oVar.mo12080a(uVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
