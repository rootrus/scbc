package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetOnDevicePassportDeserializerFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IPassportDeserializer> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<PassportCaptureModule.C0874b> f4828ad;
    private final PassportCaptureModule adv;

    public PassportCaptureModule_GetOnDevicePassportDeserializerFactory(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<PassportCaptureModule.C0874b> hmlReviewDocumentActivity) {
        this.adv = passportCaptureModule;
        this.f4828ad = hmlReviewDocumentActivity;
    }

    public final IPassportDeserializer get() {
        IPassportDeserializer a = this.adv.mo12196a(this.f4828ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetOnDevicePassportDeserializerFactory create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<PassportCaptureModule.C0874b> hmlReviewDocumentActivity) {
        return new PassportCaptureModule_GetOnDevicePassportDeserializerFactory(passportCaptureModule, hmlReviewDocumentActivity);
    }

    public static IPassportDeserializer proxyGetOnDevicePassportDeserializer(PassportCaptureModule passportCaptureModule, Object obj) {
        IPassportDeserializer a = passportCaptureModule.mo12196a((PassportCaptureModule.C0874b) obj);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
