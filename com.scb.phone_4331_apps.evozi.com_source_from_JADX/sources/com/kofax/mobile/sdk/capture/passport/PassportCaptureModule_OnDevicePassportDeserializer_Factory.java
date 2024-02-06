package com.kofax.mobile.sdk.capture.passport;

import android.content.Context;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_OnDevicePassportDeserializer_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<PassportCaptureModule.C0874b> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4829X;

    public PassportCaptureModule_OnDevicePassportDeserializer_Factory(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.f4829X = hmlReviewDocumentActivity;
    }

    public final PassportCaptureModule.C0874b get() {
        return new PassportCaptureModule.C0874b(this.f4829X.get());
    }

    public static PassportCaptureModule_OnDevicePassportDeserializer_Factory create(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new PassportCaptureModule_OnDevicePassportDeserializer_Factory(hmlReviewDocumentActivity);
    }

    public static PassportCaptureModule.C0874b newOnDevicePassportDeserializer(Context context) {
        return new PassportCaptureModule.C0874b(context);
    }
}
