package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.extract.p018id.IProjectProvider;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dc */
public final class C8106dc implements OPRStatusRewardsLandingActivity_ViewBinding<IProjectProvider> {

    /* renamed from: LV */
    private final C0705ah f4058LV;

    /* renamed from: zS */
    private final HmlReviewDocumentActivity<C0704a> f4059zS;

    public C8106dc(C0705ah ahVar, HmlReviewDocumentActivity<C0704a> hmlReviewDocumentActivity) {
        this.f4058LV = ahVar;
        this.f4059zS = hmlReviewDocumentActivity;
    }

    /* renamed from: mP */
    public final IProjectProvider get() {
        IProjectProvider a = this.f4058LV.mo11720a(this.f4059zS.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: S */
    public static C8106dc m4243S(C0705ah ahVar, HmlReviewDocumentActivity<C0704a> hmlReviewDocumentActivity) {
        return new C8106dc(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static IProjectProvider m4244a(C0705ah ahVar, C0704a aVar) {
        IProjectProvider a = ahVar.mo11720a(aVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
