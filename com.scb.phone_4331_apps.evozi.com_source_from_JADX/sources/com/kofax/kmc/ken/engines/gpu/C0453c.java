package com.kofax.kmc.ken.engines.gpu;

import com.kofax.kmc.ken.engines.gpu.ImageProcessor;

/* renamed from: com.kofax.kmc.ken.engines.gpu.c */
class C0453c extends C0461e {

    /* renamed from: gp */
    private final C0455a[] f436gp = m339Q();

    /* renamed from: com.kofax.kmc.ken.engines.gpu.c$a */
    interface C0455a {
        /* renamed from: R */
        ImageProcessor.Method mo10409R();

        /* renamed from: S */
        boolean mo10410S();

        /* renamed from: T */
        boolean mo10411T();

        /* renamed from: c */
        void mo10412c(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2);

        boolean isEnabled();
    }

    C0453c() {
    }

    public void processTexture(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2) {
        this.f455gF = null;
        for (C0455a aVar : this.f436gp) {
            if (aVar.isEnabled()) {
                aVar.mo10412c(frameBufferTexture, frameBufferTexture2);
                if (this.f455gF != null) {
                    return;
                }
            }
        }
    }

    public boolean isRGBInputTextureRequired() {
        for (C0455a aVar : this.f436gp) {
            if (aVar.isEnabled() && aVar.mo10410S()) {
                return true;
            }
        }
        return false;
    }

    public boolean isGrayScaleInputTextureRequired() {
        for (C0455a aVar : this.f436gp) {
            if (aVar.isEnabled() && aVar.mo10411T()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.kofax.kmc.ken.engines.gpu.c$e */
    class C0459e implements C0455a {
        /* renamed from: S */
        public boolean mo10410S() {
            return true;
        }

        /* renamed from: T */
        public boolean mo10411T() {
            return false;
        }

        private C0459e() {
        }

        /* renamed from: R */
        public ImageProcessor.Method mo10409R() {
            return ImageProcessor.Method.GPU_RgbSobel;
        }

        public boolean isEnabled() {
            return GPUSettings.getSettings().enableRgbSobel;
        }

        /* renamed from: c */
        public void mo10412c(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2) {
            C0453c.this.mo10417a(frameBufferTexture2);
        }
    }

    /* renamed from: com.kofax.kmc.ken.engines.gpu.c$c */
    class C0457c implements C0455a {
        /* renamed from: S */
        public boolean mo10410S() {
            return false;
        }

        /* renamed from: T */
        public boolean mo10411T() {
            return true;
        }

        private C0457c() {
        }

        /* renamed from: R */
        public ImageProcessor.Method mo10409R() {
            return ImageProcessor.Method.GPU_GlobalAdaptiveThreshold;
        }

        public boolean isEnabled() {
            return GPUSettings.getSettings().enableGlobalAdaptiveThreshold;
        }

        /* renamed from: c */
        public void mo10412c(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2) {
            C0453c.this.mo10418b(frameBufferTexture);
        }
    }

    /* renamed from: com.kofax.kmc.ken.engines.gpu.c$d */
    class C0458d implements C0455a {
        /* renamed from: S */
        public boolean mo10410S() {
            return false;
        }

        /* renamed from: T */
        public boolean mo10411T() {
            return true;
        }

        private C0458d() {
        }

        /* renamed from: R */
        public ImageProcessor.Method mo10409R() {
            return ImageProcessor.Method.GPU_LocalAdaptiveThreshold;
        }

        public boolean isEnabled() {
            return GPUSettings.getSettings().enableLocalAdaptiveThreshold;
        }

        /* renamed from: c */
        public void mo10412c(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2) {
            C0453c.this.mo10419c(frameBufferTexture);
        }
    }

    /* renamed from: com.kofax.kmc.ken.engines.gpu.c$b */
    class C0456b implements C0455a {
        /* renamed from: S */
        public boolean mo10410S() {
            return false;
        }

        /* renamed from: T */
        public boolean mo10411T() {
            return true;
        }

        private C0456b() {
        }

        /* renamed from: R */
        public ImageProcessor.Method mo10409R() {
            return ImageProcessor.Method.GPU_Barnsen;
        }

        public boolean isEnabled() {
            return GPUSettings.getSettings().enableBarnsen;
        }

        /* renamed from: c */
        public void mo10412c(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2) {
            C0453c.this.mo10420d(frameBufferTexture);
        }
    }

    /* renamed from: Q */
    private C0455a[] m339Q() {
        return new C0455a[]{new C0459e(), new C0458d(), new C0457c(), new C0456b()};
    }
}
