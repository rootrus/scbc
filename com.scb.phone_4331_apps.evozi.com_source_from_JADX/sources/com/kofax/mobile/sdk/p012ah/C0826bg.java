package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.view.C0740ap;
import com.kofax.mobile.sdk._internal.view.C0778o;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.bg */
public final class C0826bg implements OPRStatusRewardsLandingActivity_ViewBinding<C0778o> {

    /* renamed from: Yi */
    private final C0844o f2016Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0740ap> f2017ad;

    public C0826bg(C0844o oVar, HmlReviewDocumentActivity<C0740ap> hmlReviewDocumentActivity) {
        this.f2016Yi = oVar;
        this.f2017ad = hmlReviewDocumentActivity;
    }

    /* renamed from: to */
    public final C0778o get() {
        C0778o c = this.f2016Yi.mo12106c(this.f2017ad.get());
        if (c != null) {
            return c;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: O */
    public static C0826bg m2057O(C0844o oVar, HmlReviewDocumentActivity<C0740ap> hmlReviewDocumentActivity) {
        return new C0826bg(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0778o m2058a(C0844o oVar, C0740ap apVar) {
        C0778o c = oVar.mo12106c(apVar);
        if (c != null) {
            return c;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
