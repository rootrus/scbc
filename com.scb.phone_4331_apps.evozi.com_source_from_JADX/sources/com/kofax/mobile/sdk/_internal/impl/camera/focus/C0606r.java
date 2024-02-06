package com.kofax.mobile.sdk._internal.impl.camera.focus;

import com.kofax.mobile.sdk._internal.IBus;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.r */
public final class C0606r implements MileageQuantitySelectionActivity<C0602p> {

    /* renamed from: ka */
    private final HmlReviewDocumentActivity<IBus> f1442ka;

    public C0606r(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity) {
        this.f1442ka = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<C0602p> create(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity) {
        return new C0606r(hmlReviewDocumentActivity);
    }

    /* renamed from: c */
    public final void injectMembers(C0602p pVar) {
        m1321a(pVar, this.f1442ka.get());
    }

    /* renamed from: a */
    public static void m1321a(C0602p pVar, IBus iBus) {
        pVar._bus = iBus;
    }
}
