package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7906a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bh */
public final class C8063bh implements OPRStatusRewardsLandingActivity_ViewBinding<C7906a> {

    /* renamed from: LV */
    private final C0705ah f3949LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8035af> f3950ad;

    public C8063bh(C0705ah ahVar, HmlReviewDocumentActivity<C8035af> hmlReviewDocumentActivity) {
        this.f3949LV = ahVar;
        this.f3950ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nw */
    public final C7906a get() {
        C7906a a = this.f3949LV.mo11644a(this.f3950ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: q */
    public static C8063bh m4115q(C0705ah ahVar, HmlReviewDocumentActivity<C8035af> hmlReviewDocumentActivity) {
        return new C8063bh(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7906a m4114a(C0705ah ahVar, C8035af afVar) {
        C7906a a = ahVar.mo11644a(afVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
