package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetIExtractionServerKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IExtractionServer> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<KtaPassportExtractor> f4816ad;
    private final PassportCaptureModule adv;

    public PassportCaptureModule_GetIExtractionServerKtaFactory(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<KtaPassportExtractor> hmlReviewDocumentActivity) {
        this.adv = passportCaptureModule;
        this.f4816ad = hmlReviewDocumentActivity;
    }

    public final IExtractionServer get() {
        IExtractionServer iExtractionServerKta = this.adv.getIExtractionServerKta(this.f4816ad.get());
        if (iExtractionServerKta != null) {
            return iExtractionServerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetIExtractionServerKtaFactory create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<KtaPassportExtractor> hmlReviewDocumentActivity) {
        return new PassportCaptureModule_GetIExtractionServerKtaFactory(passportCaptureModule, hmlReviewDocumentActivity);
    }

    public static IExtractionServer proxyGetIExtractionServerKta(PassportCaptureModule passportCaptureModule, KtaPassportExtractor ktaPassportExtractor) {
        IExtractionServer iExtractionServerKta = passportCaptureModule.getIExtractionServerKta(ktaPassportExtractor);
        if (iExtractionServerKta != null) {
            return iExtractionServerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
