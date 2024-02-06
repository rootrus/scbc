package com.kofax.mobile.sdk._internal.impl.camera.focus;

import com.kofax.mobile.sdk._internal.IBus;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.q */
public final class C0605q implements OPRStatusRewardsLandingActivity_ViewBinding<C0602p> {

    /* renamed from: Eb */
    private final HmlReviewDocumentActivity<IBus> f1441Eb;

    public C0605q(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity) {
        this.f1441Eb = hmlReviewDocumentActivity;
    }

    /* renamed from: kG */
    public final C0602p get() {
        C0602p pVar = new C0602p(this.f1441Eb.get());
        C0606r.m1321a(pVar, this.f1441Eb.get());
        return pVar;
    }

    /* renamed from: y */
    public static C0605q m1319y(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity) {
        return new C0605q(hmlReviewDocumentActivity);
    }

    /* renamed from: c */
    public static C0602p m1318c(IBus iBus) {
        return new C0602p(iBus);
    }
}
