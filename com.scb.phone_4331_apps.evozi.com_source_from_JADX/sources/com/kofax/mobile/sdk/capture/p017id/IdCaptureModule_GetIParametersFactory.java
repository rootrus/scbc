package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk.capture.parameter.IParameters;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetIParametersFactory */
public final class IdCaptureModule_GetIParametersFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IParameters> {
    private final IdCaptureModule acu;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<IdParameters> f4754ad;

    public IdCaptureModule_GetIParametersFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<IdParameters> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4754ad = hmlReviewDocumentActivity;
    }

    public final IParameters get() {
        IParameters iParameters = this.acu.getIParameters(this.f4754ad.get());
        if (iParameters != null) {
            return iParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetIParametersFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<IdParameters> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetIParametersFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static IParameters proxyGetIParameters(IdCaptureModule idCaptureModule, IdParameters idParameters) {
        IParameters iParameters = idCaptureModule.getIParameters(idParameters);
        if (iParameters != null) {
            return iParameters;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
