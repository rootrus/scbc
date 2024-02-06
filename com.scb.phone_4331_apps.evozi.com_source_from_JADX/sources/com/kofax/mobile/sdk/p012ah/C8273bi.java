package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.C7995a;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaServiceCaller;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.bi */
public final class C8273bi implements OPRStatusRewardsLandingActivity_ViewBinding<C7995a> {

    /* renamed from: Yi */
    private final C0844o f4441Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<KtaServiceCaller> f4442ad;

    public C8273bi(C0844o oVar, HmlReviewDocumentActivity<KtaServiceCaller> hmlReviewDocumentActivity) {
        this.f4441Yi = oVar;
        this.f4442ad = hmlReviewDocumentActivity;
    }

    /* renamed from: tq */
    public final C7995a get() {
        C7995a a = this.f4441Yi.mo12084a(this.f4442ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: Q */
    public static C8273bi m4627Q(C0844o oVar, HmlReviewDocumentActivity<KtaServiceCaller> hmlReviewDocumentActivity) {
        return new C8273bi(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7995a m4628a(C0844o oVar, KtaServiceCaller ktaServiceCaller) {
        C7995a a = oVar.mo12084a(ktaServiceCaller);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
