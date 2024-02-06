package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.view.C0757q;
import com.kofax.mobile.sdk._internal.view.C0774g;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.ae */
public final class C0814ae implements OPRStatusRewardsLandingActivity_ViewBinding<C0774g> {

    /* renamed from: Yi */
    private final C0844o f1990Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0757q> f1991ad;

    public C0814ae(C0844o oVar, HmlReviewDocumentActivity<C0757q> hmlReviewDocumentActivity) {
        this.f1990Yi = oVar;
        this.f1991ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sN */
    public final C0774g get() {
        C0774g c = this.f1990Yi.mo12104c(this.f1991ad.get());
        if (c != null) {
            return c;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: o */
    public static C0814ae m2022o(C0844o oVar, HmlReviewDocumentActivity<C0757q> hmlReviewDocumentActivity) {
        return new C0814ae(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0774g m2021a(C0844o oVar, C0757q qVar) {
        C0774g c = oVar.mo12104c(qVar);
        if (c != null) {
            return c;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
