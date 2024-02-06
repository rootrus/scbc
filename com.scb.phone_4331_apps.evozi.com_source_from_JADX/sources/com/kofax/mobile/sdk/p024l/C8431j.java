package com.kofax.mobile.sdk.p024l;

import com.kofax.kmc.ken.engines.IPassportDetector;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.l.j */
public final class C8431j implements OPRStatusRewardsLandingActivity_ViewBinding<C8430i> {

    /* renamed from: ac */
    private final HmlReviewDocumentActivity<IPassportDetector> f5007ac;

    public C8431j(HmlReviewDocumentActivity<IPassportDetector> hmlReviewDocumentActivity) {
        this.f5007ac = hmlReviewDocumentActivity;
    }

    /* renamed from: lI */
    public final C8430i get() {
        return new C8430i(this.f5007ac.get());
    }

    /* renamed from: D */
    public static C8431j m4989D(HmlReviewDocumentActivity<IPassportDetector> hmlReviewDocumentActivity) {
        return new C8431j(hmlReviewDocumentActivity);
    }
}
