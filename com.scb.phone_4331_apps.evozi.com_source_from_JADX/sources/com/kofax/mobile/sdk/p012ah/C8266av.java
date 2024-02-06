package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.view.C0735aa;
import com.kofax.mobile.sdk._internal.view.IOverlayView;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.av */
public final class C8266av implements OPRStatusRewardsLandingActivity_ViewBinding<IOverlayView> {

    /* renamed from: Yi */
    private final C0844o f4427Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0735aa> f4428ad;

    public C8266av(C0844o oVar, HmlReviewDocumentActivity<C0735aa> hmlReviewDocumentActivity) {
        this.f4427Yi = oVar;
        this.f4428ad = hmlReviewDocumentActivity;
    }

    /* renamed from: td */
    public final IOverlayView get() {
        IOverlayView e = this.f4427Yi.mo12108e(this.f4428ad.get());
        if (e != null) {
            return e;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: F */
    public static C8266av m4606F(C0844o oVar, HmlReviewDocumentActivity<C0735aa> hmlReviewDocumentActivity) {
        return new C8266av(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static IOverlayView m4607a(C0844o oVar, C0735aa aaVar) {
        IOverlayView e = oVar.mo12108e(aaVar);
        if (e != null) {
            return e;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
