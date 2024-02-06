package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetExtractionParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ExtractionParameters> {
    private final CheckCaptureModule aal;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4652ad;

    public CheckCaptureModule_GetExtractionParametersFactory(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity) {
        this.aal = checkCaptureModule;
        this.f4652ad = hmlReviewDocumentActivity;
    }

    public final ExtractionParameters get() {
        ExtractionParameters extractionParameters = this.aal.getExtractionParameters(this.f4652ad.get());
        if (extractionParameters != null) {
            return extractionParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetExtractionParametersFactory create(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity) {
        return new CheckCaptureModule_GetExtractionParametersFactory(checkCaptureModule, hmlReviewDocumentActivity);
    }

    public static ExtractionParameters proxyGetExtractionParameters(CheckCaptureModule checkCaptureModule, ExtractionParameters extractionParameters) {
        ExtractionParameters extractionParameters2 = checkCaptureModule.getExtractionParameters(extractionParameters);
        if (extractionParameters2 != null) {
            return extractionParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
