package com.kofax.mobile.sdk.p084x;

import com.kofax.mobile.sdk._internal.extraction.C7900b;
import com.kofax.mobile.sdk.p016b.C0863d;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.x.bb */
public final class C8600bb implements OPRStatusRewardsLandingActivity_ViewBinding<C8599ba> {

    /* renamed from: Jt */
    private final HmlReviewDocumentActivity<C7900b> f5284Jt;

    /* renamed from: Ln */
    private final HmlReviewDocumentActivity<C0863d> f5285Ln;

    public C8600bb(HmlReviewDocumentActivity<C7900b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0863d> hmlReviewDocumentActivity2) {
        this.f5284Jt = hmlReviewDocumentActivity;
        this.f5285Ln = hmlReviewDocumentActivity2;
    }

    /* renamed from: pX */
    public final C8599ba get() {
        return new C8599ba(this.f5284Jt.get(), this.f5285Ln.get());
    }

    /* renamed from: y */
    public static C8600bb m5481y(HmlReviewDocumentActivity<C7900b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0863d> hmlReviewDocumentActivity2) {
        return new C8600bb(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
