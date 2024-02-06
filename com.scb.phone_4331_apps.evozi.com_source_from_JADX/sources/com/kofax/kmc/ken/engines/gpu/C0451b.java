package com.kofax.kmc.ken.engines.gpu;

import android.graphics.Rect;
import android.opengl.GLES20;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.ken.engines.gpu.shaders.GrayScaleAndLaplacianShader;
import com.kofax.kmc.ken.engines.gpu.shaders.GraySobelShader;
import com.kofax.kmc.ken.engines.gpu.shaders.PassThroughShader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.kofax.kmc.ken.engines.gpu.b */
class C0451b implements IGPUImageRenderer {

    /* renamed from: fC */
    public static final int f395fC = -1;

    /* renamed from: fH */
    static final float[] f396fH = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: fJ */
    static final float[] f397fJ = {-1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f};

    /* renamed from: fD */
    protected OpenGLESContextManager f398fD;

    /* renamed from: fE */
    public final Object f399fE = new Object();
    /* access modifiers changed from: private */

    /* renamed from: fF */
    public boolean f400fF = false;

    /* renamed from: fG */
    private final FloatBuffer f401fG;

    /* renamed from: fI */
    private final FloatBuffer f402fI;

    /* renamed from: fK */
    private final FloatBuffer f403fK;

    /* renamed from: fL */
    private final FloatBuffer f404fL;

    /* renamed from: fM */
    private int f405fM;

    /* renamed from: fN */
    private int f406fN;
    /* access modifiers changed from: private */

    /* renamed from: fO */
    public int f407fO;
    /* access modifiers changed from: private */

    /* renamed from: fP */
    public int f408fP;

    /* renamed from: fQ */
    protected float f409fQ;

    /* renamed from: fR */
    protected float f410fR;

    /* renamed from: fS */
    private final Queue<Runnable> f411fS = new LinkedList();

    /* renamed from: fT */
    private final Queue<Runnable> f412fT = new LinkedList();

    /* renamed from: fU */
    private Rotation f413fU;

    /* renamed from: fV */
    private ScaleType f414fV = ScaleType.CENTER_CROP;

    /* renamed from: fW */
    private FrameBufferTexture f415fW = null;

    /* renamed from: fX */
    private FrameBufferTexture f416fX = null;

    /* renamed from: fY */
    private FrameBufferTexture f417fY = null;

    /* renamed from: fZ */
    private int f418fZ = 0;

    /* renamed from: ga */
    private int f419ga = 0;
    /* access modifiers changed from: private */

    /* renamed from: gb */
    public ByteBuffer f420gb;

    /* renamed from: gc */
    private ByteBuffer f421gc = null;

    /* renamed from: gd */
    private ByteBuffer f422gd = null;
    /* access modifiers changed from: private */

    /* renamed from: ge */
    public int f423ge = -1;

    /* renamed from: gf */
    private int f424gf = -1;

    /* renamed from: gg */
    protected PassThroughShader f425gg;

    /* renamed from: gh */
    protected GraySobelShader f426gh;

    /* renamed from: gi */
    protected GrayScaleAndLaplacianShader f427gi;

    /* renamed from: gj */
    private int[] f428gj = null;

    /* renamed from: gk */
    private Rect f429gk;

    /* renamed from: gl */
    private boolean f430gl;

    /* renamed from: gm */
    private boolean f431gm;

    /* renamed from: a */
    private float m322a(float f, float f2) {
        return f != BitmapDescriptorFactory.HUE_RED ? 1.0f - f2 : f2;
    }

