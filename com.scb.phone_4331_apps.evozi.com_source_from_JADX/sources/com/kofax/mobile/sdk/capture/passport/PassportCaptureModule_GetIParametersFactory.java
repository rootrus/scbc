package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk.capture.parameter.IParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetIParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IParameters> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<PassportParameters> f4820ad;
    private final PassportCaptureModule adv;

    public PassportCaptureModule_GetIParametersFactory(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<PassportParameters> hmlReviewDocumentActivity) {
        this.adv = passportCaptureModule;
        this.f4820ad = hmlReviewDocumentActivity;
    }

    public final IParameters get() {
        IParameters iParameters = this.adv.getIParameters(this.f4820ad.get());
        if (iParameters != null) {
            return iParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetIParametersFactory create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<PassportParameters> hmlReviewDocumentActivity) {
        return new PassportCaptureModule_GetIParametersFactory(passportCaptureModule, hmlReviewDocumentActivity);
    }

    public static IParameters proxyGetIParameters(PassportCaptureModule passportCaptureModule, PassportParameters passportParameters) {
        IParameters iParameters = passportCaptureModule.getIParameters(passportParameters);
        if (iParameters != null) {
            return iParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
