package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class DetectionModule_GetForcedDocumentDetectorFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> {

    /* renamed from: B */
    private final DetectionModule f58B;

    /* renamed from: D */
    private final HmlReviewDocumentActivity<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> f59D;

    /* renamed from: E */
    private final HmlReviewDocumentActivity<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> f60E;

    public DetectionModule_GetForcedDocumentDetectorFactory(DetectionModule detectionModule, HmlReviewDocumentActivity<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> hmlReviewDocumentActivity2) {
        this.f58B = detectionModule;
        this.f59D = hmlReviewDocumentActivity;
        this.f60E = hmlReviewDocumentActivity2;
    }

    public final IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> get() {
        IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> a = this.f58B.mo10028a(this.f59D, this.f60E);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static DetectionModule_GetForcedDocumentDetectorFactory create(DetectionModule detectionModule, HmlReviewDocumentActivity<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> hmlReviewDocumentActivity2) {
        return new DetectionModule_GetForcedDocumentDetectorFactory(detectionModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public static IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> proxyGetForcedDocumentDetector(DetectionModule detectionModule, HmlReviewDocumentActivity<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> hmlReviewDocumentActivity2) {
        IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> a = detectionModule.mo10028a(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
