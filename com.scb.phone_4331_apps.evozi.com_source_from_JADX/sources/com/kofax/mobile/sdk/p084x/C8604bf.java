package com.kofax.mobile.sdk.p084x;

import com.kofax.mobile.sdk._internal.extraction.C7900b;
import com.kofax.mobile.sdk.p016b.C0863d;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.x.bf */
public final class C8604bf implements OPRStatusRewardsLandingActivity_ViewBinding<C8603be> {

    /* renamed from: Jt */
    private final HmlReviewDocumentActivity<C7900b> f5290Jt;

    /* renamed from: Ln */
    private final HmlReviewDocumentActivity<C0863d> f5291Ln;

    public C8604bf(HmlReviewDocumentActivity<C7900b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0863d> hmlReviewDocumentActivity2) {
        this.f5290Jt = hmlReviewDocumentActivity;
        this.f5291Ln = hmlReviewDocumentActivity2;
    }

    /* renamed from: pZ */
    public final C8603be get() {
        return new C8603be(this.f5290Jt.get(), this.f5291Ln.get());
    }

    /* renamed from: A */
    public static C8604bf m5489A(HmlReviewDocumentActivity<C7900b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0863d> hmlReviewDocumentActivity2) {
        return new C8604bf(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
