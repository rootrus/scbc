package com.kofax.mobile.sdk._internal.impl;

import android.content.Context;
import android.view.WindowManager;
import com.kofax.mobile.sdk._internal.IBus;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.n */
public final class C0731n implements OPRStatusRewardsLandingActivity_ViewBinding<C0730m> {

    /* renamed from: ws */
    private final HmlReviewDocumentActivity<Context> f1694ws;

    /* renamed from: wt */
    private final HmlReviewDocumentActivity<WindowManager> f1695wt;

    /* renamed from: wu */
    private final HmlReviewDocumentActivity<IBus> f1696wu;

    public C0731n(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<WindowManager> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity3) {
        this.f1694ws = hmlReviewDocumentActivity;
        this.f1695wt = hmlReviewDocumentActivity2;
        this.f1696wu = hmlReviewDocumentActivity3;
    }

    /* renamed from: hS */
    public final C0730m get() {
        return new C0730m(this.f1694ws.get(), this.f1695wt.get(), this.f1696wu.get());
    }

    /* renamed from: a */
    public static C0731n m1655a(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<WindowManager> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity3) {
        return new C0731n(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }
}
