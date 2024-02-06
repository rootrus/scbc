package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7907b;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8626q;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dx */
public final class C8125dx implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4102LV;

    /* renamed from: LW */
    private final HmlReviewDocumentActivity<C7907b> f4103LW;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8626q> f4104LX;

    public C8125dx(C0705ah ahVar, HmlReviewDocumentActivity<C7907b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8626q> hmlReviewDocumentActivity2) {
        this.f4102LV = ahVar;
        this.f4103LW = hmlReviewDocumentActivity;
        this.f4104LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4102LV.mo11685a(this.f4103LW.get(), this.f4104LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: A */
    public static C8125dx m4300A(C0705ah ahVar, HmlReviewDocumentActivity<C7907b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8626q> hmlReviewDocumentActivity2) {
        return new C8125dx(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4301a(C0705ah ahVar, C7907b bVar, C8626q qVar) {
        C8342c a = ahVar.mo11685a(bVar, qVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
