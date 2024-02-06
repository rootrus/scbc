package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.capture.C7895f;
import com.kofax.mobile.sdk.p023k.C8410h;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.bc */
public final class C8269bc implements OPRStatusRewardsLandingActivity_ViewBinding<C7895f> {

    /* renamed from: Yi */
    private final C0844o f4433Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8410h> f4434ad;

    public C8269bc(C0844o oVar, HmlReviewDocumentActivity<C8410h> hmlReviewDocumentActivity) {
        this.f4433Yi = oVar;
        this.f4434ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tk */
    public final C7895f get() {
        C7895f j = this.f4433Yi.mo12110j(this.f4434ad.get());
        if (j != null) {
            return j;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: K */
    public static C8269bc m4615K(C0844o oVar, HmlReviewDocumentActivity<C8410h> hmlReviewDocumentActivity) {
        return new C8269bc(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7895f m4616a(C0844o oVar, C8410h hVar) {
        C7895f j = oVar.mo12110j(hVar);
        if (j != null) {
            return j;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
