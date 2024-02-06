package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class RttiCheckExtractor_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<RttiCheckExtractor> {

    /* renamed from: SM */
    private final HmlReviewDocumentActivity<IImageToByteArray> f4704SM;

    public RttiCheckExtractor_Factory(HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity) {
        this.f4704SM = hmlReviewDocumentActivity;
    }

    public final RttiCheckExtractor get() {
        return new RttiCheckExtractor(this.f4704SM.get());
    }

    public static RttiCheckExtractor_Factory create(HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity) {
        return new RttiCheckExtractor_Factory(hmlReviewDocumentActivity);
    }
}
