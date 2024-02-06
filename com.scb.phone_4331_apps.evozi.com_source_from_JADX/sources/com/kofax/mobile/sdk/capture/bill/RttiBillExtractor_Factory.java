package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class RttiBillExtractor_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<RttiBillExtractor> {

    /* renamed from: SM */
    private final HmlReviewDocumentActivity<IImageToByteArray> f4636SM;

    public RttiBillExtractor_Factory(HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity) {
        this.f4636SM = hmlReviewDocumentActivity;
    }

    public final RttiBillExtractor get() {
        return new RttiBillExtractor(this.f4636SM.get());
    }

    public static RttiBillExtractor_Factory create(HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity) {
        return new RttiBillExtractor_Factory(hmlReviewDocumentActivity);
    }
}
