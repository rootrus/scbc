package com.kofax.mobile.sdk.capture.bill;

import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillCaptureModule_GetUriRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<String> {

    /* renamed from: Zt */
    private final BillCaptureModule f4587Zt;

    public BillCaptureModule_GetUriRttiFactory(BillCaptureModule billCaptureModule) {
        this.f4587Zt = billCaptureModule;
    }

    public final String get() {
        String uriRtti = this.f4587Zt.getUriRtti();
        if (uriRtti != null) {
            return uriRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static BillCaptureModule_GetUriRttiFactory create(BillCaptureModule billCaptureModule) {
        return new BillCaptureModule_GetUriRttiFactory(billCaptureModule);
    }

    public static String proxyGetUriRtti(BillCaptureModule billCaptureModule) {
        String uriRtti = billCaptureModule.getUriRtti();
        if (uriRtti != null) {
            return uriRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
