package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7916m;
import com.kofax.mobile.sdk.p083w.C8510ak;
import com.kofax.mobile.sdk.p084x.C8599ba;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cy */
public final class C8101cy implements OPRStatusRewardsLandingActivity_ViewBinding<C8510ak> {

    /* renamed from: LV */
    private final C0705ah f4043LV;

    /* renamed from: Ml */
    private final HmlReviewDocumentActivity<C7916m> f4044Ml;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8599ba> f4045ad;

    /* renamed from: wN */
    private final HmlReviewDocumentActivity<C7919g> f4046wN;

    public C8101cy(C0705ah ahVar, HmlReviewDocumentActivity<C8599ba> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7916m> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7919g> hmlReviewDocumentActivity3) {
        this.f4043LV = ahVar;
        this.f4045ad = hmlReviewDocumentActivity;
        this.f4044Ml = hmlReviewDocumentActivity2;
        this.f4046wN = hmlReviewDocumentActivity3;
    }

    /* renamed from: oa */
    public final C8510ak get() {
        C8510ak a = this.f4043LV.mo11723a(this.f4045ad.get(), this.f4044Ml.get(), this.f4046wN.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C8101cy m4229a(C0705ah ahVar, HmlReviewDocumentActivity<C8599ba> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7916m> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7919g> hmlReviewDocumentActivity3) {
        return new C8101cy(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    /* renamed from: a */
    public static C8510ak m4230a(C0705ah ahVar, C8599ba baVar, C7916m mVar, C7919g gVar) {
        C8510ak a = ahVar.mo11723a(baVar, mVar, gVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
