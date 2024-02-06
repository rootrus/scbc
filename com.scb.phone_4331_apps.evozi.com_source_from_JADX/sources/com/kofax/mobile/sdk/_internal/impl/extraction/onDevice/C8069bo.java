package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7911f;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bo */
public final class C8069bo implements OPRStatusRewardsLandingActivity_ViewBinding<C7911f> {

    /* renamed from: LV */
    private final C0705ah f3961LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8167t> f3962ad;

    public C8069bo(C0705ah ahVar, HmlReviewDocumentActivity<C8167t> hmlReviewDocumentActivity) {
        this.f3961LV = ahVar;
        this.f3962ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nD */
    public final C7911f get() {
        C7911f a = this.f3961LV.mo11649a(this.f3962ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: x */
    public static C8069bo m4133x(C0705ah ahVar, HmlReviewDocumentActivity<C8167t> hmlReviewDocumentActivity) {
        return new C8069bo(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7911f m4132a(C0705ah ahVar, Object obj) {
        C7911f a = ahVar.mo11649a((C8167t) obj);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
