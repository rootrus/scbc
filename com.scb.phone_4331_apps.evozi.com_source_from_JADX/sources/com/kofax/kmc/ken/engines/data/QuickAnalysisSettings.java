package com.kofax.kmc.ken.engines.data;

import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;

public class QuickAnalysisSettings {

    /* renamed from: eE */
    private static final double f309eE = 0.99d;

    /* renamed from: eF */
    private static final double f310eF = 0.01d;

    /* renamed from: eG */
    private static final double f311eG = 0.03d;

    /* renamed from: eH */
    private static final int f312eH = 255;

    /* renamed from: eI */
    private static final int f313eI = 0;

    /* renamed from: eJ */
    private static final int f314eJ = 230;

    /* renamed from: eK */
    private static final double f315eK = 0.99d;

    /* renamed from: eL */
    private static final double f316eL = 0.01d;

    /* renamed from: eM */
    private static final double f317eM = 0.01d;

    /* renamed from: eN */
    private static final int f318eN = 1000;

    /* renamed from: eO */
    private static final int f319eO = 1;

    /* renamed from: eP */
    private static final int f320eP = 100;

    /* renamed from: eQ */
    private static final double f321eQ = 0.99d;

    /* renamed from: eR */
    private static final double f322eR = 0.01d;

    /* renamed from: eS */
    private static final double f323eS = 0.05d;

    /* renamed from: eT */
    private static final int f324eT = 50;

    /* renamed from: eU */
    private static final int f325eU = 80;

    /* renamed from: eV */
    private static final int f326eV = 0;

    /* renamed from: eW */
    private static final int f327eW = 100;

    /* renamed from: eX */
    private static final int f328eX = 0;

    /* renamed from: eY */
    private static final int f329eY = 100;

    /* renamed from: eZ */
    private boolean f330eZ = true;

    /* renamed from: fa */
    private boolean f331fa = true;

    /* renamed from: fb */
    private boolean f332fb = true;

    /* renamed from: fc */
    private boolean f333fc = true;

    /* renamed from: fd */
    private boolean f334fd = true;

    /* renamed from: fe */
    private boolean f335fe = true;

    /* renamed from: ff */
    private boolean f336ff = true;

    /* renamed from: fg */
    private double f337fg = f311eG;

    /* renamed from: fh */
    private int f338fh = f314eJ;

    /* renamed from: fi */
    private double f339fi = 0.01d;

    /* renamed from: fj */
    private int f340fj = 100;

    /* renamed from: fk */
    private double f341fk = f323eS;

    /* renamed from: fl */
    private int f342fl = 50;

    /* renamed from: fm */
    private int f343fm = 80;

    /* renamed from: fn */
    private ImagePerfectionProfile.UseMRZPassportDetection f344fn = ImagePerfectionProfile.UseMRZPassportDetection.OFF;

    /* renamed from: fo */
    private ImagePerfectionProfile.UseTargetFrameCrop f345fo = ImagePerfectionProfile.UseTargetFrameCrop.OFF;

    /* renamed from: fp */
    private ImagePerfectionProfile.UseDocumentDetectionBasedCrop f346fp = ImagePerfectionProfile.UseDocumentDetectionBasedCrop.OFF;

    public boolean getBlurDetection() {
        return this.f330eZ;
    }

    public void setBlurDetection(boolean z) {
        this.f330eZ = z;
    }

    public boolean getSaturationDetection() {
        return this.f331fa;
    }

    public void setSaturationDetection(boolean z) {
        this.f331fa = z;
    }

    public boolean getGlareDetection() {
        return this.f332fb;
    }

    public void setGlareDetection(boolean z) {
        this.f332fb = z;
    }

    public double getGlareDetectionIntensityFraction() {
        return this.f337fg;
    }

    public void setGlareDetectionIntensityFraction(double d) {
        if (d > 0.99d) {
            d = 0.99d;
        }
        if (d < 0.01d) {
            d = 0.01d;
        }
        this.f337fg = d;
    }

