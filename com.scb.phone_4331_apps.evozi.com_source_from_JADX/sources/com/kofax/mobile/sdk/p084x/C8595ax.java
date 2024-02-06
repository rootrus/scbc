package com.kofax.mobile.sdk.p084x;

import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.x.ax */
public final class C8595ax implements OPRStatusRewardsLandingActivity_ViewBinding<C8594aw> {

    /* renamed from: Rv */
    private final HmlReviewDocumentActivity<C8572ac> f5277Rv;

    /* renamed from: Rw */
    private final HmlReviewDocumentActivity<C8617i> f5278Rw;

    public C8595ax(HmlReviewDocumentActivity<C8572ac> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8617i> hmlReviewDocumentActivity2) {
        this.f5277Rv = hmlReviewDocumentActivity;
        this.f5278Rw = hmlReviewDocumentActivity2;
    }

    /* renamed from: pV */
    public final C8594aw get() {
        return new C8594aw(this.f5277Rv.get(), this.f5278Rw.get());
    }

    /* renamed from: x */
    public static C8595ax m5464x(HmlReviewDocumentActivity<C8572ac> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8617i> hmlReviewDocumentActivity2) {
        return new C8595ax(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
