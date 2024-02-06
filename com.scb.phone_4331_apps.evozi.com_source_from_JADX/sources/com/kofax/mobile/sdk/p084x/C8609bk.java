package com.kofax.mobile.sdk.p084x;

import com.kofax.mobile.sdk._internal.extraction.C7900b;
import com.kofax.mobile.sdk.p016b.C0863d;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.x.bk */
public final class C8609bk implements OPRStatusRewardsLandingActivity_ViewBinding<C8608bj> {

    /* renamed from: Jt */
    private final HmlReviewDocumentActivity<C7900b> f5295Jt;

    /* renamed from: Ln */
    private final HmlReviewDocumentActivity<C0863d> f5296Ln;

    public C8609bk(HmlReviewDocumentActivity<C7900b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0863d> hmlReviewDocumentActivity2) {
        this.f5295Jt = hmlReviewDocumentActivity;
        this.f5296Ln = hmlReviewDocumentActivity2;
    }

    /* renamed from: qb */
    public final C8608bj get() {
        return new C8608bj(this.f5295Jt.get(), this.f5296Ln.get());
    }

    /* renamed from: C */
    public static C8609bk m5502C(HmlReviewDocumentActivity<C7900b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0863d> hmlReviewDocumentActivity2) {
        return new C8609bk(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
