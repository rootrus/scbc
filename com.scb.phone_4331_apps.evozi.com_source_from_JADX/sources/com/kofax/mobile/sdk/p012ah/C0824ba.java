package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.view.C0739ag;
import com.kofax.mobile.sdk._internal.view.C0777k;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.ba */
public final class C0824ba implements OPRStatusRewardsLandingActivity_ViewBinding<C0777k> {

    /* renamed from: Yi */
    private final C0844o f2012Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0739ag> f2013ad;

    public C0824ba(C0844o oVar, HmlReviewDocumentActivity<C0739ag> hmlReviewDocumentActivity) {
        this.f2012Yi = oVar;
        this.f2013ad = hmlReviewDocumentActivity;
    }

    /* renamed from: ti */
    public final C0777k get() {
        C0777k a = this.f2012Yi.mo12090a(this.f2013ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: I */
    public static C0824ba m2051I(C0844o oVar, HmlReviewDocumentActivity<C0739ag> hmlReviewDocumentActivity) {
        return new C0824ba(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0777k m2052a(C0844o oVar, C0739ag agVar) {
        C0777k a = oVar.mo12090a(agVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
