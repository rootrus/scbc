package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8518aq;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.di */
public final class C8112di implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4076LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8518aq> f4077ad;

    public C8112di(C0705ah ahVar, HmlReviewDocumentActivity<C8518aq> hmlReviewDocumentActivity) {
        this.f4076LV = ahVar;
        this.f4077ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4076LV.mo11698a(this.f4077ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: U */
    public static C8112di m4261U(C0705ah ahVar, HmlReviewDocumentActivity<C8518aq> hmlReviewDocumentActivity) {
        return new C8112di(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4262a(C0705ah ahVar, C8518aq aqVar) {
        C8342c a = ahVar.mo11698a(aqVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
