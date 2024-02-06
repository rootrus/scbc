package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk.capture.p017id.IdCaptureModule;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory */
public final class IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IExceptionResponseDeserializer> {
    private final IdCaptureModule acu;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<IdCaptureModule.KtaExceptionResponseDeserializer> f4743ad;

    public IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<IdCaptureModule.KtaExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4743ad = hmlReviewDocumentActivity;
    }

    public final IExceptionResponseDeserializer get() {
        IExceptionResponseDeserializer iExceptionResponseDeserializerKta = this.acu.getIExceptionResponseDeserializerKta(this.f4743ad.get());
        if (iExceptionResponseDeserializerKta != null) {
            return iExceptionResponseDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<IdCaptureModule.KtaExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static IExceptionResponseDeserializer proxyGetIExceptionResponseDeserializerKta(IdCaptureModule idCaptureModule, Object obj) {
        IExceptionResponseDeserializer iExceptionResponseDeserializerKta = idCaptureModule.getIExceptionResponseDeserializerKta((IdCaptureModule.KtaExceptionResponseDeserializer) obj);
        if (iExceptionResponseDeserializerKta != null) {
            return iExceptionResponseDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
