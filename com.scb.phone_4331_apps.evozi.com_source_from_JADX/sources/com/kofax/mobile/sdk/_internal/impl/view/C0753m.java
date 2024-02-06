package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import com.kofax.mobile.sdk._internal.capture.C0517g;
import com.kofax.mobile.sdk._internal.view.C0769a;
import com.kofax.mobile.sdk._internal.view.C0775i;
import com.kofax.mobile.sdk._internal.view.C0776j;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.m */
public final class C0753m implements OPRStatusRewardsLandingActivity_ViewBinding<C0751l> {

    /* renamed from: FD */
    private final HmlReviewDocumentActivity<C0769a> f1785FD;

    /* renamed from: Wb */
    private final HmlReviewDocumentActivity<C0775i> f1786Wb;

    /* renamed from: Wc */
    private final HmlReviewDocumentActivity<C0776j> f1787Wc;

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f1788X;

    /* renamed from: na */
    private final HmlReviewDocumentActivity<C0517g> f1789na;

    public C0753m(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0775i> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0517g> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0776j> hmlReviewDocumentActivity5) {
        this.f1788X = hmlReviewDocumentActivity;
        this.f1786Wb = hmlReviewDocumentActivity2;
        this.f1785FD = hmlReviewDocumentActivity3;
        this.f1789na = hmlReviewDocumentActivity4;
        this.f1787Wc = hmlReviewDocumentActivity5;
    }

    /* renamed from: rP */
    public final C0751l get() {
        C0751l lVar = new C0751l(this.f1788X.get());
        C0754n.m1732a(lVar, this.f1786Wb.get());
        C0754n.m1731a(lVar, this.f1785FD.get());
        C0754n.m1730a(lVar, this.f1789na.get());
        C0754n.m1733a(lVar, this.f1787Wc.get());
        return lVar;
    }

    /* renamed from: d */
    public static C0753m m1727d(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0775i> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0517g> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0776j> hmlReviewDocumentActivity5) {
        return new C0753m(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    /* renamed from: k */
    public static C0751l m1728k(Context context) {
        return new C0751l(context);
    }
}
