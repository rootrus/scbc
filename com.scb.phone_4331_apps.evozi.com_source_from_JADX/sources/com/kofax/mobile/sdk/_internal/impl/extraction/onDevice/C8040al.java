package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p070a.C8239a;
import com.kofax.mobile.sdk.p076h.C8394a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.al */
public final class C8040al implements OPRStatusRewardsLandingActivity_ViewBinding<C8239a> {

    /* renamed from: LR */
    private final HmlReviewDocumentActivity<C8394a> f3893LR;

    /* renamed from: LV */
    private final C0705ah f3894LV;

    public C8040al(C0705ah ahVar, HmlReviewDocumentActivity<C8394a> hmlReviewDocumentActivity) {
        this.f3894LV = ahVar;
        this.f3893LR = hmlReviewDocumentActivity;
    }

    /* renamed from: nq */
    public final C8239a get() {
        C8239a a = this.f3894LV.mo11663a(this.f3893LR.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public static C8040al m4047c(C0705ah ahVar, HmlReviewDocumentActivity<C8394a> hmlReviewDocumentActivity) {
        return new C8040al(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8239a m4046a(C0705ah ahVar, C8394a aVar) {
        C8239a a = ahVar.mo11663a(aVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
