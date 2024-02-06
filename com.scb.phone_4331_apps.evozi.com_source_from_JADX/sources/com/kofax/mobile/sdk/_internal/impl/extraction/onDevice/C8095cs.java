package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p082v.C8483a;
import com.kofax.mobile.sdk.p082v.C8488f;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cs */
public final class C8095cs implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4029LV;

    /* renamed from: Mh */
    private final HmlReviewDocumentActivity<C8488f> f4030Mh;

    /* renamed from: Mi */
    private final HmlReviewDocumentActivity<C8483a> f4031Mi;

    public C8095cs(C0705ah ahVar, HmlReviewDocumentActivity<C8488f> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8483a> hmlReviewDocumentActivity2) {
        this.f4029LV = ahVar;
        this.f4030Mh = hmlReviewDocumentActivity;
        this.f4031Mi = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4029LV.mo11696a(this.f4030Mh.get(), this.f4031Mi.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: w */
    public static C8095cs m4212w(C0705ah ahVar, HmlReviewDocumentActivity<C8488f> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8483a> hmlReviewDocumentActivity2) {
        return new C8095cs(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4211a(C0705ah ahVar, C8488f fVar, C8483a aVar) {
        C8342c a = ahVar.mo11696a(fVar, aVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
