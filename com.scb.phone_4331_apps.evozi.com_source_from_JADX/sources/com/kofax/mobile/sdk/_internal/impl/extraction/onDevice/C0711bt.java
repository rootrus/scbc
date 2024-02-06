package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C0530i;
import com.kofax.mobile.sdk.p029y.C0999j;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bt */
public final class C0711bt implements OPRStatusRewardsLandingActivity_ViewBinding<C0530i> {

    /* renamed from: LV */
    private final C0705ah f1649LV;

    /* renamed from: Me */
    private final HmlReviewDocumentActivity<C0999j> f1650Me;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0530i> f1651ad;

    public C0711bt(C0705ah ahVar, HmlReviewDocumentActivity<C0999j> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0530i> hmlReviewDocumentActivity2) {
        this.f1649LV = ahVar;
        this.f1650Me = hmlReviewDocumentActivity;
        this.f1651ad = hmlReviewDocumentActivity2;
    }

    /* renamed from: nI */
    public final C0530i get() {
        C0530i a = this.f1649LV.mo11654a(this.f1650Me.get(), this.f1651ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: k */
    public static C0711bt m1600k(C0705ah ahVar, HmlReviewDocumentActivity<C0999j> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0530i> hmlReviewDocumentActivity2) {
        return new C0711bt(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C0530i m1599a(C0705ah ahVar, C0999j jVar, C0530i iVar) {
        C0530i a = ahVar.mo11654a(jVar, iVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
