package com.kofax.mobile.sdk.p023k;

import android.content.Context;
import com.kofax.mobile.sdk._internal.IBus;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.k.i */
public final class C8418i implements OPRStatusRewardsLandingActivity_ViewBinding<C8410h> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4989X;

    /* renamed from: wu */
    private final HmlReviewDocumentActivity<IBus> f4990wu;

    public C8418i(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity2) {
        this.f4989X = hmlReviewDocumentActivity;
        this.f4990wu = hmlReviewDocumentActivity2;
    }

    /* renamed from: ls */
    public final C8410h get() {
        return new C8410h(this.f4989X.get(), this.f4990wu.get());
    }

    /* renamed from: l */
    public static C8418i m4966l(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity2) {
        return new C8418i(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
