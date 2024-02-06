package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.C0528e;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0529g;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.z */
public final class C0724z implements OPRStatusRewardsLandingActivity_ViewBinding<C0723y> {

    /* renamed from: LE */
    private final HmlReviewDocumentActivity<C0528e> f1677LE;

    /* renamed from: LG */
    private final HmlReviewDocumentActivity<C0529g> f1678LG;

    public C0724z(HmlReviewDocumentActivity<C0528e> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0529g> hmlReviewDocumentActivity2) {
        this.f1677LE = hmlReviewDocumentActivity;
        this.f1678LG = hmlReviewDocumentActivity2;
    }

    /* renamed from: ni */
    public final C0723y get() {
        return new C0723y(this.f1677LE.get(), this.f1678LG.get());
    }

    /* renamed from: p */
    public static C0724z m1636p(HmlReviewDocumentActivity<C0528e> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0529g> hmlReviewDocumentActivity2) {
        return new C0724z(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
