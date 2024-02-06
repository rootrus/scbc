package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8601bc;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.db */
public final class C8105db implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4056LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8601bc> f4057ad;

    public C8105db(C0705ah ahVar, HmlReviewDocumentActivity<C8601bc> hmlReviewDocumentActivity) {
        this.f4056LV = ahVar;
        this.f4057ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4056LV.mo11713a(this.f4057ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: R */
    public static C8105db m4240R(C0705ah ahVar, HmlReviewDocumentActivity<C8601bc> hmlReviewDocumentActivity) {
        return new C8105db(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4241a(C0705ah ahVar, C8601bc bcVar) {
        C8342c a = ahVar.mo11713a(bcVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
