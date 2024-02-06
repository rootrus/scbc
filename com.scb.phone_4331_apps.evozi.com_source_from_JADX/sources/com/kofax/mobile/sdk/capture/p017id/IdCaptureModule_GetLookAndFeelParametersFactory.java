package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetLookAndFeelParametersFactory */
public final class IdCaptureModule_GetLookAndFeelParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<LookAndFeelParameters> {
    private final IdCaptureModule acu;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4755ad;

    public IdCaptureModule_GetLookAndFeelParametersFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4755ad = hmlReviewDocumentActivity;
    }

    public final LookAndFeelParameters get() {
        LookAndFeelParameters lookAndFeelParameters = this.acu.getLookAndFeelParameters(this.f4755ad.get());
        if (lookAndFeelParameters != null) {
            return lookAndFeelParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetLookAndFeelParametersFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetLookAndFeelParametersFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static LookAndFeelParameters proxyGetLookAndFeelParameters(IdCaptureModule idCaptureModule, LookAndFeelParameters lookAndFeelParameters) {
        LookAndFeelParameters lookAndFeelParameters2 = idCaptureModule.getLookAndFeelParameters(lookAndFeelParameters);
        if (lookAndFeelParameters2 != null) {
            return lookAndFeelParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
