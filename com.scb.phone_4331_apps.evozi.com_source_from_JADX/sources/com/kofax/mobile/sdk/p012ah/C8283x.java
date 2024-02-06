package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.view.C8217c;
import com.kofax.mobile.sdk._internal.view.C8234b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.x */
public final class C8283x implements OPRStatusRewardsLandingActivity_ViewBinding<C8234b> {

    /* renamed from: Yi */
    private final C0844o f4462Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8217c> f4463ad;

    public C8283x(C0844o oVar, HmlReviewDocumentActivity<C8217c> hmlReviewDocumentActivity) {
        this.f4462Yi = oVar;
        this.f4463ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sH */
    public final C8234b get() {
        C8234b b = this.f4462Yi.mo12097b(this.f4463ad.get());
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: h */
    public static C8283x m4658h(C0844o oVar, HmlReviewDocumentActivity<C8217c> hmlReviewDocumentActivity) {
        return new C8283x(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8234b m4657a(C0844o oVar, C8217c cVar) {
        C8234b b = oVar.mo12097b(cVar);
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
