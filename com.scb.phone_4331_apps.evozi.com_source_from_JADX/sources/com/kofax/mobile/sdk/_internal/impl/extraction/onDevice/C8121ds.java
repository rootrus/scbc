package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7913j;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ds */
public final class C8121ds implements OPRStatusRewardsLandingActivity_ViewBinding<C7913j> {

    /* renamed from: LV */
    private final C0705ah f4094LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8028aa> f4095ad;

    public C8121ds(C0705ah ahVar, HmlReviewDocumentActivity<C8028aa> hmlReviewDocumentActivity) {
        this.f4094LV = ahVar;
        this.f4095ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nJ */
    public final C7913j get() {
        C7913j a = this.f4094LV.mo11655a(this.f4095ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: ae */
    public static C8121ds m4289ae(C0705ah ahVar, HmlReviewDocumentActivity<C8028aa> hmlReviewDocumentActivity) {
        return new C8121ds(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7913j m4288a(C0705ah ahVar, C8028aa aaVar) {
        C7913j a = ahVar.mo11655a(aaVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
