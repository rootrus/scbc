package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class RttiPassportExtractor_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<RttiPassportExtractor> {

    /* renamed from: SM */
    private final HmlReviewDocumentActivity<IImageToByteArray> f4874SM;

    public RttiPassportExtractor_Factory(HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity) {
        this.f4874SM = hmlReviewDocumentActivity;
    }

    public final RttiPassportExtractor get() {
        return new RttiPassportExtractor(this.f4874SM.get());
    }

    public static RttiPassportExtractor_Factory create(HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity) {
        return new RttiPassportExtractor_Factory(hmlReviewDocumentActivity);
    }
}
