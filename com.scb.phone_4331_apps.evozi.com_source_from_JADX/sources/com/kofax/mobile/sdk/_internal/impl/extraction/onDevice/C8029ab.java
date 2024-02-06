package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.C7904g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0529g;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ab */
public final class C8029ab implements OPRStatusRewardsLandingActivity_ViewBinding<C8028aa> {

    /* renamed from: LG */
    private final HmlReviewDocumentActivity<C0529g> f3873LG;

    /* renamed from: LI */
    private final HmlReviewDocumentActivity<C7904g> f3874LI;

    public C8029ab(HmlReviewDocumentActivity<C7904g> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0529g> hmlReviewDocumentActivity2) {
        this.f3874LI = hmlReviewDocumentActivity;
        this.f3873LG = hmlReviewDocumentActivity2;
    }

    /* renamed from: nj */
    public final C8028aa get() {
        return new C8028aa(this.f3874LI.get(), this.f3873LG.get());
    }

    /* renamed from: q */
    public static C8029ab m4025q(HmlReviewDocumentActivity<C7904g> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0529g> hmlReviewDocumentActivity2) {
        return new C8029ab(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
