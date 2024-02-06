package com.kofax.mobile.sdk.capture.creditcard;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CreditCardCaptureModule_GetExtractionParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ExtractionParameters> {
    private final CreditCardCaptureModule aca;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4707ad;

    public CreditCardCaptureModule_GetExtractionParametersFactory(CreditCardCaptureModule creditCardCaptureModule, HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity) {
        this.aca = creditCardCaptureModule;
        this.f4707ad = hmlReviewDocumentActivity;
    }

    public final ExtractionParameters get() {
        ExtractionParameters extractionParameters = this.aca.getExtractionParameters(this.f4707ad.get());
        if (extractionParameters != null) {
            return extractionParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CreditCardCaptureModule_GetExtractionParametersFactory create(CreditCardCaptureModule creditCardCaptureModule, HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity) {
        return new CreditCardCaptureModule_GetExtractionParametersFactory(creditCardCaptureModule, hmlReviewDocumentActivity);
    }

    public static ExtractionParameters proxyGetExtractionParameters(CreditCardCaptureModule creditCardCaptureModule, ExtractionParameters extractionParameters) {
        ExtractionParameters extractionParameters2 = creditCardCaptureModule.getExtractionParameters(extractionParameters);
        if (extractionParameters2 != null) {
            return extractionParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
