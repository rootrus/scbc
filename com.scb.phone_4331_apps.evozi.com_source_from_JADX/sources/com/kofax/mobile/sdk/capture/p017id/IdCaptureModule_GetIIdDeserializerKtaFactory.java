package com.kofax.mobile.sdk.capture.p017id;

import android.content.Context;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetIIdDeserializerKtaFactory */
public final class IdCaptureModule_GetIIdDeserializerKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IIdDeserializer> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4746X;
    private final IdCaptureModule acu;

    public IdCaptureModule_GetIIdDeserializerKtaFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4746X = hmlReviewDocumentActivity;
    }

    public final IIdDeserializer get() {
        IIdDeserializer iIdDeserializerKta = this.acu.getIIdDeserializerKta(this.f4746X.get());
        if (iIdDeserializerKta != null) {
            return iIdDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetIIdDeserializerKtaFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetIIdDeserializerKtaFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static IIdDeserializer proxyGetIIdDeserializerKta(IdCaptureModule idCaptureModule, Context context) {
        IIdDeserializer iIdDeserializerKta = idCaptureModule.getIIdDeserializerKta(context);
        if (iIdDeserializerKta != null) {
            return iIdDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
