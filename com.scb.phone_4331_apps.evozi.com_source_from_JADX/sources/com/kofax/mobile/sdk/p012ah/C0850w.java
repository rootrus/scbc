package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk.p023k.C0939b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.w */
public final class C0850w implements OPRStatusRewardsLandingActivity_ViewBinding<C0513a> {

    /* renamed from: Yi */
    private final C0844o f2057Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0939b> f2058ad;

    public C0850w(C0844o oVar, HmlReviewDocumentActivity<C0939b> hmlReviewDocumentActivity) {
        this.f2057Yi = oVar;
        this.f2058ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sG */
    public final C0513a get() {
        C0513a m = this.f2057Yi.mo12111m(this.f2058ad.get());
        if (m != null) {
            return m;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: g */
    public static C0850w m2176g(C0844o oVar, HmlReviewDocumentActivity<C0939b> hmlReviewDocumentActivity) {
        return new C0850w(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0513a m2175a(C0844o oVar, C0939b bVar) {
        C0513a m = oVar.mo12111m(bVar);
        if (m != null) {
            return m;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
