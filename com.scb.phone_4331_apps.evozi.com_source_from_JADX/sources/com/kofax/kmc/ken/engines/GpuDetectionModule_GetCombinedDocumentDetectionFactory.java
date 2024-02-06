package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.gpu.GPUStrategyCombinedEdgeDetection;
import com.kofax.kmc.ken.engines.gpu.GPUStrategyEdgeDetection;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class GpuDetectionModule_GetCombinedDocumentDetectionFactory implements OPRStatusRewardsLandingActivity_ViewBinding<GPUStrategyEdgeDetection> {

    /* renamed from: aa */
    private final GpuDetectionModule f66aa;

    /* renamed from: ab */
    private final HmlReviewDocumentActivity<GPUStrategyCombinedEdgeDetection> f67ab;

    public GpuDetectionModule_GetCombinedDocumentDetectionFactory(GpuDetectionModule gpuDetectionModule, HmlReviewDocumentActivity<GPUStrategyCombinedEdgeDetection> hmlReviewDocumentActivity) {
        this.f66aa = gpuDetectionModule;
        this.f67ab = hmlReviewDocumentActivity;
    }

    public final GPUStrategyEdgeDetection get() {
        GPUStrategyEdgeDetection a = this.f66aa.mo10038a(this.f67ab.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static GpuDetectionModule_GetCombinedDocumentDetectionFactory create(GpuDetectionModule gpuDetectionModule, HmlReviewDocumentActivity<GPUStrategyCombinedEdgeDetection> hmlReviewDocumentActivity) {
        return new GpuDetectionModule_GetCombinedDocumentDetectionFactory(gpuDetectionModule, hmlReviewDocumentActivity);
    }

    public static GPUStrategyEdgeDetection proxyGetCombinedDocumentDetection(GpuDetectionModule gpuDetectionModule, GPUStrategyCombinedEdgeDetection gPUStrategyCombinedEdgeDetection) {
        GPUStrategyEdgeDetection a = gpuDetectionModule.mo10038a(gPUStrategyCombinedEdgeDetection);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
