package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory */
public final class IdCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IExceptionResponseDeserializer> {
    private final IdCaptureModule acu;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<IdCaptureModule.OnDeviceExceptionResponseDeserializer> f4744ad;

    public IdCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<IdCaptureModule.OnDeviceExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4744ad = hmlReviewDocumentActivity;
    }

    public final IExceptionResponseDeserializer get() {
        IExceptionResponseDeserializer iExceptionResponseDeserializerOnDevice = this.acu.getIExceptionResponseDeserializerOnDevice(this.f4744ad.get());
        if (iExceptionResponseDeserializerOnDevice != null) {
            return iExceptionResponseDeserializerOnDevice;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<IdCaptureModule.OnDeviceExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static IExceptionResponseDeserializer proxyGetIExceptionResponseDeserializerOnDevice(IdCaptureModule idCaptureModule, IdCaptureModule.OnDeviceExceptionResponseDeserializer onDeviceExceptionResponseDeserializer) {
        IExceptionResponseDeserializer iExceptionResponseDeserializerOnDevice = idCaptureModule.getIExceptionResponseDeserializerOnDevice(onDeviceExceptionResponseDeserializer);
        if (iExceptionResponseDeserializerOnDevice != null) {
            return iExceptionResponseDeserializerOnDevice;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
