package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory */
public final class IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IExceptionResponseDeserializer> {
    private final IdCaptureModule acu;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<IdCaptureModule.RttiExceptionResponseDeserializer> f4745ad;

    public IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<IdCaptureModule.RttiExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4745ad = hmlReviewDocumentActivity;
    }

    public final IExceptionResponseDeserializer get() {
        IExceptionResponseDeserializer iExceptionResponseDeserializerRtti = this.acu.getIExceptionResponseDeserializerRtti(this.f4745ad.get());
        if (iExceptionResponseDeserializerRtti != null) {
            return iExceptionResponseDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<IdCaptureModule.RttiExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static IExceptionResponseDeserializer proxyGetIExceptionResponseDeserializerRtti(IdCaptureModule idCaptureModule, Object obj) {
        IExceptionResponseDeserializer iExceptionResponseDeserializerRtti = idCaptureModule.getIExceptionResponseDeserializerRtti((IdCaptureModule.RttiExceptionResponseDeserializer) obj);
        if (iExceptionResponseDeserializerRtti != null) {
            return iExceptionResponseDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
