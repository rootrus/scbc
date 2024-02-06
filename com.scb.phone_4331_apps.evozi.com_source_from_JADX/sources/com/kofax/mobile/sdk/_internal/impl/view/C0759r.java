package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import com.kofax.mobile.sdk._internal.capture.C0517g;
import com.kofax.mobile.sdk._internal.view.C0769a;
import com.kofax.mobile.sdk._internal.view.C0776j;
import com.kofax.mobile.sdk._internal.view.C0778o;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.r */
public final class C0759r implements OPRStatusRewardsLandingActivity_ViewBinding<C0757q> {

    /* renamed from: FD */
    private final HmlReviewDocumentActivity<C0769a> f1851FD;

    /* renamed from: Vx */
    private final HmlReviewDocumentActivity<C0778o> f1852Vx;

    /* renamed from: Wc */
    private final HmlReviewDocumentActivity<C0776j> f1853Wc;

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f1854X;

    /* renamed from: na */
    private final HmlReviewDocumentActivity<C0517g> f1855na;

    public C0759r(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0778o> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0517g> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0776j> hmlReviewDocumentActivity5) {
        this.f1854X = hmlReviewDocumentActivity;
        this.f1852Vx = hmlReviewDocumentActivity2;
        this.f1855na = hmlReviewDocumentActivity3;
        this.f1851FD = hmlReviewDocumentActivity4;
        this.f1853Wc = hmlReviewDocumentActivity5;
    }

    /* renamed from: rY */
    public final C0757q get() {
        C0757q qVar = new C0757q(this.f1854X.get(), this.f1852Vx.get());
        C0760s.m1766a(qVar, this.f1855na.get());
        C0760s.m1767a(qVar, this.f1851FD.get());
        C0760s.m1768a(qVar, this.f1853Wc.get());
        return qVar;
    }

    /* renamed from: e */
    public static C0759r m1764e(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0778o> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0517g> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0776j> hmlReviewDocumentActivity5) {
        return new C0759r(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    /* renamed from: b */
    public static C0757q m1763b(Context context, C0778o oVar) {
        return new C0757q(context, oVar);
    }
}
