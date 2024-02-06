package com.kofax.mobile.sdk._internal.impl.extraction.kta;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.d */
public final class C8004d implements OPRStatusRewardsLandingActivity_ViewBinding<C7997c> {

    /* renamed from: JE */
    private final HmlReviewDocumentActivity<IImageToByteArray> f3793JE;

    /* renamed from: JF */
    private final HmlReviewDocumentActivity<C7995a> f3794JF;

    public C8004d(HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7995a> hmlReviewDocumentActivity2) {
        this.f3793JE = hmlReviewDocumentActivity;
        this.f3794JF = hmlReviewDocumentActivity2;
    }

    /* renamed from: mC */
    public final C7997c get() {
        return new C7997c(this.f3793JE.get(), this.f3794JF.get());
    }

    /* renamed from: o */
    public static C8004d m3979o(HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7995a> hmlReviewDocumentActivity2) {
        return new C8004d(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
