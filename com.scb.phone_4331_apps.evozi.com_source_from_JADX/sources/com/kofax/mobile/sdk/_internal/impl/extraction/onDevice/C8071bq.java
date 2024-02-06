package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p016b.C8296b;
import com.kofax.mobile.sdk.p021i.C8404a;
import com.kofax.mobile.sdk.p029y.C8640f;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bq */
public final class C8071bq implements OPRStatusRewardsLandingActivity_ViewBinding<C8296b> {

    /* renamed from: LV */
    private final C0705ah f3966LV;

    /* renamed from: Me */
    private final HmlReviewDocumentActivity<C8640f> f3967Me;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8404a> f3968ad;

    public C8071bq(C0705ah ahVar, HmlReviewDocumentActivity<C8640f> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8404a> hmlReviewDocumentActivity2) {
        this.f3966LV = ahVar;
        this.f3967Me = hmlReviewDocumentActivity;
        this.f3968ad = hmlReviewDocumentActivity2;
    }

    /* renamed from: nF */
    public final C8296b get() {
        C8296b a = this.f3966LV.mo11667a(this.f3967Me.get(), this.f3968ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: i */
    public static C8071bq m4139i(C0705ah ahVar, HmlReviewDocumentActivity<C8640f> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8404a> hmlReviewDocumentActivity2) {
        return new C8071bq(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8296b m4138a(C0705ah ahVar, C8640f fVar, C8404a aVar) {
        C8296b a = ahVar.mo11667a(fVar, aVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
