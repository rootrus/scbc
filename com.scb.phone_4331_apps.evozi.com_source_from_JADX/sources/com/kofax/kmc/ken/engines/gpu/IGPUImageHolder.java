package com.kofax.kmc.ken.engines.gpu;

import android.graphics.Bitmap;

public interface IGPUImageHolder {
    void destroy();

    Bitmap getBitmap(int i);

    void handleData(byte[] bArr, int i, int i2, IGPUImageRenderer iGPUImageRenderer);

    void init();
}
