package com.kofax.mobile.sdk._internal.impl.camera.focus;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0504j;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.b */
public final class C0582b implements OPRStatusRewardsLandingActivity_ViewBinding<C0579a> {

    /* renamed from: Eb */
    private final HmlReviewDocumentActivity<IBus> f1371Eb;

    /* renamed from: Ec */
    private final HmlReviewDocumentActivity<C0504j> f1372Ec;

    public C0582b(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0504j> hmlReviewDocumentActivity2) {
        this.f1371Eb = hmlReviewDocumentActivity;
        this.f1372Ec = hmlReviewDocumentActivity2;
    }

    /* renamed from: kv */
    public final C0579a get() {
        C0579a aVar = new C0579a(this.f1371Eb.get());
        C0583c.m1244a(aVar, this.f1371Eb.get());
        C0583c.m1245a(aVar, this.f1372Ec.get());
        return aVar;
    }

    /* renamed from: j */
    public static C0582b m1242j(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0504j> hmlReviewDocumentActivity2) {
        return new C0582b(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C0579a m1241a(IBus iBus) {
        return new C0579a(iBus);
    }
}
