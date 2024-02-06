package com.kofax.mobile.sdk.p077m;

import com.kofax.android.abc.image_classification.ImageClassifier;
import com.kofax.mobile.sdk.p016b.C8296b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.m.b */
public final class C8454b implements OPRStatusRewardsLandingActivity_ViewBinding<C8453a> {

    /* renamed from: He */
    private final HmlReviewDocumentActivity<C8296b> f5024He;

    /* renamed from: Hf */
    private final HmlReviewDocumentActivity<ImageClassifier> f5025Hf;

    public C8454b(HmlReviewDocumentActivity<C8296b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<ImageClassifier> hmlReviewDocumentActivity2) {
        this.f5024He = hmlReviewDocumentActivity;
        this.f5025Hf = hmlReviewDocumentActivity2;
    }

    /* renamed from: lK */
    public final C8453a get() {
        return new C8453a(this.f5024He.get(), this.f5025Hf);
    }

    /* renamed from: m */
    public static C8454b m5072m(HmlReviewDocumentActivity<C8296b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<ImageClassifier> hmlReviewDocumentActivity2) {
        return new C8454b(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
