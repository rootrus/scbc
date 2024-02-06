package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetIJsonExactionHelperRttiFactory */
public final class IdCaptureModule_GetIJsonExactionHelperRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IJsonExactionHelper> {
    private final IdCaptureModule acu;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<RttiJsonExactionHelper> f4753ad;

    public IdCaptureModule_GetIJsonExactionHelperRttiFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<RttiJsonExactionHelper> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4753ad = hmlReviewDocumentActivity;
    }

    public final IJsonExactionHelper get() {
        IJsonExactionHelper iJsonExactionHelperRtti = this.acu.getIJsonExactionHelperRtti(this.f4753ad.get());
        if (iJsonExactionHelperRtti != null) {
            return iJsonExactionHelperRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetIJsonExactionHelperRttiFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<RttiJsonExactionHelper> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetIJsonExactionHelperRttiFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static IJsonExactionHelper proxyGetIJsonExactionHelperRtti(IdCaptureModule idCaptureModule, RttiJsonExactionHelper rttiJsonExactionHelper) {
        IJsonExactionHelper iJsonExactionHelperRtti = idCaptureModule.getIJsonExactionHelperRtti(rttiJsonExactionHelper);
        if (iJsonExactionHelperRtti != null) {
            return iJsonExactionHelperRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
