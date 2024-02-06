package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillCaptureModule_GetExtractionParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ExtractionParameters> {

    /* renamed from: Zt */
    private final BillCaptureModule f4560Zt;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<ExtractionParameters> f4561ad;

    public BillCaptureModule_GetExtractionParametersFactory(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity) {
        this.f4560Zt = billCaptureModule;
        this.f4561ad = hmlReviewDocumentActivity;
    }

    public final ExtractionParameters get() {
        ExtractionParameters extractionParameters = this.f4560Zt.getExtractionParameters(this.f4561ad.get());
        if (extractionParameters != null) {
            return extractionParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static BillCaptureModule_GetExtractionParametersFactory create(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<ExtractionParameters> hmlReviewDocumentActivity) {
        return new BillCaptureModule_GetExtractionParametersFactory(billCaptureModule, hmlReviewDocumentActivity);
    }

    public static ExtractionParameters proxyGetExtractionParameters(BillCaptureModule billCaptureModule, ExtractionParameters extractionParameters) {
        ExtractionParameters extractionParameters2 = billCaptureModule.getExtractionParameters(extractionParameters);
        if (extractionParameters2 != null) {
            return extractionParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
