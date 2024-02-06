package com.kofax.mobile.sdk.capture.passport;

import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetUriKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<String> {
    private final PassportCaptureModule adv;

    public PassportCaptureModule_GetUriKtaFactory(PassportCaptureModule passportCaptureModule) {
        this.adv = passportCaptureModule;
    }

    public final String get() {
        String uriKta = this.adv.getUriKta();
        if (uriKta != null) {
            return uriKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetUriKtaFactory create(PassportCaptureModule passportCaptureModule) {
        return new PassportCaptureModule_GetUriKtaFactory(passportCaptureModule);
    }

    public static String proxyGetUriKta(PassportCaptureModule passportCaptureModule) {
        String uriKta = passportCaptureModule.getUriKta();
        if (uriKta != null) {
            return uriKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
