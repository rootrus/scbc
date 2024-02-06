package com.kofax.mobile.sdk.capture.check;

import com.kofax.kmc.ken.engines.CheckDetector;
import com.kofax.kmc.ken.engines.ICheckDetector;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetICheckDetectorFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ICheckDetector> {
    private final CheckCaptureModule aal;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<CheckDetector> f4657ad;

    public CheckCaptureModule_GetICheckDetectorFactory(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<CheckDetector> hmlReviewDocumentActivity) {
        this.aal = checkCaptureModule;
        this.f4657ad = hmlReviewDocumentActivity;
    }

    public final ICheckDetector get() {
        ICheckDetector iCheckDetector = this.aal.getICheckDetector(this.f4657ad.get());
        if (iCheckDetector != null) {
            return iCheckDetector;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetICheckDetectorFactory create(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<CheckDetector> hmlReviewDocumentActivity) {
        return new CheckCaptureModule_GetICheckDetectorFactory(checkCaptureModule, hmlReviewDocumentActivity);
    }

    public static ICheckDetector proxyGetICheckDetector(CheckCaptureModule checkCaptureModule, CheckDetector checkDetector) {
        ICheckDetector iCheckDetector = checkCaptureModule.getICheckDetector(checkDetector);
        if (iCheckDetector != null) {
            return iCheckDetector;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
