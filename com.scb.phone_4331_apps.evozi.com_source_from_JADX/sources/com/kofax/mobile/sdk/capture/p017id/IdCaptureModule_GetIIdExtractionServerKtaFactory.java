package com.kofax.mobile.sdk.capture.p017id;

import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetIIdExtractionServerKtaFactory */
public final class IdCaptureModule_GetIIdExtractionServerKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IIdExtractionServer> {
    private final IdCaptureModule acu;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<KtaIdExtractor> f4749ad;

    public IdCaptureModule_GetIIdExtractionServerKtaFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<KtaIdExtractor> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4749ad = hmlReviewDocumentActivity;
    }

    public final IIdExtractionServer get() {
        IIdExtractionServer iIdExtractionServerKta = this.acu.getIIdExtractionServerKta(this.f4749ad.get());
        if (iIdExtractionServerKta != null) {
            return iIdExtractionServerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetIIdExtractionServerKtaFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<KtaIdExtractor> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetIIdExtractionServerKtaFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static IIdExtractionServer proxyGetIIdExtractionServerKta(IdCaptureModule idCaptureModule, KtaIdExtractor ktaIdExtractor) {
        IIdExtractionServer iIdExtractionServerKta = idCaptureModule.getIIdExtractionServerKta(ktaIdExtractor);
        if (iIdExtractionServerKta != null) {
            return iIdExtractionServerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
