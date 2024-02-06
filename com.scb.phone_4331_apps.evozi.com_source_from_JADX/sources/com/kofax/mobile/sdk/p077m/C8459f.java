package com.kofax.mobile.sdk.p077m;

import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk.p073c.C8298b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.m.f */
public final class C8459f implements OPRStatusRewardsLandingActivity_ViewBinding<C8457e> {

    /* renamed from: Hl */
    private final HmlReviewDocumentActivity<C8298b> f5033Hl;

    /* renamed from: wN */
    private final HmlReviewDocumentActivity<C7919g> f5034wN;

    public C8459f(HmlReviewDocumentActivity<C8298b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7919g> hmlReviewDocumentActivity2) {
        this.f5033Hl = hmlReviewDocumentActivity;
        this.f5034wN = hmlReviewDocumentActivity2;
    }

    /* renamed from: lM */
    public final C8457e get() {
        return new C8457e(this.f5033Hl.get(), this.f5034wN.get());
    }

    /* renamed from: n */
    public static C8459f m5083n(HmlReviewDocumentActivity<C8298b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7919g> hmlReviewDocumentActivity2) {
        return new C8459f(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8457e m5082a(C8298b bVar, C7919g gVar) {
        return new C8457e(bVar, gVar);
    }
}
