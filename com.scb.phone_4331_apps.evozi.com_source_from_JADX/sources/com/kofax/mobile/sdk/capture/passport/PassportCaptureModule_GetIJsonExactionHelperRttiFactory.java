package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetIJsonExactionHelperRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IJsonExactionHelper> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<RttiJsonExactionHelper> f4819ad;
    private final PassportCaptureModule adv;

    public PassportCaptureModule_GetIJsonExactionHelperRttiFactory(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<RttiJsonExactionHelper> hmlReviewDocumentActivity) {
        this.adv = passportCaptureModule;
        this.f4819ad = hmlReviewDocumentActivity;
    }

    public final IJsonExactionHelper get() {
        IJsonExactionHelper iJsonExactionHelperRtti = this.adv.getIJsonExactionHelperRtti(this.f4819ad.get());
        if (iJsonExactionHelperRtti != null) {
            return iJsonExactionHelperRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetIJsonExactionHelperRttiFactory create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<RttiJsonExactionHelper> hmlReviewDocumentActivity) {
        return new PassportCaptureModule_GetIJsonExactionHelperRttiFactory(passportCaptureModule, hmlReviewDocumentActivity);
    }

    public static IJsonExactionHelper proxyGetIJsonExactionHelperRtti(PassportCaptureModule passportCaptureModule, RttiJsonExactionHelper rttiJsonExactionHelper) {
        IJsonExactionHelper iJsonExactionHelperRtti = passportCaptureModule.getIJsonExactionHelperRtti(rttiJsonExactionHelper);
        if (iJsonExactionHelperRtti != null) {
            return iJsonExactionHelperRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
