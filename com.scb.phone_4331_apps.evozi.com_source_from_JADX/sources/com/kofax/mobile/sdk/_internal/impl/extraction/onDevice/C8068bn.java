package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bn */
public final class C8068bn implements OPRStatusRewardsLandingActivity_ViewBinding<C7910e> {

    /* renamed from: LV */
    private final C0705ah f3959LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8146j> f3960ad;

    public C8068bn(C0705ah ahVar, HmlReviewDocumentActivity<C8146j> hmlReviewDocumentActivity) {
        this.f3959LV = ahVar;
        this.f3960ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nC */
    public final C7910e get() {
        C7910e a = this.f3959LV.mo11648a(this.f3960ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: w */
    public static C8068bn m4130w(C0705ah ahVar, HmlReviewDocumentActivity<C8146j> hmlReviewDocumentActivity) {
        return new C8068bn(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7910e m4129a(C0705ah ahVar, C8146j jVar) {
        C7910e a = ahVar.mo11648a(jVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
