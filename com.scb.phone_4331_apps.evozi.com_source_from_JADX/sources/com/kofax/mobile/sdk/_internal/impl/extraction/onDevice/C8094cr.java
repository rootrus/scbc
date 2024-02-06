package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7908c;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8592au;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cr */
public final class C8094cr implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4026LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8592au> f4027LX;

    /* renamed from: Mg */
    private final HmlReviewDocumentActivity<C7908c> f4028Mg;

    public C8094cr(C0705ah ahVar, HmlReviewDocumentActivity<C7908c> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8592au> hmlReviewDocumentActivity2) {
        this.f4026LV = ahVar;
        this.f4028Mg = hmlReviewDocumentActivity;
        this.f4027LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4026LV.mo11690a(this.f4028Mg.get(), this.f4027LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: v */
    public static C8094cr m4209v(C0705ah ahVar, HmlReviewDocumentActivity<C7908c> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8592au> hmlReviewDocumentActivity2) {
        return new C8094cr(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4208a(C0705ah ahVar, C7908c cVar, C8592au auVar) {
        C8342c a = ahVar.mo11690a(cVar, auVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
