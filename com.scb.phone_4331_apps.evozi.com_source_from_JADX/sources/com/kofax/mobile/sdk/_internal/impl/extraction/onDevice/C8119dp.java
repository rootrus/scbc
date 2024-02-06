package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p016b.C8296b;
import com.kofax.mobile.sdk.p021i.C8404a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dp */
public final class C8119dp implements OPRStatusRewardsLandingActivity_ViewBinding<C8296b> {

    /* renamed from: LV */
    private final C0705ah f4090LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8404a> f4091ad;

    public C8119dp(C0705ah ahVar, HmlReviewDocumentActivity<C8404a> hmlReviewDocumentActivity) {
        this.f4090LV = ahVar;
        this.f4091ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nF */
    public final C8296b get() {
        C8296b a = this.f4090LV.mo11666a(this.f4091ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: ab */
    public static C8119dp m4283ab(C0705ah ahVar, HmlReviewDocumentActivity<C8404a> hmlReviewDocumentActivity) {
        return new C8119dp(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8296b m4282a(C0705ah ahVar, C8404a aVar) {
        C8296b a = ahVar.mo11666a(aVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
