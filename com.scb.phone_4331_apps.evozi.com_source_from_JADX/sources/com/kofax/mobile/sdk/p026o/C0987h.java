package com.kofax.mobile.sdk.p026o;

import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.o.h */
public final class C0987h implements OPRStatusRewardsLandingActivity_ViewBinding<C0981a> {

    /* renamed from: Im */
    private final C0986g f2379Im;

    /* renamed from: In */
    private final HmlReviewDocumentActivity<C0988i> f2380In;

    public C0987h(C0986g gVar, HmlReviewDocumentActivity<C0988i> hmlReviewDocumentActivity) {
        this.f2379Im = gVar;
        this.f2380In = hmlReviewDocumentActivity;
    }

    /* renamed from: mf */
    public final C0981a get() {
        C0981a a = this.f2379Im.mo12395a(this.f2380In.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C0987h m2565a(C0986g gVar, HmlReviewDocumentActivity<C0988i> hmlReviewDocumentActivity) {
        return new C0987h(gVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0981a m2564a(C0986g gVar, C0988i iVar) {
        C0981a a = gVar.mo12395a(iVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
