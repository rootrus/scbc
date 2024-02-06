package com.kofax.mobile.sdk.p012ah;

import com.kofax.kmc.ken.engines.DocumentDetector;
import com.kofax.kmc.ken.engines.IDocumentDetector;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.ad */
public final class C8254ad implements OPRStatusRewardsLandingActivity_ViewBinding<IDocumentDetector> {

    /* renamed from: Yi */
    private final C0844o f4403Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<DocumentDetector> f4404ad;

    public C8254ad(C0844o oVar, HmlReviewDocumentActivity<DocumentDetector> hmlReviewDocumentActivity) {
        this.f4403Yi = oVar;
        this.f4404ad = hmlReviewDocumentActivity;
    }

    public final IDocumentDetector get() {
        IDocumentDetector a = this.f4403Yi.mo12067a(this.f4404ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: n */
    public static C8254ad m4573n(C0844o oVar, HmlReviewDocumentActivity<DocumentDetector> hmlReviewDocumentActivity) {
        return new C8254ad(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static IDocumentDetector m4572a(C0844o oVar, DocumentDetector documentDetector) {
        IDocumentDetector a = oVar.mo12067a(documentDetector);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
