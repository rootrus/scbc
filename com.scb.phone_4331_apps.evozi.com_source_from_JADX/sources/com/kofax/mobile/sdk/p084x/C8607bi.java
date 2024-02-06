package com.kofax.mobile.sdk.p084x;

import com.kofax.mobile.sdk._internal.extraction.C7900b;
import com.kofax.mobile.sdk.p016b.C0863d;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.x.bi */
public final class C8607bi implements OPRStatusRewardsLandingActivity_ViewBinding<C8606bh> {

    /* renamed from: Jt */
    private final HmlReviewDocumentActivity<C7900b> f5293Jt;

    /* renamed from: Ln */
    private final HmlReviewDocumentActivity<C0863d> f5294Ln;

    public C8607bi(HmlReviewDocumentActivity<C7900b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0863d> hmlReviewDocumentActivity2) {
        this.f5293Jt = hmlReviewDocumentActivity;
        this.f5294Ln = hmlReviewDocumentActivity2;
    }

    /* renamed from: qa */
    public final C8606bh get() {
        return new C8606bh(this.f5293Jt.get(), this.f5294Ln.get());
    }

    /* renamed from: B */
    public static C8607bi m5496B(HmlReviewDocumentActivity<C7900b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0863d> hmlReviewDocumentActivity2) {
        return new C8607bi(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
