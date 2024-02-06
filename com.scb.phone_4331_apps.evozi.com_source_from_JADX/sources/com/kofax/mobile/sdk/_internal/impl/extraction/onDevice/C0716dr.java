package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C0530i;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dr */
public final class C0716dr implements OPRStatusRewardsLandingActivity_ViewBinding<C0530i> {

    /* renamed from: LV */
    private final C0705ah f1661LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0723y> f1662ad;

    public C0716dr(C0705ah ahVar, HmlReviewDocumentActivity<C0723y> hmlReviewDocumentActivity) {
        this.f1661LV = ahVar;
        this.f1662ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nI */
    public final C0530i get() {
        C0530i a = this.f1661LV.mo11653a(this.f1662ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: ad */
    public static C0716dr m1614ad(C0705ah ahVar, HmlReviewDocumentActivity<C0723y> hmlReviewDocumentActivity) {
        return new C0716dr(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0530i m1613a(C0705ah ahVar, C0723y yVar) {
        C0530i a = ahVar.mo11653a(yVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
