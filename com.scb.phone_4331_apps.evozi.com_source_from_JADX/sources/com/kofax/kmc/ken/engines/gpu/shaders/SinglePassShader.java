package com.kofax.kmc.ken.engines.gpu.shaders;

import android.opengl.GLES20;
import com.kofax.kmc.ken.engines.gpu.OpenGLESContextManager;

public abstract class SinglePassShader extends Shader {
    protected int _program = 0;

    public abstract int getProgram();

    public SinglePassShader(OpenGLESContextManager openGLESContextManager) {
        super(openGLESContextManager);
    }

    public void destroy() {
        int i = this._program;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this._program = 0;
        }
    }
}
