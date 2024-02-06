package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetIExceptionResponseDeserializerKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IExceptionResponseDeserializer> {
    private final CheckCaptureModule aal;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<CheckCaptureModule.KtaExceptionResponseDeserializer> f4658ad;

    public CheckCaptureModule_GetIExceptionResponseDeserializerKtaFactory(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<CheckCaptureModule.KtaExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        this.aal = checkCaptureModule;
        this.f4658ad = hmlReviewDocumentActivity;
    }

    public final IExceptionResponseDeserializer get() {
        IExceptionResponseDeserializer iExceptionResponseDeserializerKta = this.aal.getIExceptionResponseDeserializerKta(this.f4658ad.get());
        if (iExceptionResponseDeserializerKta != null) {
            return iExceptionResponseDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetIExceptionResponseDeserializerKtaFactory create(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<CheckCaptureModule.KtaExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        return new CheckCaptureModule_GetIExceptionResponseDeserializerKtaFactory(checkCaptureModule, hmlReviewDocumentActivity);
    }

    public static IExceptionResponseDeserializer proxyGetIExceptionResponseDeserializerKta(CheckCaptureModule checkCaptureModule, Object obj) {
        IExceptionResponseDeserializer iExceptionResponseDeserializerKta = checkCaptureModule.getIExceptionResponseDeserializerKta((CheckCaptureModule.KtaExceptionResponseDeserializer) obj);
        if (iExceptionResponseDeserializerKta != null) {
            return iExceptionResponseDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
