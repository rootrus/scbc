package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.capture.C0517g;
import com.kofax.mobile.sdk.p023k.C0959m;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.bf */
public final class C0825bf implements OPRStatusRewardsLandingActivity_ViewBinding<C0517g> {

    /* renamed from: Yi */
    private final C0844o f2014Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0959m> f2015ad;

    public C0825bf(C0844o oVar, HmlReviewDocumentActivity<C0959m> hmlReviewDocumentActivity) {
        this.f2014Yi = oVar;
        this.f2015ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tn */
    public final C0517g get() {
        C0517g b = this.f2014Yi.mo12096b(this.f2015ad.get());
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: N */
    public static C0825bf m2054N(C0844o oVar, HmlReviewDocumentActivity<C0959m> hmlReviewDocumentActivity) {
        return new C0825bf(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0517g m2055a(C0844o oVar, C0959m mVar) {
        C0517g b = oVar.mo12096b(mVar);
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
