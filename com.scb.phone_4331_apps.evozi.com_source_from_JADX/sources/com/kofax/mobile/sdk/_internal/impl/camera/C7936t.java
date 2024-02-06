package com.kofax.mobile.sdk._internal.impl.camera;

import com.kofax.mobile.sdk._internal.camera.C7891m;
import com.kofax.mobile.sdk._internal.camera.C7893v;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.t */
public final class C7936t implements OPRStatusRewardsLandingActivity_ViewBinding<C7935s> {

    /* renamed from: BC */
    private final HmlReviewDocumentActivity<C7893v> f3678BC;

    /* renamed from: BD */
    private final HmlReviewDocumentActivity<C7891m> f3679BD;

    public C7936t(HmlReviewDocumentActivity<C7893v> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7891m> hmlReviewDocumentActivity2) {
        this.f3678BC = hmlReviewDocumentActivity;
        this.f3679BD = hmlReviewDocumentActivity2;
    }

    /* renamed from: jV */
    public final C7935s get() {
        return new C7935s(this.f3678BC.get(), this.f3679BD.get());
    }

    /* renamed from: e */
    public static C7936t m3894e(HmlReviewDocumentActivity<C7893v> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7891m> hmlReviewDocumentActivity2) {
        return new C7936t(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
