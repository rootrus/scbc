package com.kofax.mobile.sdk.p022j;

import com.kofax.mobile.sdk._internal.C0495c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.j.c */
public final class C0931c implements OPRStatusRewardsLandingActivity_ViewBinding<C0495c> {

    /* renamed from: zD */
    private final C0929a f2238zD;

    /* renamed from: zE */
    private final HmlReviewDocumentActivity<C0936f> f2239zE;

    public C0931c(C0929a aVar, HmlReviewDocumentActivity<C0936f> hmlReviewDocumentActivity) {
        this.f2238zD = aVar;
        this.f2239zE = hmlReviewDocumentActivity;
    }

    /* renamed from: iY */
    public final C0495c get() {
        C0495c a = this.f2238zD.mo12323a(this.f2239zE.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C0931c m2408b(C0929a aVar, HmlReviewDocumentActivity<C0936f> hmlReviewDocumentActivity) {
        return new C0931c(aVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0495c m2407a(C0929a aVar, C0936f fVar) {
        C0495c a = aVar.mo12323a(fVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
