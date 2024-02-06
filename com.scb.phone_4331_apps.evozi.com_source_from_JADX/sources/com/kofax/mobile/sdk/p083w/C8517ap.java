package com.kofax.mobile.sdk.p083w;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk.p083w.C8515ao;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.w.ap */
public final class C8517ap implements OPRStatusRewardsLandingActivity_ViewBinding<C8515ao> {

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8515ao.C8516a> f5182LX;

    /* renamed from: Lt */
    private final HmlReviewDocumentActivity<C7910e> f5183Lt;

    public C8517ap(HmlReviewDocumentActivity<C8515ao.C8516a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7910e> hmlReviewDocumentActivity2) {
        this.f5182LX = hmlReviewDocumentActivity;
        this.f5183Lt = hmlReviewDocumentActivity2;
    }

    /* renamed from: oV */
    public final C8515ao get() {
        return new C8515ao(this.f5182LX.get(), this.f5183Lt.get());
    }

    /* renamed from: w */
    public static C8517ap m5252w(HmlReviewDocumentActivity<C8515ao.C8516a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7910e> hmlReviewDocumentActivity2) {
        return new C8517ap(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
