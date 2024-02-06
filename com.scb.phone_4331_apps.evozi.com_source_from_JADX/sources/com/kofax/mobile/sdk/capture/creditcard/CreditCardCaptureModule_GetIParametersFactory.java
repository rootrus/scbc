package com.kofax.mobile.sdk.capture.creditcard;

import com.kofax.mobile.sdk.capture.parameter.IParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CreditCardCaptureModule_GetIParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IParameters> {
    private final CreditCardCaptureModule aca;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<CreditCardParameters> f4708ad;

    public CreditCardCaptureModule_GetIParametersFactory(CreditCardCaptureModule creditCardCaptureModule, HmlReviewDocumentActivity<CreditCardParameters> hmlReviewDocumentActivity) {
        this.aca = creditCardCaptureModule;
        this.f4708ad = hmlReviewDocumentActivity;
    }

    public final IParameters get() {
        IParameters iParameters = this.aca.getIParameters(this.f4708ad.get());
        if (iParameters != null) {
            return iParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CreditCardCaptureModule_GetIParametersFactory create(CreditCardCaptureModule creditCardCaptureModule, HmlReviewDocumentActivity<CreditCardParameters> hmlReviewDocumentActivity) {
        return new CreditCardCaptureModule_GetIParametersFactory(creditCardCaptureModule, hmlReviewDocumentActivity);
    }

    public static IParameters proxyGetIParameters(CreditCardCaptureModule creditCardCaptureModule, CreditCardParameters creditCardParameters) {
        IParameters iParameters = creditCardCaptureModule.getIParameters(creditCardParameters);
        if (iParameters != null) {
            return iParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
