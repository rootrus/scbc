package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C7891m;
import com.kofax.mobile.sdk._internal.impl.camera.C7937u;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.ap */
public final class C8263ap implements OPRStatusRewardsLandingActivity_ViewBinding<C7891m> {

    /* renamed from: Yi */
    private final C0844o f4421Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C7937u> f4422ad;

    public C8263ap(C0844o oVar, HmlReviewDocumentActivity<C7937u> hmlReviewDocumentActivity) {
        this.f4421Yi = oVar;
        this.f4422ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sX */
    public final C7891m get() {
        C7891m a = this.f4421Yi.mo12072a(this.f4422ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: z */
    public static C8263ap m4598z(C0844o oVar, HmlReviewDocumentActivity<C7937u> hmlReviewDocumentActivity) {
        return new C8263ap(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7891m m4597a(C0844o oVar, C7937u uVar) {
        C7891m a = oVar.mo12072a(uVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
