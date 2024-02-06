package com.kofax.mobile.sdk.p083w;

import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7916m;
import com.kofax.mobile.sdk.p083w.C8510ak;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.w.al */
public final class C8512al implements OPRStatusRewardsLandingActivity_ViewBinding<C8510ak> {

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8510ak.C8511a> f5171LX;

    /* renamed from: Qv */
    private final HmlReviewDocumentActivity<C7916m> f5172Qv;

    /* renamed from: wN */
    private final HmlReviewDocumentActivity<C7919g> f5173wN;

    public C8512al(HmlReviewDocumentActivity<C8510ak.C8511a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7916m> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7919g> hmlReviewDocumentActivity3) {
        this.f5171LX = hmlReviewDocumentActivity;
        this.f5172Qv = hmlReviewDocumentActivity2;
        this.f5173wN = hmlReviewDocumentActivity3;
    }

    /* renamed from: oa */
    public final C8510ak get() {
        return new C8510ak(this.f5171LX.get(), this.f5172Qv.get(), this.f5173wN.get());
    }

    /* renamed from: f */
    public static C8512al m5240f(HmlReviewDocumentActivity<C8510ak.C8511a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7916m> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7919g> hmlReviewDocumentActivity3) {
        return new C8512al(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }
}
