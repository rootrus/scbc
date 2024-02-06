package com.kofax.mobile.sdk.capture.check;

import android.content.Context;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetICheckDeserializerRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ICheckDeserializer> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4655X;
    private final CheckCaptureModule aal;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<RttiCheckExtractor> f4656ad;

    public CheckCaptureModule_GetICheckDeserializerRttiFactory(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RttiCheckExtractor> hmlReviewDocumentActivity2) {
        this.aal = checkCaptureModule;
        this.f4655X = hmlReviewDocumentActivity;
        this.f4656ad = hmlReviewDocumentActivity2;
    }

    public final ICheckDeserializer get() {
        ICheckDeserializer iCheckDeserializerRtti = this.aal.getICheckDeserializerRtti(this.f4655X.get(), this.f4656ad.get());
        if (iCheckDeserializerRtti != null) {
            return iCheckDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetICheckDeserializerRttiFactory create(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RttiCheckExtractor> hmlReviewDocumentActivity2) {
        return new CheckCaptureModule_GetICheckDeserializerRttiFactory(checkCaptureModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public static ICheckDeserializer proxyGetICheckDeserializerRtti(CheckCaptureModule checkCaptureModule, Context context, RttiCheckExtractor rttiCheckExtractor) {
        ICheckDeserializer iCheckDeserializerRtti = checkCaptureModule.getICheckDeserializerRtti(context, rttiCheckExtractor);
        if (iCheckDeserializerRtti != null) {
            return iCheckDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
