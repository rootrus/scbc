package com.kofax.kmc.ken.engines.gpu;

import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class GPUStrategyCombinedEdgeDetection_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<GPUStrategyCombinedEdgeDetection> {

    /* renamed from: he */
    private final HmlReviewDocumentActivity<IGPUImageHolder> f369he;

    public GPUStrategyCombinedEdgeDetection_Factory(HmlReviewDocumentActivity<IGPUImageHolder> hmlReviewDocumentActivity) {
        this.f369he = hmlReviewDocumentActivity;
    }

    public final GPUStrategyCombinedEdgeDetection get() {
        return new GPUStrategyCombinedEdgeDetection(this.f369he.get());
    }

    public static GPUStrategyCombinedEdgeDetection_Factory create(HmlReviewDocumentActivity<IGPUImageHolder> hmlReviewDocumentActivity) {
        return new GPUStrategyCombinedEdgeDetection_Factory(hmlReviewDocumentActivity);
    }

    public static GPUStrategyCombinedEdgeDetection newGPUStrategyCombinedEdgeDetection(IGPUImageHolder iGPUImageHolder) {
        return new GPUStrategyCombinedEdgeDetection(iGPUImageHolder);
    }
}
