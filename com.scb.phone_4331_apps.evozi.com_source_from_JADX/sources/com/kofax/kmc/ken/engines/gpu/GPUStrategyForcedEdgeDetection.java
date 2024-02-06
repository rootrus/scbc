package com.kofax.kmc.ken.engines.gpu;

import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import p040o.HmlPinActivity;

public class GPUStrategyForcedEdgeDetection extends GPUStrategyEdgeDetection {

    /* renamed from: hd */
    private C0462f f372hd = null;

    @HmlPinActivity
    GPUStrategyForcedEdgeDetection(IGPUImageHolder iGPUImageHolder) {
        super(iGPUImageHolder);
    }

    public void setRotation(Rotation rotation) {
        super.setRotation(rotation);
        C0462f fVar = this.f372hd;
        if (fVar != null) {
            fVar.setRotation(rotation);
        }
    }

    public void setScaleType(ScaleType scaleType) {
        super.setScaleType(scaleType);
        C0462f fVar = this.f372hd;
        if (fVar != null) {
            fVar.setScaleType(scaleType);
        }
    }

    public float[] handleData(byte[] bArr, int i, int i2, DocumentDetectionSettings documentDetectionSettings) {
        if (this.f372hd == null) {
            C0462f fVar = new C0462f(new C0453c());
            this.f372hd = fVar;
            fVar.setRotation(getRotation());
            this.f372hd.setScaleType(getScaleType());
        }
        this.f372hd.setSettings(documentDetectionSettings);
        super.handleData(bArr, i, i2, this.f372hd);
        return this.f372hd.getBounds();
    }

    public void destroy() {
        C0462f fVar = this.f372hd;
        if (fVar != null) {
            fVar.destroy();
            this.f372hd = null;
        }
        super.destroy();
    }
}
