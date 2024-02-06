package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.view.C0744e;
import com.kofax.mobile.sdk._internal.view.C0770c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.y */
public final class C0851y implements OPRStatusRewardsLandingActivity_ViewBinding<C0770c> {

    /* renamed from: Yi */
    private final C0844o f2059Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0744e> f2060ad;

    public C0851y(C0844o oVar, HmlReviewDocumentActivity<C0744e> hmlReviewDocumentActivity) {
        this.f2059Yi = oVar;
        this.f2060ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sI */
    public final C0770c get() {
        C0770c c = this.f2059Yi.mo12102c(this.f2060ad.get());
        if (c != null) {
            return c;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: i */
    public static C0851y m2179i(C0844o oVar, HmlReviewDocumentActivity<C0744e> hmlReviewDocumentActivity) {
        return new C0851y(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0770c m2178a(C0844o oVar, C0744e eVar) {
        C0770c c = oVar.mo12102c(eVar);
        if (c != null) {
            return c;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
