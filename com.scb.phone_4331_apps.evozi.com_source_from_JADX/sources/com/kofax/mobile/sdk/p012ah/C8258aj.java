package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.impl.C8190q;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.aj */
public final class C8258aj implements OPRStatusRewardsLandingActivity_ViewBinding<C7898e> {

    /* renamed from: Yi */
    private final C0844o f4411Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8190q> f4412ad;

    public C8258aj(C0844o oVar, HmlReviewDocumentActivity<C8190q> hmlReviewDocumentActivity) {
        this.f4411Yi = oVar;
        this.f4412ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sR */
    public final C7898e get() {
        C7898e a = this.f4411Yi.mo12078a(this.f4412ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: t */
    public static C8258aj m4583t(C0844o oVar, HmlReviewDocumentActivity<C8190q> hmlReviewDocumentActivity) {
        return new C8258aj(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7898e m4582a(C0844o oVar, C8190q qVar) {
        C7898e a = oVar.mo12078a(qVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
