package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetOnDeviceExtractionServerFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IExtractionServer> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<PassportCaptureModule.PassportOnDeviceExtractionServer> f4827ad;
    private final PassportCaptureModule adv;

    public PassportCaptureModule_GetOnDeviceExtractionServerFactory(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<PassportCaptureModule.PassportOnDeviceExtractionServer> hmlReviewDocumentActivity) {
        this.adv = passportCaptureModule;
        this.f4827ad = hmlReviewDocumentActivity;
    }

    public final IExtractionServer get() {
        IExtractionServer a = this.adv.mo12195a(this.f4827ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetOnDeviceExtractionServerFactory create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<PassportCaptureModule.PassportOnDeviceExtractionServer> hmlReviewDocumentActivity) {
        return new PassportCaptureModule_GetOnDeviceExtractionServerFactory(passportCaptureModule, hmlReviewDocumentActivity);
    }

    public static IExtractionServer proxyGetOnDeviceExtractionServer(PassportCaptureModule passportCaptureModule, Object obj) {
        IExtractionServer a = passportCaptureModule.mo12195a((PassportCaptureModule.PassportOnDeviceExtractionServer) obj);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
