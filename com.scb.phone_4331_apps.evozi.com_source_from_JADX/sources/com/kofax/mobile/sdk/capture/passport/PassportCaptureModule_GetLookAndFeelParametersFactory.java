package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetLookAndFeelParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<LookAndFeelParameters> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4826ad;
    private final PassportCaptureModule adv;

    public PassportCaptureModule_GetLookAndFeelParametersFactory(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity) {
        this.adv = passportCaptureModule;
        this.f4826ad = hmlReviewDocumentActivity;
    }

    public final LookAndFeelParameters get() {
        LookAndFeelParameters lookAndFeelParameters = this.adv.getLookAndFeelParameters(this.f4826ad.get());
        if (lookAndFeelParameters != null) {
            return lookAndFeelParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetLookAndFeelParametersFactory create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity) {
        return new PassportCaptureModule_GetLookAndFeelParametersFactory(passportCaptureModule, hmlReviewDocumentActivity);
    }

    public static LookAndFeelParameters proxyGetLookAndFeelParameters(PassportCaptureModule passportCaptureModule, LookAndFeelParameters lookAndFeelParameters) {
        LookAndFeelParameters lookAndFeelParameters2 = passportCaptureModule.getLookAndFeelParameters(lookAndFeelParameters);
        if (lookAndFeelParameters2 != null) {
            return lookAndFeelParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
