package com.kofax.mobile.sdk._internal.impl.view;

import com.kofax.mobile.sdk._internal.view.C0769a;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.g */
public final class C0746g implements MileageQuantitySelectionActivity<C0744e> {

    /* renamed from: FD */
    private final HmlReviewDocumentActivity<C0769a> f1750FD;

    public C0746g(HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity) {
        this.f1750FD = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<C0744e> create(HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity) {
        return new C0746g(hmlReviewDocumentActivity);
    }

    /* renamed from: b */
    public final void injectMembers(C0744e eVar) {
        m1709a(eVar, this.f1750FD.get());
    }

    /* renamed from: a */
    public static void m1709a(C0744e eVar, C0769a aVar) {
        eVar.f1744Vu = aVar;
    }
}
