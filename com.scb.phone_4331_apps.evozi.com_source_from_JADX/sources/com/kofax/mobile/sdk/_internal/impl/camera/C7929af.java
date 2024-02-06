package com.kofax.mobile.sdk._internal.impl.camera;

import com.kofax.mobile.sdk._internal.camera.C0512u;
import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.af */
public final class C7929af implements OPRStatusRewardsLandingActivity_ViewBinding<C0548ad> {

    /* renamed from: Di */
    private final HmlReviewDocumentActivity<C0512u> f3668Di;

    /* renamed from: ur */
    private final HmlReviewDocumentActivity<IVideoResourceProvider> f3669ur;

    public C7929af(HmlReviewDocumentActivity<C0512u> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IVideoResourceProvider> hmlReviewDocumentActivity2) {
        this.f3668Di = hmlReviewDocumentActivity;
        this.f3669ur = hmlReviewDocumentActivity2;
    }

    /* renamed from: ki */
    public final C0548ad get() {
        return new C0548ad(this.f3668Di.get(), this.f3669ur.get());
    }

    /* renamed from: g */
    public static C7929af m3882g(HmlReviewDocumentActivity<C0512u> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IVideoResourceProvider> hmlReviewDocumentActivity2) {
        return new C7929af(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
