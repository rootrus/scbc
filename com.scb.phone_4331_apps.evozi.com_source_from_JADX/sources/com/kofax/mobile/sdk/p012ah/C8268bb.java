package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.view.C8207ai;
import com.kofax.mobile.sdk._internal.view.C8236l;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.bb */
public final class C8268bb implements OPRStatusRewardsLandingActivity_ViewBinding<C8236l> {

    /* renamed from: Yi */
    private final C0844o f4431Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8207ai> f4432ad;

    public C8268bb(C0844o oVar, HmlReviewDocumentActivity<C8207ai> hmlReviewDocumentActivity) {
        this.f4431Yi = oVar;
        this.f4432ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tj */
    public final C8236l get() {
        C8236l b = this.f4431Yi.mo12099b(this.f4432ad.get());
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: J */
    public static C8268bb m4612J(C0844o oVar, HmlReviewDocumentActivity<C8207ai> hmlReviewDocumentActivity) {
        return new C8268bb(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8236l m4613a(C0844o oVar, C8207ai aiVar) {
        C8236l b = oVar.mo12099b(aiVar);
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
