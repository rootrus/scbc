package com.kofax.kmc.ken.engines.gpu;

import android.os.Build;
import java.io.Serializable;

public class GPUSettings implements Serializable {

    /* renamed from: gZ */
    private static final GPUSettings f364gZ = new GPUSettings();
    public int barnsenRadius;
    public float barnsenThreshold;
    public int contrastFactorDivider = 8;
    public float contrastThreshold;
    public float edgeLowThreshold;
    public boolean enableBarnsen;
    public boolean enableBarnsenOLC;
    public boolean enableGlobalAdaptiveThreshold;
    public boolean enableGlobalAdaptiveThresholdOLC;
    public boolean enableLocalAdaptiveThreshold;
    public boolean enableLocalAdaptiveThresholdOLC;
    public boolean enableRgbSobel;
    public boolean enableRgbSobelOLC;
    public float localAdaptiveThreshold;
    public int localAdaptiveThresholdRadius;
    public float maxAspectRatio;
    public float relativeAreaRatio;
    public float rgbSobelEdgeStrength;
    public float scaleFactor;
    public boolean showProcessedImageAndBounds;

    public static GPUSettings getSettings() {
        return f364gZ;
    }

    protected GPUSettings() {
        setDefaults();
    }

    /* access modifiers changed from: protected */
    public void setDefaults() {
        this.showProcessedImageAndBounds = false;
        this.scaleFactor = 0.2f;
        this.relativeAreaRatio = 0.2f;
        this.maxAspectRatio = 4.0f;
        this.rgbSobelEdgeStrength = 0.16666667f;
        this.edgeLowThreshold = 0.11764706f;
        this.contrastThreshold = 0.1f;
        this.localAdaptiveThresholdRadius = 4;
        this.localAdaptiveThreshold = 0.05f;
        this.barnsenRadius = 4;
        this.barnsenThreshold = 0.1f;
        this.enableRgbSobel = true;
        if (isSamsungS4()) {
            this.enableGlobalAdaptiveThreshold = false;
            this.enableLocalAdaptiveThreshold = false;
            this.enableBarnsen = false;
        } else {
            this.enableGlobalAdaptiveThreshold = true;
            this.enableLocalAdaptiveThreshold = true;
            this.enableBarnsen = true;
        }
        this.enableRgbSobelOLC = false;
        this.enableGlobalAdaptiveThresholdOLC = true;
        this.enableLocalAdaptiveThresholdOLC = false;
        this.enableBarnsenOLC = true;
    }

    public static boolean isSamsungS4() {
        return Build.MANUFACTURER.equalsIgnoreCase("Samsung") && Build.MODEL.equalsIgnoreCase("GT-I9500");
    }
}
