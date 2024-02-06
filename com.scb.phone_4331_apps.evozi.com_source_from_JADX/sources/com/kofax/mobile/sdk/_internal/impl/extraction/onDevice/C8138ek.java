package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7917o;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ek */
public final class C8138ek implements OPRStatusRewardsLandingActivity_ViewBinding<C8137ej> {

    /* renamed from: Mm */
    private final HmlReviewDocumentActivity<C7910e> f4160Mm;

    /* renamed from: NA */
    private final HmlReviewDocumentActivity<C7917o> f4161NA;

    public C8138ek(HmlReviewDocumentActivity<C7910e> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7917o> hmlReviewDocumentActivity2) {
        this.f4160Mm = hmlReviewDocumentActivity;
        this.f4161NA = hmlReviewDocumentActivity2;
    }

    /* renamed from: om */
    public final C8137ej get() {
        return new C8137ej(this.f4160Mm.get(), this.f4161NA.get());
    }

    /* renamed from: r */
    public static C8138ek m4328r(HmlReviewDocumentActivity<C7910e> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7917o> hmlReviewDocumentActivity2) {
        return new C8138ek(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8137ej m4327a(C7910e eVar, C7917o oVar) {
        return new C8137ej(eVar, oVar);
    }
}
