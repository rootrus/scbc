package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7908c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ct */
public final class C8096ct implements OPRStatusRewardsLandingActivity_ViewBinding<C7908c> {

    /* renamed from: LV */
    private final C0705ah f4032LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8171w> f4033ad;

    public C8096ct(C0705ah ahVar, HmlReviewDocumentActivity<C8171w> hmlReviewDocumentActivity) {
        this.f4032LV = ahVar;
        this.f4033ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nz */
    public final C7908c get() {
        C7908c a = this.f4032LV.mo11646a(this.f4033ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: M */
    public static C8096ct m4214M(C0705ah ahVar, HmlReviewDocumentActivity<C8171w> hmlReviewDocumentActivity) {
        return new C8096ct(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: c */
    public static C7908c m4215c(C0705ah ahVar, Object obj) {
        C7908c a = ahVar.mo11646a((C8171w) obj);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
