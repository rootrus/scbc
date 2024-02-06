package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class PassportCaptureModule_GetIJsonExactionHelperKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IJsonExactionHelper> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<KtaJsonExactionHelper> f4818ad;
    private final PassportCaptureModule adv;

    public PassportCaptureModule_GetIJsonExactionHelperKtaFactory(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<KtaJsonExactionHelper> hmlReviewDocumentActivity) {
        this.adv = passportCaptureModule;
        this.f4818ad = hmlReviewDocumentActivity;
    }

    public final IJsonExactionHelper get() {
        IJsonExactionHelper iJsonExactionHelperKta = this.adv.getIJsonExactionHelperKta(this.f4818ad.get());
        if (iJsonExactionHelperKta != null) {
            return iJsonExactionHelperKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static PassportCaptureModule_GetIJsonExactionHelperKtaFactory create(PassportCaptureModule passportCaptureModule, HmlReviewDocumentActivity<KtaJsonExactionHelper> hmlReviewDocumentActivity) {
        return new PassportCaptureModule_GetIJsonExactionHelperKtaFactory(passportCaptureModule, hmlReviewDocumentActivity);
    }

    public static IJsonExactionHelper proxyGetIJsonExactionHelperKta(PassportCaptureModule passportCaptureModule, KtaJsonExactionHelper ktaJsonExactionHelper) {
        IJsonExactionHelper iJsonExactionHelperKta = passportCaptureModule.getIJsonExactionHelperKta(ktaJsonExactionHelper);
        if (iJsonExactionHelperKta != null) {
            return iJsonExactionHelperKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
