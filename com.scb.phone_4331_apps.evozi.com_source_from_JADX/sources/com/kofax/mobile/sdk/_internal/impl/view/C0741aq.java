package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import com.kofax.mobile.sdk._internal.view.C0769a;
import com.kofax.mobile.sdk._internal.view.C0776j;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.aq */
public final class C0741aq implements OPRStatusRewardsLandingActivity_ViewBinding<C0740ap> {

    /* renamed from: FD */
    private final HmlReviewDocumentActivity<C0769a> f1738FD;

    /* renamed from: Wc */
    private final HmlReviewDocumentActivity<C0776j> f1739Wc;

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f1740X;

    public C0741aq(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0776j> hmlReviewDocumentActivity3) {
        this.f1740X = hmlReviewDocumentActivity;
        this.f1738FD = hmlReviewDocumentActivity2;
        this.f1739Wc = hmlReviewDocumentActivity3;
    }

    /* renamed from: so */
    public final C0740ap get() {
        C0740ap apVar = new C0740ap(this.f1740X.get());
        C0742ar.m1700a(apVar, this.f1738FD.get());
        C0742ar.m1701a(apVar, this.f1739Wc.get());
        return apVar;
    }

    /* renamed from: j */
    public static C0741aq m1697j(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0776j> hmlReviewDocumentActivity3) {
        return new C0741aq(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    /* renamed from: p */
    public static C0740ap m1698p(Context context) {
        return new C0740ap(context);
    }
}
