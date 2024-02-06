package com.kofax.kmc.ken.engines.gpu;

import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import com.kofax.mobile.sdk._internal.C0767k;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

public class PixelBuffer {

    /* renamed from: hh */
    private static final boolean f375hh = false;

    /* renamed from: hi */
    private GLSurfaceView.Renderer f376hi;

    /* renamed from: hj */
    private EGL10 f377hj;

    /* renamed from: hk */
    private EGLDisplay f378hk;

    /* renamed from: hl */
    private EGLConfig[] f379hl;

    /* renamed from: hm */
    private EGLConfig f380hm;

    /* renamed from: hn */
    private EGLContext f381hn;

    /* renamed from: ho */
    private EGLSurface f382ho;

    /* renamed from: hp */
    private GL10 f383hp = ((GL10) this.f381hn.getGL());

    /* renamed from: hq */
    String f384hq = Thread.currentThread().getName();
    private int mHeight;
    private int mWidth;

    /* renamed from: a */
    private static int m306a(int i, int i2, int i3, int i4) {
        return (((i2 - 1) - i4) * i) + i3;
    }

    /* renamed from: b */
    private static int m308b(int i, int i2, int i3, int i4) {
        return (i * i4) + i3;
    }

    /* renamed from: c */
    private static int m309c(int i, int i2, int i3, int i4) {
        return ((i2 - 1) - i4) + (i2 * i3);
    }

    /* renamed from: d */
    private static int m312d(int i, int i2, int i3, int i4) {
        return ((i - 1) - i3) + (((i2 - 1) - i4) * i);
    }

    /* renamed from: e */
    private static int m313e(int i, int i2, int i3, int i4) {
        return i4 + (i2 * ((i - 1) - i3));
    }

    public PixelBuffer(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        int[] iArr = {12375, i, 12374, i2, 12344};
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f377hj = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f378hk = eglGetDisplay;
        this.f377hj.eglInitialize(eglGetDisplay, new int[2]);
        EGLConfig Y = m304Y();
        this.f380hm = Y;
        this.f381hn = this.f377hj.eglCreateContext(this.f378hk, Y, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        EGLSurface eglCreatePbufferSurface = this.f377hj.eglCreatePbufferSurface(this.f378hk, this.f380hm, iArr);
        this.f382ho = eglCreatePbufferSurface;
        m311c(this.f377hj.eglMakeCurrent(this.f378hk, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f381hn));
    }

    public void destroy() {
        this.f376hi = null;
        EGL10 egl10 = this.f377hj;
        if (egl10 != null) {
            m311c(egl10.eglMakeCurrent(this.f378hk, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT));
            EGLSurface eGLSurface = this.f382ho;
            if (eGLSurface != null) {
                m311c(this.f377hj.eglDestroySurface(this.f378hk, eGLSurface));
                this.f382ho = null;
            }
            if (this.f380hm != null) {
                m311c(this.f377hj.eglDestroyContext(this.f378hk, this.f381hn));
                this.f380hm = null;
            }
            EGLDisplay eGLDisplay = this.f378hk;
            if (eGLDisplay != null) {
                m311c(this.f377hj.eglTerminate(eGLDisplay));
                this.f378hk = null;
            }
            this.f377hj = null;
        }
    }

    /* renamed from: c */
    private static void m311c(boolean z) {
        if (!z) {
            throw new AssertionError();
        }
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        this.f376hi = renderer;
        if (!Thread.currentThread().getName().equals(this.f384hq)) {
            C0767k.m1825g(this, "setRenderer: This thread does not own the OpenGL context.");
            return;
        }
        this.f376hi.onSurfaceCreated(this.f383hp, this.f380hm);
        this.f376hi.onSurfaceChanged(this.f383hp, this.mWidth, this.mHeight);
    }

    public void drawFrame() {
        if (this.f376hi == null) {
            C0767k.m1825g(this, "getBitmap: Renderer was not set.");
        } else if (!Thread.currentThread().getName().equals(this.f384hq)) {
            C0767k.m1825g(this, "getBitmap: This thread does not own the OpenGL context.");
        } else {
            this.f376hi.onDrawFrame(this.f383hp);
        }
    }

    public Bitmap getBitmap(int i) {
        return m310c(i);
    }

    /* renamed from: Y */
    private EGLConfig m304Y() {
        int[] iArr = new int[1];
        int[] iArr2 = {12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
        int[] iArr3 = iArr;
        this.f377hj.eglChooseConfig(this.f378hk, iArr2, (EGLConfig[]) null, 0, iArr3);
        int i = iArr[0];
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        this.f379hl = eGLConfigArr;
        this.f377hj.eglChooseConfig(this.f378hk, iArr2, eGLConfigArr, i, iArr3);
        return this.f379hl[0];
    }

    /* renamed from: Z */
    private void m305Z() {
        C0767k.m1818e((Object) this, "Config List {");
        for (EGLConfig eGLConfig : this.f379hl) {
            int a = m307a(eGLConfig, 12325);
            int a2 = m307a(eGLConfig, 12326);
            int a3 = m307a(eGLConfig, 12324);
            int a4 = m307a(eGLConfig, 12323);
            int a5 = m307a(eGLConfig, 12322);
            int a6 = m307a(eGLConfig, 12321);
            StringBuilder sb = new StringBuilder();
            sb.append("    <d,s,r,g,b,a> = <");
            sb.append(a);
            sb.append(",");
            sb.append(a2);
            sb.append(",");
            sb.append(a3);
            sb.append(",");
            sb.append(a4);
            sb.append(",");
            sb.append(a5);
            sb.append(",");
            sb.append(a6);
            sb.append(">");
            C0767k.m1818e((Object) this, sb.toString());
        }
        C0767k.m1818e((Object) this, "}");
    }

    /* renamed from: a */
    private int m307a(EGLConfig eGLConfig, int i) {
        int[] iArr = new int[1];
        if (this.f377hj.eglGetConfigAttrib(this.f378hk, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        return 0;
    }

    /* renamed from: c */
    private Bitmap m310c(int i) {
        int i2 = this.mWidth * this.mHeight;
        int[] iArr = new int[i2];
        IntBuffer allocate = IntBuffer.allocate(i2);
        this.f383hp.glReadPixels(0, 0, this.mWidth, this.mHeight, 6408, 5121, allocate);
        int[] array = allocate.array();
        int i3 = this.mWidth;
        int i4 = this.mHeight;
        for (int i5 = 0; i5 < this.mHeight; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.mWidth;
                if (i6 >= i7) {
                    break;
                }
                if (i == 90) {
                    iArr[m309c(i7, this.mHeight, i6, i5)] = array[m306a(this.mWidth, this.mHeight, i6, i5)];
                    i3 = this.mHeight;
                    i4 = this.mWidth;
                } else if (i == 180) {
                    iArr[m312d(i7, this.mHeight, i6, i5)] = array[m306a(this.mWidth, this.mHeight, i6, i5)];
                } else if (i != 270) {
                    iArr[m308b(i7, this.mHeight, i6, i5)] = array[m306a(this.mWidth, this.mHeight, i6, i5)];
                } else {
                    iArr[m313e(i7, this.mHeight, i6, i5)] = array[m306a(this.mWidth, this.mHeight, i6, i5)];
                    i3 = this.mHeight;
                    i4 = this.mWidth;
                }
                i6++;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(iArr));
        return createBitmap;
    }
}
