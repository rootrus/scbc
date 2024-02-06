package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.C7900b;
import com.kofax.mobile.sdk._internal.impl.extraction.C7986b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cc */
public final class C8082cc implements OPRStatusRewardsLandingActivity_ViewBinding<C7900b> {

    /* renamed from: LV */
    private final C0705ah f3996LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C7986b> f3997ad;

    public C8082cc(C0705ah ahVar, HmlReviewDocumentActivity<C7986b> hmlReviewDocumentActivity) {
        this.f3996LV = ahVar;
        this.f3997ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nQ */
    public final C7900b get() {
        C7900b a = this.f3996LV.mo11639a(this.f3997ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: D */
    public static C8082cc m4172D(C0705ah ahVar, HmlReviewDocumentActivity<C7986b> hmlReviewDocumentActivity) {
        return new C8082cc(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7900b m4173a(C0705ah ahVar, C7986b bVar) {
        C7900b a = ahVar.mo11639a(bVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
