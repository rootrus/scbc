package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8520as;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dj */
public final class C8113dj implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4078LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8520as> f4079ad;

    public C8113dj(C0705ah ahVar, HmlReviewDocumentActivity<C8520as> hmlReviewDocumentActivity) {
        this.f4078LV = ahVar;
        this.f4079ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4078LV.mo11699a(this.f4079ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: V */
    public static C8113dj m4264V(C0705ah ahVar, HmlReviewDocumentActivity<C8520as> hmlReviewDocumentActivity) {
        return new C8113dj(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4265a(C0705ah ahVar, C8520as asVar) {
        C8342c a = ahVar.mo11699a(asVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
