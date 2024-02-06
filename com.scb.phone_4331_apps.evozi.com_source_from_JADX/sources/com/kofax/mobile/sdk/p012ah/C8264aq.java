package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.C8010j;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.IKtaSessionIdProviderFactory;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.aq */
public final class C8264aq implements OPRStatusRewardsLandingActivity_ViewBinding<IKtaSessionIdProviderFactory> {

    /* renamed from: Yi */
    private final C0844o f4423Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8010j> f4424ad;

    public C8264aq(C0844o oVar, HmlReviewDocumentActivity<C8010j> hmlReviewDocumentActivity) {
        this.f4423Yi = oVar;
        this.f4424ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sY */
    public final IKtaSessionIdProviderFactory get() {
        IKtaSessionIdProviderFactory a = this.f4423Yi.mo12083a(this.f4424ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: A */
    public static C8264aq m4600A(C0844o oVar, HmlReviewDocumentActivity<C8010j> hmlReviewDocumentActivity) {
        return new C8264aq(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static IKtaSessionIdProviderFactory m4601a(C0844o oVar, C8010j jVar) {
        IKtaSessionIdProviderFactory a = oVar.mo12083a(jVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
