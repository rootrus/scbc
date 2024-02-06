package com.kofax.mobile.sdk.capture.check;

import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetIExtractionServerKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ICheckExtractionServer> {
    private final CheckCaptureModule aal;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<KtaCheckExtractor> f4660ad;

    public CheckCaptureModule_GetIExtractionServerKtaFactory(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<KtaCheckExtractor> hmlReviewDocumentActivity) {
        this.aal = checkCaptureModule;
        this.f4660ad = hmlReviewDocumentActivity;
    }

    public final ICheckExtractionServer get() {
        ICheckExtractionServer iExtractionServerKta = this.aal.getIExtractionServerKta(this.f4660ad.get());
        if (iExtractionServerKta != null) {
            return iExtractionServerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetIExtractionServerKtaFactory create(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<KtaCheckExtractor> hmlReviewDocumentActivity) {
        return new CheckCaptureModule_GetIExtractionServerKtaFactory(checkCaptureModule, hmlReviewDocumentActivity);
    }

    public static ICheckExtractionServer proxyGetIExtractionServerKta(CheckCaptureModule checkCaptureModule, KtaCheckExtractor ktaCheckExtractor) {
        ICheckExtractionServer iExtractionServerKta = checkCaptureModule.getIExtractionServerKta(ktaCheckExtractor);
        if (iExtractionServerKta != null) {
            return iExtractionServerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
