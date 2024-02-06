package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p016b.C0862c;
import com.kofax.mobile.sdk.p029y.C1002n;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bv */
public final class C0712bv implements OPRStatusRewardsLandingActivity_ViewBinding<C0862c> {

    /* renamed from: LV */
    private final C0705ah f1652LV;

    /* renamed from: Me */
    private final HmlReviewDocumentActivity<C1002n> f1653Me;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0862c> f1654ad;

    public C0712bv(C0705ah ahVar, HmlReviewDocumentActivity<C1002n> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0862c> hmlReviewDocumentActivity2) {
        this.f1652LV = ahVar;
        this.f1653Me = hmlReviewDocumentActivity;
        this.f1654ad = hmlReviewDocumentActivity2;
    }

    /* renamed from: nK */
    public final C0862c get() {
        C0862c a = this.f1652LV.mo11669a(this.f1653Me.get(), this.f1654ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: m */
    public static C0712bv m1603m(C0705ah ahVar, HmlReviewDocumentActivity<C1002n> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0862c> hmlReviewDocumentActivity2) {
        return new C0712bv(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C0862c m1602a(C0705ah ahVar, C1002n nVar, C0862c cVar) {
        C0862c a = ahVar.mo11669a(nVar, cVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
