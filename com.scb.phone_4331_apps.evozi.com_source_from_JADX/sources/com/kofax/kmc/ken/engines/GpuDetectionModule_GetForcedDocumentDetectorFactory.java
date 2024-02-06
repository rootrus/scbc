package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class GpuDetectionModule_GetForcedDocumentDetectorFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> {

    /* renamed from: aa */
    private final GpuDetectionModule f72aa;

    /* renamed from: ac */
    private final HmlReviewDocumentActivity<C0436d> f73ac;

    public GpuDetectionModule_GetForcedDocumentDetectorFactory(GpuDetectionModule gpuDetectionModule, HmlReviewDocumentActivity<C0436d> hmlReviewDocumentActivity) {
        this.f72aa = gpuDetectionModule;
        this.f73ac = hmlReviewDocumentActivity;
    }

    public final IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> get() {
        IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> a = this.f72aa.mo10037a(this.f73ac.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static GpuDetectionModule_GetForcedDocumentDetectorFactory create(GpuDetectionModule gpuDetectionModule, HmlReviewDocumentActivity<C0436d> hmlReviewDocumentActivity) {
        return new GpuDetectionModule_GetForcedDocumentDetectorFactory(gpuDetectionModule, hmlReviewDocumentActivity);
    }

    public static IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> proxyGetForcedDocumentDetector(GpuDetectionModule gpuDetectionModule, Object obj) {
        IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> a = gpuDetectionModule.mo10037a((C0436d) obj);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
