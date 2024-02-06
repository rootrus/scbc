package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C0502h;
import com.kofax.mobile.sdk._internal.impl.camera.C0542a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.bo */
public final class C8275bo implements OPRStatusRewardsLandingActivity_ViewBinding<C0502h> {

    /* renamed from: Yo */
    private final C0830bn f4445Yo;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0542a> f4446ad;

    public C8275bo(C0830bn bnVar, HmlReviewDocumentActivity<C0542a> hmlReviewDocumentActivity) {
        this.f4445Yo = bnVar;
        this.f4446ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tw */
    public final C0502h get() {
        C0502h b = this.f4445Yo.mo12046b(this.f4446ad.get());
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C8275bo m4634a(C0830bn bnVar, HmlReviewDocumentActivity<C0542a> hmlReviewDocumentActivity) {
        return new C8275bo(bnVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0502h m4633a(C0830bn bnVar, C0542a aVar) {
        C0502h b = bnVar.mo12046b(aVar);
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
