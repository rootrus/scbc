package com.kofax.mobile.sdk.capture.check;

import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetUriRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<String> {
    private final CheckCaptureModule aal;

    public CheckCaptureModule_GetUriRttiFactory(CheckCaptureModule checkCaptureModule) {
        this.aal = checkCaptureModule;
    }

    public final String get() {
        String uriRtti = this.aal.getUriRtti();
        if (uriRtti != null) {
            return uriRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetUriRttiFactory create(CheckCaptureModule checkCaptureModule) {
        return new CheckCaptureModule_GetUriRttiFactory(checkCaptureModule);
    }

    public static String proxyGetUriRtti(CheckCaptureModule checkCaptureModule) {
        String uriRtti = checkCaptureModule.getUriRtti();
        if (uriRtti != null) {
            return uriRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
