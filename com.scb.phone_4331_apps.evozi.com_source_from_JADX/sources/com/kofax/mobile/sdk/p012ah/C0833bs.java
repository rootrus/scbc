package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import com.kofax.mobile.sdk._internal.impl.camera.C0571aq;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.bs */
public final class C0833bs implements OPRStatusRewardsLandingActivity_ViewBinding<IVideoResourceProvider> {

    /* renamed from: Yo */
    private final C0830bn f2026Yo;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0571aq> f2027ad;

    public C0833bs(C0830bn bnVar, HmlReviewDocumentActivity<C0571aq> hmlReviewDocumentActivity) {
        this.f2026Yo = bnVar;
        this.f2027ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tz */
    public final IVideoResourceProvider get() {
        IVideoResourceProvider a = this.f2026Yo.mo12042a(this.f2027ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: e */
    public static C0833bs m2080e(C0830bn bnVar, HmlReviewDocumentActivity<C0571aq> hmlReviewDocumentActivity) {
        return new C0833bs(bnVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static IVideoResourceProvider m2079a(C0830bn bnVar, C0571aq aqVar) {
        IVideoResourceProvider a = bnVar.mo12042a(aqVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
