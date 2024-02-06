package com.kofax.mobile.sdk._internal.impl.camera;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.C0506n;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0598m;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.i */
public final class C0618i implements OPRStatusRewardsLandingActivity_ViewBinding<C0608h> {

    /* renamed from: Bb */
    private final HmlReviewDocumentActivity<C0499e> f1489Bb;

    /* renamed from: Bc */
    private final HmlReviewDocumentActivity<C0577f> f1490Bc;

    /* renamed from: Bd */
    private final HmlReviewDocumentActivity<C0506n> f1491Bd;

    /* renamed from: Be */
    private final HmlReviewDocumentActivity<C0598m> f1492Be;

    /* renamed from: wu */
    private final HmlReviewDocumentActivity<IBus> f1493wu;

    public C0618i(HmlReviewDocumentActivity<C0499e> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0577f> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0506n> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0598m> hmlReviewDocumentActivity5) {
        this.f1489Bb = hmlReviewDocumentActivity;
        this.f1490Bc = hmlReviewDocumentActivity2;
        this.f1493wu = hmlReviewDocumentActivity3;
        this.f1491Bd = hmlReviewDocumentActivity4;
        this.f1492Be = hmlReviewDocumentActivity5;
    }

    /* renamed from: jL */
    public final C0608h get() {
        return new C0608h(this.f1489Bb.get(), this.f1490Bc.get(), this.f1493wu.get(), this.f1491Bd.get(), this.f1492Be.get());
    }

    /* renamed from: b */
    public static C0618i m1378b(HmlReviewDocumentActivity<C0499e> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0577f> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0506n> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0598m> hmlReviewDocumentActivity5) {
        return new C0618i(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }
}
