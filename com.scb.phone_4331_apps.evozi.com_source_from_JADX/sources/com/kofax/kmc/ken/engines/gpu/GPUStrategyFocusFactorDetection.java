package com.kofax.kmc.ken.engines.gpu;

import android.graphics.Rect;
import p040o.HmlPinActivity;

public class GPUStrategyFocusFactorDetection extends GPUStrategy {

    /* renamed from: hf */
    private C0451b f370hf = null;

    @HmlPinActivity
    GPUStrategyFocusFactorDetection(IGPUImageHolder iGPUImageHolder) {
        super(iGPUImageHolder);
    }

    public void setRotation(Rotation rotation) {
        super.setRotation(rotation);
        C0451b bVar = this.f370hf;
        if (bVar != null) {
            bVar.setRotation(rotation);
        }
    }

    public void setScaleType(ScaleType scaleType) {
        super.setScaleType(scaleType);
        C0451b bVar = this.f370hf;
        if (bVar != null) {
            bVar.setScaleType(scaleType);
        }
    }

    public int[] handleFocus(byte[] bArr, int i, int i2, Rect rect, boolean z, boolean z2) {
        if (this.f370hf == null) {
            C0451b bVar = new C0451b();
            this.f370hf = bVar;
            bVar.setRotation(getRotation());
            this.f370hf.setScaleType(getScaleType());
        }
        this.f370hf.mo10402a(rect, z, z2);
        super.handleData(bArr, i, i2, this.f370hf);
        return this.f370hf.mo10401L();
    }

    public void destroy() {
        C0451b bVar = this.f370hf;
        if (bVar != null) {
            bVar.destroy();
            this.f370hf = null;
        }
        super.destroy();
    }
}
