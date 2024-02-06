package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7906a;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8570aa;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bd */
public final class C8059bd implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3939LV;

    /* renamed from: LW */
    private final HmlReviewDocumentActivity<C7906a> f3940LW;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8570aa> f3941LX;

    public C8059bd(C0705ah ahVar, HmlReviewDocumentActivity<C7906a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8570aa> hmlReviewDocumentActivity2) {
        this.f3939LV = ahVar;
        this.f3940LW = hmlReviewDocumentActivity;
        this.f3941LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3939LV.mo11679a(this.f3940LW.get(), this.f3941LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: f */
    public static C8059bd m4103f(C0705ah ahVar, HmlReviewDocumentActivity<C7906a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8570aa> hmlReviewDocumentActivity2) {
        return new C8059bd(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4102a(C0705ah ahVar, C7906a aVar, C8570aa aaVar) {
        C8342c a = ahVar.mo11679a(aVar, aaVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
