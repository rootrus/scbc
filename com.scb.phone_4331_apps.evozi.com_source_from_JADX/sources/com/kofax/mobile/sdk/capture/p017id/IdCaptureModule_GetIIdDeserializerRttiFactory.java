package com.kofax.mobile.sdk.capture.p017id;

import android.content.Context;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetIIdDeserializerRttiFactory */
public final class IdCaptureModule_GetIIdDeserializerRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IIdDeserializer> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4748X;
    private final IdCaptureModule acu;

    public IdCaptureModule_GetIIdDeserializerRttiFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4748X = hmlReviewDocumentActivity;
    }

    public final IIdDeserializer get() {
        IIdDeserializer iIdDeserializerRtti = this.acu.getIIdDeserializerRtti(this.f4748X.get());
        if (iIdDeserializerRtti != null) {
            return iIdDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetIIdDeserializerRttiFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetIIdDeserializerRttiFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static IIdDeserializer proxyGetIIdDeserializerRtti(IdCaptureModule idCaptureModule, Context context) {
        IIdDeserializer iIdDeserializerRtti = idCaptureModule.getIIdDeserializerRtti(context);
        if (iIdDeserializerRtti != null) {
            return iIdDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
