package com.kofax.mobile.sdk._internal.impl.camera.focus;

import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.C0503i;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.o */
public final class C0601o implements MileageQuantitySelectionActivity<C0598m> {

    /* renamed from: EQ */
    private final HmlReviewDocumentActivity<C0503i> f1431EQ;

    /* renamed from: ER */
    private final HmlReviewDocumentActivity<C0503i> f1432ER;

    /* renamed from: ES */
    private final HmlReviewDocumentActivity<C0503i> f1433ES;

    /* renamed from: kc */
    private final HmlReviewDocumentActivity<C0499e> f1434kc;

    public C0601o(HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0499e> hmlReviewDocumentActivity4) {
        this.f1431EQ = hmlReviewDocumentActivity;
        this.f1432ER = hmlReviewDocumentActivity2;
        this.f1433ES = hmlReviewDocumentActivity3;
        this.f1434kc = hmlReviewDocumentActivity4;
    }

    public static MileageQuantitySelectionActivity<C0598m> create(HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0499e> hmlReviewDocumentActivity4) {
        return new C0601o(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    /* renamed from: a */
    public final void injectMembers(C0598m mVar) {
        m1305a(mVar, this.f1431EQ.get());
        m1306b(mVar, this.f1432ER.get());
        m1307c(mVar, this.f1433ES.get());
        m1304a(mVar, this.f1434kc.get());
    }

    /* renamed from: a */
    public static void m1305a(C0598m mVar, C0503i iVar) {
        mVar.f1417EL = iVar;
    }

    /* renamed from: b */
    public static void m1306b(C0598m mVar, C0503i iVar) {
        mVar.f1418EM = iVar;
    }

    /* renamed from: c */
    public static void m1307c(C0598m mVar, C0503i iVar) {
        mVar.f1419EN = iVar;
    }

    /* renamed from: a */
    public static void m1304a(C0598m mVar, C0499e eVar) {
        mVar.f1416AB = eVar;
    }
}
