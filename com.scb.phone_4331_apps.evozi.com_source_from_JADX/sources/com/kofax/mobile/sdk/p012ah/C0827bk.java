package com.kofax.mobile.sdk.p012ah;

import android.view.SurfaceView;
import com.kofax.mobile.sdk._internal.impl.camera.C0621l;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.bk */
public final class C0827bk implements OPRStatusRewardsLandingActivity_ViewBinding<SurfaceView> {

    /* renamed from: Yi */
    private final C0844o f2018Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0621l> f2019ad;

    public C0827bk(C0844o oVar, HmlReviewDocumentActivity<C0621l> hmlReviewDocumentActivity) {
        this.f2018Yi = oVar;
        this.f2019ad = hmlReviewDocumentActivity;
    }

    /* renamed from: ts */
    public final SurfaceView get() {
        SurfaceView a = this.f2018Yi.mo12066a(this.f2019ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: S */
    public static C0827bk m2060S(C0844o oVar, HmlReviewDocumentActivity<C0621l> hmlReviewDocumentActivity) {
        return new C0827bk(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static SurfaceView m2061a(C0844o oVar, C0621l lVar) {
        SurfaceView a = oVar.mo12066a(lVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
