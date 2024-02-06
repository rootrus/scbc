package com.kofax.mobile.sdk.p084x;

import com.kofax.mobile.sdk.p083w.C8510ak;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.x.bd */
public final class C8602bd implements OPRStatusRewardsLandingActivity_ViewBinding<C8601bc> {

    /* renamed from: RB */
    private final HmlReviewDocumentActivity<C8510ak> f5288RB;

    /* renamed from: RC */
    private final HmlReviewDocumentActivity<C8510ak> f5289RC;

    public C8602bd(HmlReviewDocumentActivity<C8510ak> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8510ak> hmlReviewDocumentActivity2) {
        this.f5288RB = hmlReviewDocumentActivity;
        this.f5289RC = hmlReviewDocumentActivity2;
    }

    /* renamed from: pY */
    public final C8601bc get() {
        return new C8601bc(this.f5288RB.get(), this.f5289RC.get());
    }

    /* renamed from: z */
    public static C8602bd m5483z(HmlReviewDocumentActivity<C8510ak> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8510ak> hmlReviewDocumentActivity2) {
        return new C8602bd(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
