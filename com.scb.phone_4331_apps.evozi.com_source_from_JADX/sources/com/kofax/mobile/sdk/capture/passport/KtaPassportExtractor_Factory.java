package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.IKtaSessionIdProviderFactory;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class KtaPassportExtractor_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<KtaPassportExtractor> {

    /* renamed from: SM */
    private final HmlReviewDocumentActivity<IImageToByteArray> f4801SM;

    /* renamed from: ZV */
    private final HmlReviewDocumentActivity<IKtaSessionIdProviderFactory> f4802ZV;

    public KtaPassportExtractor_Factory(HmlReviewDocumentActivity<IKtaSessionIdProviderFactory> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity2) {
        this.f4802ZV = hmlReviewDocumentActivity;
        this.f4801SM = hmlReviewDocumentActivity2;
    }

    public final KtaPassportExtractor get() {
        return new KtaPassportExtractor(this.f4802ZV.get(), this.f4801SM.get());
    }

    public static KtaPassportExtractor_Factory create(HmlReviewDocumentActivity<IKtaSessionIdProviderFactory> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity2) {
        return new KtaPassportExtractor_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
