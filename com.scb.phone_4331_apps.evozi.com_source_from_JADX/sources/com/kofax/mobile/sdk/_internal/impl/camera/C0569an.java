package com.kofax.mobile.sdk._internal.impl.camera;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.an */
public final class C0569an implements OPRStatusRewardsLandingActivity_ViewBinding<C0564am> {

    /* renamed from: ur */
    private final HmlReviewDocumentActivity<IVideoResourceProvider> f1301ur;

    /* renamed from: wu */
    private final HmlReviewDocumentActivity<IBus> f1302wu;

    public C0569an(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IVideoResourceProvider> hmlReviewDocumentActivity2) {
        this.f1302wu = hmlReviewDocumentActivity;
        this.f1301ur = hmlReviewDocumentActivity2;
    }

    /* renamed from: kp */
    public final C0564am get() {
        return new C0564am(this.f1302wu.get(), this.f1301ur.get());
    }

    /* renamed from: h */
    public static C0569an m1161h(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IVideoResourceProvider> hmlReviewDocumentActivity2) {
        return new C0569an(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
