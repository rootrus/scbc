package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetLookAndFeelParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<LookAndFeelParameters> {
    private final CheckCaptureModule aal;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4665ad;

    public CheckCaptureModule_GetLookAndFeelParametersFactory(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity) {
        this.aal = checkCaptureModule;
        this.f4665ad = hmlReviewDocumentActivity;
    }

    public final LookAndFeelParameters get() {
        LookAndFeelParameters lookAndFeelParameters = this.aal.getLookAndFeelParameters(this.f4665ad.get());
        if (lookAndFeelParameters != null) {
            return lookAndFeelParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetLookAndFeelParametersFactory create(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity) {
        return new CheckCaptureModule_GetLookAndFeelParametersFactory(checkCaptureModule, hmlReviewDocumentActivity);
    }

    public static LookAndFeelParameters proxyGetLookAndFeelParameters(CheckCaptureModule checkCaptureModule, LookAndFeelParameters lookAndFeelParameters) {
        LookAndFeelParameters lookAndFeelParameters2 = checkCaptureModule.getLookAndFeelParameters(lookAndFeelParameters);
        if (lookAndFeelParameters2 != null) {
            return lookAndFeelParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
