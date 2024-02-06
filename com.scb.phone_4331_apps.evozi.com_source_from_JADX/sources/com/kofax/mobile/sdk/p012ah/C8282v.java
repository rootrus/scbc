package com.kofax.mobile.sdk.p012ah;

import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.mobile.sdk._internal.camera.C0500f;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.v */
public final class C8282v implements OPRStatusRewardsLandingActivity_ViewBinding<C0500f> {

    /* renamed from: Yi */
    private final C0844o f4460Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<ImageCaptureView> f4461ad;

    public C8282v(C0844o oVar, HmlReviewDocumentActivity<ImageCaptureView> hmlReviewDocumentActivity) {
        this.f4460Yi = oVar;
        this.f4461ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sF */
    public final C0500f get() {
        C0500f o = this.f4460Yi.mo12112o(this.f4461ad.get());
        if (o != null) {
            return o;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: f */
    public static C8282v m4655f(C0844o oVar, HmlReviewDocumentActivity<ImageCaptureView> hmlReviewDocumentActivity) {
        return new C8282v(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0500f m4654a(C0844o oVar, ImageCaptureView imageCaptureView) {
        C0500f o = oVar.mo12112o(imageCaptureView);
        if (o != null) {
            return o;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
