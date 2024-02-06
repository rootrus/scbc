package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.QuickAnalysisSettings;

public interface IGlareDetector {
    boolean detectGlare(QuickAnalysisSettings quickAnalysisSettings, Bitmap bitmap);
}
