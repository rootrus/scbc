package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.C7888b;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7911f;
import com.kofax.mobile.sdk.p070a.C8240b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ag */
public final class C8038ag implements OPRStatusRewardsLandingActivity_ViewBinding<C8035af> {

    /* renamed from: LR */
    private final HmlReviewDocumentActivity<C8240b> f3888LR;

    /* renamed from: LS */
    private final HmlReviewDocumentActivity<C7911f> f3889LS;

    /* renamed from: LT */
    private final HmlReviewDocumentActivity<C7888b> f3890LT;

    public C8038ag(HmlReviewDocumentActivity<C8240b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7911f> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7888b> hmlReviewDocumentActivity3) {
        this.f3888LR = hmlReviewDocumentActivity;
        this.f3889LS = hmlReviewDocumentActivity2;
        this.f3890LT = hmlReviewDocumentActivity3;
    }

    /* renamed from: nm */
    public final C8035af get() {
        return new C8035af(this.f3888LR.get(), this.f3889LS.get(), this.f3890LT.get());
    }

    /* renamed from: e */
    public static C8038ag m4041e(HmlReviewDocumentActivity<C8240b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7911f> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7888b> hmlReviewDocumentActivity3) {
        return new C8038ag(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    /* renamed from: a */
    public static C8035af m4040a(C8240b bVar, C7911f fVar, C7888b bVar2) {
        return new C8035af(bVar, fVar, bVar2);
    }
}
