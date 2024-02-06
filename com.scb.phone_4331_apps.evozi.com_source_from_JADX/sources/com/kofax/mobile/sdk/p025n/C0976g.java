package com.kofax.mobile.sdk.p025n;

import com.kofax.mobile.sdk.p026o.C0981a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.n.g */
public final class C0976g implements OPRStatusRewardsLandingActivity_ViewBinding<C0981a> {

    /* renamed from: Ih */
    private final C0975f f2368Ih;

    /* renamed from: Z */
    private final HmlReviewDocumentActivity<C0979j> f2369Z;

    public C0976g(C0975f fVar, HmlReviewDocumentActivity<C0979j> hmlReviewDocumentActivity) {
        this.f2368Ih = fVar;
        this.f2369Z = hmlReviewDocumentActivity;
    }

    /* renamed from: mf */
    public final C0981a get() {
        C0981a a = this.f2368Ih.mo12386a(this.f2369Z.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C0976g m2543a(C0975f fVar, HmlReviewDocumentActivity<C0979j> hmlReviewDocumentActivity) {
        return new C0976g(fVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0981a m2544a(C0975f fVar, C0979j jVar) {
        C0981a a = fVar.mo12386a(jVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
