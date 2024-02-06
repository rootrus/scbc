package com.kofax.mobile.sdk._internal.impl.extraction.rtti;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.rtti.c */
public final class C8180c implements OPRStatusRewardsLandingActivity_ViewBinding<C8175b> {

    /* renamed from: JE */
    private final HmlReviewDocumentActivity<IImageToByteArray> f4224JE;

    /* renamed from: SH */
    private final HmlReviewDocumentActivity<C8174a> f4225SH;

    public C8180c(HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8174a> hmlReviewDocumentActivity2) {
        this.f4224JE = hmlReviewDocumentActivity;
        this.f4225SH = hmlReviewDocumentActivity2;
    }

    /* renamed from: qF */
    public final C8175b get() {
        return new C8175b(this.f4224JE.get(), this.f4225SH.get());
    }

    /* renamed from: D */
    public static C8180c m4438D(HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8174a> hmlReviewDocumentActivity2) {
        return new C8180c(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
