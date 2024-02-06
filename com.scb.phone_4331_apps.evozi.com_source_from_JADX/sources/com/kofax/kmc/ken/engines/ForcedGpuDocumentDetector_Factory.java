package com.kofax.kmc.ken.engines;

import android.content.Context;
import com.kofax.kmc.ken.engines.gpu.GPUStrategyEdgeDetection;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class ForcedGpuDocumentDetector_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<C0436d> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f63X;

    /* renamed from: Y */
    private final HmlReviewDocumentActivity<GPUStrategyEdgeDetection> f64Y;

    public ForcedGpuDocumentDetector_Factory(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<GPUStrategyEdgeDetection> hmlReviewDocumentActivity2) {
        this.f63X = hmlReviewDocumentActivity;
        this.f64Y = hmlReviewDocumentActivity2;
    }

    public final C0436d get() {
        return new C0436d(this.f63X.get(), this.f64Y.get());
    }

    public static ForcedGpuDocumentDetector_Factory create(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<GPUStrategyEdgeDetection> hmlReviewDocumentActivity2) {
        return new ForcedGpuDocumentDetector_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public static C0436d newForcedGpuDocumentDetector(Context context, GPUStrategyEdgeDetection gPUStrategyEdgeDetection) {
        return new C0436d(context, gPUStrategyEdgeDetection);
    }
}
