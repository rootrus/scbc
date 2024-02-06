package com.kofax.mobile.sdk.p083w;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7909d;
import com.kofax.mobile.sdk.p083w.C8559t;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.w.u */
public final class C8561u implements OPRStatusRewardsLandingActivity_ViewBinding<C8559t> {

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8559t.C8560a> f5244LX;

    /* renamed from: Md */
    private final HmlReviewDocumentActivity<C7909d> f5245Md;

    public C8561u(HmlReviewDocumentActivity<C8559t.C8560a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7909d> hmlReviewDocumentActivity2) {
        this.f5244LX = hmlReviewDocumentActivity;
        this.f5245Md = hmlReviewDocumentActivity2;
    }

    /* renamed from: oI */
    public final C8559t get() {
        return new C8559t(this.f5244LX.get(), this.f5245Md.get());
    }

    /* renamed from: t */
    public static C8561u m5351t(HmlReviewDocumentActivity<C8559t.C8560a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7909d> hmlReviewDocumentActivity2) {
        return new C8561u(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
