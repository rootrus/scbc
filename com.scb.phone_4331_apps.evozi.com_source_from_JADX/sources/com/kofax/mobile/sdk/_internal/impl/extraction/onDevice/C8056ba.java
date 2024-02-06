package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p082v.C8486d;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ba */
public final class C8056ba implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3932LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8486d> f3933ad;

    public C8056ba(C0705ah ahVar, HmlReviewDocumentActivity<C8486d> hmlReviewDocumentActivity) {
        this.f3932LV = ahVar;
        this.f3933ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3932LV.mo11695a(this.f3933ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: m */
    public static C8056ba m4094m(C0705ah ahVar, HmlReviewDocumentActivity<C8486d> hmlReviewDocumentActivity) {
        return new C8056ba(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4093a(C0705ah ahVar, C8486d dVar) {
        C8342c a = ahVar.mo11695a(dVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
