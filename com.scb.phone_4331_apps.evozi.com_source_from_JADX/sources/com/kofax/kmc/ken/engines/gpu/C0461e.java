package com.kofax.kmc.ken.engines.gpu;

import android.graphics.Point;
import android.graphics.Rect;
import android.opengl.GLES20;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.kmc.ken.engines.gpu.shaders.BarnsenShader;
import com.kofax.kmc.ken.engines.gpu.shaders.GlobalThresholdShader;
import com.kofax.kmc.ken.engines.gpu.shaders.LocalAdaptiveThresholdShader;
import com.kofax.kmc.ken.engines.gpu.shaders.PassThroughShader;
import com.kofax.kmc.ken.engines.gpu.shaders.RgbSobelShader;
import com.kofax.kmc.ken.engines.gpu.shaders.ScaleHistogramShader;
import com.kofax.kmc.kut.utilities.RectUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.kofax.kmc.ken.engines.gpu.e */
abstract class C0461e extends ImageProcessor {

    /* renamed from: fH */
    static final float[] f442fH = {-1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f};

    /* renamed from: fD */
    protected OpenGLESContextManager f443fD;

    /* renamed from: fG */
    private FloatBuffer f444fG;

    /* renamed from: fK */
    private FloatBuffer f445fK;

    /* renamed from: fO */
    private int f446fO = 0;

    /* renamed from: fP */
    private int f447fP = 0;

    /* renamed from: fY */
    private FrameBufferTexture f448fY = null;

    /* renamed from: fZ */
    private int f449fZ = 0;

    /* renamed from: gA */
    protected LocalAdaptiveThresholdShader f450gA;

    /* renamed from: gB */
    protected BarnsenShader f451gB;

    /* renamed from: gC */
    private FrameBufferTexture f452gC = null;

    /* renamed from: gD */
    private FrameBufferTexture f453gD = null;

    /* renamed from: gE */
    private FrameBufferTexture f454gE = null;

    /* renamed from: gF */
    protected float[] f455gF = null;

    /* renamed from: ga */
    private int f456ga = 0;

    /* renamed from: gc */
    private ByteBuffer f457gc = null;

    /* renamed from: gd */
    private ByteBuffer f458gd = null;

    /* renamed from: gg */
    protected PassThroughShader f459gg;

    /* renamed from: gx */
    protected RgbSobelShader f460gx;

    /* renamed from: gy */
    protected GlobalThresholdShader f461gy;

    /* renamed from: gz */
    protected ScaleHistogramShader f462gz;

    public void processByteData(byte[] bArr, int i, int i2) {
    }

