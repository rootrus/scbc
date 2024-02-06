package com.kofax.kmc.ken.engines.gpu.shaders;

import android.opengl.GLES20;
import com.kofax.kmc.ken.engines.gpu.OpenGLESContextManager;
import com.kofax.kmc.ken.engines.gpu.OpenGlUtils;

public class ColorPassThroughShader extends SinglePassShader {
    protected static final String FragmentShaderString = "uniform lowp vec4 color;void main(){gl_FragColor = color;}";
    protected static final String VertexShaderString = "attribute vec4 position;void main(){gl_Position = position;}";
    protected int _colorUniform = 0;

    public ColorPassThroughShader(OpenGLESContextManager openGLESContextManager) {
        super(openGLESContextManager);
    }

    public int getProgram() {
        if (this._program == 0) {
            this._program = OpenGlUtils.loadProgram(VertexShaderString, FragmentShaderString, new int[]{0}, new String[]{"position", "inputTextureCoordinate"}, 1);
            this._colorUniform = GLES20.glGetUniformLocation(this._program, "color");
        }
        return this._program;
    }

    public int getColorUniform() {
        return this._colorUniform;
    }
}
