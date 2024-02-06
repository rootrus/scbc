package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C0506n;
import com.kofax.mobile.sdk.p012ah.C0844o;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.au */
public final class C0819au implements OPRStatusRewardsLandingActivity_ViewBinding<C0506n> {

    /* renamed from: Yi */
    private final C0844o f2000Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0844o.C0845a> f2001ad;

    public C0819au(C0844o oVar, HmlReviewDocumentActivity<C0844o.C0845a> hmlReviewDocumentActivity) {
        this.f2000Yi = oVar;
        this.f2001ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tc */
    public final C0506n get() {
        C0506n a = this.f2000Yi.mo12073a(this.f2001ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: E */
    public static C0819au m2036E(C0844o oVar, HmlReviewDocumentActivity<C0844o.C0845a> hmlReviewDocumentActivity) {
        return new C0819au(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0506n m2037a(C0844o oVar, C0844o.C0845a aVar) {
        C0506n a = oVar.mo12073a(aVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
