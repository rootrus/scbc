package com.kofax.mobile.sdk.capture.passport;

import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetUriRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<String> {
    private final PassportCaptureModule adv;

    public PassportCaptureModule_GetUriRttiFactory(PassportCaptureModule passportCaptureModule) {
        this.adv = passportCaptureModule;
    }

    public final String get() {
        String uriRtti = this.adv.getUriRtti();
        if (uriRtti != null) {
            return uriRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetUriRttiFactory create(PassportCaptureModule passportCaptureModule) {
        return new PassportCaptureModule_GetUriRttiFactory(passportCaptureModule);
    }

    public static String proxyGetUriRtti(PassportCaptureModule passportCaptureModule) {
        String uriRtti = passportCaptureModule.getUriRtti();
        if (uriRtti != null) {
            return uriRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
