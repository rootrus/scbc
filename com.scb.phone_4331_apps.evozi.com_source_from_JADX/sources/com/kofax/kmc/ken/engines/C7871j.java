package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import com.kofax.android.abc.machine_vision.GlareDetector;
import com.kofax.kmc.ken.engines.data.QuickAnalysisSettings;
import java.util.Locale;

/* renamed from: com.kofax.kmc.ken.engines.j */
class C7871j implements IGlareDetector {

    /* renamed from: bJ */
    private final GlareDetector f3368bJ = new GlareDetector();

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("KfxEVRS");
        System.loadLibrary("sol_isg_mobile");
    }

    public boolean detectGlare(QuickAnalysisSettings quickAnalysisSettings, Bitmap bitmap) {
        boolean z = false;
        if (!quickAnalysisSettings.getGlareDetection()) {
            return false;
        }
        synchronized (this.f3368bJ) {
            this.f3368bJ.loadConfigurationString(m3735a(quickAnalysisSettings.getGlareDetectionIntensityFraction(), quickAnalysisSettings.getGlareDetectionIntensityThreshold(), quickAnalysisSettings.getGlareDetectionMinimumGlareAreaFraction(), quickAnalysisSettings.getGlareDetectionNumberOfTiles()), "DocumentDetection.GlareDetection");
            this.f3368bJ.grabImageFrame(bitmap);
            double detectGlare = this.f3368bJ.detectGlare();
            this.f3368bJ.releaseFrame();
            if (detectGlare >= quickAnalysisSettings.getGlareDetectedThreshold()) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        this.f3368bJ.dispose();
        super.finalize();
    }

    /* renamed from: a */
    private String m3735a(double d, int i, double d2, int i2) {
        return String.format(Locale.US, "<?xml version='1.0' encoding='iso-8859-1'?><Configuration name='Cadence'>  <Section name='DocumentDetection'>    <Section name=\"GlareDetection\">    <Parm name=\"IntensityFraction\" type=\"float\" value=\"%f\"/>    <Parm name=\"IntensityThreshold\" type=\"int\" value=\"%d\"/>    <Parm name=\"MinimumGlareAreaFraction\" type=\"float\" value=\"%f\"/>    <Parm name=\"NumberOfTiles\" type=\"int\" value=\"%d\"/>    </Section>  </Section></Configuration>", new Object[]{Double.valueOf(d), Integer.valueOf(i), Double.valueOf(d2), Integer.valueOf(i2)});
    }
}
