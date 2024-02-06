package com.kofax.mobile.sdk.capture.bill;

import android.content.Context;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillCaptureModule_GetIBillDeserializerKtaFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IBillDeserializer> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4562X;

    /* renamed from: Zt */
    private final BillCaptureModule f4563Zt;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<RttiBillExtractor> f4564ad;

    public BillCaptureModule_GetIBillDeserializerKtaFactory(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RttiBillExtractor> hmlReviewDocumentActivity2) {
        this.f4563Zt = billCaptureModule;
        this.f4562X = hmlReviewDocumentActivity;
        this.f4564ad = hmlReviewDocumentActivity2;
    }

    public final IBillDeserializer get() {
        IBillDeserializer iBillDeserializerKta = this.f4563Zt.getIBillDeserializerKta(this.f4562X.get(), this.f4564ad.get());
        if (iBillDeserializerKta != null) {
            return iBillDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static BillCaptureModule_GetIBillDeserializerKtaFactory create(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RttiBillExtractor> hmlReviewDocumentActivity2) {
        return new BillCaptureModule_GetIBillDeserializerKtaFactory(billCaptureModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public static IBillDeserializer proxyGetIBillDeserializerKta(BillCaptureModule billCaptureModule, Context context, RttiBillExtractor rttiBillExtractor) {
        IBillDeserializer iBillDeserializerKta = billCaptureModule.getIBillDeserializerKta(context, rttiBillExtractor);
        if (iBillDeserializerKta != null) {
            return iBillDeserializerKta;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
