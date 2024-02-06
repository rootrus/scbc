package com.kofax.kmc.ken.engines.gpu.shaders;

import android.opengl.GLES20;
import com.kofax.kmc.ken.engines.gpu.OpenGLESContextManager;

public abstract class TwoPassShader extends Shader {
    protected int _firstPassProgram = 0;
    protected int _secondPassProgram = 0;

    public abstract int getFirstPassProgram();

    public abstract int getSecondPassProgram();

    public TwoPassShader(OpenGLESContextManager openGLESContextManager) {
        super(openGLESContextManager);
    }

    public void destroy() {
        int i = this._firstPassProgram;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this._firstPassProgram = 0;
        }
        int i2 = this._secondPassProgram;
        if (i2 != 0) {
            GLES20.glDeleteProgram(i2);
            this._secondPassProgram = 0;
        }
    }
}
