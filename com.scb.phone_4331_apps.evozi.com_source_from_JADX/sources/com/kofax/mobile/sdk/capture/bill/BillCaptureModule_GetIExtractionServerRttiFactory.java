package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillCaptureModule_GetIExtractionServerRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IExtractionServer> {

    /* renamed from: Zt */
    private final BillCaptureModule f4574Zt;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<RttiBillExtractor> f4575ad;

    public BillCaptureModule_GetIExtractionServerRttiFactory(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<RttiBillExtractor> hmlReviewDocumentActivity) {
        this.f4574Zt = billCaptureModule;
        this.f4575ad = hmlReviewDocumentActivity;
    }

    public final IExtractionServer get() {
        IExtractionServer iExtractionServerRtti = this.f4574Zt.getIExtractionServerRtti(this.f4575ad.get());
        if (iExtractionServerRtti != null) {
            return iExtractionServerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static BillCaptureModule_GetIExtractionServerRttiFactory create(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<RttiBillExtractor> hmlReviewDocumentActivity) {
        return new BillCaptureModule_GetIExtractionServerRttiFactory(billCaptureModule, hmlReviewDocumentActivity);
    }

    public static IExtractionServer proxyGetIExtractionServerRtti(BillCaptureModule billCaptureModule, RttiBillExtractor rttiBillExtractor) {
        IExtractionServer iExtractionServerRtti = billCaptureModule.getIExtractionServerRtti(rttiBillExtractor);
        if (iExtractionServerRtti != null) {
            return iExtractionServerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
