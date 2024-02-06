package com.kofax.mobile.sdk._internal.impl.camera;

import com.kofax.mobile.sdk._internal.camera.C0511t;
import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.ac */
public final class C7928ac implements OPRStatusRewardsLandingActivity_ViewBinding<VideoPlayerCameraPlayer> {

    /* renamed from: Dc */
    private final HmlReviewDocumentActivity<C0511t> f3666Dc;

    /* renamed from: ur */
    private final HmlReviewDocumentActivity<IVideoResourceProvider> f3667ur;

    public C7928ac(HmlReviewDocumentActivity<IVideoResourceProvider> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0511t> hmlReviewDocumentActivity2) {
        this.f3667ur = hmlReviewDocumentActivity;
        this.f3666Dc = hmlReviewDocumentActivity2;
    }

    /* renamed from: kh */
    public final VideoPlayerCameraPlayer get() {
        return new VideoPlayerCameraPlayer(this.f3667ur.get(), this.f3666Dc.get());
    }

    /* renamed from: f */
    public static C7928ac m3880f(HmlReviewDocumentActivity<IVideoResourceProvider> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0511t> hmlReviewDocumentActivity2) {
        return new C7928ac(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
