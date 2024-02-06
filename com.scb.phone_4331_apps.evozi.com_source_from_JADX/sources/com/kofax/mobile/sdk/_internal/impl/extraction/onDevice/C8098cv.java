package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p070a.C8240b;
import com.kofax.mobile.sdk.p076h.C8398c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cv */
public final class C8098cv implements OPRStatusRewardsLandingActivity_ViewBinding<C8240b> {

    /* renamed from: LR */
    private final HmlReviewDocumentActivity<C8398c> f4037LR;

    /* renamed from: LV */
    private final C0705ah f4038LV;

    public C8098cv(C0705ah ahVar, HmlReviewDocumentActivity<C8398c> hmlReviewDocumentActivity) {
        this.f4038LV = ahVar;
        this.f4037LR = hmlReviewDocumentActivity;
    }

    /* renamed from: nZ */
    public final C8240b get() {
        C8240b b = this.f4038LV.mo11728b(this.f4037LR.get());
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: N */
    public static C8098cv m4220N(C0705ah ahVar, HmlReviewDocumentActivity<C8398c> hmlReviewDocumentActivity) {
        return new C8098cv(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8240b m4221a(C0705ah ahVar, C8398c cVar) {
        C8240b b = ahVar.mo11728b(cVar);
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
