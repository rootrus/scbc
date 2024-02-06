package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8579ai;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cz */
public final class C8102cz implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4047LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8579ai> f4048LX;

    public C8102cz(C0705ah ahVar, HmlReviewDocumentActivity<C8579ai> hmlReviewDocumentActivity) {
        this.f4047LV = ahVar;
        this.f4048LX = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4047LV.mo11711a(this.f4048LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: Q */
    public static C8102cz m4232Q(C0705ah ahVar, HmlReviewDocumentActivity<C8579ai> hmlReviewDocumentActivity) {
        return new C8102cz(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4233a(C0705ah ahVar, C8579ai aiVar) {
        C8342c a = ahVar.mo11711a(aiVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
