package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.C0764y;
import com.kofax.mobile.sdk._internal.view.C0775i;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.ao */
public final class C0816ao implements OPRStatusRewardsLandingActivity_ViewBinding<C0775i> {

    /* renamed from: Yi */
    private final C0844o f1994Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0764y> f1995ad;

    public C0816ao(C0844o oVar, HmlReviewDocumentActivity<C0764y> hmlReviewDocumentActivity) {
        this.f1994Yi = oVar;
        this.f1995ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sW */
    public final C0775i get() {
        C0775i e = this.f1994Yi.mo12109e(this.f1995ad.get());
        if (e != null) {
            return e;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: y */
    public static C0816ao m2028y(C0844o oVar, HmlReviewDocumentActivity<C0764y> hmlReviewDocumentActivity) {
        return new C0816ao(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0775i m2027a(C0844o oVar, C0764y yVar) {
        C0775i e = oVar.mo12109e(yVar);
        if (e != null) {
            return e;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
