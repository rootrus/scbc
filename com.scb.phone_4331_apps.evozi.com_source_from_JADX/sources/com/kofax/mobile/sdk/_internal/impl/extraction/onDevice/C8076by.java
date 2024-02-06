package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7915l;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.by */
public final class C8076by implements OPRStatusRewardsLandingActivity_ViewBinding<C7915l> {

    /* renamed from: LV */
    private final C0705ah f3980LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8133ef> f3981ad;

    public C8076by(C0705ah ahVar, HmlReviewDocumentActivity<C8133ef> hmlReviewDocumentActivity) {
        this.f3980LV = ahVar;
        this.f3981ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nM */
    public final C7915l get() {
        C7915l a = this.f3980LV.mo11658a(this.f3981ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: A */
    public static C8076by m4153A(C0705ah ahVar, HmlReviewDocumentActivity<C8133ef> hmlReviewDocumentActivity) {
        return new C8076by(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7915l m4154a(C0705ah ahVar, C8133ef efVar) {
        C7915l a = ahVar.mo11658a(efVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
