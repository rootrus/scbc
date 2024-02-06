package com.kofax.mobile.sdk.capture.passport;

import android.content.Context;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8128eb;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractor;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_PassportOnDeviceExtractionServer_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<PassportCaptureModule.PassportOnDeviceExtractionServer> {

    /* renamed from: Mz */
    private final HmlReviewDocumentActivity<IIdExtractor> f4830Mz;

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4831X;

    public PassportCaptureModule_PassportOnDeviceExtractionServer_Factory(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IIdExtractor> hmlReviewDocumentActivity2) {
        this.f4831X = hmlReviewDocumentActivity;
        this.f4830Mz = hmlReviewDocumentActivity2;
    }

    public final PassportCaptureModule.PassportOnDeviceExtractionServer get() {
        PassportCaptureModule.PassportOnDeviceExtractionServer passportOnDeviceExtractionServer = new PassportCaptureModule.PassportOnDeviceExtractionServer(this.f4831X.get());
        C8128eb.m4309a(passportOnDeviceExtractionServer, this.f4830Mz.get());
        return passportOnDeviceExtractionServer;
    }

    public static PassportCaptureModule_PassportOnDeviceExtractionServer_Factory create(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IIdExtractor> hmlReviewDocumentActivity2) {
        return new PassportCaptureModule_PassportOnDeviceExtractionServer_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public static PassportCaptureModule.PassportOnDeviceExtractionServer newPassportOnDeviceExtractionServer(Context context) {
        return new PassportCaptureModule.PassportOnDeviceExtractionServer(context);
    }
}
