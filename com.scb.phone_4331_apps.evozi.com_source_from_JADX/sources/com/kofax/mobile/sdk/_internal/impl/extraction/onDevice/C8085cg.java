package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.C7904g;
import com.kofax.mobile.sdk._internal.impl.extraction.C7990h;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cg */
public final class C8085cg implements OPRStatusRewardsLandingActivity_ViewBinding<C7904g> {

    /* renamed from: LV */
    private final C0705ah f4003LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C7990h> f4004ad;

    public C8085cg(C0705ah ahVar, HmlReviewDocumentActivity<C7990h> hmlReviewDocumentActivity) {
        this.f4003LV = ahVar;
        this.f4004ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nU */
    public final C7904g get() {
        C7904g a = this.f4003LV.mo11642a(this.f4004ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: G */
    public static C8085cg m4181G(C0705ah ahVar, HmlReviewDocumentActivity<C7990h> hmlReviewDocumentActivity) {
        return new C8085cg(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7904g m4182a(C0705ah ahVar, C7990h hVar) {
        C7904g a = ahVar.mo11642a(hVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
