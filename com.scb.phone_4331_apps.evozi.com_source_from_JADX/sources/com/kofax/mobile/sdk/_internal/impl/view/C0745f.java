package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import com.kofax.mobile.sdk._internal.view.C0769a;
import com.kofax.mobile.sdk._internal.view.C0778o;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.f */
public final class C0745f implements OPRStatusRewardsLandingActivity_ViewBinding<C0744e> {

    /* renamed from: FD */
    private final HmlReviewDocumentActivity<C0769a> f1747FD;

    /* renamed from: Vx */
    private final HmlReviewDocumentActivity<C0778o> f1748Vx;

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f1749X;

    public C0745f(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0778o> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity3) {
        this.f1749X = hmlReviewDocumentActivity;
        this.f1748Vx = hmlReviewDocumentActivity2;
        this.f1747FD = hmlReviewDocumentActivity3;
    }

    /* renamed from: rJ */
    public final C0744e get() {
        C0744e eVar = new C0744e(this.f1749X.get(), this.f1748Vx.get());
        C0746g.m1709a(eVar, this.f1747FD.get());
        return eVar;
    }

    /* renamed from: i */
    public static C0745f m1707i(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0778o> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity3) {
        return new C0745f(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    /* renamed from: a */
    public static C0744e m1706a(Context context, C0778o oVar) {
        return new C0744e(context, oVar);
    }
}
