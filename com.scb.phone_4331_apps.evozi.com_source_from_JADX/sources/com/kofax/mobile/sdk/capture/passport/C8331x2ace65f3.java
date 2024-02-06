package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetOnDeviceExceptionResponseDeserializerFactory */
public final class C8331x2ace65f3 implements OPRStatusRewardsLandingActivity_ViewBinding<IExceptionResponseDeserializer> {
    private final PassportCaptureModule adv;

    public C8331x2ace65f3(PassportCaptureModule passportCaptureModule) {
        this.adv = passportCaptureModule;
    }

    public final IExceptionResponseDeserializer get() {
        IExceptionResponseDeserializer tU = this.adv.mo12212tU();
        if (tU != null) {
            return tU;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static C8331x2ace65f3 create(PassportCaptureModule passportCaptureModule) {
        return new C8331x2ace65f3(passportCaptureModule);
    }

    public static IExceptionResponseDeserializer proxyGetOnDeviceExceptionResponseDeserializer(PassportCaptureModule passportCaptureModule) {
        IExceptionResponseDeserializer tU = passportCaptureModule.mo12212tU();
        if (tU != null) {
            return tU;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
