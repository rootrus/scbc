package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk.capture.check.CheckCaptureModule;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IExceptionResponseDeserializer> {
    private final CheckCaptureModule aal;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<CheckCaptureModule.RttiExceptionResponseDeserializer> f4659ad;

    public CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<CheckCaptureModule.RttiExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        this.aal = checkCaptureModule;
        this.f4659ad = hmlReviewDocumentActivity;
    }

    public final IExceptionResponseDeserializer get() {
        IExceptionResponseDeserializer iExceptionResponseDeserializerRtti = this.aal.getIExceptionResponseDeserializerRtti(this.f4659ad.get());
        if (iExceptionResponseDeserializerRtti != null) {
            return iExceptionResponseDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory create(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<CheckCaptureModule.RttiExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        return new CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory(checkCaptureModule, hmlReviewDocumentActivity);
    }

    public static IExceptionResponseDeserializer proxyGetIExceptionResponseDeserializerRtti(CheckCaptureModule checkCaptureModule, Object obj) {
        IExceptionResponseDeserializer iExceptionResponseDeserializerRtti = checkCaptureModule.getIExceptionResponseDeserializerRtti((CheckCaptureModule.RttiExceptionResponseDeserializer) obj);
        if (iExceptionResponseDeserializerRtti != null) {
            return iExceptionResponseDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
