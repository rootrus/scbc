package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CheckCaptureModule_GetIJsonExactionHelperKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IJsonExactionHelper> {
    private final CheckCaptureModule aal;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<KtaJsonExactionHelper> f4662ad;

    public CheckCaptureModule_GetIJsonExactionHelperKtaFactory(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<KtaJsonExactionHelper> hmlReviewDocumentActivity) {
        this.aal = checkCaptureModule;
        this.f4662ad = hmlReviewDocumentActivity;
    }

    public final IJsonExactionHelper get() {
        IJsonExactionHelper iJsonExactionHelperKta = this.aal.getIJsonExactionHelperKta(this.f4662ad.get());
        if (iJsonExactionHelperKta != null) {
            return iJsonExactionHelperKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CheckCaptureModule_GetIJsonExactionHelperKtaFactory create(CheckCaptureModule checkCaptureModule, HmlReviewDocumentActivity<KtaJsonExactionHelper> hmlReviewDocumentActivity) {
        return new CheckCaptureModule_GetIJsonExactionHelperKtaFactory(checkCaptureModule, hmlReviewDocumentActivity);
    }

    public static IJsonExactionHelper proxyGetIJsonExactionHelperKta(CheckCaptureModule checkCaptureModule, KtaJsonExactionHelper ktaJsonExactionHelper) {
        IJsonExactionHelper iJsonExactionHelperKta = checkCaptureModule.getIJsonExactionHelperKta(ktaJsonExactionHelper);
        if (iJsonExactionHelperKta != null) {
            return iJsonExactionHelperKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
