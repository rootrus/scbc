package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class IsgDetectionModule_GetDocumentDetectorFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> {

    /* renamed from: ac */
    private final HmlReviewDocumentActivity<C0464i> f144ac;

    /* renamed from: bH */
    private final IsgDetectionModule f145bH;

    public IsgDetectionModule_GetDocumentDetectorFactory(IsgDetectionModule isgDetectionModule, HmlReviewDocumentActivity<C0464i> hmlReviewDocumentActivity) {
        this.f145bH = isgDetectionModule;
        this.f144ac = hmlReviewDocumentActivity;
    }

    public final IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> get() {
        IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> a = this.f145bH.mo10104a(this.f144ac.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IsgDetectionModule_GetDocumentDetectorFactory create(IsgDetectionModule isgDetectionModule, HmlReviewDocumentActivity<C0464i> hmlReviewDocumentActivity) {
        return new IsgDetectionModule_GetDocumentDetectorFactory(isgDetectionModule, hmlReviewDocumentActivity);
    }

    public static IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> proxyGetDocumentDetector(IsgDetectionModule isgDetectionModule, Object obj) {
        IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> a = isgDetectionModule.mo10104a((C0464i) obj);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
