package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p016b.C0863d;
import com.kofax.mobile.sdk.p021i.C0921g;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ci */
public final class C0714ci implements OPRStatusRewardsLandingActivity_ViewBinding<C0863d> {

    /* renamed from: LV */
    private final C0705ah f1657LV;

    /* renamed from: Ln */
    private final HmlReviewDocumentActivity<C0921g> f1658Ln;

    public C0714ci(C0705ah ahVar, HmlReviewDocumentActivity<C0921g> hmlReviewDocumentActivity) {
        this.f1657LV = ahVar;
        this.f1658Ln = hmlReviewDocumentActivity;
    }

    /* renamed from: nW */
    public final C0863d get() {
        C0863d a = this.f1657LV.mo11670a(this.f1658Ln.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: I */
    public static C0714ci m1608I(C0705ah ahVar, HmlReviewDocumentActivity<C0921g> hmlReviewDocumentActivity) {
        return new C0714ci(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0863d m1609a(C0705ah ahVar, C0921g gVar) {
        C0863d a = ahVar.mo11670a(gVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
