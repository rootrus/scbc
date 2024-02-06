package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk.p006ab.C0786a;
import com.kofax.mobile.sdk.p013ai.C0854b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.ax */
public final class C0821ax implements OPRStatusRewardsLandingActivity_ViewBinding<C0854b> {

    /* renamed from: Yi */
    private final C0844o f2005Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0786a> f2006ad;

    public C0821ax(C0844o oVar, HmlReviewDocumentActivity<C0786a> hmlReviewDocumentActivity) {
        this.f2005Yi = oVar;
        this.f2006ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tf */
    public final C0854b get() {
        C0854b a = this.f2005Yi.mo12092a(this.f2006ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: G */
    public static C0821ax m2042G(C0844o oVar, HmlReviewDocumentActivity<C0786a> hmlReviewDocumentActivity) {
        return new C0821ax(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0854b m2043a(C0844o oVar, C0786a aVar) {
        C0854b a = oVar.mo12092a(aVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
