package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7908c;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8590as;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cq */
public final class C8093cq implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4023LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8590as> f4024LX;

    /* renamed from: Mg */
    private final HmlReviewDocumentActivity<C7908c> f4025Mg;

    public C8093cq(C0705ah ahVar, HmlReviewDocumentActivity<C7908c> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8590as> hmlReviewDocumentActivity2) {
        this.f4023LV = ahVar;
        this.f4025Mg = hmlReviewDocumentActivity;
        this.f4024LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4023LV.mo11689a(this.f4025Mg.get(), this.f4024LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: u */
    public static C8093cq m4206u(C0705ah ahVar, HmlReviewDocumentActivity<C7908c> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8590as> hmlReviewDocumentActivity2) {
        return new C8093cq(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4205a(C0705ah ahVar, C7908c cVar, C8590as asVar) {
        C8342c a = ahVar.mo11689a(cVar, asVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