    public double getGlareDetectionMinimumGlareAreaFraction() {
        return this.f339fi;
    }

    public void setGlareDetectionMinimumGlareAreaFraction(double d) {
        if (d > 0.99d) {
            d = 0.99d;
        }
        if (d < 0.01d) {
            d = 0.01d;
        }
        this.f339fi = d;
    }

    public int getGlareDetectionIntensityThreshold() {
        return this.f338fh;
    }

    public void setGlareDetectionIntensityThreshold(int i) {
        if (i > 255) {
            i = 255;
        }
        if (i < 0) {
            i = 0;
        }
        this.f338fh = i;
    }

    public int getGlareDetectionNumberOfTiles() {
        return this.f340fj;
    }

    public void setGlareDetectionNumberOfTiles(int i) {
        if (i > 1000) {
            i = 1000;
        }
        if (i <= 0) {
            i = 1;
        }
        this.f340fj = i;
    }

    public double getGlareDetectedThreshold() {
        return this.f341fk;
    }

    public void setGlareDetectedThreshold(double d) {
        if (d > 0.99d) {
            d = 0.99d;
        }
        if (d < 0.01d) {
            d = 0.01d;
        }
        this.f341fk = d;
    }

    public int getBlurThreshold() {
        return this.f342fl;
    }

    public void setBlurThreshold(int i) {
        if (i > 100) {
            i = 100;
        }
        if (i < 0) {
            i = 0;
        }
        this.f342fl = i;
    }

    @Deprecated
    public int getBlurCountPercentThreshold() {
        return this.f343fm;
    }

    @Deprecated
    public void setBlurCountPercentThreshold(int i) {
        if (i > 100) {
            i = 100;
        }
        if (i < 0) {
            i = 0;
        }
        this.f343fm = i;
    }

    public boolean getSkewDetection() {
        return this.f333fc;
    }

    public void setSkewDetection(boolean z) {
        this.f333fc = z;
    }

    public boolean getShadowDetection() {
        return this.f334fd;
    }

    public void setShadowDetection(boolean z) {
        this.f334fd = z;
    }

    public boolean getMissingBordersDetection() {
        return this.f335fe;
    }

    public void setMissingBordersDetection(boolean z) {
        this.f335fe = z;
    }

    public boolean getLowContrastBackgroundDetection() {
        return this.f336ff;
    }

    public void setLowContrastBackgroundDetection(boolean z) {
        this.f336ff = z;
    }

    public ImagePerfectionProfile.UseMRZPassportDetection getUseMRZPassportDetection() {
        return this.f344fn;
    }

    public void setUseMRZPassportDetection(ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection) {
        if (useMRZPassportDetection != null) {
            this.f344fn = useMRZPassportDetection;
            return;
        }
        throw new NullPointerException("useMRZPassportDetection parameter is null");
    }

    public ImagePerfectionProfile.UseTargetFrameCrop getUseTargetFrameCrop() {
        return this.f345fo;
    }

    public void setUseTargetFrameCrop(ImagePerfectionProfile.UseTargetFrameCrop useTargetFrameCrop) {
        if (useTargetFrameCrop != null) {
            this.f345fo = useTargetFrameCrop;
            return;
        }
        throw new NullPointerException("useTargetFrameCrop parameter is null");
    }

    public ImagePerfectionProfile.UseDocumentDetectionBasedCrop getUseDocumentDetectionBasedCrop() {
        return this.f346fp;
    }

    public void setUseDocumentDetectionBasedCrop(ImagePerfectionProfile.UseDocumentDetectionBasedCrop useDocumentDetectionBasedCrop) {
        if (useDocumentDetectionBasedCrop != null) {
            this.f346fp = useDocumentDetectionBasedCrop;
            return;
        }
        throw new NullPointerException("useDocumentDetectionBasedCrop parameter is null");
    }
}
