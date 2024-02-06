package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.RttiIdExtractor_Factory */
public final class RttiIdExtractor_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<RttiIdExtractor> {

    /* renamed from: SM */
    private final HmlReviewDocumentActivity<IImageToByteArray> f4793SM;

    public RttiIdExtractor_Factory(HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity) {
        this.f4793SM = hmlReviewDocumentActivity;
    }

    public final RttiIdExtractor get() {
        return new RttiIdExtractor(this.f4793SM.get());
    }

    public static RttiIdExtractor_Factory create(HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity) {
        return new RttiIdExtractor_Factory(hmlReviewDocumentActivity);
    }
}