    public C0451b() {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f396fH.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f401fG = asFloatBuffer;
        asFloatBuffer.put(f396fH).position(0);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(f397fJ.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f402fI = asFloatBuffer2;
        asFloatBuffer2.put(f397fJ).position(0);
        this.f403fK = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_NO_ROTATION.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        FloatBuffer asFloatBuffer3 = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_ROTATED_270.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f404fL = asFloatBuffer3;
        asFloatBuffer3.clear();
        this.f404fL.put(TextureRotationUtil.TEXTURE_ROTATED_270).position(0);
        setRotation(Rotation.NORMAL);
    }

    /* renamed from: L */
    public int[] mo10401L() {
        return this.f428gj;
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        GLES20.glDisable(2929);
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f405fM = i;
        this.f406fN = i2;
        GLES20.glViewport(0, 0, i, i2);
        m321P();
        synchronized (this.f399fE) {
            this.f399fE.notifyAll();
        }
    }

    /* renamed from: M */
    private void m318M() {
        int i;
        int i2;
        if (this.f398fD == null) {
            OpenGLESContextManager openGLESContextManager = new OpenGLESContextManager();
            this.f398fD = openGLESContextManager;
            this.f425gg = new PassThroughShader(openGLESContextManager);
        }
        if (!(this.f415fW != null || this.f407fO == 0 || this.f408fP == 0)) {
            float f = GPUSettings.getSettings().scaleFactor;
            int i3 = (int) (((float) this.f407fO) * f);
            this.f418fZ = i3;
            if (i3 % 2 != 0) {
                this.f418fZ = i3 + 1;
            }
            int i4 = (int) (f * ((float) this.f408fP));
            this.f419ga = i4;
            if (i4 % 2 != 0) {
                this.f419ga = i4 + 1;
            }
            this.f415fW = new FrameBufferTexture(this.f418fZ, this.f419ga);
        }
        if (this.f417fY == null && (i = this.f418fZ) != 0 && (i2 = this.f419ga) != 0) {
            this.f417fY = new FrameBufferTexture(i, i2);
            OpenGLESContextManager openGLESContextManager2 = new OpenGLESContextManager();
            this.f398fD = openGLESContextManager2;
            this.f426gh = new GraySobelShader(openGLESContextManager2);
            this.f427gi = new GrayScaleAndLaplacianShader(this.f398fD);
        }
    }

    /* renamed from: N */
    private void m319N() {
        int[] iArr = new int[1];
        int[] iArr2 = new int[4];
        GLES20.glGetIntegerv(36006, iArr, 0);
        GLES20.glGetIntegerv(2978, iArr2, 0);
        GLES20.glBindFramebuffer(36160, this.f415fW.mFrameBuffer);
        GLES20.glViewport(0, 0, this.f415fW.mWidth, this.f415fW.mHeight);
        m320O();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glViewport(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
    }

    /* renamed from: O */
    private void m320O() {
        GLES20.glUseProgram(this.f425gg.getProgram());
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f402fI);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f404fL);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glBindTexture(3553, this.f423ge);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: b */
    private void m331b(int i) {
        if (i != -1) {
            GLES20.glUseProgram(this.f425gg.getProgram());
            GLES20.glClearColor(0.3f, 0.3f, 0.3f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f401fG);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f403fK);
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glBindTexture(3553, i);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(3553, 0);
        }
    }

    /* renamed from: a */
    private void m326a(Queue<Runnable> queue) {
        synchronized (queue) {
            while (!queue.isEmpty()) {
                queue.poll().run();
            }
        }
    }

    public void onPreviewFrame(final byte[] bArr, final int i, final int i2) {
        if (this.f420gb == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i2);
            this.f420gb = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        if (this.f411fS.isEmpty()) {
            mo10403a((Runnable) new Runnable() {
                public void run() {
                    C0451b.this.f420gb.clear();
                    C0451b.this.f420gb.put(bArr, 0, i * i2);
                    C0451b.this.f420gb.position(0);
                    if (C0451b.this.f423ge == -1) {
                        int[] iArr = new int[1];
                        GLES20.glGenTextures(1, iArr, 0);
                        GLES20.glBindTexture(3553, iArr[0]);
                        GLES20.glTexParameterf(3553, 10240, 9729.0f);
                        GLES20.glTexParameterf(3553, 10241, 9729.0f);
                        GLES20.glTexParameterf(3553, 10242, 33071.0f);
                        GLES20.glTexParameterf(3553, 10243, 33071.0f);
                        GLES20.glTexImage2D(3553, 0, 6409, i, i2, 0, 6409, 5121, C0451b.this.f420gb);
                        int unused = C0451b.this.f423ge = iArr[0];
                    } else {
                        GLES20.glBindTexture(3553, C0451b.this.f423ge);
                        GLES20.glTexSubImage2D(3553, 0, 0, 0, i, i2, 6409, 5121, C0451b.this.f420gb);
                    }
                    boolean unused2 = C0451b.this.f400fF = true;
                    int c = C0451b.this.f407fO;
                    int i = i;
                    if (c != i) {
                        int unused3 = C0451b.this.f407fO = i;
                        int unused4 = C0451b.this.f408fP = i2;
                        C0451b.this.m321P();
                    }
                }
            });
        }
    }

