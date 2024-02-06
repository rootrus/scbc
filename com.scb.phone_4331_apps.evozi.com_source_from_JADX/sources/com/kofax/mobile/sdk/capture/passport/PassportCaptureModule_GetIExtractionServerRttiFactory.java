package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetIExtractionServerRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IExtractionServer> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<RttiPassportExtractor> f4817ad;
    private final PassportCaptureModule adv;

    public PassportCaptureModule_GetIExtractionServerRttiFactory(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<RttiPassportExtractor> hmlReviewDocumentActivity) {
        this.adv = passportCaptureModule;
        this.f4817ad = hmlReviewDocumentActivity;
    }

    public final IExtractionServer get() {
        IExtractionServer iExtractionServerRtti = this.adv.getIExtractionServerRtti(this.f4817ad.get());
        if (iExtractionServerRtti != null) {
            return iExtractionServerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetIExtractionServerRttiFactory create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<RttiPassportExtractor> hmlReviewDocumentActivity) {
        return new PassportCaptureModule_GetIExtractionServerRttiFactory(passportCaptureModule, hmlReviewDocumentActivity);
    }

    public static IExtractionServer proxyGetIExtractionServerRtti(PassportCaptureModule passportCaptureModule, RttiPassportExtractor rttiPassportExtractor) {
        IExtractionServer iExtractionServerRtti = passportCaptureModule.getIExtractionServerRtti(rttiPassportExtractor);
        if (iExtractionServerRtti != null) {
            return iExtractionServerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
