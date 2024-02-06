package com.kofax.mobile.sdk.p022j;

import com.kofax.mobile.sdk._internal.C0495c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.j.b */
public final class C0930b implements OPRStatusRewardsLandingActivity_ViewBinding<C0495c> {

    /* renamed from: zD */
    private final C0929a f2236zD;

    /* renamed from: zE */
    private final HmlReviewDocumentActivity<C0932d> f2237zE;

    public C0930b(C0929a aVar, HmlReviewDocumentActivity<C0932d> hmlReviewDocumentActivity) {
        this.f2236zD = aVar;
        this.f2237zE = hmlReviewDocumentActivity;
    }

    /* renamed from: iY */
    public final C0495c get() {
        C0495c a = this.f2236zD.mo12322a(this.f2237zE.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C0930b m2405a(C0929a aVar, HmlReviewDocumentActivity<C0932d> hmlReviewDocumentActivity) {
        return new C0930b(aVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0495c m2404a(C0929a aVar, C0932d dVar) {
        C0495c a = aVar.mo12322a(dVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
