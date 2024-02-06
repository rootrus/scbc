package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C7890l;
import com.kofax.mobile.sdk._internal.impl.camera.C7935s;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.ai */
public final class C8257ai implements OPRStatusRewardsLandingActivity_ViewBinding<C7890l> {

    /* renamed from: Yi */
    private final C0844o f4409Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C7935s> f4410ad;

    public C8257ai(C0844o oVar, HmlReviewDocumentActivity<C7935s> hmlReviewDocumentActivity) {
        this.f4409Yi = oVar;
        this.f4410ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sQ */
    public final C7890l get() {
        C7890l a = this.f4409Yi.mo12071a(this.f4410ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: s */
    public static C8257ai m4580s(C0844o oVar, HmlReviewDocumentActivity<C7935s> hmlReviewDocumentActivity) {
        return new C8257ai(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7890l m4579a(C0844o oVar, C7935s sVar) {
        C7890l a = oVar.mo12071a(sVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
