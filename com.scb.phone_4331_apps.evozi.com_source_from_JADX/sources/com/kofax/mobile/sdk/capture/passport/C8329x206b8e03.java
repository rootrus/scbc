package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetIExceptionResponseDeserializerKtaFactory */
public final class C8329x206b8e03 implements OPRStatusRewardsLandingActivity_ViewBinding<IExceptionResponseDeserializer> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<PassportCaptureModule.KtaExceptionResponseDeserializer> f4814ad;
    private final PassportCaptureModule adv;

    public C8329x206b8e03(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<PassportCaptureModule.KtaExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        this.adv = passportCaptureModule;
        this.f4814ad = hmlReviewDocumentActivity;
    }

    public final IExceptionResponseDeserializer get() {
        IExceptionResponseDeserializer iExceptionResponseDeserializerKta = this.adv.getIExceptionResponseDeserializerKta(this.f4814ad.get());
        if (iExceptionResponseDeserializerKta != null) {
            return iExceptionResponseDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static C8329x206b8e03 create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<PassportCaptureModule.KtaExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        return new C8329x206b8e03(passportCaptureModule, hmlReviewDocumentActivity);
    }

    public static IExceptionResponseDeserializer proxyGetIExceptionResponseDeserializerKta(PassportCaptureModule passportCaptureModule, Object obj) {
        IExceptionResponseDeserializer iExceptionResponseDeserializerKta = passportCaptureModule.getIExceptionResponseDeserializerKta((PassportCaptureModule.KtaExceptionResponseDeserializer) obj);
        if (iExceptionResponseDeserializerKta != null) {
            return iExceptionResponseDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
