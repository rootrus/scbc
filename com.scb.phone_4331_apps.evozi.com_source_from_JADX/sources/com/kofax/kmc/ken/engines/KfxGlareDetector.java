package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.QuickAnalysisSettings;

public class KfxGlareDetector implements IGlareDetector {

    /* renamed from: bN */
    private final IGlareDetector f3344bN;

    public KfxGlareDetector() {
        this((IGlareDetector) null);
    }

    KfxGlareDetector(IGlareDetector iGlareDetector) {
        this.f3344bN = iGlareDetector == null ? new C7871j() : iGlareDetector;
    }

    public final boolean detectGlare(QuickAnalysisSettings quickAnalysisSettings, Bitmap bitmap) {
        return this.f3344bN.detectGlare(quickAnalysisSettings, bitmap);
    }
}
