package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7909d;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bl */
public final class C8066bl implements OPRStatusRewardsLandingActivity_ViewBinding<C7909d> {

    /* renamed from: LV */
    private final C0705ah f3955LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8137ej> f3956ad;

    public C8066bl(C0705ah ahVar, HmlReviewDocumentActivity<C8137ej> hmlReviewDocumentActivity) {
        this.f3955LV = ahVar;
        this.f3956ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nA */
    public final C7909d get() {
        C7909d a = this.f3955LV.mo11647a(this.f3956ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: u */
    public static C8066bl m4124u(C0705ah ahVar, HmlReviewDocumentActivity<C8137ej> hmlReviewDocumentActivity) {
        return new C8066bl(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7909d m4123a(C0705ah ahVar, C8137ej ejVar) {
        C7909d a = ahVar.mo11647a(ejVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
