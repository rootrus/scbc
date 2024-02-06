package com.kofax.mobile.sdk.p010af;

import android.hardware.SensorManager;
import com.kofax.mobile.sdk._internal.IBus;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.af.e */
public final class C0804e implements OPRStatusRewardsLandingActivity_ViewBinding<C0801d> {

    /* renamed from: UI */
    private final HmlReviewDocumentActivity<SensorManager> f1955UI;

    /* renamed from: wu */
    private final HmlReviewDocumentActivity<IBus> f1956wu;

    public C0804e(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<SensorManager> hmlReviewDocumentActivity2) {
        this.f1956wu = hmlReviewDocumentActivity;
        this.f1955UI = hmlReviewDocumentActivity2;
    }

    /* renamed from: rj */
    public final C0801d get() {
        return new C0801d(this.f1956wu.get(), this.f1955UI.get());
    }

    /* renamed from: E */
    public static C0804e m1940E(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<SensorManager> hmlReviewDocumentActivity2) {
        return new C0804e(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
