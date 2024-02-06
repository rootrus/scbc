package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.CheckDetectionResult;
import com.kofax.kmc.ken.engines.data.CheckDetectionSettings;

public interface ICheckDetector extends IDocumentDetector<CheckDetectionSettings, CheckDetectionResult> {
    CheckDetectionResult detect(CheckDetectionSettings checkDetectionSettings, Bitmap bitmap);

    CheckDetectionResult detect(CheckDetectionSettings checkDetectionSettings, byte[] bArr, int i, int i2);
}
