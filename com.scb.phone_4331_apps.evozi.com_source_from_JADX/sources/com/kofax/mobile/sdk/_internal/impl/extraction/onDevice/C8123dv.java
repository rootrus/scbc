package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p073c.C8299c;
import com.kofax.mobile.sdk.p077m.C8457e;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dv */
public final class C8123dv implements OPRStatusRewardsLandingActivity_ViewBinding<C8299c> {

    /* renamed from: LV */
    private final C0705ah f4098LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8457e> f4099ad;

    public C8123dv(C0705ah ahVar, HmlReviewDocumentActivity<C8457e> hmlReviewDocumentActivity) {
        this.f4098LV = ahVar;
        this.f4099ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nO */
    public final C8299c get() {
        C8299c a = this.f4098LV.mo11673a(this.f4099ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: ah */
    public static C8123dv m4295ah(C0705ah ahVar, HmlReviewDocumentActivity<C8457e> hmlReviewDocumentActivity) {
        return new C8123dv(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8299c m4294a(C0705ah ahVar, C8457e eVar) {
        C8299c a = ahVar.mo11673a(eVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
