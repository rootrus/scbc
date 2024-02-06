package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillCaptureModule_GetIJsonExactionHelperKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IJsonExactionHelper> {

    /* renamed from: Zt */
    private final BillCaptureModule f4576Zt;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<KtaJsonExactionHelper> f4577ad;

    public BillCaptureModule_GetIJsonExactionHelperKtaFactory(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<KtaJsonExactionHelper> hmlReviewDocumentActivity) {
        this.f4576Zt = billCaptureModule;
        this.f4577ad = hmlReviewDocumentActivity;
    }

    public final IJsonExactionHelper get() {
        IJsonExactionHelper iJsonExactionHelperKta = this.f4576Zt.getIJsonExactionHelperKta(this.f4577ad.get());
        if (iJsonExactionHelperKta != null) {
            return iJsonExactionHelperKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static BillCaptureModule_GetIJsonExactionHelperKtaFactory create(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<KtaJsonExactionHelper> hmlReviewDocumentActivity) {
        return new BillCaptureModule_GetIJsonExactionHelperKtaFactory(billCaptureModule, hmlReviewDocumentActivity);
    }

    public static IJsonExactionHelper proxyGetIJsonExactionHelperKta(BillCaptureModule billCaptureModule, KtaJsonExactionHelper ktaJsonExactionHelper) {
        IJsonExactionHelper iJsonExactionHelperKta = billCaptureModule.getIJsonExactionHelperKta(ktaJsonExactionHelper);
        if (iJsonExactionHelperKta != null) {
            return iJsonExactionHelperKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
