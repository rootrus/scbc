package com.kofax.mobile.sdk.capture.creditcard;

import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CreditCardCaptureModule_GetLookAndFeelParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<LookAndFeelParameters> {
    private final CreditCardCaptureModule aca;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4709ad;

    public CreditCardCaptureModule_GetLookAndFeelParametersFactory(CreditCardCaptureModule creditCardCaptureModule, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity) {
        this.aca = creditCardCaptureModule;
        this.f4709ad = hmlReviewDocumentActivity;
    }

    public final LookAndFeelParameters get() {
        LookAndFeelParameters lookAndFeelParameters = this.aca.getLookAndFeelParameters(this.f4709ad.get());
        if (lookAndFeelParameters != null) {
            return lookAndFeelParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CreditCardCaptureModule_GetLookAndFeelParametersFactory create(CreditCardCaptureModule creditCardCaptureModule, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity) {
        return new CreditCardCaptureModule_GetLookAndFeelParametersFactory(creditCardCaptureModule, hmlReviewDocumentActivity);
    }

    public static LookAndFeelParameters proxyGetLookAndFeelParameters(CreditCardCaptureModule creditCardCaptureModule, LookAndFeelParameters lookAndFeelParameters) {
        LookAndFeelParameters lookAndFeelParameters2 = creditCardCaptureModule.getLookAndFeelParameters(lookAndFeelParameters);
        if (lookAndFeelParameters2 != null) {
            return lookAndFeelParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
