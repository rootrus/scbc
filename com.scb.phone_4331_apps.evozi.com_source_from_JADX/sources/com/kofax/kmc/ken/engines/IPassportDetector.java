package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.PassportDetectionResult;
import com.kofax.kmc.ken.engines.data.PassportDetectionSettings;

public interface IPassportDetector extends IDocumentDetector<PassportDetectionSettings, PassportDetectionResult> {
    PassportDetectionResult detect(PassportDetectionSettings passportDetectionSettings, Bitmap bitmap);

    PassportDetectionResult detect(PassportDetectionSettings passportDetectionSettings, byte[] bArr, int i, int i2);
}
