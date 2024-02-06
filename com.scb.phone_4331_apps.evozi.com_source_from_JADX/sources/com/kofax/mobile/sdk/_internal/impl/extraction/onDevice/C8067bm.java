package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p016b.C8295a;
import com.kofax.mobile.sdk.p021i.C8406e;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bm */
public final class C8067bm implements OPRStatusRewardsLandingActivity_ViewBinding<C8295a> {

    /* renamed from: LV */
    private final C0705ah f3957LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8406e> f3958ad;

    public C8067bm(C0705ah ahVar, HmlReviewDocumentActivity<C8406e> hmlReviewDocumentActivity) {
        this.f3957LV = ahVar;
        this.f3958ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nB */
    public final C8295a get() {
        C8295a a = this.f3957LV.mo11665a(this.f3958ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: v */
    public static C8067bm m4127v(C0705ah ahVar, HmlReviewDocumentActivity<C8406e> hmlReviewDocumentActivity) {
        return new C8067bm(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8295a m4126a(C0705ah ahVar, C8406e eVar) {
        C8295a a = ahVar.mo11665a(eVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
