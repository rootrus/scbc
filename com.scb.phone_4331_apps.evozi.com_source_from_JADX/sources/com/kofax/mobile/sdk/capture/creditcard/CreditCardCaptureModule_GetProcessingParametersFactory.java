package com.kofax.mobile.sdk.capture.creditcard;

import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CreditCardCaptureModule_GetProcessingParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ProcessingParameters> {
    private final CreditCardCaptureModule aca;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<ProcessingParameters> f4710ad;

    public CreditCardCaptureModule_GetProcessingParametersFactory(CreditCardCaptureModule creditCardCaptureModule, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity) {
        this.aca = creditCardCaptureModule;
        this.f4710ad = hmlReviewDocumentActivity;
    }

    public final ProcessingParameters get() {
        ProcessingParameters processingParameters = this.aca.getProcessingParameters(this.f4710ad.get());
        if (processingParameters != null) {
            return processingParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CreditCardCaptureModule_GetProcessingParametersFactory create(CreditCardCaptureModule creditCardCaptureModule, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity) {
        return new CreditCardCaptureModule_GetProcessingParametersFactory(creditCardCaptureModule, hmlReviewDocumentActivity);
    }

    public static ProcessingParameters proxyGetProcessingParameters(CreditCardCaptureModule creditCardCaptureModule, ProcessingParameters processingParameters) {
        ProcessingParameters processingParameters2 = creditCardCaptureModule.getProcessingParameters(processingParameters);
        if (processingParameters2 != null) {
            return processingParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
