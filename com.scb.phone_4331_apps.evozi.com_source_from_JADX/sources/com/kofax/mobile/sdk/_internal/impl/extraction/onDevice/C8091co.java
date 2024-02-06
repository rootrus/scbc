package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7908c;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8586ao;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.co */
public final class C8091co implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4017LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8586ao> f4018LX;

    /* renamed from: Mg */
    private final HmlReviewDocumentActivity<C7908c> f4019Mg;

    public C8091co(C0705ah ahVar, HmlReviewDocumentActivity<C7908c> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8586ao> hmlReviewDocumentActivity2) {
        this.f4017LV = ahVar;
        this.f4019Mg = hmlReviewDocumentActivity;
        this.f4018LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4017LV.mo11687a(this.f4019Mg.get(), this.f4018LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: s */
    public static C8091co m4200s(C0705ah ahVar, HmlReviewDocumentActivity<C7908c> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8586ao> hmlReviewDocumentActivity2) {
        return new C8091co(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4199a(C0705ah ahVar, C7908c cVar, C8586ao aoVar) {
        C8342c a = ahVar.mo11687a(cVar, aoVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
