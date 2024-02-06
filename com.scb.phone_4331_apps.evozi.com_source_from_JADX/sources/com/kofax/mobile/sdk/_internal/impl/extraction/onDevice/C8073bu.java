package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7913j;
import com.kofax.mobile.sdk.p029y.C8647l;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bu */
public final class C8073bu implements OPRStatusRewardsLandingActivity_ViewBinding<C7913j> {

    /* renamed from: LV */
    private final C0705ah f3972LV;

    /* renamed from: Me */
    private final HmlReviewDocumentActivity<C8647l> f3973Me;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C7913j> f3974ad;

    public C8073bu(C0705ah ahVar, HmlReviewDocumentActivity<C8647l> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7913j> hmlReviewDocumentActivity2) {
        this.f3972LV = ahVar;
        this.f3973Me = hmlReviewDocumentActivity;
        this.f3974ad = hmlReviewDocumentActivity2;
    }

    /* renamed from: nJ */
    public final C7913j get() {
        C7913j a = this.f3972LV.mo11656a(this.f3973Me.get(), this.f3974ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: l */
    public static C8073bu m4145l(C0705ah ahVar, HmlReviewDocumentActivity<C8647l> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7913j> hmlReviewDocumentActivity2) {
        return new C8073bu(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C7913j m4144a(C0705ah ahVar, C8647l lVar, C7913j jVar) {
        C7913j a = ahVar.mo11656a(lVar, jVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
