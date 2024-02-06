package com.kofax.kmc.ken.engines.gpu;

import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;

public abstract class GPUStrategyEdgeDetection extends GPUStrategy {
    public static final String COMBINED_STRATEGY = "COMBINED_STRATEGY";
    public static final String FORCED_STRATEGY = "FORCED_STRATEGY";

    public abstract float[] handleData(byte[] bArr, int i, int i2, DocumentDetectionSettings documentDetectionSettings);

    GPUStrategyEdgeDetection(IGPUImageHolder iGPUImageHolder) {
        super(iGPUImageHolder);
    }
}
