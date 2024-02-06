package com.kofax.kmc.ken.engines.gpu;

import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.mobile.sdk._internal.impl.detection.Frame;

public interface GPUFrame extends Frame {
    float[] passTo(DocumentDetectionSettings documentDetectionSettings, GPUStrategyEdgeDetection gPUStrategyEdgeDetection);

    void setMaxTextureSize(int i);
}
