package com.kofax.kmc.ken.engines.gpu;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.mobile.sdk._internal.C0518d;
import com.kofax.mobile.sdk._internal.impl.C0532a;
import com.kofax.mobile.sdk._internal.impl.C0725f;
import com.kofax.mobile.sdk._internal.impl.detection.C0668a;

public class BitmapGPUFrame extends C0668a implements GPUFrame {
    private int _maxTextureSize = 0;

    /* renamed from: fv */
    private final C0518d f351fv = new C0725f(new C0532a());

    public BitmapGPUFrame(Bitmap bitmap) {
        super(bitmap);
    }

    public float[] passTo(DocumentDetectionSettings documentDetectionSettings, GPUStrategyEdgeDetection gPUStrategyEdgeDetection) {
        Bitmap bitmap;
        int width = this._bitmap.getWidth();
        int height = this._bitmap.getHeight();
        int max = Math.max(width, height);
        int i = this._maxTextureSize;
        if (max > i && i > 0) {
            float f = ((float) i) / ((float) max);
            width = (int) (((float) width) * f);
            height = (int) (((float) height) * f);
        }
        if (width % 2 != 0) {
            width++;
        }
        if (height % 2 != 0) {
            height++;
        }
        if (width == this._bitmap.getWidth() && height == this._bitmap.getHeight()) {
            bitmap = null;
        } else {
            bitmap = Bitmap.createScaledBitmap(this._bitmap, width, height, false);
        }
        byte[] g = this.f351fv.mo11323g(bitmap != null ? bitmap : this._bitmap);
        if (bitmap != null) {
            bitmap.recycle();
        }
        float[] handleData = gPUStrategyEdgeDetection.handleData(g, width, height, documentDetectionSettings);
        float width2 = (float) (this._bitmap.getWidth() / width);
        float height2 = (float) (this._bitmap.getHeight() / height);
        if (handleData == null) {
            return null;
        }
        return new float[]{handleData[0] * width2, handleData[1] * height2, handleData[2] * width2, handleData[3] * height2, handleData[4] * width2, handleData[5] * height2, handleData[6] * width2, handleData[7] * height2};
    }

    public void setMaxTextureSize(int i) {
        this._maxTextureSize = i - 1;
    }

    public int getWidth() {
        return this._bitmap.getWidth();
    }

    public int getHeight() {
        return this._bitmap.getHeight();
    }
}
