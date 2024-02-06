package com.kofax.mobile.sdk.p083w;

import com.kofax.mobile.sdk.p074d.C8337b;
import com.kofax.mobile.sdk.p074d.C8339c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.w.o */
public final class C8553o implements OPRStatusRewardsLandingActivity_ViewBinding<C8551n> {

    /* renamed from: PY */
    private final HmlReviewDocumentActivity<C8337b> f5236PY;

    /* renamed from: PZ */
    private final HmlReviewDocumentActivity<C8339c> f5237PZ;

    public C8553o(HmlReviewDocumentActivity<C8337b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8339c> hmlReviewDocumentActivity2) {
        this.f5236PY = hmlReviewDocumentActivity;
        this.f5237PZ = hmlReviewDocumentActivity2;
    }

    /* renamed from: oF */
    public final C8551n get() {
        return new C8551n(this.f5236PY.get(), this.f5237PZ.get());
    }

    /* renamed from: s */
    public static C8553o m5331s(HmlReviewDocumentActivity<C8337b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8339c> hmlReviewDocumentActivity2) {
        return new C8553o(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
