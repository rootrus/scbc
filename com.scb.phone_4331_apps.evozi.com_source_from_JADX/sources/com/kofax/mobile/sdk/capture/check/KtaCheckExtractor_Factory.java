package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.IKtaSessionIdProviderFactory;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class KtaCheckExtractor_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<KtaCheckExtractor> {

    /* renamed from: SM */
    private final HmlReviewDocumentActivity<IImageToByteArray> f4700SM;

    /* renamed from: ZV */
    private final HmlReviewDocumentActivity<IKtaSessionIdProviderFactory> f4701ZV;

    public KtaCheckExtractor_Factory(HmlReviewDocumentActivity<IKtaSessionIdProviderFactory> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity2) {
        this.f4701ZV = hmlReviewDocumentActivity;
        this.f4700SM = hmlReviewDocumentActivity2;
    }

    public final KtaCheckExtractor get() {
        return new KtaCheckExtractor(this.f4701ZV.get(), this.f4700SM.get());
    }

    public static KtaCheckExtractor_Factory create(HmlReviewDocumentActivity<IKtaSessionIdProviderFactory> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity2) {
        return new KtaCheckExtractor_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
