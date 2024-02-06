package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetExtractionParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ExtractionParameters> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4813ad;
    private final PassportCaptureModule adv;

    public PassportCaptureModule_GetExtractionParametersFactory(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity) {
        this.adv = passportCaptureModule;
        this.f4813ad = hmlReviewDocumentActivity;
    }

    public final ExtractionParameters get() {
        ExtractionParameters extractionParameters = this.adv.getExtractionParameters(this.f4813ad.get());
        if (extractionParameters != null) {
            return extractionParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetExtractionParametersFactory create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity) {
        return new PassportCaptureModule_GetExtractionParametersFactory(passportCaptureModule, hmlReviewDocumentActivity);
    }

    public static ExtractionParameters proxyGetExtractionParameters(PassportCaptureModule passportCaptureModule, ExtractionParameters extractionParameters) {
        ExtractionParameters extractionParameters2 = passportCaptureModule.getExtractionParameters(extractionParameters);
        if (extractionParameters2 != null) {
            return extractionParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
