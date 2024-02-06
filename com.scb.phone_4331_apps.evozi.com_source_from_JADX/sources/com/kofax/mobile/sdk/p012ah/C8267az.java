package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C7892r;
import com.kofax.mobile.sdk._internal.impl.camera.C7939w;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.az */
public final class C8267az implements OPRStatusRewardsLandingActivity_ViewBinding<C7892r> {

    /* renamed from: Yi */
    private final C0844o f4429Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C7939w> f4430ad;

    public C8267az(C0844o oVar, HmlReviewDocumentActivity<C7939w> hmlReviewDocumentActivity) {
        this.f4429Yi = oVar;
        this.f4430ad = hmlReviewDocumentActivity;
    }

    /* renamed from: th */
    public final C7892r get() {
        C7892r a = this.f4429Yi.mo12075a(this.f4430ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: H */
    public static C8267az m4609H(C0844o oVar, HmlReviewDocumentActivity<C7939w> hmlReviewDocumentActivity) {
        return new C8267az(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7892r m4610a(C0844o oVar, C7939w wVar) {
        C7892r a = oVar.mo12075a(wVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
