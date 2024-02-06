package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillCaptureModule_GetIJsonExactionHelperRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IJsonExactionHelper> {

    /* renamed from: Zt */
    private final BillCaptureModule f4578Zt;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<RttiJsonExactionHelper> f4579ad;

    public BillCaptureModule_GetIJsonExactionHelperRttiFactory(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<RttiJsonExactionHelper> hmlReviewDocumentActivity) {
        this.f4578Zt = billCaptureModule;
        this.f4579ad = hmlReviewDocumentActivity;
    }

    public final IJsonExactionHelper get() {
        IJsonExactionHelper iJsonExactionHelperRtti = this.f4578Zt.getIJsonExactionHelperRtti(this.f4579ad.get());
        if (iJsonExactionHelperRtti != null) {
            return iJsonExactionHelperRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static BillCaptureModule_GetIJsonExactionHelperRttiFactory create(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<RttiJsonExactionHelper> hmlReviewDocumentActivity) {
        return new BillCaptureModule_GetIJsonExactionHelperRttiFactory(billCaptureModule, hmlReviewDocumentActivity);
    }

    public static IJsonExactionHelper proxyGetIJsonExactionHelperRtti(BillCaptureModule billCaptureModule, RttiJsonExactionHelper rttiJsonExactionHelper) {
        IJsonExactionHelper iJsonExactionHelperRtti = billCaptureModule.getIJsonExactionHelperRtti(rttiJsonExactionHelper);
        if (iJsonExactionHelperRtti != null) {
            return iJsonExactionHelperRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
