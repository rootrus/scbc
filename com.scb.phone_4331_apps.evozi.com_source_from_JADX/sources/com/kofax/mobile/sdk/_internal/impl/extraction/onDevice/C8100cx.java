package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8624o;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cx */
public final class C8100cx implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4041LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8624o> f4042LX;

    public C8100cx(C0705ah ahVar, HmlReviewDocumentActivity<C8624o> hmlReviewDocumentActivity) {
        this.f4041LV = ahVar;
        this.f4042LX = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4041LV.mo11717a(this.f4042LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: P */
    public static C8100cx m4226P(C0705ah ahVar, HmlReviewDocumentActivity<C8624o> hmlReviewDocumentActivity) {
        return new C8100cx(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4227a(C0705ah ahVar, C8624o oVar) {
        C8342c a = ahVar.mo11717a(oVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
