package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.view.C0751l;
import com.kofax.mobile.sdk._internal.view.C0772e;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.aa */
public final class C0811aa implements OPRStatusRewardsLandingActivity_ViewBinding<C0772e> {

    /* renamed from: Yi */
    private final C0844o f1984Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0751l> f1985ad;

    public C0811aa(C0844o oVar, HmlReviewDocumentActivity<C0751l> hmlReviewDocumentActivity) {
        this.f1984Yi = oVar;
        this.f1985ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sK */
    public final C0772e get() {
        C0772e c = this.f1984Yi.mo12103c(this.f1985ad.get());
        if (c != null) {
            return c;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: k */
    public static C0811aa m2013k(C0844o oVar, HmlReviewDocumentActivity<C0751l> hmlReviewDocumentActivity) {
        return new C0811aa(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0772e m2012a(C0844o oVar, C0751l lVar) {
        C0772e c = oVar.mo12103c(lVar);
        if (c != null) {
            return c;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
