package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C0529g;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.br */
public final class C0710br implements OPRStatusRewardsLandingActivity_ViewBinding<C0529g> {

    /* renamed from: LV */
    private final C0705ah f1647LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0721l> f1648ad;

    public C0710br(C0705ah ahVar, HmlReviewDocumentActivity<C0721l> hmlReviewDocumentActivity) {
        this.f1647LV = ahVar;
        this.f1648ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nG */
    public final C0529g get() {
        C0529g a = this.f1647LV.mo11650a(this.f1648ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: y */
    public static C0710br m1597y(C0705ah ahVar, HmlReviewDocumentActivity<C0721l> hmlReviewDocumentActivity) {
        return new C0710br(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0529g m1596a(C0705ah ahVar, C0721l lVar) {
        C0529g a = ahVar.mo11650a(lVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
