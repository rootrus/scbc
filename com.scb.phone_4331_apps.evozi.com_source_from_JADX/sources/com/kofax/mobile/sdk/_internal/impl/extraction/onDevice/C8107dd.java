package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8513am;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dd */
public final class C8107dd implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4060LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8513am> f4061ad;

    public C8107dd(C0705ah ahVar, HmlReviewDocumentActivity<C8513am> hmlReviewDocumentActivity) {
        this.f4060LV = ahVar;
        this.f4061ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4060LV.mo11697a(this.f4061ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: T */
    public static C8107dd m4246T(C0705ah ahVar, HmlReviewDocumentActivity<C8513am> hmlReviewDocumentActivity) {
        return new C8107dd(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4247a(C0705ah ahVar, C8513am amVar) {
        C8342c a = ahVar.mo11697a(amVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
