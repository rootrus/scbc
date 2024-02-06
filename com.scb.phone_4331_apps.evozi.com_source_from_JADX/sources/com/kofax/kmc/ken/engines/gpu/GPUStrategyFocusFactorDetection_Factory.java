package com.kofax.kmc.ken.engines.gpu;

import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class GPUStrategyFocusFactorDetection_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<GPUStrategyFocusFactorDetection> {

    /* renamed from: he */
    private final HmlReviewDocumentActivity<IGPUImageHolder> f371he;

    public GPUStrategyFocusFactorDetection_Factory(HmlReviewDocumentActivity<IGPUImageHolder> hmlReviewDocumentActivity) {
        this.f371he = hmlReviewDocumentActivity;
    }

    public final GPUStrategyFocusFactorDetection get() {
        return new GPUStrategyFocusFactorDetection(this.f371he.get());
    }

    public static GPUStrategyFocusFactorDetection_Factory create(HmlReviewDocumentActivity<IGPUImageHolder> hmlReviewDocumentActivity) {
        return new GPUStrategyFocusFactorDetection_Factory(hmlReviewDocumentActivity);
    }

    public static GPUStrategyFocusFactorDetection newGPUStrategyFocusFactorDetection(IGPUImageHolder iGPUImageHolder) {
        return new GPUStrategyFocusFactorDetection(iGPUImageHolder);
    }
}
