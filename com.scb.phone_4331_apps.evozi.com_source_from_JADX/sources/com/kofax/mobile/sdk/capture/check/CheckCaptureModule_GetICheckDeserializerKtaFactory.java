package com.kofax.mobile.sdk.capture.check;

import android.content.Context;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetICheckDeserializerKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<ICheckDeserializer> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4653X;
    private final CheckCaptureModule aal;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<RttiCheckExtractor> f4654ad;

    public CheckCaptureModule_GetICheckDeserializerKtaFactory(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RttiCheckExtractor> hmlReviewDocumentActivity2) {
        this.aal = checkCaptureModule;
        this.f4653X = hmlReviewDocumentActivity;
        this.f4654ad = hmlReviewDocumentActivity2;
    }

    public final ICheckDeserializer get() {
        ICheckDeserializer iCheckDeserializerKta = this.aal.getICheckDeserializerKta(this.f4653X.get(), this.f4654ad.get());
        if (iCheckDeserializerKta != null) {
            return iCheckDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetICheckDeserializerKtaFactory create(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RttiCheckExtractor> hmlReviewDocumentActivity2) {
        return new CheckCaptureModule_GetICheckDeserializerKtaFactory(checkCaptureModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public static ICheckDeserializer proxyGetICheckDeserializerKta(CheckCaptureModule checkCaptureModule, Context context, RttiCheckExtractor rttiCheckExtractor) {
        ICheckDeserializer iCheckDeserializerKta = checkCaptureModule.getICheckDeserializerKta(context, rttiCheckExtractor);
        if (iCheckDeserializerKta != null) {
            return iCheckDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
