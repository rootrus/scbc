package com.kofax.mobile.sdk.capture.p017id;

import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetIIdExtractionServerRttiFactory */
public final class IdCaptureModule_GetIIdExtractionServerRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IIdExtractionServer> {
    private final IdCaptureModule acu;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<RttiIdExtractor> f4751ad;

    public IdCaptureModule_GetIIdExtractionServerRttiFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<RttiIdExtractor> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4751ad = hmlReviewDocumentActivity;
    }

    public final IIdExtractionServer get() {
        IIdExtractionServer iIdExtractionServerRtti = this.acu.getIIdExtractionServerRtti(this.f4751ad.get());
        if (iIdExtractionServerRtti != null) {
            return iIdExtractionServerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetIIdExtractionServerRttiFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<RttiIdExtractor> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetIIdExtractionServerRttiFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static IIdExtractionServer proxyGetIIdExtractionServerRtti(IdCaptureModule idCaptureModule, RttiIdExtractor rttiIdExtractor) {
        IIdExtractionServer iIdExtractionServerRtti = idCaptureModule.getIIdExtractionServerRtti(rttiIdExtractor);
        if (iIdExtractionServerRtti != null) {
            return iIdExtractionServerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
