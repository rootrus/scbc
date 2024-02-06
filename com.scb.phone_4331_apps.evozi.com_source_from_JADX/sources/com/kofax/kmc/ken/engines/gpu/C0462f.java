package com.kofax.kmc.ken.engines.gpu;

import android.opengl.GLES20;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.kmc.ken.engines.gpu.shaders.ColorPassThroughShader;
import com.kofax.kmc.ken.engines.gpu.shaders.GrayGaussianBlur3x3Shader;
import com.kofax.kmc.ken.engines.gpu.shaders.PassThroughShader;
import com.kofax.kmc.ken.engines.gpu.shaders.RgbGaussianBlur3x3Shader;
import com.kofax.kmc.ken.engines.gpu.shaders.YuvToRgbShader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.kofax.kmc.ken.engines.gpu.f */
class C0462f implements IGPUImageRenderer {

    /* renamed from: fC */
    public static final int f463fC = -1;

    /* renamed from: fH */
    static final float[] f464fH = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: fJ */
    static final float[] f465fJ = {-1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f};

    /* renamed from: fD */
    protected OpenGLESContextManager f466fD;

    /* renamed from: fE */
    public final Object f467fE = new Object();
    /* access modifiers changed from: private */

    /* renamed from: fF */
    public boolean f468fF = false;

    /* renamed from: fG */
    private final FloatBuffer f469fG;

    /* renamed from: fI */
    private final FloatBuffer f470fI;

    /* renamed from: fK */
    private final FloatBuffer f471fK;

    /* renamed from: fL */
    private final FloatBuffer f472fL;

    /* renamed from: fM */
    private int f473fM;

    /* renamed from: fN */
    private int f474fN;
    /* access modifiers changed from: private */

    /* renamed from: fO */
    public int f475fO;
    /* access modifiers changed from: private */

    /* renamed from: fP */
    public int f476fP;

    /* renamed from: fQ */
    protected float f477fQ;

    /* renamed from: fR */
    protected float f478fR;

    /* renamed from: fS */
    private final Queue<Runnable> f479fS = new LinkedList();

    /* renamed from: fT */
    private final Queue<Runnable> f480fT = new LinkedList();

    /* renamed from: fU */
    private Rotation f481fU;

    /* renamed from: fV */
    private ScaleType f482fV = ScaleType.CENTER_CROP;

    /* renamed from: fW */
    private FrameBufferTexture f483fW = null;

    /* renamed from: fX */
    private FrameBufferTexture f484fX = null;

    /* renamed from: fZ */
    private int f485fZ = 0;

    /* renamed from: gF */
    private float[] f486gF = null;

    /* renamed from: gG */
    private final FloatBuffer f487gG;

    /* renamed from: gH */
    private FrameBufferTexture f488gH = null;

    /* renamed from: gI */
    private long f489gI = 0;

    /* renamed from: gJ */
    private int f490gJ = 0;

    /* renamed from: gK */
    private int f491gK = 0;

    /* renamed from: gL */
    private double f492gL = 0.0d;

    /* renamed from: gM */
    private int f493gM = 0;

    /* renamed from: gN */
    long f494gN = 0;
    /* access modifiers changed from: private */

    /* renamed from: gO */
    public ByteBuffer f495gO;
    /* access modifiers changed from: private */

    /* renamed from: gP */
    public int f496gP = -1;
    /* access modifiers changed from: private */

    /* renamed from: gQ */
    public boolean f497gQ = false;
    /* access modifiers changed from: private */

    /* renamed from: gR */
    public boolean f498gR = false;

    /* renamed from: gS */
    protected ColorPassThroughShader f499gS;

    /* renamed from: gT */
    protected GrayGaussianBlur3x3Shader f500gT;

    /* renamed from: gU */
    protected RgbGaussianBlur3x3Shader f501gU;

    /* renamed from: gV */
    protected YuvToRgbShader f502gV;

