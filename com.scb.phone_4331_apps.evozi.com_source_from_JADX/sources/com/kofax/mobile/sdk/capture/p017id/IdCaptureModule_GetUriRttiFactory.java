package com.kofax.mobile.sdk.capture.p017id;

import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetUriRttiFactory */
public final class IdCaptureModule_GetUriRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<String> {
    private final IdCaptureModule acu;

    public IdCaptureModule_GetUriRttiFactory(IdCaptureModule idCaptureModule) {
        this.acu = idCaptureModule;
    }

    public final String get() {
        String uriRtti = this.acu.getUriRtti();
        if (uriRtti != null) {
            return uriRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetUriRttiFactory create(IdCaptureModule idCaptureModule) {
        return new IdCaptureModule_GetUriRttiFactory(idCaptureModule);
    }

    public static String proxyGetUriRtti(IdCaptureModule idCaptureModule) {
        String uriRtti = idCaptureModule.getUriRtti();
        if (uriRtti != null) {
            return uriRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
