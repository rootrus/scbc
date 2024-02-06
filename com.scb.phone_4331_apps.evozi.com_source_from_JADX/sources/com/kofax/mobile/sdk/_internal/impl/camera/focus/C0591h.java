package com.kofax.mobile.sdk._internal.impl.camera.focus;

import com.kofax.mobile.sdk._internal.camera.C0504j;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.h */
public final class C0591h implements MileageQuantitySelectionActivity<C0586f> {

    /* renamed from: Ec */
    private final HmlReviewDocumentActivity<C0504j> f1393Ec;

    public C0591h(HmlReviewDocumentActivity<C0504j> hmlReviewDocumentActivity) {
        this.f1393Ec = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<C0586f> create(HmlReviewDocumentActivity<C0504j> hmlReviewDocumentActivity) {
        return new C0591h(hmlReviewDocumentActivity);
    }

    /* renamed from: h */
    public final void injectMembers(C0586f fVar) {
        m1274a(fVar, this.f1393Ec.get());
    }

    /* renamed from: a */
    public static void m1274a(C0586f fVar, C0504j jVar) {
        fVar.f1378DR = jVar;
    }
}
