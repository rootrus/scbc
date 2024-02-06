package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.C0528e;
import com.kofax.mobile.sdk._internal.impl.extraction.C0702f;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cf */
public final class C0713cf implements OPRStatusRewardsLandingActivity_ViewBinding<C0528e> {

    /* renamed from: LV */
    private final C0705ah f1655LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0702f> f1656ad;

    public C0713cf(C0705ah ahVar, HmlReviewDocumentActivity<C0702f> hmlReviewDocumentActivity) {
        this.f1655LV = ahVar;
        this.f1656ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nT */
    public final C0528e get() {
        C0528e a = this.f1655LV.mo11641a(this.f1656ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: F */
    public static C0713cf m1605F(C0705ah ahVar, HmlReviewDocumentActivity<C0702f> hmlReviewDocumentActivity) {
        return new C0713cf(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0528e m1606a(C0705ah ahVar, C0702f fVar) {
        C0528e a = ahVar.mo11641a(fVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
