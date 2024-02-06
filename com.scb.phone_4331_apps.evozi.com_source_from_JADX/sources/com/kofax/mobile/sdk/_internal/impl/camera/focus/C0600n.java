package com.kofax.mobile.sdk._internal.impl.camera.focus;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.C0503i;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.n */
public final class C0600n implements OPRStatusRewardsLandingActivity_ViewBinding<C0598m> {

    /* renamed from: EQ */
    private final HmlReviewDocumentActivity<C0503i> f1425EQ;

    /* renamed from: ER */
    private final HmlReviewDocumentActivity<C0503i> f1426ER;

    /* renamed from: ES */
    private final HmlReviewDocumentActivity<C0503i> f1427ES;

    /* renamed from: Ew */
    private final HmlReviewDocumentActivity<C0597k> f1428Ew;

    /* renamed from: kc */
    private final HmlReviewDocumentActivity<C0499e> f1429kc;

    /* renamed from: wu */
    private final HmlReviewDocumentActivity<IBus> f1430wu;

    public C0600n(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0597k> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C0499e> hmlReviewDocumentActivity6) {
        this.f1430wu = hmlReviewDocumentActivity;
        this.f1428Ew = hmlReviewDocumentActivity2;
        this.f1425EQ = hmlReviewDocumentActivity3;
        this.f1426ER = hmlReviewDocumentActivity4;
        this.f1427ES = hmlReviewDocumentActivity5;
        this.f1429kc = hmlReviewDocumentActivity6;
    }

    /* renamed from: kF */
    public final C0598m get() {
        C0598m mVar = new C0598m(this.f1430wu.get(), this.f1428Ew.get());
        C0601o.m1305a(mVar, this.f1425EQ.get());
        C0601o.m1306b(mVar, this.f1426ER.get());
        C0601o.m1307c(mVar, this.f1427ES.get());
        C0601o.m1304a(mVar, this.f1429kc.get());
        return mVar;
    }

    /* renamed from: a */
    public static C0600n m1302a(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0597k> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C0499e> hmlReviewDocumentActivity6) {
        return new C0600n(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    /* renamed from: a */
    public static C0598m m1301a(IBus iBus, C0597k kVar) {
        return new C0598m(iBus, kVar);
    }
}
