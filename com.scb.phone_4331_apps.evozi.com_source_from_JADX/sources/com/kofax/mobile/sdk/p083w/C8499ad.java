package com.kofax.mobile.sdk.p083w;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7907b;
import com.kofax.mobile.sdk.p083w.C8496ac;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.w.ad */
public final class C8499ad implements OPRStatusRewardsLandingActivity_ViewBinding<C8496ac> {

    /* renamed from: LW */
    private final HmlReviewDocumentActivity<C7907b> f5158LW;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8496ac.C8498a> f5159LX;

    public C8499ad(HmlReviewDocumentActivity<C7907b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8496ac.C8498a> hmlReviewDocumentActivity2) {
        this.f5158LW = hmlReviewDocumentActivity;
        this.f5159LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: oP */
    public final C8496ac get() {
        return new C8496ac(this.f5158LW.get(), this.f5159LX.get());
    }

    /* renamed from: v */
    public static C8499ad m5199v(HmlReviewDocumentActivity<C7907b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8496ac.C8498a> hmlReviewDocumentActivity2) {
        return new C8499ad(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
