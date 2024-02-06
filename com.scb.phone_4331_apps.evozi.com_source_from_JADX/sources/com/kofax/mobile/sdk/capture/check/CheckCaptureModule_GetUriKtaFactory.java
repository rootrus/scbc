package com.kofax.mobile.sdk.capture.check;

import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetUriKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<String> {
    private final CheckCaptureModule aal;

    public CheckCaptureModule_GetUriKtaFactory(CheckCaptureModule checkCaptureModule) {
        this.aal = checkCaptureModule;
    }

    public final String get() {
        String uriKta = this.aal.getUriKta();
        if (uriKta != null) {
            return uriKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetUriKtaFactory create(CheckCaptureModule checkCaptureModule) {
        return new CheckCaptureModule_GetUriKtaFactory(checkCaptureModule);
    }

    public static String proxyGetUriKta(CheckCaptureModule checkCaptureModule) {
        String uriKta = checkCaptureModule.getUriKta();
        if (uriKta != null) {
            return uriKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
