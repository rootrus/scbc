package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p083w.C8490a;
import com.kofax.mobile.sdk.p084x.C8569a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.aj */
public final class C8039aj implements OPRStatusRewardsLandingActivity_ViewBinding<C8490a.C8492a> {

    /* renamed from: LV */
    private final C0705ah f3891LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8569a> f3892ad;

    public C8039aj(C0705ah ahVar, HmlReviewDocumentActivity<C8569a> hmlReviewDocumentActivity) {
        this.f3891LV = ahVar;
        this.f3892ad = hmlReviewDocumentActivity;
    }

    /* renamed from: np */
    public final C8490a.C8492a get() {
        C8490a.C8492a a = this.f3891LV.mo11722a(this.f3892ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C8039aj m4043a(C0705ah ahVar, HmlReviewDocumentActivity<C8569a> hmlReviewDocumentActivity) {
        return new C8039aj(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8490a.C8492a m4044a(C0705ah ahVar, C8569a aVar) {
        C8490a.C8492a a = ahVar.mo11722a(aVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
