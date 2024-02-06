package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8529ba;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dn */
public final class C8117dn implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4086LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8529ba> f4087ad;

    public C8117dn(C0705ah ahVar, HmlReviewDocumentActivity<C8529ba> hmlReviewDocumentActivity) {
        this.f4086LV = ahVar;
        this.f4087ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4086LV.mo11703a(this.f4087ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: Z */
    public static C8117dn m4276Z(C0705ah ahVar, HmlReviewDocumentActivity<C8529ba> hmlReviewDocumentActivity) {
        return new C8117dn(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4277a(C0705ah ahVar, C8529ba baVar) {
        C8342c a = ahVar.mo11703a(baVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
