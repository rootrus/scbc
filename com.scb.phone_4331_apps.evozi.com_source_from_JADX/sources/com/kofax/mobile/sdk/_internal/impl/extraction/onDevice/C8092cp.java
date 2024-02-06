package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7908c;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8588aq;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cp */
public final class C8092cp implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4020LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8588aq> f4021LX;

    /* renamed from: Mg */
    private final HmlReviewDocumentActivity<C7908c> f4022Mg;

    public C8092cp(C0705ah ahVar, HmlReviewDocumentActivity<C7908c> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8588aq> hmlReviewDocumentActivity2) {
        this.f4020LV = ahVar;
        this.f4022Mg = hmlReviewDocumentActivity;
        this.f4021LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4020LV.mo11688a(this.f4022Mg.get(), this.f4021LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: t */
    public static C8092cp m4203t(C0705ah ahVar, HmlReviewDocumentActivity<C7908c> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8588aq> hmlReviewDocumentActivity2) {
        return new C8092cp(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4202a(C0705ah ahVar, C7908c cVar, C8588aq aqVar) {
        C8342c a = ahVar.mo11688a(cVar, aqVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
