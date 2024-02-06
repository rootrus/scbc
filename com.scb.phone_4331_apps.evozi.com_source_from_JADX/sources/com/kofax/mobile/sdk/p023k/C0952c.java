package com.kofax.mobile.sdk.p023k;

import android.content.Context;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.capture.C0516e;
import com.kofax.mobile.sdk._internal.impl.view.C0734a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.k.c */
public final class C0952c implements OPRStatusRewardsLandingActivity_ViewBinding<C0939b> {

    /* renamed from: FD */
    private final HmlReviewDocumentActivity<C0734a> f2294FD;

    /* renamed from: FE */
    private final HmlReviewDocumentActivity<C0516e> f2295FE;

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f2296X;

    /* renamed from: wu */
    private final HmlReviewDocumentActivity<IBus> f2297wu;

    public C0952c(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0734a> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0516e> hmlReviewDocumentActivity4) {
        this.f2296X = hmlReviewDocumentActivity;
        this.f2297wu = hmlReviewDocumentActivity2;
        this.f2294FD = hmlReviewDocumentActivity3;
        this.f2295FE = hmlReviewDocumentActivity4;
    }

    /* renamed from: lb */
    public final C0939b get() {
        C0939b bVar = new C0939b(this.f2296X.get(), this.f2297wu.get());
        C0953d.m2477a(bVar, this.f2294FD.get());
        C0953d.m2476a(bVar, this.f2295FE.get());
        return bVar;
    }

    /* renamed from: a */
    public static C0952c m2474a(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0734a> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0516e> hmlReviewDocumentActivity4) {
        return new C0952c(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    /* renamed from: a */
    public static C0939b m2473a(Context context, IBus iBus) {
        return new C0939b(context, iBus);
    }
}
