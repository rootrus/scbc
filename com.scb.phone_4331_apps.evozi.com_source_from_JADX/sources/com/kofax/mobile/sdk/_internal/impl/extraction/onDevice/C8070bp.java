package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p029y.C8637d;
import com.kofax.mobile.sdk.p073c.C8298b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bp */
public final class C8070bp implements OPRStatusRewardsLandingActivity_ViewBinding<C8298b> {

    /* renamed from: LV */
    private final C0705ah f3963LV;

    /* renamed from: Me */
    private final HmlReviewDocumentActivity<C8637d> f3964Me;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8298b> f3965ad;

    public C8070bp(C0705ah ahVar, HmlReviewDocumentActivity<C8637d> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8298b> hmlReviewDocumentActivity2) {
        this.f3963LV = ahVar;
        this.f3964Me = hmlReviewDocumentActivity;
        this.f3965ad = hmlReviewDocumentActivity2;
    }

    /* renamed from: nE */
    public final C8298b get() {
        C8298b a = this.f3963LV.mo11672a(this.f3964Me.get(), this.f3965ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: h */
    public static C8070bp m4136h(C0705ah ahVar, HmlReviewDocumentActivity<C8637d> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8298b> hmlReviewDocumentActivity2) {
        return new C8070bp(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8298b m4135a(C0705ah ahVar, C8637d dVar, C8298b bVar) {
        C8298b a = ahVar.mo11672a(dVar, bVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
