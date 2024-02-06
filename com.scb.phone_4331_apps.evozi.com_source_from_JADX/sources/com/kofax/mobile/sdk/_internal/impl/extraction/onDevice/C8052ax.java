package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p074d.C8336a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ax */
public final class C8052ax implements OPRStatusRewardsLandingActivity_ViewBinding<C8336a> {

    /* renamed from: LV */
    private final C0705ah f3925LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8151p> f3926ad;

    public C8052ax(C0705ah ahVar, HmlReviewDocumentActivity<C8151p> hmlReviewDocumentActivity) {
        this.f3925LV = ahVar;
        this.f3926ad = hmlReviewDocumentActivity;
    }

    /* renamed from: ns */
    public final C8336a get() {
        C8336a a = this.f3925LV.mo11676a(this.f3926ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: j */
    public static C8052ax m4083j(C0705ah ahVar, HmlReviewDocumentActivity<C8151p> hmlReviewDocumentActivity) {
        return new C8052ax(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8336a m4082a(C0705ah ahVar, C8151p pVar) {
        C8336a a = ahVar.mo11676a(pVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