    /* renamed from: gW */
    protected ImageProcessor f503gW = null;

    /* renamed from: gX */
    protected boolean f504gX = false;

    /* renamed from: ga */
    private int f505ga = 0;
    /* access modifiers changed from: private */

    /* renamed from: gb */
    public ByteBuffer f506gb;
    /* access modifiers changed from: private */

    /* renamed from: ge */
    public int f507ge = -1;

    /* renamed from: gf */
    private int f508gf = -1;

    /* renamed from: gg */
    protected PassThroughShader f509gg;

    /* renamed from: a */
    private float m378a(float f, float f2) {
        return f != BitmapDescriptorFactory.HUE_RED ? 1.0f - f2 : f2;
    }

    public C0462f(ImageProcessor imageProcessor) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f464fH.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f469fG = asFloatBuffer;
        asFloatBuffer.put(f464fH).position(0);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(f465fJ.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f470fI = asFloatBuffer2;
        asFloatBuffer2.put(f465fJ).position(0);
        FloatBuffer asFloatBuffer3 = ByteBuffer.allocateDirect(f464fH.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f487gG = asFloatBuffer3;
        asFloatBuffer3.put(f464fH).position(0);
        this.f471fK = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_NO_ROTATION.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        FloatBuffer asFloatBuffer4 = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_ROTATED_270.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f472fL = asFloatBuffer4;
        asFloatBuffer4.clear();
        this.f472fL.put(TextureRotationUtil.TEXTURE_ROTATED_270).position(0);
        setRotation(Rotation.NORMAL);
        this.f504gX = false;
        this.f504gX = true;
        this.f503gW = imageProcessor;
    }

    public float[] getBounds() {
        return this.f486gF;
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        GLES20.glDisable(2929);
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f473fM = i;
        this.f474fN = i2;
        GLES20.glViewport(0, 0, i, i2);
        m375P();
        synchronized (this.f467fE) {
            this.f467fE.notifyAll();
        }
    }

    public void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            m382a(this.f479fS);
            m373M();
            if (this.f468fF) {
                if (this.f489gI == 0) {
                    this.f489gI = currentTimeMillis;
                }
                if (!(this.f507ge == -1 || this.f483fW == null)) {
                    m374N();
                }
                this.f486gF = null;
                this.f484fX = null;
                if (!(this.f483fW == null || this.f503gW == null)) {
                    if (this.f504gX) {
                        int[] iArr = new int[1];
                        int[] iArr2 = new int[4];
                        GLES20.glGetIntegerv(36006, iArr, 0);
                        GLES20.glGetIntegerv(2978, iArr2, 0);
                        this.f503gW.processTexture(this.f483fW, this.f488gH);
                        GLES20.glBindFramebuffer(36160, iArr[0]);
                        GLES20.glViewport(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    }
                    if (GPUSettings.getSettings().showProcessedImageAndBounds) {
                        this.f484fX = this.f503gW.getProcessedTexture();
                    }
                    this.f486gF = this.f503gW.getBounds();
                }
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            if (GPUSettings.getSettings().showProcessedImageAndBounds) {
                if (this.f484fX == null) {
                    this.f484fX = this.f497gQ ? this.f488gH : this.f483fW;
                }
                m395e(this.f484fX);
                m383a(this.f486gF);
            }
            m382a(this.f480fT);
            if (this.f468fF && this.f483fW != null) {
                this.f491gK++;
                int i = this.f493gM + 1;
                this.f493gM = i;
                long j = this.f494gN + (currentTimeMillis2 - currentTimeMillis);
                this.f494gN = j;
                if (i % 50 == 0) {
                    this.f492gL = ((double) j) / ((double) i);
                    this.f494gN = 0;
                    this.f493gM = 0;
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                long j2 = currentTimeMillis3 - this.f489gI;
                if (j2 >= 1000) {
                    this.f489gI = currentTimeMillis3;
                    this.f490gJ = (int) ((((float) this.f491gK) * 1000.0f) / ((float) j2));
                    this.f491gK = 0;
                }
            }
        }
    }

    /* renamed from: M */
    private void m373M() {
        if (this.f466fD == null) {
            OpenGLESContextManager openGLESContextManager = new OpenGLESContextManager();
            this.f466fD = openGLESContextManager;
            this.f509gg = new PassThroughShader(openGLESContextManager);
            this.f499gS = new ColorPassThroughShader(this.f466fD);
            this.f500gT = new GrayGaussianBlur3x3Shader(this.f466fD);
            this.f501gU = new RgbGaussianBlur3x3Shader(this.f466fD);
            this.f502gV = new YuvToRgbShader(this.f466fD);
        }
        if (this.f483fW == null && this.f475fO != 0 && this.f476fP != 0) {
            float f = GPUSettings.getSettings().scaleFactor;
            int i = (int) (((float) this.f475fO) * f);
            this.f485fZ = i;
            if (i % 2 != 0) {
                this.f485fZ = i + 1;
            }
            int i2 = (int) (f * ((float) this.f476fP));
            this.f505ga = i2;
            if (i2 % 2 != 0) {
                this.f505ga = i2 + 1;
            }
            ImageProcessor imageProcessor = this.f503gW;
            if (imageProcessor != null) {
                imageProcessor.setResizedResolution(this.f485fZ, this.f505ga);
            }
            this.f483fW = new FrameBufferTexture(this.f485fZ, this.f505ga);
            if (this.f488gH == null) {
                this.f488gH = new FrameBufferTexture(this.f485fZ, this.f505ga);
            }
        }
    }

    /* renamed from: N */
    private void m374N() {
        int[] iArr = new int[1];
        int[] iArr2 = new int[4];
        GLES20.glGetIntegerv(36006, iArr, 0);
        GLES20.glGetIntegerv(2978, iArr2, 0);
        if (this.f497gQ) {
            GLES20.glBindFramebuffer(36160, this.f483fW.mFrameBuffer);
            GLES20.glViewport(0, 0, this.f483fW.mWidth, this.f483fW.mHeight);
            m376W();
            m398h(this.f483fW, this.f488gH);
        }
        if (this.f498gR) {
            GLES20.glBindFramebuffer(36160, this.f483fW.mFrameBuffer);
            GLES20.glViewport(0, 0, this.f483fW.mWidth, this.f483fW.mHeight);
            m377X();
        }
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glViewport(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
    }

    /* renamed from: W */
    private void m376W() {
        YuvToRgbShader yuvToRgbShader = this.f502gV;
        GLES20.glUseProgram(yuvToRgbShader.getProgram());
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f470fI);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f472fL);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f507ge);
        GLES20.glUniform1i(yuvToRgbShader.getYTextureUniform(), 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.f496gP);
        GLES20.glUniform1i(yuvToRgbShader.getUVTextureUniform(), 1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: X */
    private void m377X() {
        GrayGaussianBlur3x3Shader grayGaussianBlur3x3Shader = this.f500gT;
        GLES20.glUseProgram(grayGaussianBlur3x3Shader.getProgram());
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f470fI);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f472fL);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glBindTexture(3553, this.f507ge);
        float f = 1.0f / ((float) this.f476fP);
        GLES20.glUniform1f(grayGaussianBlur3x3Shader.getTexelWidthUniform(), 1.0f / ((float) this.f475fO));
        GLES20.glUniform1f(grayGaussianBlur3x3Shader.getTexelHeightUniform(), f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: h */
    private void m398h(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2) {
        FrameBufferTexture frameBufferTexture3 = frameBufferTexture;
        FrameBufferTexture frameBufferTexture4 = frameBufferTexture2;
        GLES20.glBindFramebuffer(36160, frameBufferTexture4.mFrameBuffer);
        GLES20.glViewport(0, 0, frameBufferTexture4.mWidth, frameBufferTexture4.mHeight);
        RgbGaussianBlur3x3Shader rgbGaussianBlur3x3Shader = this.f501gU;
        GLES20.glUseProgram(rgbGaussianBlur3x3Shader.getProgram());
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f470fI);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f472fL);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glBindTexture(3553, frameBufferTexture3.mTexture);
        float f = 1.0f / ((float) frameBufferTexture3.mHeight);
        GLES20.glUniform1f(rgbGaussianBlur3x3Shader.getTexelWidthUniform(), 1.0f / ((float) frameBufferTexture3.mWidth));
        GLES20.glUniform1f(rgbGaussianBlur3x3Shader.getTexelHeightUniform(), f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: e */
    private void m395e(FrameBufferTexture frameBufferTexture) {
        if (frameBufferTexture != null) {
            GLES20.glUseProgram(this.f509gg.getProgram());
            GLES20.glClearColor(0.3f, 0.3f, 0.3f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f469fG);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f471fK);
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glBindTexture(3553, frameBufferTexture.mTexture);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(3553, 0);
        }
    }

    /* renamed from: a */
    private void m383a(float[] fArr) {
        if (fArr != null) {
            ColorPassThroughShader colorPassThroughShader = this.f499gS;
            GLES20.glUseProgram(colorPassThroughShader.getProgram());
            float f = (float) (((double) (this.f473fM * this.f474fN)) * 4.0E-6d);
            if (f < 2.0f) {
                f = 2.0f;
            }
            GLES20.glLineWidth(f);
            GLES20.glUniform4f(colorPassThroughShader.getColorUniform(), 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
            float f2 = fArr[0];
            float f3 = (float) this.f475fO;
            float f4 = fArr[1];
            float f5 = (float) this.f476fP;
            float[] fArr2 = {((f2 * 2.0f) / f3) - 1.0f, 1.0f - ((f4 * 2.0f) / f5), ((fArr[2] * 2.0f) / f3) - 1.0f, 1.0f - ((fArr[3] * 2.0f) / f5), ((fArr[4] * 2.0f) / f3) - 1.0f, 1.0f - ((fArr[5] * 2.0f) / f5), ((fArr[6] * 2.0f) / f3) - 1.0f, 1.0f - ((fArr[7] * 2.0f) / f5)};
            float f6 = this.f477fQ;
            float f7 = this.f478fR;
            float[] fArr3 = {fArr2[0] * f6, fArr2[1] * f7, fArr2[2] * f6, fArr2[3] * f7, fArr2[4] * f6, fArr2[5] * f7, f6 * fArr2[6], f7 * fArr2[7]};
            this.f487gG.clear();
            this.f487gG.put(fArr3).position(0);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f487gG);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glDrawArrays(2, 0, 4);
        }
    }

    /* renamed from: a */
    private void m382a(Queue<Runnable> queue) {
        synchronized (queue) {
            while (!queue.isEmpty()) {
                queue.poll().run();
            }
        }
    }

    public void onPreviewFrame(final byte[] bArr, final int i, final int i2) {
        if (this.f506gb == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i2);
            this.f506gb = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        if (this.f495gO == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect((i * i2) / 2);
            this.f495gO = allocateDirect2;
            allocateDirect2.order(ByteOrder.nativeOrder());
        }
        if (this.f479fS.isEmpty()) {
            mo10421a((Runnable) new Runnable() {
                public void run() {
                    C0462f.this.f506gb.clear();
                    int remaining = C0462f.this.f506gb.remaining();
                    int i = i * i2;
                    if (remaining < i) {
                        ByteBuffer unused = C0462f.this.f506gb = ByteBuffer.allocateDirect(i);
                        C0462f.this.f506gb.order(ByteOrder.nativeOrder());
                    }
                    C0462f.this.f506gb.put(bArr, 0, i * i2);
                    C0462f.this.f506gb.position(0);
                    if (C0462f.this.f507ge == -1) {
                        int[] iArr = new int[1];
                        GLES20.glGenTextures(1, iArr, 0);
                        GLES20.glBindTexture(3553, iArr[0]);
                        GLES20.glTexParameterf(3553, 10240, 9729.0f);
                        GLES20.glTexParameterf(3553, 10241, 9729.0f);
                        GLES20.glTexParameterf(3553, 10242, 33071.0f);
                        GLES20.glTexParameterf(3553, 10243, 33071.0f);
                        int i2 = i;
                        int i3 = i2;
                        GLES20.glTexImage2D(3553, 0, 6409, i3, i2, 0, 6409, 5121, C0462f.this.f506gb);
                        int unused2 = C0462f.this.f507ge = iArr[0];
                    } else {
                        GLES20.glBindTexture(3553, C0462f.this.f507ge);
                        int i4 = i;
                        int i5 = i4;
                        GLES20.glTexSubImage2D(3553, 0, 0, 0, i5, i2, 6409, 5121, C0462f.this.f506gb);
                    }
                    C0462f fVar = C0462f.this;
                    boolean unused3 = fVar.f498gR = fVar.f503gW.isGrayScaleInputTextureRequired();
                    C0462f fVar2 = C0462f.this;
                    boolean unused4 = fVar2.f497gQ = fVar2.f503gW.isRGBInputTextureRequired();
                    if (C0462f.this.f497gQ) {
                        C0462f.this.f495gO.clear();
                        int remaining2 = C0462f.this.f495gO.remaining();
                        int i6 = (i * i2) / 2;
                        if (remaining2 < i6) {
                            ByteBuffer unused5 = C0462f.this.f495gO = ByteBuffer.allocateDirect(i6);
                            C0462f.this.f495gO.order(ByteOrder.nativeOrder());
                        }
                        ByteBuffer d = C0462f.this.f495gO;
                        byte[] bArr = bArr;
                        int i7 = i * i2;
                        d.put(bArr, i7, i7 / 2);
                        C0462f.this.f495gO.position(0);
                        if (C0462f.this.f496gP == -1) {
                            int[] iArr2 = new int[1];
                            GLES20.glGenTextures(1, iArr2, 0);
                            GLES20.glBindTexture(3553, iArr2[0]);
                            GLES20.glTexParameterf(3553, 10240, 9729.0f);
                            GLES20.glTexParameterf(3553, 10241, 9729.0f);
                            GLES20.glTexParameterf(3553, 10242, 33071.0f);
                            GLES20.glTexParameterf(3553, 10243, 33071.0f);
                            GLES20.glTexImage2D(3553, 0, 6410, i / 2, i2 / 2, 0, 6410, 5121, C0462f.this.f495gO);
                            int unused6 = C0462f.this.f496gP = iArr2[0];
                        } else {
                            GLES20.glBindTexture(3553, C0462f.this.f496gP);
                            GLES20.glTexSubImage2D(3553, 0, 0, 0, i / 2, i2 / 2, 6410, 5121, C0462f.this.f495gO);
                        }
                    }
                    boolean unused7 = C0462f.this.f468fF = true;
                    if (C0462f.this.f503gW != null && !C0462f.this.f504gX) {
                        C0462f.this.f503gW.processByteData(bArr, i, i2);
                    }
                    int f = C0462f.this.f475fO;
                    int i8 = i;
                    if (f != i8) {
                        int unused8 = C0462f.this.f475fO = i8;
                        int unused9 = C0462f.this.f476fP = i2;
                        if (C0462f.this.f503gW != null) {
                            C0462f.this.f503gW.setPreviewResoution(C0462f.this.f475fO, C0462f.this.f476fP);
                        }
                        C0462f.this.m375P();
                    }
                }
            });
        }
    }

    public final void destroy() {
        synchronized (this) {
            if (this.f483fW != null) {
                this.f483fW.destroy();
                this.f483fW = null;
            }
            if (this.f488gH != null) {
                this.f488gH.destroy();
                this.f488gH = null;
            }
            if (this.f508gf != -1) {
                GLES20.glDeleteTextures(1, new int[]{this.f508gf}, 0);
                this.f508gf = -1;
            }
            if (this.f507ge != -1) {
                GLES20.glDeleteTextures(1, new int[]{this.f507ge}, 0);
                this.f507ge = -1;
            }
            if (this.f496gP != -1) {
                GLES20.glDeleteTextures(1, new int[]{this.f496gP}, 0);
                this.f496gP = -1;
            }
            if (this.f503gW != null) {
                this.f503gW.destroy();
                this.f503gW = null;
            }
            if (this.f509gg != null) {
                this.f509gg.destroy();
                this.f509gg = null;
            }
            if (this.f499gS != null) {
                this.f499gS.destroy();
                this.f499gS = null;
            }
            if (this.f500gT != null) {
                this.f500gT.destroy();
                this.f500gT = null;
            }
            if (this.f501gU != null) {
                this.f501gU.destroy();
                this.f501gU = null;
            }
            if (this.f502gV != null) {
                this.f502gV.destroy();
                this.f502gV = null;
            }
        }
    }

    public void setScaleType(ScaleType scaleType) {
        this.f482fV = scaleType;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m375P() {
        float f = (float) this.f473fM;
        float f2 = (float) this.f474fN;
        if (this.f481fU == Rotation.ROTATION_270 || this.f481fU == Rotation.ROTATION_90) {
            f = (float) this.f474fN;
            f2 = (float) this.f473fM;
        }
        float max = Math.max(f / ((float) this.f475fO), f2 / ((float) this.f476fP));
        int round = Math.round(((float) this.f475fO) * max);
        int round2 = Math.round(((float) this.f476fP) * max);
        this.f477fQ = ((float) round) / f;
        this.f478fR = ((float) round2) / f2;
        float[] fArr = f464fH;
        float[] rotation = TextureRotationUtil.getRotation(this.f481fU, false, false);
        if (this.f482fV == ScaleType.CENTER_CROP) {
            float f3 = (1.0f - (1.0f / this.f477fQ)) / 2.0f;
            float f4 = (1.0f - (1.0f / this.f478fR)) / 2.0f;
            rotation = new float[]{m378a(rotation[0], f3), m378a(rotation[1], f4), m378a(rotation[2], f3), m378a(rotation[3], f4), m378a(rotation[4], f3), m378a(rotation[5], f4), m378a(rotation[6], f3), m378a(rotation[7], f4)};
        } else {
            float[] fArr2 = f464fH;
            float f5 = fArr2[0];
            float f6 = this.f478fR;
            float f7 = fArr2[1];
            float f8 = this.f477fQ;
            fArr = new float[]{f5 / f6, f7 / f8, fArr2[2] / f6, fArr2[3] / f8, fArr2[4] / f6, fArr2[5] / f8, fArr2[6] / f6, fArr2[7] / f8};
        }
        this.f469fG.clear();
        this.f469fG.put(fArr).position(0);
        this.f471fK.clear();
        this.f471fK.put(rotation).position(0);
    }

    public void setRotation(Rotation rotation) {
        this.f481fU = rotation;
        m375P();
    }

    public Rotation getRotation() {
        return this.f481fU;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10421a(Runnable runnable) {
        synchronized (this.f479fS) {
            this.f479fS.add(runnable);
        }
    }

    public void setSettings(DocumentDetectionSettings documentDetectionSettings) {
        ImageProcessor imageProcessor = this.f503gW;
        if (imageProcessor != null) {
            imageProcessor.setSettings(documentDetectionSettings);
        }
    }
}
