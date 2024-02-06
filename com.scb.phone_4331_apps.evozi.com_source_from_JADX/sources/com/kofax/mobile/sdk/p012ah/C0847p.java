package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.C0727j;
import p040o.FragmentBuilder_BindEasycashReferralSendDfwFragment;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.p */
public final class C0847p implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindEasycashReferralSendDfwFragment> {

    /* renamed from: Yi */
    private final C0844o f2049Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0727j> f2050ad;

    public C0847p(C0844o oVar, HmlReviewDocumentActivity<C0727j> hmlReviewDocumentActivity) {
        this.f2049Yi = oVar;
        this.f2050ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sA */
    public final FragmentBuilder_BindEasycashReferralSendDfwFragment get() {
        FragmentBuilder_BindEasycashReferralSendDfwFragment b = this.f2049Yi.mo12101b(this.f2050ad.get());
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C0847p m2166a(C0844o oVar, HmlReviewDocumentActivity<C0727j> hmlReviewDocumentActivity) {
        return new C0847p(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static FragmentBuilder_BindEasycashReferralSendDfwFragment m2167a(C0844o oVar, C0727j jVar) {
        FragmentBuilder_BindEasycashReferralSendDfwFragment b = oVar.mo12101b(jVar);
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
