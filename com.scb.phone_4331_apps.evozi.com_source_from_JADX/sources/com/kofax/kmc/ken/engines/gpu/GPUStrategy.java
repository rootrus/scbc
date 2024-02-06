package com.kofax.kmc.ken.engines.gpu;

import android.graphics.Bitmap;

public abstract class GPUStrategy {

    /* renamed from: ha */
    private IGPUImageHolder f365ha = null;

    /* renamed from: hb */
    private Rotation f366hb = Rotation.NORMAL;

    /* renamed from: hc */
    private ScaleType f367hc = ScaleType.CENTER_CROP;

    GPUStrategy(IGPUImageHolder iGPUImageHolder) {
        this.f365ha = iGPUImageHolder;
        iGPUImageHolder.init();
    }

    public void setRotation(Rotation rotation) {
        this.f366hb = rotation;
    }

    public Rotation getRotation() {
        return this.f366hb;
    }

    public void setScaleType(ScaleType scaleType) {
        this.f367hc = scaleType;
    }

    public ScaleType getScaleType() {
        return this.f367hc;
    }

    public void handleData(byte[] bArr, int i, int i2, IGPUImageRenderer iGPUImageRenderer) {
        this.f365ha.handleData(bArr, i, i2, iGPUImageRenderer);
    }

    public Bitmap getBitmap(int i) {
        IGPUImageHolder iGPUImageHolder = this.f365ha;
        if (iGPUImageHolder == null) {
            return null;
        }
        return iGPUImageHolder.getBitmap(i);
    }

    public void destroy() {
        IGPUImageHolder iGPUImageHolder = this.f365ha;
        if (iGPUImageHolder != null) {
            iGPUImageHolder.destroy();
            this.f365ha = null;
        }
    }
}
