package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C0512u;
import com.kofax.mobile.sdk._internal.impl.camera.C0570ao;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.br */
public final class C0832br implements OPRStatusRewardsLandingActivity_ViewBinding<C0512u> {

    /* renamed from: Yo */
    private final C0830bn f2024Yo;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0570ao> f2025ad;

    public C0832br(C0830bn bnVar, HmlReviewDocumentActivity<C0570ao> hmlReviewDocumentActivity) {
        this.f2024Yo = bnVar;
        this.f2025ad = hmlReviewDocumentActivity;
    }

    /* renamed from: ty */
    public final C0512u get() {
        C0512u a = this.f2024Yo.mo12045a(this.f2025ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: d */
    public static C0832br m2077d(C0830bn bnVar, HmlReviewDocumentActivity<C0570ao> hmlReviewDocumentActivity) {
        return new C0832br(bnVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0512u m2076a(C0830bn bnVar, C0570ao aoVar) {
        C0512u a = bnVar.mo12045a(aoVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
