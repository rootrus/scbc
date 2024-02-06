package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.IKtaSessionIdProviderFactory;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class KtaBillExtractor_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<KtaBillExtractor> {

    /* renamed from: SM */
    private final HmlReviewDocumentActivity<IImageToByteArray> f4630SM;

    /* renamed from: ZV */
    private final HmlReviewDocumentActivity<IKtaSessionIdProviderFactory> f4631ZV;

    public KtaBillExtractor_Factory(HmlReviewDocumentActivity<IKtaSessionIdProviderFactory> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity2) {
        this.f4631ZV = hmlReviewDocumentActivity;
        this.f4630SM = hmlReviewDocumentActivity2;
    }

    public final KtaBillExtractor get() {
        return new KtaBillExtractor(this.f4631ZV.get(), this.f4630SM.get());
    }

    public static KtaBillExtractor_Factory create(HmlReviewDocumentActivity<IKtaSessionIdProviderFactory> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageToByteArray> hmlReviewDocumentActivity2) {
        return new KtaBillExtractor_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
