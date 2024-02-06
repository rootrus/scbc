package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillCaptureModule_GetLookAndFeelParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<LookAndFeelParameters> {

    /* renamed from: Zt */
    private final BillCaptureModule f4582Zt;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<LookAndFeelParameters> f4583ad;

    public BillCaptureModule_GetLookAndFeelParametersFactory(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity) {
        this.f4582Zt = billCaptureModule;
        this.f4583ad = hmlReviewDocumentActivity;
    }

    public final LookAndFeelParameters get() {
        LookAndFeelParameters lookAndFeelParameters = this.f4582Zt.getLookAndFeelParameters(this.f4583ad.get());
        if (lookAndFeelParameters != null) {
            return lookAndFeelParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static BillCaptureModule_GetLookAndFeelParametersFactory create(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<LookAndFeelParameters> hmlReviewDocumentActivity) {
        return new BillCaptureModule_GetLookAndFeelParametersFactory(billCaptureModule, hmlReviewDocumentActivity);
    }

    public static LookAndFeelParameters proxyGetLookAndFeelParameters(BillCaptureModule billCaptureModule, LookAndFeelParameters lookAndFeelParameters) {
        LookAndFeelParameters lookAndFeelParameters2 = billCaptureModule.getLookAndFeelParameters(lookAndFeelParameters);
        if (lookAndFeelParameters2 != null) {
            return lookAndFeelParameters2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
