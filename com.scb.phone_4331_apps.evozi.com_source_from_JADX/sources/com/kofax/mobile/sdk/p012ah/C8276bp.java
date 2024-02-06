package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C0502h;
import com.kofax.mobile.sdk._internal.impl.camera.C0623n;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.bp */
public final class C8276bp implements OPRStatusRewardsLandingActivity_ViewBinding<C0502h> {

    /* renamed from: Yo */
    private final C0830bn f4447Yo;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0623n> f4448ad;

    public C8276bp(C0830bn bnVar, HmlReviewDocumentActivity<C0623n> hmlReviewDocumentActivity) {
        this.f4447Yo = bnVar;
        this.f4448ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tw */
    public final C0502h get() {
        C0502h a = this.f4447Yo.mo12043a(this.f4448ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C8276bp m4637b(C0830bn bnVar, HmlReviewDocumentActivity<C0623n> hmlReviewDocumentActivity) {
        return new C8276bp(bnVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0502h m4636a(C0830bn bnVar, C0623n nVar) {
        C0502h a = bnVar.mo12043a(nVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
