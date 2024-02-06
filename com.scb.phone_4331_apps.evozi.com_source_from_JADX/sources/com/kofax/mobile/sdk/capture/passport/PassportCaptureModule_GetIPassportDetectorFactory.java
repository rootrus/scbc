package com.kofax.mobile.sdk.capture.passport;

import com.kofax.kmc.ken.engines.IPassportDetector;
import com.kofax.kmc.ken.engines.PassportDetector;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetIPassportDetectorFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IPassportDetector> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<PassportDetector> f4825ad;
    private final PassportCaptureModule adv;

    public PassportCaptureModule_GetIPassportDetectorFactory(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<PassportDetector> hmlReviewDocumentActivity) {
        this.adv = passportCaptureModule;
        this.f4825ad = hmlReviewDocumentActivity;
    }

    public final IPassportDetector get() {
        IPassportDetector iPassportDetector = this.adv.getIPassportDetector(this.f4825ad.get());
        if (iPassportDetector != null) {
            return iPassportDetector;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetIPassportDetectorFactory create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<PassportDetector> hmlReviewDocumentActivity) {
        return new PassportCaptureModule_GetIPassportDetectorFactory(passportCaptureModule, hmlReviewDocumentActivity);
    }

    public static IPassportDetector proxyGetIPassportDetector(PassportCaptureModule passportCaptureModule, PassportDetector passportDetector) {
        IPassportDetector iPassportDetector = passportCaptureModule.getIPassportDetector(passportDetector);
        if (iPassportDetector != null) {
            return iPassportDetector;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
