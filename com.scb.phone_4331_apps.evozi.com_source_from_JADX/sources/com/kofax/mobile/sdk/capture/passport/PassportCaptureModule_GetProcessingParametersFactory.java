package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetProcessingParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ProcessingParameters> {
    private final PassportCaptureModule adv;
    private final HmlReviewDocumentActivity<ProcessingParameters> adw;

    public PassportCaptureModule_GetProcessingParametersFactory(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity) {
        this.adv = passportCaptureModule;
        this.adw = hmlReviewDocumentActivity;
    }

    public final ProcessingParameters get() {
        ProcessingParameters processingParameters = this.adv.getProcessingParameters(this.adw.get());
        if (processingParameters != null) {
            return processingParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetProcessingParametersFactory create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity) {
        return new PassportCaptureModule_GetProcessingParametersFactory(passportCaptureModule, hmlReviewDocumentActivity);
    }

    public static ProcessingParameters proxyGetProcessingParameters(PassportCaptureModule passportCaptureModule, ProcessingParameters processingParameters) {
        ProcessingParameters processingParameters2 = passportCaptureModule.getProcessingParameters(processingParameters);
        if (processingParameters2 != null) {
            return processingParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
