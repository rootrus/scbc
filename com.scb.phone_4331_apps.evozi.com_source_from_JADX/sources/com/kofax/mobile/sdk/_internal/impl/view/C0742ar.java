package com.kofax.mobile.sdk._internal.impl.view;

import com.kofax.mobile.sdk._internal.view.C0769a;
import com.kofax.mobile.sdk._internal.view.C0776j;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.ar */
public final class C0742ar implements MileageQuantitySelectionActivity<C0740ap> {

    /* renamed from: FD */
    private final HmlReviewDocumentActivity<C0769a> f1741FD;

    /* renamed from: Wc */
    private final HmlReviewDocumentActivity<C0776j> f1742Wc;

    public C0742ar(HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0776j> hmlReviewDocumentActivity2) {
        this.f1741FD = hmlReviewDocumentActivity;
        this.f1742Wc = hmlReviewDocumentActivity2;
    }

    public static MileageQuantitySelectionActivity<C0740ap> create(HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0776j> hmlReviewDocumentActivity2) {
        return new C0742ar(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: b */
    public final void injectMembers(C0740ap apVar) {
        m1700a(apVar, this.f1741FD.get());
        m1701a(apVar, this.f1742Wc.get());
    }

    /* renamed from: a */
    public static void m1700a(C0740ap apVar, C0769a aVar) {
        apVar.f1731Vu = aVar;
    }

    /* renamed from: a */
    public static void m1701a(C0740ap apVar, C0776j jVar) {
        apVar.f1730VS = jVar;
    }
}
