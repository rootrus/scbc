package com.kofax.mobile.sdk.capture.passport;

import android.content.Context;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetIPassportDeserializerRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IPassportDeserializer> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4823X;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<RttiPassportExtractor> f4824ad;
    private final PassportCaptureModule adv;

    public PassportCaptureModule_GetIPassportDeserializerRttiFactory(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RttiPassportExtractor> hmlReviewDocumentActivity2) {
        this.adv = passportCaptureModule;
        this.f4823X = hmlReviewDocumentActivity;
        this.f4824ad = hmlReviewDocumentActivity2;
    }

    public final IPassportDeserializer get() {
        IPassportDeserializer iPassportDeserializerRtti = this.adv.getIPassportDeserializerRtti(this.f4823X.get(), this.f4824ad.get());
        if (iPassportDeserializerRtti != null) {
            return iPassportDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetIPassportDeserializerRttiFactory create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RttiPassportExtractor> hmlReviewDocumentActivity2) {
        return new PassportCaptureModule_GetIPassportDeserializerRttiFactory(passportCaptureModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public static IPassportDeserializer proxyGetIPassportDeserializerRtti(PassportCaptureModule passportCaptureModule, Context context, RttiPassportExtractor rttiPassportExtractor) {
        IPassportDeserializer iPassportDeserializerRtti = passportCaptureModule.getIPassportDeserializerRtti(context, rttiPassportExtractor);
        if (iPassportDeserializerRtti != null) {
            return iPassportDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
