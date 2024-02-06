package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetExtractionParametersFactory */
public final class IdCaptureModule_GetExtractionParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ExtractionParameters> {
    private final IdCaptureModule acu;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4742ad;

    public IdCaptureModule_GetExtractionParametersFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4742ad = hmlReviewDocumentActivity;
    }

    public final ExtractionParameters get() {
        ExtractionParameters extractionParameters = this.acu.getExtractionParameters(this.f4742ad.get());
        if (extractionParameters != null) {
            return extractionParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetExtractionParametersFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetExtractionParametersFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static ExtractionParameters proxyGetExtractionParameters(IdCaptureModule idCaptureModule, ExtractionParameters extractionParameters) {
        ExtractionParameters extractionParameters2 = idCaptureModule.getExtractionParameters(extractionParameters);
        if (extractionParameters2 != null) {
            return extractionParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
