package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk.capture.passport.PassportCaptureModule;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.passport.PassportCaptureModule_GetIExceptionResponseDeserializerRttiFactory */
public final class C8330x9b852ec2 implements OPRStatusRewardsLandingActivity_ViewBinding<IExceptionResponseDeserializer> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<PassportCaptureModule.RttiExceptionResponseDeserializer> f4815ad;
    private final PassportCaptureModule adv;

    public C8330x9b852ec2(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<PassportCaptureModule.RttiExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        this.adv = passportCaptureModule;
        this.f4815ad = hmlReviewDocumentActivity;
    }

    public final IExceptionResponseDeserializer get() {
        IExceptionResponseDeserializer iExceptionResponseDeserializerRtti = this.adv.getIExceptionResponseDeserializerRtti(this.f4815ad.get());
        if (iExceptionResponseDeserializerRtti != null) {
            return iExceptionResponseDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static C8330x9b852ec2 create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<PassportCaptureModule.RttiExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        return new C8330x9b852ec2(passportCaptureModule, hmlReviewDocumentActivity);
    }

    public static IExceptionResponseDeserializer proxyGetIExceptionResponseDeserializerRtti(PassportCaptureModule passportCaptureModule, Object obj) {
        IExceptionResponseDeserializer iExceptionResponseDeserializerRtti = passportCaptureModule.getIExceptionResponseDeserializerRtti((PassportCaptureModule.RttiExceptionResponseDeserializer) obj);
        if (iExceptionResponseDeserializerRtti != null) {
            return iExceptionResponseDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
