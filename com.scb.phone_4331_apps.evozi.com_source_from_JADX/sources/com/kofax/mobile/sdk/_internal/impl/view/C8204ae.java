package com.kofax.mobile.sdk._internal.impl.view;

import com.kofax.mobile.sdk._internal.IBus;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.ae */
public final class C8204ae implements MileageQuantitySelectionActivity<C8201ad> {

    /* renamed from: ka */
    private final HmlReviewDocumentActivity<IBus> f4277ka;

    public C8204ae(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity) {
        this.f4277ka = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<C8201ad> create(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity) {
        return new C8204ae(hmlReviewDocumentActivity);
    }

    /* renamed from: b */
    public final void injectMembers(C8201ad adVar) {
        m4483a(adVar, this.f4277ka.get());
    }

    /* renamed from: a */
    public static void m4483a(C8201ad adVar, IBus iBus) {
        adVar._bus = iBus;
    }
}
