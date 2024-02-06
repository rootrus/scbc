package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7916m;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dw */
public final class C8124dw implements OPRStatusRewardsLandingActivity_ViewBinding<C7916m> {

    /* renamed from: LV */
    private final C0705ah f4100LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8148n> f4101ad;

    public C8124dw(C0705ah ahVar, HmlReviewDocumentActivity<C8148n> hmlReviewDocumentActivity) {
        this.f4100LV = ahVar;
        this.f4101ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nR */
    public final C7916m get() {
        C7916m a = this.f4100LV.mo11659a(this.f4101ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: ai */
    public static C8124dw m4297ai(C0705ah ahVar, HmlReviewDocumentActivity<C8148n> hmlReviewDocumentActivity) {
        return new C8124dw(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: d */
    public static C7916m m4298d(C0705ah ahVar, Object obj) {
        C7916m a = ahVar.mo11659a((C8148n) obj);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
