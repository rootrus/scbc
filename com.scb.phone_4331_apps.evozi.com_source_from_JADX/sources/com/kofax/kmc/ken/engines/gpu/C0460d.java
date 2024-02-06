package com.kofax.kmc.ken.engines.gpu;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: com.kofax.kmc.ken.engines.gpu.d */
class C0460d {

    /* renamed from: gr */
    private PixelBuffer f441gr;

    public C0460d(Context context) {
        if (!m360a(context)) {
            throw new IllegalStateException("OpenGL ES 2.0 is not supported on this phone.");
        }
    }

    /* renamed from: a */
    private boolean m360a(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 131072;
    }

    public Bitmap getBitmap(int i) {
        return this.f441gr.getBitmap(i);
    }

    public void handleData(byte[] bArr, int i, int i2, IGPUImageRenderer iGPUImageRenderer) {
        if (this.f441gr == null) {
            this.f441gr = new PixelBuffer(i, i2);
        }
        this.f441gr.setRenderer(iGPUImageRenderer);
        iGPUImageRenderer.onPreviewFrame(bArr, i, i2);
        this.f441gr.drawFrame();
    }

    public final void destroy() {
        PixelBuffer pixelBuffer = this.f441gr;
        if (pixelBuffer != null) {
            pixelBuffer.destroy();
            this.f441gr = null;
        }
    }
}
