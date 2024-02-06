package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.view.C0763y;
import com.kofax.mobile.sdk._internal.view.C0776j;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.as */
public final class C0817as implements OPRStatusRewardsLandingActivity_ViewBinding<C0776j> {

    /* renamed from: Yi */
    private final C0844o f1996Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0763y> f1997ad;

    public C0817as(C0844o oVar, HmlReviewDocumentActivity<C0763y> hmlReviewDocumentActivity) {
        this.f1996Yi = oVar;
        this.f1997ad = hmlReviewDocumentActivity;
    }

    /* renamed from: ta */
    public final C0776j get() {
        C0776j a = this.f1996Yi.mo12089a(this.f1997ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: C */
    public static C0817as m2030C(C0844o oVar, HmlReviewDocumentActivity<C0763y> hmlReviewDocumentActivity) {
        return new C0817as(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0776j m2031a(C0844o oVar, C0763y yVar) {
        C0776j a = oVar.mo12089a(yVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
