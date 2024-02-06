package com.kofax.mobile.sdk._internal.impl.detection;

import com.kofax.kmc.ken.engines.IDocumentDetector;
import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.detection.d */
public final class C0671d implements OPRStatusRewardsLandingActivity_ViewBinding<C0669c> {

    /* renamed from: ac */
    private final HmlReviewDocumentActivity<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> f1594ac;

    public C0671d(HmlReviewDocumentActivity<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> hmlReviewDocumentActivity) {
        this.f1594ac = hmlReviewDocumentActivity;
    }

    /* renamed from: lN */
    public final C0669c get() {
        return new C0669c(this.f1594ac);
    }

    /* renamed from: F */
    public static C0671d m1458F(HmlReviewDocumentActivity<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> hmlReviewDocumentActivity) {
        return new C0671d(hmlReviewDocumentActivity);
    }

    /* renamed from: G */
    public static C0669c m1459G(HmlReviewDocumentActivity<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> hmlReviewDocumentActivity) {
        return new C0669c(hmlReviewDocumentActivity);
    }
}
