package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8524aw;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dl */
public final class C8115dl implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4082LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8524aw> f4083ad;

    public C8115dl(C0705ah ahVar, HmlReviewDocumentActivity<C8524aw> hmlReviewDocumentActivity) {
        this.f4082LV = ahVar;
        this.f4083ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4082LV.mo11701a(this.f4083ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: X */
    public static C8115dl m4270X(C0705ah ahVar, HmlReviewDocumentActivity<C8524aw> hmlReviewDocumentActivity) {
        return new C8115dl(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4271a(C0705ah ahVar, C8524aw awVar) {
        C8342c a = ahVar.mo11701a(awVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
