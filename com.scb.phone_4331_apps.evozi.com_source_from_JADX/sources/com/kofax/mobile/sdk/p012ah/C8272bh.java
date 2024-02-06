package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C7893v;
import com.kofax.mobile.sdk._internal.impl.camera.C7931as;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.bh */
public final class C8272bh implements OPRStatusRewardsLandingActivity_ViewBinding<C7893v> {

    /* renamed from: Yi */
    private final C0844o f4439Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C7931as> f4440ad;

    public C8272bh(C0844o oVar, HmlReviewDocumentActivity<C7931as> hmlReviewDocumentActivity) {
        this.f4439Yi = oVar;
        this.f4440ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tp */
    public final C7893v get() {
        C7893v a = this.f4439Yi.mo12076a(this.f4440ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: P */
    public static C8272bh m4624P(C0844o oVar, HmlReviewDocumentActivity<C7931as> hmlReviewDocumentActivity) {
        return new C8272bh(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7893v m4625a(C0844o oVar, C7931as asVar) {
        C7893v a = oVar.mo12076a(asVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
