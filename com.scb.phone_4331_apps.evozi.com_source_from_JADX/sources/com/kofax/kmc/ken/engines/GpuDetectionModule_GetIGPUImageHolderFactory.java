package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.gpu.GPUImageHolderImpl;
import com.kofax.kmc.ken.engines.gpu.IGPUImageHolder;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class GpuDetectionModule_GetIGPUImageHolderFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IGPUImageHolder> {

    /* renamed from: aa */
    private final GpuDetectionModule f74aa;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<GPUImageHolderImpl> f75ad;

    public GpuDetectionModule_GetIGPUImageHolderFactory(GpuDetectionModule gpuDetectionModule, HmlReviewDocumentActivity<GPUImageHolderImpl> hmlReviewDocumentActivity) {
        this.f74aa = gpuDetectionModule;
        this.f75ad = hmlReviewDocumentActivity;
    }

    public final IGPUImageHolder get() {
        IGPUImageHolder a = this.f74aa.mo10040a(this.f75ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static GpuDetectionModule_GetIGPUImageHolderFactory create(GpuDetectionModule gpuDetectionModule, HmlReviewDocumentActivity<GPUImageHolderImpl> hmlReviewDocumentActivity) {
        return new GpuDetectionModule_GetIGPUImageHolderFactory(gpuDetectionModule, hmlReviewDocumentActivity);
    }

    public static IGPUImageHolder proxyGetIGPUImageHolder(GpuDetectionModule gpuDetectionModule, GPUImageHolderImpl gPUImageHolderImpl) {
        IGPUImageHolder a = gpuDetectionModule.mo10040a(gPUImageHolderImpl);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
