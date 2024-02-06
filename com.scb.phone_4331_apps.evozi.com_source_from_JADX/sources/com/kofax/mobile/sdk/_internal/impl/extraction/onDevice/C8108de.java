package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7916m;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8606bh;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.de */
public final class C8108de implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4062LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8606bh> f4063LX;

    /* renamed from: Ml */
    private final HmlReviewDocumentActivity<C7916m> f4064Ml;

    /* renamed from: wN */
    private final HmlReviewDocumentActivity<C7919g> f4065wN;

    public C8108de(C0705ah ahVar, HmlReviewDocumentActivity<C8606bh> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7916m> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7919g> hmlReviewDocumentActivity3) {
        this.f4062LV = ahVar;
        this.f4063LX = hmlReviewDocumentActivity;
        this.f4064Ml = hmlReviewDocumentActivity2;
        this.f4065wN = hmlReviewDocumentActivity3;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4062LV.mo11714a(this.f4063LX.get(), this.f4064Ml.get(), this.f4065wN.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public static C8108de m4250c(C0705ah ahVar, HmlReviewDocumentActivity<C8606bh> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7916m> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7919g> hmlReviewDocumentActivity3) {
        return new C8108de(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    /* renamed from: a */
    public static C8342c m4249a(C0705ah ahVar, C8606bh bhVar, C7916m mVar, C7919g gVar) {
        C8342c a = ahVar.mo11714a(bhVar, mVar, gVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
