package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.view.C8211ak;
import com.kofax.mobile.sdk._internal.view.C8237m;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.bd */
public final class C8270bd implements OPRStatusRewardsLandingActivity_ViewBinding<C8237m> {

    /* renamed from: Yi */
    private final C0844o f4435Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8211ak> f4436ad;

    public C8270bd(C0844o oVar, HmlReviewDocumentActivity<C8211ak> hmlReviewDocumentActivity) {
        this.f4435Yi = oVar;
        this.f4436ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tl */
    public final C8237m get() {
        C8237m c = this.f4435Yi.mo12105c(this.f4436ad.get());
        if (c != null) {
            return c;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: L */
    public static C8270bd m4618L(C0844o oVar, HmlReviewDocumentActivity<C8211ak> hmlReviewDocumentActivity) {
        return new C8270bd(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8237m m4619a(C0844o oVar, C8211ak akVar) {
        C8237m c = oVar.mo12105c(akVar);
        if (c != null) {
            return c;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
