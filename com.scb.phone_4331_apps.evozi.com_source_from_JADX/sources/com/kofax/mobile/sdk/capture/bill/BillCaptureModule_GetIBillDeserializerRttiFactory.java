package com.kofax.mobile.sdk.capture.bill;

import android.content.Context;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BillCaptureModule_GetIBillDeserializerRttiFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IBillDeserializer> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4565X;

    /* renamed from: Zt */
    private final BillCaptureModule f4566Zt;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<RttiBillExtractor> f4567ad;

    public BillCaptureModule_GetIBillDeserializerRttiFactory(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RttiBillExtractor> hmlReviewDocumentActivity2) {
        this.f4566Zt = billCaptureModule;
        this.f4565X = hmlReviewDocumentActivity;
        this.f4567ad = hmlReviewDocumentActivity2;
    }

    public final IBillDeserializer get() {
        IBillDeserializer iBillDeserializerRtti = this.f4566Zt.getIBillDeserializerRtti(this.f4565X.get(), this.f4567ad.get());
        if (iBillDeserializerRtti != null) {
            return iBillDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static BillCaptureModule_GetIBillDeserializerRttiFactory create(BillCaptureModule billCaptureModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<RttiBillExtractor> hmlReviewDocumentActivity2) {
        return new BillCaptureModule_GetIBillDeserializerRttiFactory(billCaptureModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public static IBillDeserializer proxyGetIBillDeserializerRtti(BillCaptureModule billCaptureModule, Context context, RttiBillExtractor rttiBillExtractor) {
        IBillDeserializer iBillDeserializerRtti = billCaptureModule.getIBillDeserializerRtti(context, rttiBillExtractor);
        if (iBillDeserializerRtti != null) {
            return iBillDeserializerRtti;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
