package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8564x;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.az */
public final class C8054az implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3929LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8564x> f3930ad;

    public C8054az(C0705ah ahVar, HmlReviewDocumentActivity<C8564x> hmlReviewDocumentActivity) {
        this.f3929LV = ahVar;
        this.f3930ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3929LV.mo11709a(this.f3930ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: l */
    public static C8054az m4089l(C0705ah ahVar, HmlReviewDocumentActivity<C8564x> hmlReviewDocumentActivity) {
        return new C8054az(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4088a(C0705ah ahVar, C8564x xVar) {
        C8342c a = ahVar.mo11709a(xVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
