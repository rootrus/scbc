package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillCaptureModule_GetIExtractionServerKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IExtractionServer> {

    /* renamed from: Zt */
    private final BillCaptureModule f4572Zt;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<KtaBillExtractor> f4573ad;

    public BillCaptureModule_GetIExtractionServerKtaFactory(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<KtaBillExtractor> hmlReviewDocumentActivity) {
        this.f4572Zt = billCaptureModule;
        this.f4573ad = hmlReviewDocumentActivity;
    }

    public final IExtractionServer get() {
        IExtractionServer iExtractionServerKta = this.f4572Zt.getIExtractionServerKta(this.f4573ad.get());
        if (iExtractionServerKta != null) {
            return iExtractionServerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static BillCaptureModule_GetIExtractionServerKtaFactory create(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<KtaBillExtractor> hmlReviewDocumentActivity) {
        return new BillCaptureModule_GetIExtractionServerKtaFactory(billCaptureModule, hmlReviewDocumentActivity);
    }

    public static IExtractionServer proxyGetIExtractionServerKta(BillCaptureModule billCaptureModule, KtaBillExtractor ktaBillExtractor) {
        IExtractionServer iExtractionServerKta = billCaptureModule.getIExtractionServerKta(ktaBillExtractor);
        if (iExtractionServerKta != null) {
            return iExtractionServerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
