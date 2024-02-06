package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.view.C8226t;
import com.kofax.mobile.sdk._internal.view.C8235h;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.ag */
public final class C8256ag implements OPRStatusRewardsLandingActivity_ViewBinding<C8235h> {

    /* renamed from: Yi */
    private final C0844o f4407Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8226t> f4408ad;

    public C8256ag(C0844o oVar, HmlReviewDocumentActivity<C8226t> hmlReviewDocumentActivity) {
        this.f4407Yi = oVar;
        this.f4408ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sO */
    public final C8235h get() {
        C8235h a = this.f4407Yi.mo12088a(this.f4408ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: q */
    public static C8256ag m4577q(C0844o oVar, HmlReviewDocumentActivity<C8226t> hmlReviewDocumentActivity) {
        return new C8256ag(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8235h m4576a(C0844o oVar, C8226t tVar) {
        C8235h a = oVar.mo12088a(tVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
