package com.kofax.kmc.ken.engines.gpu;

import android.opengl.GLES20;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class OpenGLESContextManager {
    protected static final int INVALID_VALUE = 0;
    protected static int _maxTextureSize;
    protected int _maxVaryingVectors = 0;

    public static int getMaxTextureSize() {
        if (_maxTextureSize == 0) {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eglGetDisplay, new int[2]);
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            egl10.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12339, 1, 12344}, eGLConfigArr, 1, new int[1]);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344});
            EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 1, 12344});
            egl10.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
            int[] iArr = {0};
            GLES20.glGetIntegerv(3379, iArr, 0);
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
            egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
            egl10.eglTerminate(eglGetDisplay);
            _maxTextureSize = iArr[0];
        }
        return _maxTextureSize;
    }

    public int getMaxVaryingVectors() {
        if (this._maxVaryingVectors == 0) {
            int[] iArr = {0};
            GLES20.glGetIntegerv(36348, iArr, 0);
            this._maxVaryingVectors = iArr[0];
        }
        return this._maxVaryingVectors;
    }
}
