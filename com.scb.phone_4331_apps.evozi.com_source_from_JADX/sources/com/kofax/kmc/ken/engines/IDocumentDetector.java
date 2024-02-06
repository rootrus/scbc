package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.DetectionResult;
import com.kofax.kmc.ken.engines.data.DetectionSettings;

public interface IDocumentDetector<T extends DetectionSettings, U extends DetectionResult> {
    public static final String FORCED_DOCUMENT = "FORCED_DOCUMENT";
    public static final String FORCED_GPU_DOCUMENT = "FORCED_GPU_DOCUMENT";
    public static final String FORCED_ISG_DOCUMENT = "FORCED_ISG_DOCUMENT";
    public static final String GPU_DOCUMENT = "GPU_DOCUMENT";
    public static final String ISG_DOCUMENT = "ISG_DOCUMENT";

    void destroy();

    U detect(T t, Bitmap bitmap);

    U detect(T t, byte[] bArr, int i, int i2);
}
