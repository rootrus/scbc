package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class GpuDetectionModule_GetDocumentDetectorFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> {

    /* renamed from: aa */
    private final GpuDetectionModule f68aa;

    /* renamed from: ac */
    private final HmlReviewDocumentActivity<GpuDocumentDetector> f69ac;

    public GpuDetectionModule_GetDocumentDetectorFactory(GpuDetectionModule gpuDetectionModule, HmlReviewDocumentActivity<GpuDocumentDetector> hmlReviewDocumentActivity) {
        this.f68aa = gpuDetectionModule;
        this.f69ac = hmlReviewDocumentActivity;
    }

    public final IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> get() {
        IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> a = this.f68aa.mo10036a(this.f69ac.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static GpuDetectionModule_GetDocumentDetectorFactory create(GpuDetectionModule gpuDetectionModule, HmlReviewDocumentActivity<GpuDocumentDetector> hmlReviewDocumentActivity) {
        return new GpuDetectionModule_GetDocumentDetectorFactory(gpuDetectionModule, hmlReviewDocumentActivity);
    }

    public static IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> proxyGetDocumentDetector(GpuDetectionModule gpuDetectionModule, GpuDocumentDetector gpuDocumentDetector) {
        IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> a = gpuDetectionModule.mo10036a(gpuDocumentDetector);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
