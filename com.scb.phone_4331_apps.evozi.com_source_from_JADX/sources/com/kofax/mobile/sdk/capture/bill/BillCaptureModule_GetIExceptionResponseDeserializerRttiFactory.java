package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.extraction.IExceptionResponseDeserializer;
import com.kofax.mobile.sdk.capture.bill.BillCaptureModule;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillCaptureModule_GetIExceptionResponseDeserializerRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IExceptionResponseDeserializer> {

    /* renamed from: Zt */
    private final BillCaptureModule f4570Zt;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<BillCaptureModule.RttiExceptionResponseDeserializer> f4571ad;

    public BillCaptureModule_GetIExceptionResponseDeserializerRttiFactory(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<BillCaptureModule.RttiExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        this.f4570Zt = billCaptureModule;
        this.f4571ad = hmlReviewDocumentActivity;
    }

    public final IExceptionResponseDeserializer get() {
        IExceptionResponseDeserializer iExceptionResponseDeserializerRtti = this.f4570Zt.getIExceptionResponseDeserializerRtti(this.f4571ad.get());
        if (iExceptionResponseDeserializerRtti != null) {
            return iExceptionResponseDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static BillCaptureModule_GetIExceptionResponseDeserializerRttiFactory create(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<BillCaptureModule.RttiExceptionResponseDeserializer> hmlReviewDocumentActivity) {
        return new BillCaptureModule_GetIExceptionResponseDeserializerRttiFactory(billCaptureModule, hmlReviewDocumentActivity);
    }

    public static IExceptionResponseDeserializer proxyGetIExceptionResponseDeserializerRtti(BillCaptureModule billCaptureModule, Object obj) {
        IExceptionResponseDeserializer iExceptionResponseDeserializerRtti = billCaptureModule.getIExceptionResponseDeserializerRtti((BillCaptureModule.RttiExceptionResponseDeserializer) obj);
        if (iExceptionResponseDeserializerRtti != null) {
            return iExceptionResponseDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
