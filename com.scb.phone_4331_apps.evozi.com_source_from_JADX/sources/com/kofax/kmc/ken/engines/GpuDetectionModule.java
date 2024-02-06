package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.kmc.ken.engines.gpu.GPUImageHolderImpl;
import com.kofax.kmc.ken.engines.gpu.GPUStrategyCombinedEdgeDetection;
import com.kofax.kmc.ken.engines.gpu.GPUStrategyEdgeDetection;
import com.kofax.kmc.ken.engines.gpu.GPUStrategyForcedEdgeDetection;
import com.kofax.kmc.ken.engines.gpu.IGPUImageHolder;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import p040o.HmlRepaymentMethodAboutActivity;

public class GpuDetectionModule {
    /* access modifiers changed from: package-private */
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "GPU_DOCUMENT")
    /* renamed from: a */
    public IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> mo10036a(GpuDocumentDetector gpuDocumentDetector) {
        return gpuDocumentDetector;
    }

    /* access modifiers changed from: package-private */
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "FORCED_GPU_DOCUMENT")
    /* renamed from: a */
    public IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> mo10037a(C0436d dVar) {
        return dVar;
    }

    /* access modifiers changed from: package-private */
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "COMBINED_STRATEGY")
    /* renamed from: a */
    public GPUStrategyEdgeDetection mo10038a(GPUStrategyCombinedEdgeDetection gPUStrategyCombinedEdgeDetection) {
        return gPUStrategyCombinedEdgeDetection;
    }

    /* access modifiers changed from: package-private */
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "FORCED_STRATEGY")
    /* renamed from: a */
    public GPUStrategyEdgeDetection mo10039a(GPUStrategyForcedEdgeDetection gPUStrategyForcedEdgeDetection) {
        return gPUStrategyForcedEdgeDetection;
    }

    /* access modifiers changed from: package-private */
    @C0519a
    /* renamed from: a */
    public IGPUImageHolder mo10040a(GPUImageHolderImpl gPUImageHolderImpl) {
        return gPUImageHolderImpl;
    }
}
