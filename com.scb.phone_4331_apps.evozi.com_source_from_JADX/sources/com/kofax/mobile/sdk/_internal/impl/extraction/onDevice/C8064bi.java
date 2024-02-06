package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7907b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bi */
public final class C8064bi implements OPRStatusRewardsLandingActivity_ViewBinding<C7907b> {

    /* renamed from: LV */
    private final C0705ah f3951LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8078c> f3952ad;

    public C8064bi(C0705ah ahVar, HmlReviewDocumentActivity<C8078c> hmlReviewDocumentActivity) {
        this.f3951LV = ahVar;
        this.f3952ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nx */
    public final C7907b get() {
        C7907b b = this.f3951LV.mo11727b(this.f3952ad.get());
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: r */
    public static C8064bi m4118r(C0705ah ahVar, HmlReviewDocumentActivity<C8078c> hmlReviewDocumentActivity) {
        return new C8064bi(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7907b m4117a(C0705ah ahVar, C8078c cVar) {
        C7907b b = ahVar.mo11727b(cVar);
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
