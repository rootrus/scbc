package com.kofax.kmc.ken.engines.gpu;

import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;

public abstract class ImageProcessor {
    protected DocumentDetectionSettings mSettings = null;

    public enum Method {
        None,
        GPU_RgbSobel,
        GPU_LocalAdaptiveThreshold,
        GPU_GlobalAdaptiveThreshold,
        GPU_Barnsen,
        GPU_End
    }

    public abstract void destroy();

    public abstract float[] getBounds();

    public abstract FrameBufferTexture getProcessedTexture();

    public abstract boolean isGrayScaleInputTextureRequired();

    public abstract boolean isRGBInputTextureRequired();

    public abstract void processByteData(byte[] bArr, int i, int i2);

    public abstract void processTexture(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2);

    public abstract void setPreviewResoution(int i, int i2);

    public abstract void setResizedResolution(int i, int i2);

    public void setSettings(DocumentDetectionSettings documentDetectionSettings) {
        this.mSettings = documentDetectionSettings;
    }
}
