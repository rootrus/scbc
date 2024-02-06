package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p073c.C8298b;
import com.kofax.mobile.sdk.p077m.C8455c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.do */
public final class C8118do implements OPRStatusRewardsLandingActivity_ViewBinding<C8298b> {

    /* renamed from: LV */
    private final C0705ah f4088LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8455c> f4089ad;

    public C8118do(C0705ah ahVar, HmlReviewDocumentActivity<C8455c> hmlReviewDocumentActivity) {
        this.f4088LV = ahVar;
        this.f4089ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nE */
    public final C8298b get() {
        C8298b a = this.f4088LV.mo11671a(this.f4089ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: aa */
    public static C8118do m4280aa(C0705ah ahVar, HmlReviewDocumentActivity<C8455c> hmlReviewDocumentActivity) {
        return new C8118do(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8298b m4279a(C0705ah ahVar, C8455c cVar) {
        C8298b a = ahVar.mo11671a(cVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
