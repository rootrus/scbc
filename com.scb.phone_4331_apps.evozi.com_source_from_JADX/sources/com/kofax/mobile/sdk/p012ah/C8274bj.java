package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8174a;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8184g;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.bj */
public final class C8274bj implements OPRStatusRewardsLandingActivity_ViewBinding<C8174a> {

    /* renamed from: Yi */
    private final C0844o f4443Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8184g> f4444ad;

    public C8274bj(C0844o oVar, HmlReviewDocumentActivity<C8184g> hmlReviewDocumentActivity) {
        this.f4443Yi = oVar;
        this.f4444ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tr */
    public final C8174a get() {
        C8174a a = this.f4443Yi.mo12085a(this.f4444ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: R */
    public static C8274bj m4630R(C0844o oVar, HmlReviewDocumentActivity<C8184g> hmlReviewDocumentActivity) {
        return new C8274bj(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8174a m4631a(C0844o oVar, C8184g gVar) {
        C8174a a = oVar.mo12085a(gVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
