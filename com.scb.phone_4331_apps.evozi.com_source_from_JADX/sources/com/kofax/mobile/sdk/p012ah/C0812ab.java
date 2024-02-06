package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.view.C0755o;
import com.kofax.mobile.sdk._internal.view.C0773f;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.ab */
public final class C0812ab implements OPRStatusRewardsLandingActivity_ViewBinding<C0773f> {

    /* renamed from: Yi */
    private final C0844o f1986Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0755o> f1987ad;

    public C0812ab(C0844o oVar, HmlReviewDocumentActivity<C0755o> hmlReviewDocumentActivity) {
        this.f1986Yi = oVar;
        this.f1987ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sL */
    public final C0773f get() {
        C0773f b = this.f1986Yi.mo12098b(this.f1987ad.get());
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: l */
    public static C0812ab m2016l(C0844o oVar, HmlReviewDocumentActivity<C0755o> hmlReviewDocumentActivity) {
        return new C0812ab(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0773f m2015a(C0844o oVar, C0755o oVar2) {
        C0773f b = oVar.mo12098b(oVar2);
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
