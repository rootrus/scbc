package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8526ay;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dm */
public final class C8116dm implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4084LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8526ay> f4085ad;

    public C8116dm(C0705ah ahVar, HmlReviewDocumentActivity<C8526ay> hmlReviewDocumentActivity) {
        this.f4084LV = ahVar;
        this.f4085ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4084LV.mo11702a(this.f4085ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: Y */
    public static C8116dm m4273Y(C0705ah ahVar, HmlReviewDocumentActivity<C8526ay> hmlReviewDocumentActivity) {
        return new C8116dm(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4274a(C0705ah ahVar, C8526ay ayVar) {
        C8342c a = ahVar.mo11702a(ayVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
