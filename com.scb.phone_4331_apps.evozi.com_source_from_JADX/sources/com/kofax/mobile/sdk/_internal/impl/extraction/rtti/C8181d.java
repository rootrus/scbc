package com.kofax.mobile.sdk._internal.impl.extraction.rtti;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.rtti.d */
public final class C8181d implements OPRStatusRewardsLandingActivity_ViewBinding<RttiExtractor> {

    /* renamed from: SM */
    private final HmlReviewDocumentActivity<IImageToByteArray> f4226SM;

    public C8181d(HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity) {
        this.f4226SM = hmlReviewDocumentActivity;
    }

    /* renamed from: qG */
    public final RttiExtractor get() {
        return new RttiExtractor(this.f4226SM.get());
    }

    /* renamed from: ay */
    public static C8181d m4440ay(HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity) {
        return new C8181d(hmlReviewDocumentActivity);
    }
}
