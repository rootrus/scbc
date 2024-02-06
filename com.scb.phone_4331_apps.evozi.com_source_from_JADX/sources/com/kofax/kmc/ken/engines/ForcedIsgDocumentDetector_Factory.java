package com.kofax.kmc.ken.engines;

import com.kofax.mobile.sdk.p026o.C0983c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class ForcedIsgDocumentDetector_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<C0441e> {

    /* renamed from: Z */
    private final HmlReviewDocumentActivity<C0983c> f65Z;

    public ForcedIsgDocumentDetector_Factory(HmlReviewDocumentActivity<C0983c> hmlReviewDocumentActivity) {
        this.f65Z = hmlReviewDocumentActivity;
    }

    public final C0441e get() {
        return new C0441e(this.f65Z.get());
    }

    public static ForcedIsgDocumentDetector_Factory create(HmlReviewDocumentActivity<C0983c> hmlReviewDocumentActivity) {
        return new ForcedIsgDocumentDetector_Factory(hmlReviewDocumentActivity);
    }

    public static C0441e newForcedIsgDocumentDetector(C0983c cVar) {
        return new C0441e(cVar);
    }
}
