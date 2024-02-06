package com.kofax.mobile.sdk.p025n;

import com.kofax.mobile.sdk.p026o.C0983c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.n.i */
public final class C0978i implements OPRStatusRewardsLandingActivity_ViewBinding<C0983c> {

    /* renamed from: Ih */
    private final C0975f f2372Ih;

    /* renamed from: Ij */
    private final HmlReviewDocumentActivity<C0968a> f2373Ij;

    public C0978i(C0975f fVar, HmlReviewDocumentActivity<C0968a> hmlReviewDocumentActivity) {
        this.f2372Ih = fVar;
        this.f2373Ij = hmlReviewDocumentActivity;
    }

    /* renamed from: mg */
    public final C0983c get() {
        C0983c a = this.f2372Ih.mo12387a(this.f2373Ij.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public static C0978i m2550c(C0975f fVar, HmlReviewDocumentActivity<C0968a> hmlReviewDocumentActivity) {
        return new C0978i(fVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0983c m2549a(C0975f fVar, C0968a aVar) {
        C0983c a = fVar.mo12387a(aVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