    public void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            m326a(this.f411fS);
            m318M();
            if (this.f400fF) {
                if (!(this.f423ge == -1 || this.f415fW == null)) {
                    m319N();
                }
                this.f428gj = null;
                this.f416fX = null;
                if (this.f415fW != null) {
                    int[] iArr = new int[1];
                    int[] iArr2 = new int[4];
                    GLES20.glGetIntegerv(36006, iArr, 0);
                    GLES20.glGetIntegerv(2978, iArr2, 0);
                    if (this.f417fY != null) {
                        if (this.f430gl) {
                            m332b(this.f415fW, this.f417fY);
                        } else {
                            m325a(this.f415fW, this.f417fY);
                        }
                        FrameBufferTexture frameBufferTexture = this.f417fY;
                        this.f416fX = frameBufferTexture;
                        this.f428gj = m328a(frameBufferTexture, (ByteBuffer) null, GPUSettings.getSettings().enableRgbSobelOLC);
                    }
                    GLES20.glBindFramebuffer(36160, iArr[0]);
                    GLES20.glViewport(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                }
            }
            if (GPUSettings.getSettings().showProcessedImageAndBounds) {
                if (this.f416fX == null) {
                    this.f416fX = this.f415fW;
                }
                m331b(this.f416fX.mTexture);
            }
            m326a(this.f412fT);
        }
    }

    public final void destroy() {
        synchronized (this) {
            if (this.f415fW != null) {
                this.f415fW.destroy();
                this.f415fW = null;
            }
            if (this.f424gf != -1) {
                GLES20.glDeleteTextures(1, new int[]{this.f424gf}, 0);
                this.f424gf = -1;
            }
            if (this.f423ge != -1) {
                GLES20.glDeleteTextures(1, new int[]{this.f423ge}, 0);
                this.f423ge = -1;
            }
            if (this.f425gg != null) {
                this.f425gg.destroy();
                this.f425gg = null;
            }
            if (this.f417fY != null) {
                this.f417fY.destroy();
                this.f417fY = null;
            }
            if (this.f426gh != null) {
                this.f426gh.destroy();
                this.f426gh = null;
            }
            if (this.f427gi != null) {
                this.f427gi.destroy();
                this.f427gi = null;
            }
        }
    }

    public void setScaleType(ScaleType scaleType) {
        this.f414fV = scaleType;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m321P() {
        float f = (float) this.f405fM;
        float f2 = (float) this.f406fN;
        if (this.f413fU == Rotation.ROTATION_270 || this.f413fU == Rotation.ROTATION_90) {
            f = (float) this.f406fN;
            f2 = (float) this.f405fM;
        }
        float max = Math.max(f / ((float) this.f407fO), f2 / ((float) this.f408fP));
        int round = Math.round(((float) this.f407fO) * max);
        int round2 = Math.round(((float) this.f408fP) * max);
        this.f409fQ = ((float) round) / f;
        this.f410fR = ((float) round2) / f2;
        float[] fArr = f396fH;
        float[] rotation = TextureRotationUtil.getRotation(this.f413fU, false, false);
        if (this.f414fV == ScaleType.CENTER_CROP) {
            float f3 = (1.0f - (1.0f / this.f409fQ)) / 2.0f;
            float f4 = (1.0f - (1.0f / this.f410fR)) / 2.0f;
            rotation = new float[]{m322a(rotation[0], f3), m322a(rotation[1], f4), m322a(rotation[2], f3), m322a(rotation[3], f4), m322a(rotation[4], f3), m322a(rotation[5], f4), m322a(rotation[6], f3), m322a(rotation[7], f4)};
        } else {
            float[] fArr2 = f396fH;
            float f5 = fArr2[0];
            float f6 = this.f410fR;
            float f7 = fArr2[1];
            float f8 = this.f409fQ;
            fArr = new float[]{f5 / f6, f7 / f8, fArr2[2] / f6, fArr2[3] / f8, fArr2[4] / f6, fArr2[5] / f8, fArr2[6] / f6, fArr2[7] / f8};
        }
        this.f401fG.clear();
        this.f401fG.put(fArr).position(0);
        this.f403fK.clear();
        this.f403fK.put(rotation).position(0);
    }

    public void setRotation(Rotation rotation) {
        this.f413fU = rotation;
        m321P();
    }

    public Rotation getRotation() {
        return this.f413fU;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10403a(Runnable runnable) {
        synchronized (this.f411fS) {
            this.f411fS.add(runnable);
        }
    }

    /* renamed from: a */
    private void m325a(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2) {
        FrameBufferTexture frameBufferTexture3 = frameBufferTexture;
        FrameBufferTexture frameBufferTexture4 = frameBufferTexture2;
        GLES20.glBindFramebuffer(36160, frameBufferTexture4.mFrameBuffer);
        GLES20.glViewport(0, 0, frameBufferTexture4.mWidth, frameBufferTexture4.mHeight);
        GraySobelShader graySobelShader = this.f426gh;
        GLES20.glUseProgram(graySobelShader.getProgram());
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f402fI);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f404fL);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glBindTexture(3553, frameBufferTexture3.mTexture);
        float f = 1.0f / ((float) frameBufferTexture3.mHeight);
        GLES20.glUniform1f(graySobelShader.getTexelWidthUniform(), 1.0f / ((float) frameBufferTexture3.mWidth));
        GLES20.glUniform1f(graySobelShader.getTexelHeightUniform(), f);
        GLES20.glUniform1f(graySobelShader.getEdgeStrengthUniform(), 0.5f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: b */
    private void m332b(FrameBufferTexture frameBufferTexture, FrameBufferTexture frameBufferTexture2) {
        FrameBufferTexture frameBufferTexture3 = frameBufferTexture;
        FrameBufferTexture frameBufferTexture4 = frameBufferTexture2;
        GLES20.glBindFramebuffer(36160, frameBufferTexture4.mFrameBuffer);
        GLES20.glViewport(0, 0, frameBufferTexture4.mWidth, frameBufferTexture4.mHeight);
        GrayScaleAndLaplacianShader grayScaleAndLaplacianShader = this.f427gi;
        GLES20.glUseProgram(grayScaleAndLaplacianShader.getProgram());
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f402fI);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, this.f404fL);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glBindTexture(3553, frameBufferTexture3.mTexture);
        float f = 1.0f / ((float) frameBufferTexture3.mHeight);
        GLES20.glUniform1f(grayScaleAndLaplacianShader.getTexelWidthUniform(), 1.0f / ((float) frameBufferTexture3.mWidth));
        GLES20.glUniform1f(grayScaleAndLaplacianShader.getTexelHeightUniform(), f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: a */
    private int[] m328a(FrameBufferTexture frameBufferTexture, ByteBuffer byteBuffer, boolean z) {
        byte[] bArr;
        FrameBufferTexture frameBufferTexture2 = frameBufferTexture;
        if (byteBuffer != null) {
            bArr = byteBuffer.array();
        } else {
            GLES20.glFinish();
            GLES20.glBindFramebuffer(36160, frameBufferTexture2.mFrameBuffer);
            GLES20.glViewport(0, 0, frameBufferTexture2.mWidth, frameBufferTexture2.mHeight);
            if (this.f421gc == null) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect((frameBufferTexture2.mWidth * frameBufferTexture2.mHeight) << 2);
                this.f421gc = allocateDirect;
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            }
            GLES20.glReadPixels(0, 0, frameBufferTexture2.mWidth, frameBufferTexture2.mHeight, 6408, 5121, this.f421gc);
            byte[] array = this.f421gc.array();
            if (this.f422gd == null) {
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(frameBufferTexture2.mWidth * frameBufferTexture2.mHeight);
                this.f422gd = allocateDirect2;
                allocateDirect2.order(ByteOrder.nativeOrder());
            }
            byte[] array2 = this.f422gd.array();
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
        int[] iArr = new int[4];
        int i5 = GPUSettings.getSettings().contrastFactorDivider;
        float f = ((float) frameBufferTexture2.mWidth) / ((float) this.f407fO);
        GPUImageNativeLibrary.ContrastFactor(bArr, frameBufferTexture2.mWidth, frameBufferTexture2.mHeight, new int[]{(int) (((float) this.f429gk.left) * f), (int) (((float) this.f429gk.top) * f), (int) (((float) this.f429gk.right) * f), (int) (((float) this.f429gk.bottom) * f)}, this.f431gm, i5, iArr);
        iArr[0] = (int) (((float) iArr[0]) / f);
        iArr[1] = (int) (((float) iArr[1]) / f);
        iArr[2] = (int) (((float) iArr[2]) / f);
        iArr[3] = (int) (((float) iArr[3]) / f);
        return iArr;
    }

    /* renamed from: a */
    public void mo10402a(Rect rect, boolean z, boolean z2) {
        this.f429gk = rect;
        this.f430gl = z;
        this.f431gm = z2;
    }
}
