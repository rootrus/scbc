package com.kofax.kmc.ken.engines.gpu;

import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.mobile.sdk._internal.impl.detection.C7943b;

public class DataGPUFrame extends C7943b implements GPUFrame {
    public void setMaxTextureSize(int i) {
    }

    public DataGPUFrame(byte[] bArr, int i, int i2, int i3) {
        super(bArr, i, i2, i3);
    }

    public float[] passTo(DocumentDetectionSettings documentDetectionSettings, GPUStrategyEdgeDetection gPUStrategyEdgeDetection) {
        return gPUStrategyEdgeDetection.handleData(this._data, this._width, this._height, documentDetectionSettings);
    }

    public int getWidth() {
        return this._width;
    }

    public int getHeight() {
        return this._height;
    }
}
