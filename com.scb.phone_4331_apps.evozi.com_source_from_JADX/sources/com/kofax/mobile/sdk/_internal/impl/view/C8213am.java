package com.kofax.mobile.sdk._internal.impl.view;

import com.kofax.mobile.sdk._internal.view.C0769a;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.am */
public final class C8213am implements MileageQuantitySelectionActivity<C8211ak> {

    /* renamed from: FD */
    private final HmlReviewDocumentActivity<C0769a> f4317FD;

    public C8213am(HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity) {
        this.f4317FD = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<C8211ak> create(HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity) {
        return new C8213am(hmlReviewDocumentActivity);
    }

    /* renamed from: b */
    public final void injectMembers(C8211ak akVar) {
        m4502a(akVar, this.f4317FD.get());
    }

    /* renamed from: a */
    public static void m4502a(C8211ak akVar, C0769a aVar) {
        akVar.f4294Vu = aVar;
    }
}
