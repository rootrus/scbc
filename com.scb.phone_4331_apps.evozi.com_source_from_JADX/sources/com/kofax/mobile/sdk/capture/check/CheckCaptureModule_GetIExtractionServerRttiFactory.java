package com.kofax.mobile.sdk.capture.check;

import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetIExtractionServerRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ICheckExtractionServer> {
    private final CheckCaptureModule aal;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<RttiCheckExtractor> f4661ad;

    public CheckCaptureModule_GetIExtractionServerRttiFactory(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<RttiCheckExtractor> hmlReviewDocumentActivity) {
        this.aal = checkCaptureModule;
        this.f4661ad = hmlReviewDocumentActivity;
    }

    public final ICheckExtractionServer get() {
        ICheckExtractionServer iExtractionServerRtti = this.aal.getIExtractionServerRtti(this.f4661ad.get());
        if (iExtractionServerRtti != null) {
            return iExtractionServerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetIExtractionServerRttiFactory create(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<RttiCheckExtractor> hmlReviewDocumentActivity) {
        return new CheckCaptureModule_GetIExtractionServerRttiFactory(checkCaptureModule, hmlReviewDocumentActivity);
    }

    public static ICheckExtractionServer proxyGetIExtractionServerRtti(CheckCaptureModule checkCaptureModule, RttiCheckExtractor rttiCheckExtractor) {
        ICheckExtractionServer iExtractionServerRtti = checkCaptureModule.getIExtractionServerRtti(rttiCheckExtractor);
        if (iExtractionServerRtti != null) {
            return iExtractionServerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
