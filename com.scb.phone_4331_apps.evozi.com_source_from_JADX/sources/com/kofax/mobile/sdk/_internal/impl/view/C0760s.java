package com.kofax.mobile.sdk._internal.impl.view;

import com.kofax.mobile.sdk._internal.capture.C0517g;
import com.kofax.mobile.sdk._internal.view.C0769a;
import com.kofax.mobile.sdk._internal.view.C0776j;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.s */
public final class C0760s implements MileageQuantitySelectionActivity<C0757q> {

    /* renamed from: FD */
    private final HmlReviewDocumentActivity<C0769a> f1856FD;

    /* renamed from: Wc */
    private final HmlReviewDocumentActivity<C0776j> f1857Wc;

    /* renamed from: na */
    private final HmlReviewDocumentActivity<C0517g> f1858na;

    public C0760s(HmlReviewDocumentActivity<C0517g> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0776j> hmlReviewDocumentActivity3) {
        this.f1858na = hmlReviewDocumentActivity;
        this.f1856FD = hmlReviewDocumentActivity2;
        this.f1857Wc = hmlReviewDocumentActivity3;
    }

    public static MileageQuantitySelectionActivity<C0757q> create(HmlReviewDocumentActivity<C0517g> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0776j> hmlReviewDocumentActivity3) {
        return new C0760s(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    /* renamed from: b */
    public final void injectMembers(C0757q qVar) {
        m1766a(qVar, this.f1858na.get());
        m1767a(qVar, this.f1856FD.get());
        m1768a(qVar, this.f1857Wc.get());
    }

    /* renamed from: a */
    public static void m1766a(C0757q qVar, C0517g gVar) {
        qVar.f1809VR = gVar;
    }

    /* renamed from: a */
    public static void m1767a(C0757q qVar, C0769a aVar) {
        qVar.f1811Vu = aVar;
    }

    /* renamed from: a */
    public static void m1768a(C0757q qVar, C0776j jVar) {
        qVar.f1810VS = jVar;
    }
}
