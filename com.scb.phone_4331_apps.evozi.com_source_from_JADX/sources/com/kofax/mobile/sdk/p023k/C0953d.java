package com.kofax.mobile.sdk.p023k;

import com.kofax.mobile.sdk._internal.capture.C0516e;
import com.kofax.mobile.sdk._internal.impl.view.C0734a;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk.k.d */
public final class C0953d implements MileageQuantitySelectionActivity<C0939b> {

    /* renamed from: FD */
    private final HmlReviewDocumentActivity<C0734a> f2298FD;

    /* renamed from: FE */
    private final HmlReviewDocumentActivity<C0516e> f2299FE;

    public C0953d(HmlReviewDocumentActivity<C0734a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0516e> hmlReviewDocumentActivity2) {
        this.f2298FD = hmlReviewDocumentActivity;
        this.f2299FE = hmlReviewDocumentActivity2;
    }

    public static MileageQuantitySelectionActivity<C0939b> create(HmlReviewDocumentActivity<C0734a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0516e> hmlReviewDocumentActivity2) {
        return new C0953d(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: l */
    public final void injectMembers(C0939b bVar) {
        m2477a(bVar, this.f2298FD.get());
        m2476a(bVar, this.f2299FE.get());
    }

    /* renamed from: a */
    public static void m2477a(C0939b bVar, C0734a aVar) {
        bVar.f2272Ft = aVar;
    }

    /* renamed from: a */
    public static void m2476a(C0939b bVar, C0516e eVar) {
        bVar.f2273Fu = eVar;
    }
}
