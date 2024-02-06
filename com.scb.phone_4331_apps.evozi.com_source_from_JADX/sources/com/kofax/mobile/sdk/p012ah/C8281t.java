package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C0498d;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.t */
public final class C8281t implements OPRStatusRewardsLandingActivity_ViewBinding<C0498d> {

    /* renamed from: Yi */
    private final C0844o f4458Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0499e> f4459ad;

    public C8281t(C0844o oVar, HmlReviewDocumentActivity<C0499e> hmlReviewDocumentActivity) {
        this.f4458Yi = oVar;
        this.f4459ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sE */
    public final C0498d get() {
        C0498d d = this.f4458Yi.mo12107d(this.f4459ad.get());
        if (d != null) {
            return d;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: e */
    public static C8281t m4652e(C0844o oVar, HmlReviewDocumentActivity<C0499e> hmlReviewDocumentActivity) {
        return new C8281t(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0498d m4651a(C0844o oVar, C0499e eVar) {
        C0498d d = oVar.mo12107d(eVar);
        if (d != null) {
            return d;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
