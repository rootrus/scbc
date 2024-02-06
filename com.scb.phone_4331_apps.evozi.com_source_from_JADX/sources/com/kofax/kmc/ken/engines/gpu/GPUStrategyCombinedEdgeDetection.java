package com.kofax.kmc.ken.engines.gpu;

import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import p040o.HmlPinActivity;

public class GPUStrategyCombinedEdgeDetection extends GPUStrategyEdgeDetection {

    /* renamed from: hd */
    private C0462f f368hd = null;

    @HmlPinActivity
    GPUStrategyCombinedEdgeDetection(IGPUImageHolder iGPUImageHolder) {
        super(iGPUImageHolder);
    }

    public void setRotation(Rotation rotation) {
        super.setRotation(rotation);
        C0462f fVar = this.f368hd;
        if (fVar != null) {
            fVar.setRotation(rotation);
        }
    }

    public void setScaleType(ScaleType scaleType) {
        super.setScaleType(scaleType);
        C0462f fVar = this.f368hd;
        if (fVar != null) {
            fVar.setScaleType(scaleType);
        }
    }

    public float[] handleData(byte[] bArr, int i, int i2, DocumentDetectionSettings documentDetectionSettings) {
        if (this.f368hd == null) {
            C0462f fVar = new C0462f(new C0449a());
            this.f368hd = fVar;
            fVar.setRotation(getRotation());
            this.f368hd.setScaleType(getScaleType());
        }
        this.f368hd.setSettings(documentDetectionSettings);
        super.handleData(bArr, i, i2, this.f368hd);
        return this.f368hd.getBounds();
    }

    public void destroy() {
        C0462f fVar = this.f368hd;
        if (fVar != null) {
            fVar.destroy();
            this.f368hd = null;
        }
        super.destroy();
    }
}
