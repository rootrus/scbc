package com.kofax.kmc.ken.engines;

import com.kofax.mobile.sdk.p026o.C0983c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class IsgDocumentDetector_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<C0464i> {

    /* renamed from: Z */
    private final HmlReviewDocumentActivity<C0983c> f148Z;

    public IsgDocumentDetector_Factory(HmlReviewDocumentActivity<C0983c> hmlReviewDocumentActivity) {
        this.f148Z = hmlReviewDocumentActivity;
    }

    public final C0464i get() {
        return new C0464i(this.f148Z.get());
    }

    public static IsgDocumentDetector_Factory create(HmlReviewDocumentActivity<C0983c> hmlReviewDocumentActivity) {
        return new IsgDocumentDetector_Factory(hmlReviewDocumentActivity);
    }

    public static C0464i newIsgDocumentDetector(C0983c cVar) {
        return new C0464i(cVar);
    }
}
