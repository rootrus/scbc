package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetProcessingParametersFactory */
public final class IdCaptureModule_GetProcessingParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ProcessingParameters> {
    private final IdCaptureModule acu;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<ProcessingParameters> f4756ad;

    public IdCaptureModule_GetProcessingParametersFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4756ad = hmlReviewDocumentActivity;
    }

    public final ProcessingParameters get() {
        ProcessingParameters processingParameters = this.acu.getProcessingParameters(this.f4756ad.get());
        if (processingParameters != null) {
            return processingParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetProcessingParametersFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetProcessingParametersFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static ProcessingParameters proxyGetProcessingParameters(IdCaptureModule idCaptureModule, ProcessingParameters processingParameters) {
        ProcessingParameters processingParameters2 = idCaptureModule.getProcessingParameters(processingParameters);
        if (processingParameters2 != null) {
            return processingParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
