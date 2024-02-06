package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk.capture.parameter.IParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetIParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IParameters> {
    private final CheckCaptureModule aal;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<CheckParameters> f4664ad;

    public CheckCaptureModule_GetIParametersFactory(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<CheckParameters> hmlReviewDocumentActivity) {
        this.aal = checkCaptureModule;
        this.f4664ad = hmlReviewDocumentActivity;
    }

    public final IParameters get() {
        IParameters iParameters = this.aal.getIParameters(this.f4664ad.get());
        if (iParameters != null) {
            return iParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetIParametersFactory create(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<CheckParameters> hmlReviewDocumentActivity) {
        return new CheckCaptureModule_GetIParametersFactory(checkCaptureModule, hmlReviewDocumentActivity);
    }

    public static IParameters proxyGetIParameters(CheckCaptureModule checkCaptureModule, CheckParameters checkParameters) {
        IParameters iParameters = checkCaptureModule.getIParameters(checkParameters);
        if (iParameters != null) {
            return iParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
