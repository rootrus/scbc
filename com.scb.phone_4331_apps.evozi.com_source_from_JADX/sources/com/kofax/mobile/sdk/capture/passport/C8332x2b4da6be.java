package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8128eb;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractor;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_PassportOnDeviceExtractionServer_MembersInjector */
public final class C8332x2b4da6be implements MileageQuantitySelectionActivity<PassportCaptureModule.PassportOnDeviceExtractionServer> {

    /* renamed from: Mz */
    private final HmlReviewDocumentActivity<IIdExtractor> f4832Mz;

    public C8332x2b4da6be(HmlReviewDocumentActivity<IIdExtractor> hmlReviewDocumentActivity) {
        this.f4832Mz = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<PassportCaptureModule.PassportOnDeviceExtractionServer> create(HmlReviewDocumentActivity<IIdExtractor> hmlReviewDocumentActivity) {
        return new C8332x2b4da6be(hmlReviewDocumentActivity);
    }

    public final void injectMembers(PassportCaptureModule.PassportOnDeviceExtractionServer passportOnDeviceExtractionServer) {
        C8128eb.m4309a(passportOnDeviceExtractionServer, this.f4832Mz.get());
    }
}
