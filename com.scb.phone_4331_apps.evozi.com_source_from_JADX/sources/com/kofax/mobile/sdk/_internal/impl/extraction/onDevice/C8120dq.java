package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7912h;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dq */
public final class C8120dq implements OPRStatusRewardsLandingActivity_ViewBinding<C7912h> {

    /* renamed from: LV */
    private final C0705ah f4092LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8141en> f4093ad;

    public C8120dq(C0705ah ahVar, HmlReviewDocumentActivity<C8141en> hmlReviewDocumentActivity) {
        this.f4092LV = ahVar;
        this.f4093ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nH */
    public final C7912h get() {
        C7912h a = this.f4092LV.mo11651a(this.f4093ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: ac */
    public static C8120dq m4286ac(C0705ah ahVar, HmlReviewDocumentActivity<C8141en> hmlReviewDocumentActivity) {
        return new C8120dq(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7912h m4285a(C0705ah ahVar, C8141en enVar) {
        C7912h a = ahVar.mo11651a(enVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
