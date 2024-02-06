package com.kofax.mobile.sdk.p025n;

import com.kofax.mobile.sdk.p026o.C0983c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.n.h */
public final class C0977h implements OPRStatusRewardsLandingActivity_ViewBinding<C0983c> {

    /* renamed from: Ih */
    private final C0975f f2370Ih;

    /* renamed from: Ii */
    private final HmlReviewDocumentActivity<C0973d> f2371Ii;

    public C0977h(C0975f fVar, HmlReviewDocumentActivity<C0973d> hmlReviewDocumentActivity) {
        this.f2370Ih = fVar;
        this.f2371Ii = hmlReviewDocumentActivity;
    }

    /* renamed from: mg */
    public final C0983c get() {
        C0983c a = this.f2370Ih.mo12388a(this.f2371Ii.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C0977h m2547b(C0975f fVar, HmlReviewDocumentActivity<C0973d> hmlReviewDocumentActivity) {
        return new C0977h(fVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0983c m2546a(C0975f fVar, C0973d dVar) {
        C0983c a = fVar.mo12388a(dVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
