package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk.capture.parameter.IParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillCaptureModule_GetIParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IParameters> {

    /* renamed from: Zt */
    private final BillCaptureModule f4580Zt;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<BillParameters> f4581ad;

    public BillCaptureModule_GetIParametersFactory(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<BillParameters> hmlReviewDocumentActivity) {
        this.f4580Zt = billCaptureModule;
        this.f4581ad = hmlReviewDocumentActivity;
    }

    public final IParameters get() {
        IParameters iParameters = this.f4580Zt.getIParameters(this.f4581ad.get());
        if (iParameters != null) {
            return iParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static BillCaptureModule_GetIParametersFactory create(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<BillParameters> hmlReviewDocumentActivity) {
        return new BillCaptureModule_GetIParametersFactory(billCaptureModule, hmlReviewDocumentActivity);
    }

    public static IParameters proxyGetIParameters(BillCaptureModule billCaptureModule, BillParameters billParameters) {
        IParameters iParameters = billCaptureModule.getIParameters(billParameters);
        if (iParameters != null) {
            return iParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
