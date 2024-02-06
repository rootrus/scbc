package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceExtractionServer;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetIIdExtractionServerOnDeviceFactory */
public final class IdCaptureModule_GetIIdExtractionServerOnDeviceFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IIdExtractionServer> {
    private final IdCaptureModule acu;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<OnDeviceExtractionServer> f4750ad;

    public IdCaptureModule_GetIIdExtractionServerOnDeviceFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<OnDeviceExtractionServer> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4750ad = hmlReviewDocumentActivity;
    }

    public final IIdExtractionServer get() {
        IIdExtractionServer iIdExtractionServerOnDevice = this.acu.getIIdExtractionServerOnDevice(this.f4750ad.get());
        if (iIdExtractionServerOnDevice != null) {
            return iIdExtractionServerOnDevice;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetIIdExtractionServerOnDeviceFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<OnDeviceExtractionServer> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetIIdExtractionServerOnDeviceFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static IIdExtractionServer proxyGetIIdExtractionServerOnDevice(IdCaptureModule idCaptureModule, OnDeviceExtractionServer onDeviceExtractionServer) {
        IIdExtractionServer iIdExtractionServerOnDevice = idCaptureModule.getIIdExtractionServerOnDevice(onDeviceExtractionServer);
        if (iIdExtractionServerOnDevice != null) {
            return iIdExtractionServerOnDevice;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
