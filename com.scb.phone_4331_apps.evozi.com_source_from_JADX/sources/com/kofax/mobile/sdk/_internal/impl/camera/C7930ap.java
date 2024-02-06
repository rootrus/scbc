package com.kofax.mobile.sdk._internal.impl.camera;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.ap */
public final class C7930ap implements OPRStatusRewardsLandingActivity_ViewBinding<C0570ao> {

    /* renamed from: ur */
    private final HmlReviewDocumentActivity<IVideoResourceProvider> f3670ur;

    /* renamed from: wu */
    private final HmlReviewDocumentActivity<IBus> f3671wu;

    public C7930ap(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IVideoResourceProvider> hmlReviewDocumentActivity2) {
        this.f3671wu = hmlReviewDocumentActivity;
        this.f3670ur = hmlReviewDocumentActivity2;
    }

    /* renamed from: kq */
    public final C0570ao get() {
        return new C0570ao(this.f3671wu.get(), this.f3670ur.get());
    }

    /* renamed from: i */
    public static C7930ap m3884i(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IVideoResourceProvider> hmlReviewDocumentActivity2) {
        return new C7930ap(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
