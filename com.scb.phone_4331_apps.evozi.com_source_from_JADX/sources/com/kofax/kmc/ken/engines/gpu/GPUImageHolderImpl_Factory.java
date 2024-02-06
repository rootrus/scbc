package com.kofax.kmc.ken.engines.gpu;

import android.content.Context;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class GPUImageHolderImpl_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<GPUImageHolderImpl> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f363X;

    public GPUImageHolderImpl_Factory(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.f363X = hmlReviewDocumentActivity;
    }

    public final GPUImageHolderImpl get() {
        return new GPUImageHolderImpl(this.f363X.get());
    }

    public static GPUImageHolderImpl_Factory create(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new GPUImageHolderImpl_Factory(hmlReviewDocumentActivity);
    }

    public static GPUImageHolderImpl newGPUImageHolderImpl(Context context) {
        return new GPUImageHolderImpl(context);
    }
}
