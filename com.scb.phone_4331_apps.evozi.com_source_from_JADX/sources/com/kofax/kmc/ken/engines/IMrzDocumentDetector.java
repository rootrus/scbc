package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;

public interface IMrzDocumentDetector {
    void destroy();

    BoundingTetragon detect(Bitmap bitmap);
}
