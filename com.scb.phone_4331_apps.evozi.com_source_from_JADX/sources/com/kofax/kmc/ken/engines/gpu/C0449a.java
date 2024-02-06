package com.kofax.kmc.ken.engines.gpu;

import com.kofax.kmc.ken.engines.gpu.ImageProcessor;

/* renamed from: com.kofax.kmc.ken.engines.gpu.a */
class C0449a extends C0461e {

    /* renamed from: fA */
    protected final int[] f389fA = new int[ImageProcessor.Method.GPU_End.ordinal()];

    /* renamed from: fw */
    private ImageProcessor.Method f390fw = ImageProcessor.Method.GPU_RgbSobel;

    /* renamed from: fx */
    protected final boolean[] f391fx = new boolean[ImageProcessor.Method.GPU_End.ordinal()];

    /* renamed from: fy */
    protected final int[] f392fy = new int[ImageProcessor.Method.GPU_End.ordinal()];

    /* renamed from: fz */
    protected final int[] f393fz = new int[ImageProcessor.Method.GPU_End.ordinal()];

    public C0449a() {
        this.f393fz[ImageProcessor.Method.GPU_RgbSobel.ordinal()] = 2;
        this.f393fz[ImageProcessor.Method.GPU_LocalAdaptiveThreshold.ordinal()] = 2;
        this.f393fz[ImageProcessor.Method.GPU_GlobalAdaptiveThreshold.ordinal()] = 1;
        this.f393fz[ImageProcessor.Method.GPU_Barnsen.ordinal()] = 1;
        this.f389fA[ImageProcessor.Method.GPU_RgbSobel.ordinal()] = 10;
        this.f389fA[ImageProcessor.Method.GPU_LocalAdaptiveThreshold.ordinal()] = 10;
        this.f389fA[ImageProcessor.Method.GPU_GlobalAdaptiveThreshold.ordinal()] = 6;
        this.f389fA[ImageProcessor.Method.GPU_Barnsen.ordinal()] = 4;
        for (int ordinal = ImageProcessor.Method.GPU_RgbSobel.ordinal(); ordinal < ImageProcessor.Method.GPU_End.ordinal(); ordinal++) {
            this.f392fy[ordinal] = this.f393fz[ordinal];
        }
    }

    public void processTexture(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2) {
        mo10398J();
        this.f455gF = null;
        if (mo10399K()) {
            int i = C04501.f394fB[this.f390fw.ordinal()];
            boolean z = true;
            if (i == 1) {
                mo10417a(frameBufferTexture2);
            } else if (i == 2) {
                mo10418b(frameBufferTexture);
            } else if (i == 3) {
                mo10419c(frameBufferTexture);
            } else if (i == 4) {
                mo10420d(frameBufferTexture);
            }
            if (getBounds() == null) {
                z = false;
            }
            mo10400b(z);
        }
    }

    /* renamed from: com.kofax.kmc.ken.engines.gpu.a$1 */
    static /* synthetic */ class C04501 {

        /* renamed from: fB */
        static final /* synthetic */ int[] f394fB;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.kofax.kmc.ken.engines.gpu.ImageProcessor$Method[] r0 = com.kofax.kmc.ken.engines.gpu.ImageProcessor.Method.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f394fB = r0
                com.kofax.kmc.ken.engines.gpu.ImageProcessor$Method r1 = com.kofax.kmc.ken.engines.gpu.ImageProcessor.Method.GPU_RgbSobel     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f394fB     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.ken.engines.gpu.ImageProcessor$Method r1 = com.kofax.kmc.ken.engines.gpu.ImageProcessor.Method.GPU_GlobalAdaptiveThreshold     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f394fB     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.ken.engines.gpu.ImageProcessor$Method r1 = com.kofax.kmc.ken.engines.gpu.ImageProcessor.Method.GPU_LocalAdaptiveThreshold     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f394fB     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.kofax.kmc.ken.engines.gpu.ImageProcessor$Method r1 = com.kofax.kmc.ken.engines.gpu.ImageProcessor.Method.GPU_Barnsen     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.gpu.C0449a.C04501.<clinit>():void");
        }
    }

    public boolean isRGBInputTextureRequired() {
        mo10398J();
        mo10399K();
        return this.f390fw == ImageProcessor.Method.GPU_RgbSobel;
    }

    public boolean isGrayScaleInputTextureRequired() {
        mo10398J();
        mo10399K();
        return this.f390fw != ImageProcessor.Method.GPU_RgbSobel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo10398J() {
        this.f391fx[ImageProcessor.Method.GPU_RgbSobel.ordinal()] = GPUSettings.getSettings().enableRgbSobel;
        this.f391fx[ImageProcessor.Method.GPU_GlobalAdaptiveThreshold.ordinal()] = GPUSettings.getSettings().enableGlobalAdaptiveThreshold;
        this.f391fx[ImageProcessor.Method.GPU_LocalAdaptiveThreshold.ordinal()] = GPUSettings.getSettings().enableLocalAdaptiveThreshold;
        this.f391fx[ImageProcessor.Method.GPU_Barnsen.ordinal()] = GPUSettings.getSettings().enableBarnsen;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public boolean mo10399K() {
        int ordinal = ImageProcessor.Method.GPU_RgbSobel.ordinal();
        while (!this.f391fx[this.f390fw.ordinal()] && ordinal < ImageProcessor.Method.GPU_End.ordinal()) {
            int ordinal2 = this.f390fw.ordinal() + 1;
            if (ordinal2 >= ImageProcessor.Method.GPU_End.ordinal()) {
                ordinal2 = ImageProcessor.Method.GPU_RgbSobel.ordinal();
            }
            this.f390fw = ImageProcessor.Method.values()[ordinal2];
            ordinal++;
        }
        return this.f391fx[this.f390fw.ordinal()];
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10400b(boolean z) {
        int i;
        int i2 = this.f392fy[this.f390fw.ordinal()];
        if (z) {
            i = i2 + 1;
            if (i > this.f389fA[this.f390fw.ordinal()]) {
                return;
            }
        } else {
            i = i2 - 1;
            if (i <= 0) {
                this.f392fy[this.f390fw.ordinal()] = this.f393fz[this.f390fw.ordinal()];
                int ordinal = this.f390fw.ordinal() + 1;
                if (ordinal >= ImageProcessor.Method.GPU_End.ordinal()) {
                    ordinal = ImageProcessor.Method.GPU_RgbSobel.ordinal();
                }
                this.f390fw = ImageProcessor.Method.values()[ordinal];
                return;
            }
        }
        this.f392fy[this.f390fw.ordinal()] = i;
    }
}
