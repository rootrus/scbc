package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.C7921h;
import com.kofax.mobile.sdk._internal.impl.C7924ac;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.be */
public final class C8271be implements OPRStatusRewardsLandingActivity_ViewBinding<C7921h> {

    /* renamed from: Yi */
    private final C0844o f4437Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C7924ac> f4438ad;

    public C8271be(C0844o oVar, HmlReviewDocumentActivity<C7924ac> hmlReviewDocumentActivity) {
        this.f4437Yi = oVar;
        this.f4438ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tm */
    public final C7921h get() {
        C7921h a = this.f4437Yi.mo12081a(this.f4438ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: M */
    public static C8271be m4621M(C0844o oVar, HmlReviewDocumentActivity<C7924ac> hmlReviewDocumentActivity) {
        return new C8271be(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7921h m4622a(C0844o oVar, C7924ac acVar) {
        C7921h a = oVar.mo12081a(acVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
