package com.kofax.mobile.sdk.capture.p017id;

import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetUriKtaFactory */
public final class IdCaptureModule_GetUriKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<String> {
    private final IdCaptureModule acu;

    public IdCaptureModule_GetUriKtaFactory(IdCaptureModule idCaptureModule) {
        this.acu = idCaptureModule;
    }

    public final String get() {
        String uriKta = this.acu.getUriKta();
        if (uriKta != null) {
            return uriKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetUriKtaFactory create(IdCaptureModule idCaptureModule) {
        return new IdCaptureModule_GetUriKtaFactory(idCaptureModule);
    }

    public static String proxyGetUriKta(IdCaptureModule idCaptureModule) {
        String uriKta = idCaptureModule.getUriKta();
        if (uriKta != null) {
            return uriKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
