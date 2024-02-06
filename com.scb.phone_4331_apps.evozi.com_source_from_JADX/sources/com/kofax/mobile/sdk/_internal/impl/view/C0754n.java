package com.kofax.mobile.sdk._internal.impl.view;

import com.kofax.mobile.sdk._internal.capture.C0517g;
import com.kofax.mobile.sdk._internal.view.C0769a;
import com.kofax.mobile.sdk._internal.view.C0775i;
import com.kofax.mobile.sdk._internal.view.C0776j;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.n */
public final class C0754n implements MileageQuantitySelectionActivity<C0751l> {

    /* renamed from: FD */
    private final HmlReviewDocumentActivity<C0769a> f1790FD;

    /* renamed from: Wb */
    private final HmlReviewDocumentActivity<C0775i> f1791Wb;

    /* renamed from: Wc */
    private final HmlReviewDocumentActivity<C0776j> f1792Wc;

    /* renamed from: na */
    private final HmlReviewDocumentActivity<C0517g> f1793na;

    public C0754n(HmlReviewDocumentActivity<C0775i> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0517g> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0776j> hmlReviewDocumentActivity4) {
        this.f1791Wb = hmlReviewDocumentActivity;
        this.f1790FD = hmlReviewDocumentActivity2;
        this.f1793na = hmlReviewDocumentActivity3;
        this.f1792Wc = hmlReviewDocumentActivity4;
    }

    public static MileageQuantitySelectionActivity<C0751l> create(HmlReviewDocumentActivity<C0775i> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0517g> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0776j> hmlReviewDocumentActivity4) {
        return new C0754n(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    /* renamed from: b */
    public final void injectMembers(C0751l lVar) {
        m1732a(lVar, this.f1791Wb.get());
        m1731a(lVar, this.f1790FD.get());
        m1730a(lVar, this.f1793na.get());
        m1733a(lVar, this.f1792Wc.get());
    }

    /* renamed from: a */
    public static void m1732a(C0751l lVar, C0775i iVar) {
        lVar.f1773VQ = iVar;
    }

    /* renamed from: a */
    public static void m1731a(C0751l lVar, C0769a aVar) {
        lVar.f1776Vu = aVar;
    }

    /* renamed from: a */
    public static void m1730a(C0751l lVar, C0517g gVar) {
        lVar.f1774VR = gVar;
    }

    /* renamed from: a */
    public static void m1733a(C0751l lVar, C0776j jVar) {
        lVar.f1775VS = jVar;
    }
}
