package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillCaptureModule_GetIExceptionResponseDeserializerKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IExceptionResponseDeserializer> {

    /* renamed from: Zt */
    private final BillCaptureModule f4568Zt;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<BillCaptureModule.KtaExceptionResponseDeserializer> f4569ad;

    public BillCaptureModule_GetIExceptionResponseDeserializerKtaFactory(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<BillCaptureModule.KtaExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        this.f4568Zt = billCaptureModule;
        this.f4569ad = hmlReviewDocumentActivity;
    }

    public final IExceptionResponseDeserializer get() {
        IExceptionResponseDeserializer iExceptionResponseDeserializerKta = this.f4568Zt.getIExceptionResponseDeserializerKta(this.f4569ad.get());
        if (iExceptionResponseDeserializerKta != null) {
            return iExceptionResponseDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static BillCaptureModule_GetIExceptionResponseDeserializerKtaFactory create(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<BillCaptureModule.KtaExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        return new BillCaptureModule_GetIExceptionResponseDeserializerKtaFactory(billCaptureModule, hmlReviewDocumentActivity);
    }

    public static IExceptionResponseDeserializer proxyGetIExceptionResponseDeserializerKta(BillCaptureModule billCaptureModule, Object obj) {
        IExceptionResponseDeserializer iExceptionResponseDeserializerKta = billCaptureModule.getIExceptionResponseDeserializerKta((BillCaptureModule.KtaExceptionResponseDeserializer) obj);
        if (iExceptionResponseDeserializerKta != null) {
            return iExceptionResponseDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
