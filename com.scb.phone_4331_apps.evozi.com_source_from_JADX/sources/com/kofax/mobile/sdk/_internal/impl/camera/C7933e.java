package com.kofax.mobile.sdk._internal.impl.camera;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk.p014aj.C0856b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.e */
public final class C7933e implements OPRStatusRewardsLandingActivity_ViewBinding<C0576d> {

    /* renamed from: Ac */
    private final HmlReviewDocumentActivity<C0856b> f3673Ac;

    /* renamed from: wu */
    private final HmlReviewDocumentActivity<IBus> f3674wu;

    public C7933e(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0856b> hmlReviewDocumentActivity2) {
        this.f3674wu = hmlReviewDocumentActivity;
        this.f3673Ac = hmlReviewDocumentActivity2;
    }

    /* renamed from: jm */
    public final C0576d get() {
        return new C0576d(this.f3674wu.get(), this.f3673Ac.get());
    }

    /* renamed from: d */
    public static C7933e m3889d(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0856b> hmlReviewDocumentActivity2) {
        return new C7933e(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
