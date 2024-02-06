package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.gpu.GPUStrategyEdgeDetection;
import com.kofax.kmc.ken.engines.gpu.GPUStrategyForcedEdgeDetection;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class GpuDetectionModule_GetForcedDocumentDetectionFactory implements OPRStatusRewardsLandingActivity_ViewBinding<GPUStrategyEdgeDetection> {

    /* renamed from: aa */
    private final GpuDetectionModule f70aa;

    /* renamed from: ab */
    private final HmlReviewDocumentActivity<GPUStrategyForcedEdgeDetection> f71ab;

    public GpuDetectionModule_GetForcedDocumentDetectionFactory(GpuDetectionModule gpuDetectionModule, HmlReviewDocumentActivity<GPUStrategyForcedEdgeDetection> hmlReviewDocumentActivity) {
        this.f70aa = gpuDetectionModule;
        this.f71ab = hmlReviewDocumentActivity;
    }

    public final GPUStrategyEdgeDetection get() {
        GPUStrategyEdgeDetection a = this.f70aa.mo10039a(this.f71ab.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static GpuDetectionModule_GetForcedDocumentDetectionFactory create(GpuDetectionModule gpuDetectionModule, HmlReviewDocumentActivity<GPUStrategyForcedEdgeDetection> hmlReviewDocumentActivity) {
        return new GpuDetectionModule_GetForcedDocumentDetectionFactory(gpuDetectionModule, hmlReviewDocumentActivity);
    }

    public static GPUStrategyEdgeDetection proxyGetForcedDocumentDetection(GpuDetectionModule gpuDetectionModule, GPUStrategyForcedEdgeDetection gPUStrategyForcedEdgeDetection) {
        GPUStrategyEdgeDetection a = gpuDetectionModule.mo10039a(gPUStrategyForcedEdgeDetection);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
