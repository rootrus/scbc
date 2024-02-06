package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.C7918f;
import com.kofax.mobile.sdk._internal.impl.C8194s;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.al */
public final class C8260al implements OPRStatusRewardsLandingActivity_ViewBinding<C7918f> {

    /* renamed from: Yi */
    private final C0844o f4415Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8194s> f4416ad;

    public C8260al(C0844o oVar, HmlReviewDocumentActivity<C8194s> hmlReviewDocumentActivity) {
        this.f4415Yi = oVar;
        this.f4416ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sT */
    public final C7918f get() {
        C7918f a = this.f4415Yi.mo12079a(this.f4416ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: v */
    public static C8260al m4589v(C0844o oVar, HmlReviewDocumentActivity<C8194s> hmlReviewDocumentActivity) {
        return new C8260al(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7918f m4588a(C0844o oVar, C8194s sVar) {
        C7918f a = oVar.mo12079a(sVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
