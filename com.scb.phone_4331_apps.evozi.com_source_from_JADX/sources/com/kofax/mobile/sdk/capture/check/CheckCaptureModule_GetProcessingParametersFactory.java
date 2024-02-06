package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetProcessingParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ProcessingParameters> {
    private final CheckCaptureModule aal;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<ProcessingParameters> f4666ad;

    public CheckCaptureModule_GetProcessingParametersFactory(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity) {
        this.aal = checkCaptureModule;
        this.f4666ad = hmlReviewDocumentActivity;
    }

    public final ProcessingParameters get() {
        ProcessingParameters processingParameters = this.aal.getProcessingParameters(this.f4666ad.get());
        if (processingParameters != null) {
            return processingParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetProcessingParametersFactory create(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity) {
        return new CheckCaptureModule_GetProcessingParametersFactory(checkCaptureModule, hmlReviewDocumentActivity);
    }

    public static ProcessingParameters proxyGetProcessingParameters(CheckCaptureModule checkCaptureModule, ProcessingParameters processingParameters) {
        ProcessingParameters processingParameters2 = checkCaptureModule.getProcessingParameters(processingParameters);
        if (processingParameters2 != null) {
            return processingParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
