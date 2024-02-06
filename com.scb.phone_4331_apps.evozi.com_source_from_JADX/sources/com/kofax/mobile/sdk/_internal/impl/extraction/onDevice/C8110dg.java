package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8620k;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dg */
public final class C8110dg implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4070LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8620k> f4071LX;

    /* renamed from: Mm */
    private final HmlReviewDocumentActivity<C7910e> f4072Mm;

    public C8110dg(C0705ah ahVar, HmlReviewDocumentActivity<C8620k> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7910e> hmlReviewDocumentActivity2) {
        this.f4070LV = ahVar;
        this.f4071LX = hmlReviewDocumentActivity;
        this.f4072Mm = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4070LV.mo11716a(this.f4071LX.get(), this.f4072Mm.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: y */
    public static C8110dg m4256y(C0705ah ahVar, HmlReviewDocumentActivity<C8620k> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7910e> hmlReviewDocumentActivity2) {
        return new C8110dg(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4255a(C0705ah ahVar, C8620k kVar, C7910e eVar) {
        C8342c a = ahVar.mo11716a(kVar, eVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
