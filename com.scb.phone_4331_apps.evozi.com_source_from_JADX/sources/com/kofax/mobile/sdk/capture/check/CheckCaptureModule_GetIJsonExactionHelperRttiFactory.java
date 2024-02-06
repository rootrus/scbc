package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetIJsonExactionHelperRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IJsonExactionHelper> {
    private final CheckCaptureModule aal;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<RttiJsonExactionHelper> f4663ad;

    public CheckCaptureModule_GetIJsonExactionHelperRttiFactory(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<RttiJsonExactionHelper> hmlReviewDocumentActivity) {
        this.aal = checkCaptureModule;
        this.f4663ad = hmlReviewDocumentActivity;
    }

    public final IJsonExactionHelper get() {
        IJsonExactionHelper iJsonExactionHelperRtti = this.aal.getIJsonExactionHelperRtti(this.f4663ad.get());
        if (iJsonExactionHelperRtti != null) {
            return iJsonExactionHelperRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetIJsonExactionHelperRttiFactory create(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<RttiJsonExactionHelper> hmlReviewDocumentActivity) {
        return new CheckCaptureModule_GetIJsonExactionHelperRttiFactory(checkCaptureModule, hmlReviewDocumentActivity);
    }

    public static IJsonExactionHelper proxyGetIJsonExactionHelperRtti(CheckCaptureModule checkCaptureModule, RttiJsonExactionHelper rttiJsonExactionHelper) {
        IJsonExactionHelper iJsonExactionHelperRtti = checkCaptureModule.getIJsonExactionHelperRtti(rttiJsonExactionHelper);
        if (iJsonExactionHelperRtti != null) {
            return iJsonExactionHelperRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
