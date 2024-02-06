package com.kofax.mobile.sdk._internal.impl.camera.focus;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0504j;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.c */
public final class C0583c implements MileageQuantitySelectionActivity<C0579a> {

    /* renamed from: Ec */
    private final HmlReviewDocumentActivity<C0504j> f1373Ec;

    /* renamed from: ka */
    private final HmlReviewDocumentActivity<IBus> f1374ka;

    public C0583c(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0504j> hmlReviewDocumentActivity2) {
        this.f1374ka = hmlReviewDocumentActivity;
        this.f1373Ec = hmlReviewDocumentActivity2;
    }

    public static MileageQuantitySelectionActivity<C0579a> create(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0504j> hmlReviewDocumentActivity2) {
        return new C0583c(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: h */
    public final void injectMembers(C0579a aVar) {
        m1244a(aVar, this.f1374ka.get());
        m1245a(aVar, this.f1373Ec.get());
    }

    /* renamed from: a */
    public static void m1244a(C0579a aVar, IBus iBus) {
        aVar._bus = iBus;
    }

    /* renamed from: a */
    public static void m1245a(C0579a aVar, C0504j jVar) {
        aVar.f1359DR = jVar;
    }
}
