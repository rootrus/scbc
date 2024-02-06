package com.kofax.kmc.ken.engines;

import android.content.Context;
import com.kofax.kmc.ken.engines.gpu.GPUStrategyEdgeDetection;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class GpuDocumentDetector_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<GpuDocumentDetector> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f3310X;

    /* renamed from: Y */
    private final HmlReviewDocumentActivity<GPUStrategyEdgeDetection> f3311Y;

    public GpuDocumentDetector_Factory(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<GPUStrategyEdgeDetection> hmlReviewDocumentActivity2) {
        this.f3310X = hmlReviewDocumentActivity;
        this.f3311Y = hmlReviewDocumentActivity2;
    }

    public final GpuDocumentDetector get() {
        return new GpuDocumentDetector(this.f3310X.get(), this.f3311Y.get());
    }

    public static GpuDocumentDetector_Factory create(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<GPUStrategyEdgeDetection> hmlReviewDocumentActivity2) {
        return new GpuDocumentDetector_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }
}
