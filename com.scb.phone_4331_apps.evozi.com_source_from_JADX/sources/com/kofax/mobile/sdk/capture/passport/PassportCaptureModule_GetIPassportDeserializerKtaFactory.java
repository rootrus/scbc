package com.kofax.mobile.sdk.capture.passport;

import android.content.Context;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetIPassportDeserializerKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IPassportDeserializer> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4821X;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<RttiPassportExtractor> f4822ad;
    private final PassportCaptureModule adv;

    public PassportCaptureModule_GetIPassportDeserializerKtaFactory(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RttiPassportExtractor> hmlReviewDocumentActivity2) {
        this.adv = passportCaptureModule;
        this.f4821X = hmlReviewDocumentActivity;
        this.f4822ad = hmlReviewDocumentActivity2;
    }

    public final IPassportDeserializer get() {
        IPassportDeserializer iPassportDeserializerKta = this.adv.getIPassportDeserializerKta(this.f4821X.get(), this.f4822ad.get());
        if (iPassportDeserializerKta != null) {
            return iPassportDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetIPassportDeserializerKtaFactory create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RttiPassportExtractor> hmlReviewDocumentActivity2) {
        return new PassportCaptureModule_GetIPassportDeserializerKtaFactory(passportCaptureModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public static IPassportDeserializer proxyGetIPassportDeserializerKta(PassportCaptureModule passportCaptureModule, Context context, RttiPassportExtractor rttiPassportExtractor) {
        IPassportDeserializer iPassportDeserializerKta = passportCaptureModule.getIPassportDeserializerKta(context, rttiPassportExtractor);
        if (iPassportDeserializerKta != null) {
            return iPassportDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
