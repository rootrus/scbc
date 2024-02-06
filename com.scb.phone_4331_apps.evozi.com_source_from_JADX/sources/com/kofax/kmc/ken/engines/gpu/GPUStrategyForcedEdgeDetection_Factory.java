package com.kofax.kmc.ken.engines.gpu;

import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class GPUStrategyForcedEdgeDetection_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<GPUStrategyForcedEdgeDetection> {

    /* renamed from: he */
    private final HmlReviewDocumentActivity<IGPUImageHolder> f373he;

    public GPUStrategyForcedEdgeDetection_Factory(HmlReviewDocumentActivity<IGPUImageHolder> hmlReviewDocumentActivity) {
        this.f373he = hmlReviewDocumentActivity;
    }

    public final GPUStrategyForcedEdgeDetection get() {
        return new GPUStrategyForcedEdgeDetection(this.f373he.get());
    }

    public static GPUStrategyForcedEdgeDetection_Factory create(HmlReviewDocumentActivity<IGPUImageHolder> hmlReviewDocumentActivity) {
        return new GPUStrategyForcedEdgeDetection_Factory(hmlReviewDocumentActivity);
    }

    public static GPUStrategyForcedEdgeDetection newGPUStrategyForcedEdgeDetection(IGPUImageHolder iGPUImageHolder) {
        return new GPUStrategyForcedEdgeDetection(iGPUImageHolder);
    }
}
