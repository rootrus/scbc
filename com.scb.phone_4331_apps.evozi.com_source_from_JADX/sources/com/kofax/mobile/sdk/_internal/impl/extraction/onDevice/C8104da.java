package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7916m;
import com.kofax.mobile.sdk.p083w.C8510ak;
import com.kofax.mobile.sdk.p084x.C8603be;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.da */
public final class C8104da implements OPRStatusRewardsLandingActivity_ViewBinding<C8510ak> {

    /* renamed from: LV */
    private final C0705ah f4052LV;

    /* renamed from: Ml */
    private final HmlReviewDocumentActivity<C7916m> f4053Ml;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8603be> f4054ad;

    /* renamed from: wN */
    private final HmlReviewDocumentActivity<C7919g> f4055wN;

    public C8104da(C0705ah ahVar, HmlReviewDocumentActivity<C8603be> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7916m> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7919g> hmlReviewDocumentActivity3) {
        this.f4052LV = ahVar;
        this.f4054ad = hmlReviewDocumentActivity;
        this.f4053Ml = hmlReviewDocumentActivity2;
        this.f4055wN = hmlReviewDocumentActivity3;
    }

    /* renamed from: oa */
    public final C8510ak get() {
        C8510ak a = this.f4052LV.mo11724a(this.f4054ad.get(), this.f4053Ml.get(), this.f4055wN.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C8104da m4238b(C0705ah ahVar, HmlReviewDocumentActivity<C8603be> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7916m> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7919g> hmlReviewDocumentActivity3) {
        return new C8104da(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    /* renamed from: a */
    public static C8510ak m4237a(C0705ah ahVar, C8603be beVar, C7916m mVar, C7919g gVar) {
        C8510ak a = ahVar.mo11724a(beVar, mVar, gVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
