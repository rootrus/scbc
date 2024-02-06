package com.kofax.mobile.sdk.capture.bill;

import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillCaptureModule_GetUriKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<String> {

    /* renamed from: Zt */
    private final BillCaptureModule f4586Zt;

    public BillCaptureModule_GetUriKtaFactory(BillCaptureModule billCaptureModule) {
        this.f4586Zt = billCaptureModule;
    }

    public final String get() {
        String uriKta = this.f4586Zt.getUriKta();
        if (uriKta != null) {
            return uriKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static BillCaptureModule_GetUriKtaFactory create(BillCaptureModule billCaptureModule) {
        return new BillCaptureModule_GetUriKtaFactory(billCaptureModule);
    }

    public static String proxyGetUriKta(BillCaptureModule billCaptureModule) {
        String uriKta = billCaptureModule.getUriKta();
        if (uriKta != null) {
            return uriKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
