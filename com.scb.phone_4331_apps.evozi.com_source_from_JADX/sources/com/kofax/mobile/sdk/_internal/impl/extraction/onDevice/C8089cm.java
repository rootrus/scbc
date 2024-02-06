package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p070a.C8239a;
import com.kofax.mobile.sdk.p076h.C8401e;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cm */
public final class C8089cm implements OPRStatusRewardsLandingActivity_ViewBinding<C8239a> {

    /* renamed from: LR */
    private final HmlReviewDocumentActivity<C8401e> f4012LR;

    /* renamed from: LV */
    private final C0705ah f4013LV;

    public C8089cm(C0705ah ahVar, HmlReviewDocumentActivity<C8401e> hmlReviewDocumentActivity) {
        this.f4013LV = ahVar;
        this.f4012LR = hmlReviewDocumentActivity;
    }

    /* renamed from: nq */
    public final C8239a get() {
        C8239a a = this.f4013LV.mo11664a(this.f4012LR.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: L */
    public static C8089cm m4193L(C0705ah ahVar, HmlReviewDocumentActivity<C8401e> hmlReviewDocumentActivity) {
        return new C8089cm(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8239a m4194a(C0705ah ahVar, C8401e eVar) {
        C8239a a = ahVar.mo11664a(eVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
