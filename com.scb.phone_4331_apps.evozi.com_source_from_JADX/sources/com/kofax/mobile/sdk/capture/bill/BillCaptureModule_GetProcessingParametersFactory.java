package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillCaptureModule_GetProcessingParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ProcessingParameters> {

    /* renamed from: Zt */
    private final BillCaptureModule f4584Zt;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<ProcessingParameters> f4585ad;

    public BillCaptureModule_GetProcessingParametersFactory(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity) {
        this.f4584Zt = billCaptureModule;
        this.f4585ad = hmlReviewDocumentActivity;
    }

    public final ProcessingParameters get() {
        ProcessingParameters processingParameters = this.f4584Zt.getProcessingParameters(this.f4585ad.get());
        if (processingParameters != null) {
            return processingParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static BillCaptureModule_GetProcessingParametersFactory create(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<ProcessingParameters> hmlReviewDocumentActivity) {
        return new BillCaptureModule_GetProcessingParametersFactory(billCaptureModule, hmlReviewDocumentActivity);
    }

    public static ProcessingParameters proxyGetProcessingParameters(BillCaptureModule billCaptureModule, ProcessingParameters processingParameters) {
        ProcessingParameters processingParameters2 = billCaptureModule.getProcessingParameters(processingParameters);
        if (processingParameters2 != null) {
            return processingParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
