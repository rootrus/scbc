package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.IKtaSessionIdProviderFactory;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.KtaIdExtractor_Factory */
public final class KtaIdExtractor_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<KtaIdExtractor> {

    /* renamed from: SM */
    private final HmlReviewDocumentActivity<IImageToByteArray> f4791SM;

    /* renamed from: ZV */
    private final HmlReviewDocumentActivity<IKtaSessionIdProviderFactory> f4792ZV;

    public KtaIdExtractor_Factory(HmlReviewDocumentActivity<IKtaSessionIdProviderFactory> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity2) {
        this.f4792ZV = hmlReviewDocumentActivity;
        this.f4791SM = hmlReviewDocumentActivity2;
    }

    public final KtaIdExtractor get() {
        return new KtaIdExtractor(this.f4792ZV.get(), this.f4791SM.get());
    }

    public static KtaIdExtractor_Factory create(HmlReviewDocumentActivity<IKtaSessionIdProviderFactory> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity2) {
        return new KtaIdExtractor_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
