package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureModule_GetIJsonExactionHelperKtaFactory */
public final class IdCaptureModule_GetIJsonExactionHelperKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IJsonExactionHelper> {
    private final IdCaptureModule acu;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<KtaJsonExactionHelper> f4752ad;

    public IdCaptureModule_GetIJsonExactionHelperKtaFactory(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<KtaJsonExactionHelper> hmlReviewDocumentActivity) {
        this.acu = idCaptureModule;
        this.f4752ad = hmlReviewDocumentActivity;
    }

    public final IJsonExactionHelper get() {
        IJsonExactionHelper iJsonExactionHelperKta = this.acu.getIJsonExactionHelperKta(this.f4752ad.get());
        if (iJsonExactionHelperKta != null) {
            return iJsonExactionHelperKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IdCaptureModule_GetIJsonExactionHelperKtaFactory create(IdCaptureModule idCaptureModule, HmlReviewDocumentActivity<KtaJsonExactionHelper> hmlReviewDocumentActivity) {
        return new IdCaptureModule_GetIJsonExactionHelperKtaFactory(idCaptureModule, hmlReviewDocumentActivity);
    }

    public static IJsonExactionHelper proxyGetIJsonExactionHelperKta(IdCaptureModule idCaptureModule, KtaJsonExactionHelper ktaJsonExactionHelper) {
        IJsonExactionHelper iJsonExactionHelperKta = idCaptureModule.getIJsonExactionHelperKta(ktaJsonExactionHelper);
        if (iJsonExactionHelperKta != null) {
            return iJsonExactionHelperKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
