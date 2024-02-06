package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p016b.C0862c;
import com.kofax.mobile.sdk.p021i.C0919c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dt */
public final class C0717dt implements OPRStatusRewardsLandingActivity_ViewBinding<C0862c> {

    /* renamed from: LV */
    private final C0705ah f1663LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0919c> f1664ad;

    public C0717dt(C0705ah ahVar, HmlReviewDocumentActivity<C0919c> hmlReviewDocumentActivity) {
        this.f1663LV = ahVar;
        this.f1664ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nK */
    public final C0862c get() {
        C0862c a = this.f1663LV.mo11668a(this.f1664ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: af */
    public static C0717dt m1617af(C0705ah ahVar, HmlReviewDocumentActivity<C0919c> hmlReviewDocumentActivity) {
        return new C0717dt(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0862c m1616a(C0705ah ahVar, C0919c cVar) {
        C0862c a = ahVar.mo11668a(cVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