    public C0461e() {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f442fH.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f444fG = asFloatBuffer;
        asFloatBuffer.put(f442fH).position(0);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_ROTATED_270.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f445fK = asFloatBuffer2;
        asFloatBuffer2.clear();
        this.f445fK.put(TextureRotationUtil.TEXTURE_ROTATED_270).position(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10417a(FrameBufferTexture frameBufferTexture) {
        this.f455gF = null;
        m361V();
        FrameBufferTexture frameBufferTexture2 = this.f448fY;
        if (frameBufferTexture2 != null) {
            m365d(frameBufferTexture, frameBufferTexture2);
            boolean e = m366e(this.f448fY, this.f452gC);
            FrameBufferTexture frameBufferTexture3 = this.f452gC;
            this.f454gE = frameBufferTexture3;
            if (e) {
                this.f455gF = m364b(frameBufferTexture3, (ByteBuffer) null, GPUSettings.getSettings().enableRgbSobelOLC);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10418b(FrameBufferTexture frameBufferTexture) {
        this.f455gF = null;
        m361V();
        FrameBufferTexture frameBufferTexture2 = this.f448fY;
        if (frameBufferTexture2 == null) {
            return;
        }
        if (m367f(frameBufferTexture, frameBufferTexture2)) {
            ByteBuffer g = m368g(this.f448fY, this.f452gC);
            FrameBufferTexture frameBufferTexture3 = this.f452gC;
            this.f454gE = frameBufferTexture3;
            this.f455gF = m364b(frameBufferTexture3, g, GPUSettings.getSettings().enableGlobalAdaptiveThresholdOLC);
            return;
        }
        this.f454gE = this.f448fY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo10419c(FrameBufferTexture frameBufferTexture) {
        this.f455gF = null;
        m361V();
        FrameBufferTexture frameBufferTexture2 = this.f448fY;
        if (frameBufferTexture2 == null) {
            return;
        }
        if (m367f(frameBufferTexture, frameBufferTexture2)) {
            FrameBufferTexture frameBufferTexture3 = this.f448fY;
            m362a(frameBufferTexture3, frameBufferTexture3, this.f452gC);
            FrameBufferTexture frameBufferTexture4 = this.f448fY;
            this.f454gE = frameBufferTexture4;
            this.f455gF = m364b(frameBufferTexture4, (ByteBuffer) null, GPUSettings.getSettings().enableLocalAdaptiveThresholdOLC);
            return;
        }
        this.f454gE = this.f448fY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo10420d(FrameBufferTexture frameBufferTexture) {
        this.f455gF = null;
        m361V();
        FrameBufferTexture frameBufferTexture2 = this.f448fY;
        if (frameBufferTexture2 != null) {
            m363b(frameBufferTexture, frameBufferTexture2, this.f452gC);
            FrameBufferTexture frameBufferTexture3 = this.f448fY;
            this.f454gE = frameBufferTexture3;
            this.f455gF = m364b(frameBufferTexture3, (ByteBuffer) null, GPUSettings.getSettings().enableBarnsenOLC);
        }
    }

    public FrameBufferTexture getProcessedTexture() {
        return this.f454gE;
    }

    public float[] getBounds() {
        return this.f455gF;
    }

    public void destroy() {
        FrameBufferTexture frameBufferTexture = this.f448fY;
        if (frameBufferTexture != null) {
            frameBufferTexture.destroy();
            this.f448fY = null;
        }
        FrameBufferTexture frameBufferTexture2 = this.f452gC;
        if (frameBufferTexture2 != null) {
            frameBufferTexture2.destroy();
            this.f452gC = null;
        }
        FrameBufferTexture frameBufferTexture3 = this.f453gD;
        if (frameBufferTexture3 != null) {
            frameBufferTexture3.destroy();
            this.f453gD = null;
        }
        RgbSobelShader rgbSobelShader = this.f460gx;
        if (rgbSobelShader != null) {
            rgbSobelShader.destroy();
            this.f460gx = null;
        }
        GlobalThresholdShader globalThresholdShader = this.f461gy;
        if (globalThresholdShader != null) {
            globalThresholdShader.destroy();
            this.f461gy = null;
        }
        ScaleHistogramShader scaleHistogramShader = this.f462gz;
        if (scaleHistogramShader != null) {
            scaleHistogramShader.destroy();
            this.f462gz = null;
        }
        LocalAdaptiveThresholdShader localAdaptiveThresholdShader = this.f450gA;
        if (localAdaptiveThresholdShader != null) {
            localAdaptiveThresholdShader.destroy();
            this.f450gA = null;
        }
        BarnsenShader barnsenShader = this.f451gB;
        if (barnsenShader != null) {
            barnsenShader.destroy();
            this.f451gB = null;
        }
        PassThroughShader passThroughShader = this.f459gg;
        if (passThroughShader != null) {
            passThroughShader.destroy();
            this.f459gg = null;
        }
    }

    public void setPreviewResoution(int i, int i2) {
        this.f446fO = i;
        this.f447fP = i2;
    }

    public void setResizedResolution(int i, int i2) {
        this.f449fZ = i;
        this.f456ga = i2;
    }

    /* renamed from: d */
    private void m365d(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2) {
        FrameBufferTexture frameBufferTexture3 = frameBufferTexture;
        FrameBufferTexture frameBufferTexture4 = frameBufferTexture2;
        GLES20.glBindFramebuffer(36160, frameBufferTexture4.mFrameBuffer);
        GLES20.glViewport(0, 0, frameBufferTexture4.mWidth, frameBufferTexture4.mHeight);
        RgbSobelShader rgbSobelShader = this.f460gx;
        GLES20.glUseProgram(rgbSobelShader.getProgram());
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f444fG);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f445fK);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glBindTexture(3553, frameBufferTexture3.mTexture);
        float f = 1.0f / ((float) frameBufferTexture3.mHeight);
        float f2 = GPUSettings.getSettings().rgbSobelEdgeStrength;
        GLES20.glUniform1f(rgbSobelShader.getTexelWidthUniform(), 1.0f / ((float) frameBufferTexture3.mWidth));
        GLES20.glUniform1f(rgbSobelShader.getTexelHeightUniform(), f);
        GLES20.glUniform1f(rgbSobelShader.getEdgeStrengthUniform(), f2);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: e */
    private boolean m366e(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2) {
        FrameBufferTexture frameBufferTexture3 = frameBufferTexture;
        FrameBufferTexture frameBufferTexture4 = frameBufferTexture2;
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, frameBufferTexture3.mFrameBuffer);
        GLES20.glViewport(0, 0, frameBufferTexture3.mWidth, frameBufferTexture3.mHeight);
        if (this.f457gc == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((frameBufferTexture3.mWidth * frameBufferTexture3.mHeight) << 2);
            this.f457gc = allocateDirect;
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        }
        GLES20.glReadPixels(0, 0, frameBufferTexture3.mWidth, frameBufferTexture3.mHeight, 6408, 5121, this.f457gc);
        byte[] array = this.f457gc.array();
        int i = frameBufferTexture3.mWidth << 2;
        byte b = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < frameBufferTexture3.mHeight; i3++) {
            for (int i4 = 0; i4 < i; i4 += 4) {
                byte b2 = array[i2 + i4] & 255;
                if (b < b2) {
                    b = b2;
                }
            }
            i2 += i;
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = (float) b;
        if (f2 / 255.0f >= GPUSettings.getSettings().contrastThreshold) {
            f = 255.0f / f2;
        }
        GLES20.glBindFramebuffer(36160, frameBufferTexture4.mFrameBuffer);
        GLES20.glViewport(0, 0, frameBufferTexture4.mWidth, frameBufferTexture4.mHeight);
        GlobalThresholdShader globalThresholdShader = this.f461gy;
        GLES20.glUseProgram(globalThresholdShader.getProgram());
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f444fG);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f445fK);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glBindTexture(3553, frameBufferTexture3.mTexture);
        GLES20.glUniform1f(globalThresholdShader.getThresholdUniform(), GPUSettings.getSettings().edgeLowThreshold);
        GLES20.glUniform1f(globalThresholdShader.getScaleFactorUniform(), f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        if (((double) f) > 0.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private float[] m364b(FrameBufferTexture frameBufferTexture, ByteBuffer byteBuffer, boolean z) {
        byte[] bArr;
        FrameBufferTexture frameBufferTexture2 = frameBufferTexture;
        if (byteBuffer != null) {
            bArr = byteBuffer.array();
        } else {
            GLES20.glFinish();
            GLES20.glBindFramebuffer(36160, frameBufferTexture2.mFrameBuffer);
            GLES20.glViewport(0, 0, frameBufferTexture2.mWidth, frameBufferTexture2.mHeight);
            if (this.f457gc == null) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect((frameBufferTexture2.mWidth * frameBufferTexture2.mHeight) << 2);
                this.f457gc = allocateDirect;
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            }
            GLES20.glReadPixels(0, 0, frameBufferTexture2.mWidth, frameBufferTexture2.mHeight, 6408, 5121, this.f457gc);
            byte[] array = this.f457gc.array();
            if (this.f458gd == null) {
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(frameBufferTexture2.mWidth * frameBufferTexture2.mHeight);
                this.f458gd = allocateDirect2;
                allocateDirect2.order(ByteOrder.nativeOrder());
            }
            byte[] array2 = this.f458gd.array();
            int i = frameBufferTexture2.mWidth;
            int i2 = frameBufferTexture2.mHeight;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * i2) {
                array2[i3] = array[i4];
                i3++;
                i4 += 4;
            }
            bArr = array2;
        }
        float[] fArr = new float[8];
        if (this.mSettings == null) {
            this.mSettings = new DocumentDetectionSettings();
        }
        Rect createTargetRect = RectUtil.createTargetRect(this.mSettings.getTargetFramePaddingPercent(), this.mSettings.getTargetFrameAspectRatio(), this.mSettings.getCenterPoint() != null ? new Point((this.mSettings.getCenterPoint().x * frameBufferTexture2.mWidth) / this.f446fO, (this.mSettings.getCenterPoint().y * frameBufferTexture2.mHeight) / this.f447fP) : null, frameBufferTexture2.mWidth, frameBufferTexture2.mHeight);
        if (!GPUImageNativeLibrary.DetectBounds(bArr, frameBufferTexture2.mWidth, frameBufferTexture2.mHeight, Math.min(((((float) createTargetRect.width()) * ((float) createTargetRect.height())) / (((float) frameBufferTexture2.mWidth) * ((float) frameBufferTexture2.mHeight))) * 0.5f, GPUSettings.getSettings().relativeAreaRatio), GPUSettings.getSettings().maxAspectRatio, (float) this.mSettings.getTargetFrameAspectRatio(), z, fArr)) {
            return null;
        }
        fArr[0] = ((float) this.f446fO) * (fArr[0] / ((float) frameBufferTexture2.mWidth));
        fArr[1] = ((float) this.f447fP) * (fArr[1] / ((float) frameBufferTexture2.mHeight));
        fArr[2] = ((float) this.f446fO) * (fArr[2] / ((float) frameBufferTexture2.mWidth));
        fArr[3] = ((float) this.f447fP) * (fArr[3] / ((float) frameBufferTexture2.mHeight));
        fArr[4] = ((float) this.f446fO) * (fArr[4] / ((float) frameBufferTexture2.mWidth));
        fArr[5] = ((float) this.f447fP) * (fArr[5] / ((float) frameBufferTexture2.mHeight));
        fArr[6] = ((float) this.f446fO) * (fArr[6] / ((float) frameBufferTexture2.mWidth));
        fArr[7] = ((float) this.f447fP) * (fArr[7] / ((float) frameBufferTexture2.mHeight));
        return fArr;
    }

    /* renamed from: V */
    private void m361V() {
        int i;
        int i2;
        if (this.f448fY == null && (i = this.f449fZ) != 0 && (i2 = this.f456ga) != 0) {
            this.f448fY = new FrameBufferTexture(i, i2);
            this.f452gC = new FrameBufferTexture(this.f449fZ, this.f456ga);
            OpenGLESContextManager openGLESContextManager = new OpenGLESContextManager();
            this.f443fD = openGLESContextManager;
            this.f460gx = new RgbSobelShader(openGLESContextManager);
            this.f461gy = new GlobalThresholdShader(this.f443fD);
            this.f462gz = new ScaleHistogramShader(this.f443fD);
            this.f450gA = new LocalAdaptiveThresholdShader(this.f443fD);
            this.f451gB = new BarnsenShader(this.f443fD);
            this.f459gg = new PassThroughShader(this.f443fD);
        }
    }

    /* renamed from: f */
    private boolean m367f(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2) {
        FrameBufferTexture frameBufferTexture3 = frameBufferTexture;
        FrameBufferTexture frameBufferTexture4 = frameBufferTexture2;
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, frameBufferTexture3.mFrameBuffer);
        GLES20.glViewport(0, 0, frameBufferTexture3.mWidth, frameBufferTexture3.mHeight);
        if (this.f457gc == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((frameBufferTexture3.mWidth * frameBufferTexture3.mHeight) << 2);
            this.f457gc = allocateDirect;
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        }
        GLES20.glReadPixels(0, 0, frameBufferTexture3.mWidth, frameBufferTexture3.mHeight, 6408, 5121, this.f457gc);
        byte[] array = this.f457gc.array();
        int i = frameBufferTexture3.mWidth << 2;
        byte b = 0;
        int i2 = 0;
        byte b2 = 255;
        for (int i3 = 0; i3 < frameBufferTexture3.mHeight; i3++) {
            for (int i4 = 0; i4 < i; i4 += 4) {
                byte b3 = array[i2 + i4] & 255;
                if (b3 > b) {
                    b = b3;
                }
                if (b3 < b2) {
                    b2 = b3;
                }
            }
            i2 += i;
        }
        float f = (float) (b - b2);
        float f2 = f / 255.0f >= GPUSettings.getSettings().contrastThreshold ? 255.0f / f : 0.0f;
        GLES20.glBindFramebuffer(36160, frameBufferTexture4.mFrameBuffer);
        GLES20.glViewport(0, 0, frameBufferTexture4.mWidth, frameBufferTexture4.mHeight);
        ScaleHistogramShader scaleHistogramShader = this.f462gz;
        GLES20.glUseProgram(scaleHistogramShader.getProgram());
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f444fG);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f445fK);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glBindTexture(3553, frameBufferTexture3.mTexture);
        GLES20.glUniform1f(scaleHistogramShader.getMinValueUniform(), ((float) b2) / 255.0f);
        GLES20.glUniform1f(scaleHistogramShader.getScaleFactorUniform(), f2);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m362a(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2, FrameBufferTexture frameBufferTexture3) {
        FrameBufferTexture frameBufferTexture4 = frameBufferTexture;
        FrameBufferTexture frameBufferTexture5 = frameBufferTexture2;
        FrameBufferTexture frameBufferTexture6 = frameBufferTexture3;
        LocalAdaptiveThresholdShader localAdaptiveThresholdShader = this.f450gA;
        GLES20.glBindFramebuffer(36160, frameBufferTexture6.mFrameBuffer);
        GLES20.glViewport(0, 0, frameBufferTexture6.mWidth, frameBufferTexture6.mHeight);
        localAdaptiveThresholdShader.setRadius(GPUSettings.getSettings().localAdaptiveThresholdRadius);
        GLES20.glUseProgram(localAdaptiveThresholdShader.getFirstPassProgram());
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f444fG);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f445fK);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glBindTexture(3553, frameBufferTexture4.mTexture);
        float f = GPUSettings.getSettings().localAdaptiveThreshold;
        GLES20.glUniform1f(localAdaptiveThresholdShader.getFirstPassTexelWidthUniform(), 1.0f / ((float) frameBufferTexture4.mWidth));
        GLES20.glUniform1f(localAdaptiveThresholdShader.getFirstPassTexelHeightUniform(), BitmapDescriptorFactory.HUE_RED);
        GLES20.glUniform1f(localAdaptiveThresholdShader.getFirstPassThresholdUniform(), f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, frameBufferTexture5.mFrameBuffer);
        GLES20.glViewport(0, 0, frameBufferTexture5.mWidth, frameBufferTexture5.mHeight);
        GLES20.glUseProgram(localAdaptiveThresholdShader.getSecondPassProgram());
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f444fG);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f445fK);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glBindTexture(3553, frameBufferTexture6.mTexture);
        float f2 = 1.0f / ((float) frameBufferTexture6.mHeight);
        float f3 = GPUSettings.getSettings().localAdaptiveThreshold;
        GLES20.glUniform1f(localAdaptiveThresholdShader.getSecondPassTexelWidthUniform(), BitmapDescriptorFactory.HUE_RED);
        GLES20.glUniform1f(localAdaptiveThresholdShader.getSecondPassTexelHeightUniform(), f2);
        GLES20.glUniform1f(localAdaptiveThresholdShader.getSecondPassThresholdUniform(), f3);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: g */
    private ByteBuffer m368g(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2) {
        FrameBufferTexture frameBufferTexture3 = frameBufferTexture;
        FrameBufferTexture frameBufferTexture4 = frameBufferTexture2;
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, frameBufferTexture3.mFrameBuffer);
        GLES20.glViewport(0, 0, frameBufferTexture3.mWidth, frameBufferTexture3.mHeight);
        if (this.f457gc == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((frameBufferTexture3.mWidth * frameBufferTexture3.mHeight) << 2);
            this.f457gc = allocateDirect;
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        }
        if (this.f458gd == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(frameBufferTexture3.mWidth * frameBufferTexture3.mHeight);
            this.f458gd = allocateDirect2;
            allocateDirect2.order(ByteOrder.nativeOrder());
        }
        GLES20.glReadPixels(0, 0, frameBufferTexture3.mWidth, frameBufferTexture3.mHeight, 6408, 5121, this.f457gc);
        byte[] array = this.f457gc.array();
        byte[] array2 = this.f458gd.array();
        int i = frameBufferTexture3.mWidth * frameBufferTexture3.mHeight;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            array2[i2] = array[i3];
            i2++;
            i3 += 4;
        }
        GPUImageNativeLibrary.OtsyThreshold(array2, frameBufferTexture3.mWidth, frameBufferTexture3.mHeight, 30.0f, 255.0f);
        if (GPUSettings.getSettings().showProcessedImageAndBounds) {
            if (this.f453gD == null) {
                this.f453gD = new FrameBufferTexture(this.f449fZ, this.f456ga);
            }
            if (this.f453gD != null) {
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    if (array2[i5] != 0) {
                        int i6 = i4 + 1;
                        array[i4] = -1;
                        int i7 = i6 + 1;
                        array[i6] = -1;
                        int i8 = i7 + 1;
                        array[i7] = -1;
                        i4 = i8 + 1;
                        array[i8] = -1;
                    } else {
                        int i9 = i4 + 1;
                        array[i4] = 0;
                        int i10 = i9 + 1;
                        array[i9] = 0;
                        int i11 = i10 + 1;
                        array[i10] = 0;
                        i4 = i11 + 1;
                        array[i11] = -1;
                    }
                }
                this.f453gD.setTextureBuffer(this.f457gc);
                GLES20.glBindFramebuffer(36160, frameBufferTexture4.mFrameBuffer);
                GLES20.glViewport(0, 0, frameBufferTexture4.mWidth, frameBufferTexture4.mHeight);
                GLES20.glUseProgram(this.f459gg.getProgram());
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f444fG);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f445fK);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glBindTexture(3553, this.f453gD.mTexture);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glBindTexture(3553, 0);
            }
        }
        return this.f458gd;
    }

    /* renamed from: b */
    private void m363b(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2, FrameBufferTexture frameBufferTexture3) {
        FrameBufferTexture frameBufferTexture4 = frameBufferTexture;
        FrameBufferTexture frameBufferTexture5 = frameBufferTexture2;
        FrameBufferTexture frameBufferTexture6 = frameBufferTexture3;
        BarnsenShader barnsenShader = this.f451gB;
        GLES20.glBindFramebuffer(36160, frameBufferTexture6.mFrameBuffer);
        GLES20.glViewport(0, 0, frameBufferTexture6.mWidth, frameBufferTexture6.mHeight);
        barnsenShader.setRadius(GPUSettings.getSettings().barnsenRadius);
        GLES20.glUseProgram(barnsenShader.getFirstPassProgram());
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f444fG);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f445fK);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glBindTexture(3553, frameBufferTexture4.mTexture);
        float f = GPUSettings.getSettings().barnsenThreshold;
        GLES20.glUniform1f(barnsenShader.getFirstPassTexelWidthUniform(), 1.0f / ((float) frameBufferTexture4.mWidth));
        GLES20.glUniform1f(barnsenShader.getFirstPassTexelHeightUniform(), BitmapDescriptorFactory.HUE_RED);
        GLES20.glUniform1f(barnsenShader.getFirstPassThresholdUniform(), f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, frameBufferTexture5.mFrameBuffer);
        GLES20.glViewport(0, 0, frameBufferTexture5.mWidth, frameBufferTexture5.mHeight);
        GLES20.glUseProgram(barnsenShader.getSecondPassProgram());
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f444fG);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f445fK);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glBindTexture(3553, frameBufferTexture6.mTexture);
        float f2 = 1.0f / ((float) frameBufferTexture6.mHeight);
        float f3 = GPUSettings.getSettings().barnsenThreshold;
        GLES20.glUniform1f(barnsenShader.getSecondPassTexelWidthUniform(), BitmapDescriptorFactory.HUE_RED);
        GLES20.glUniform1f(barnsenShader.getSecondPassTexelHeightUniform(), f2);
        GLES20.glUniform1f(barnsenShader.getSecondPassThresholdUniform(), f3);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }
}
