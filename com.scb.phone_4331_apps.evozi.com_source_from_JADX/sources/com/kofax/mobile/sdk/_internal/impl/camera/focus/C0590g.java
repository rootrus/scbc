package com.kofax.mobile.sdk._internal.impl.camera.focus;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0504j;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.g */
public final class C0590g implements OPRStatusRewardsLandingActivity_ViewBinding<C0586f> {

    /* renamed from: Ec */
    private final HmlReviewDocumentActivity<C0504j> f1391Ec;

    /* renamed from: wu */
    private final HmlReviewDocumentActivity<IBus> f1392wu;

    public C0590g(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0504j> hmlReviewDocumentActivity2) {
        this.f1392wu = hmlReviewDocumentActivity;
        this.f1391Ec = hmlReviewDocumentActivity2;
    }

    /* renamed from: kx */
    public final C0586f get() {
        C0586f fVar = new C0586f(this.f1392wu.get());
        C0591h.m1274a(fVar, this.f1391Ec.get());
        return fVar;
    }

    /* renamed from: k */
    public static C0590g m1272k(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0504j> hmlReviewDocumentActivity2) {
        return new C0590g(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: b */
    public static C0586f m1271b(IBus iBus) {
        return new C0586f(iBus);
    }
}
