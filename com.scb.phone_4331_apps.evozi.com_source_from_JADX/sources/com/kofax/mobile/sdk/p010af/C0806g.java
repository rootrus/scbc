package com.kofax.mobile.sdk.p010af;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk.p014aj.C0855a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.af.g */
public final class C0806g implements OPRStatusRewardsLandingActivity_ViewBinding<C0805f> {

    /* renamed from: UP */
    private final HmlReviewDocumentActivity<C0855a> f1964UP;

    /* renamed from: wu */
    private final HmlReviewDocumentActivity<IBus> f1965wu;

    public C0806g(HmlReviewDocumentActivity<C0855a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity2) {
        this.f1964UP = hmlReviewDocumentActivity;
        this.f1965wu = hmlReviewDocumentActivity2;
    }

    /* renamed from: ro */
    public final C0805f get() {
        return new C0805f(this.f1964UP.get(), this.f1965wu.get());
    }

    /* renamed from: F */
    public static C0806g m1948F(HmlReviewDocumentActivity<C0855a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity2) {
        return new C0806g(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
