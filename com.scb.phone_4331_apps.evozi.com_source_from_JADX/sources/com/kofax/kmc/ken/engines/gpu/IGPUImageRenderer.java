package com.kofax.kmc.ken.engines.gpu;

import android.opengl.GLSurfaceView;

public interface IGPUImageRenderer extends GLSurfaceView.Renderer {
    void destroy();

    void onPreviewFrame(byte[] bArr, int i, int i2);

    void setRotation(Rotation rotation);

    void setScaleType(ScaleType scaleType);
}
