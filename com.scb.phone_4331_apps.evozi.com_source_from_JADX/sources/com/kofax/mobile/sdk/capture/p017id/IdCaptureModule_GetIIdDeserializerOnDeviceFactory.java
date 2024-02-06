package com.kofax.mobile.sdk.capture.p017id;

import android.content.Context;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetIIdDeserializerOnDeviceFactory */
public final class IdCaptureModule_GetIIdDeserializerOnDeviceFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IIdDeserializer> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4747X;
    private final IdCaptureModule acu;

    public IdCaptureModule_GetIIdDeserializerOnDeviceFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4747X = hmlReviewDocumentActivity;
    }

    public final IIdDeserializer get() {
        IIdDeserializer iIdDeserializerOnDevice = this.acu.getIIdDeserializerOnDevice(this.f4747X.get());
        if (iIdDeserializerOnDevice != null) {
            return iIdDeserializerOnDevice;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetIIdDeserializerOnDeviceFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetIIdDeserializerOnDeviceFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static IIdDeserializer proxyGetIIdDeserializerOnDevice(IdCaptureModule idCaptureModule, Context context) {
        IIdDeserializer iIdDeserializerOnDevice = idCaptureModule.getIIdDeserializerOnDevice(context);
        if (iIdDeserializerOnDevice != null) {
            return iIdDeserializerOnDevice;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
