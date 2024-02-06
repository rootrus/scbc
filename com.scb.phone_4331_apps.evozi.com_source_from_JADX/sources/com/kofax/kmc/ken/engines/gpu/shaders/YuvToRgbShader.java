package com.kofax.kmc.ken.engines.gpu.shaders;

import android.opengl.GLES20;
import com.kofax.kmc.ken.engines.gpu.OpenGLESContextManager;
import com.kofax.kmc.ken.engines.gpu.OpenGlUtils;

public class YuvToRgbShader extends SinglePassShader {
    protected static final String FragmentShaderString = "precision highp float;varying vec2 textureCoordinate;uniform sampler2D y_inputImageTexture;uniform sampler2D uv_inputImageTexture;void main(){float r, g, b, y, u, v;y = texture2D(y_inputImageTexture, textureCoordinate).r;u = texture2D(uv_inputImageTexture, textureCoordinate).a - 0.5;v = texture2D(uv_inputImageTexture, textureCoordinate).r - 0.5;r = y + 1.13983 * v;g = y - 0.39465 * u - 0.58060 * v;b = y + 2.03211 * u;gl_FragColor = vec4(r, g, b, 1.0);}";
    protected int _uvTextureUniform = 0;
    protected int _yTextureUniform = 0;

    public YuvToRgbShader(OpenGLESContextManager openGLESContextManager) {
        super(openGLESContextManager);
    }

    public int getProgram() {
        if (this._program == 0) {
            this._program = OpenGlUtils.loadProgram("attribute vec4 position;attribute vec4 inputTextureCoordinate;varying vec2 textureCoordinate;void main(){gl_Position = position;textureCoordinate = inputTextureCoordinate.xy;}", FragmentShaderString, new int[]{0, 1}, new String[]{"position", "inputTextureCoordinate"}, 2);
            this._yTextureUniform = GLES20.glGetUniformLocation(this._program, "y_inputImageTexture");
            this._uvTextureUniform = GLES20.glGetUniformLocation(this._program, "uv_inputImageTexture");
        }
        return this._program;
    }

    public int getYTextureUniform() {
        return this._yTextureUniform;
    }

    public int getUVTextureUniform() {
        return this._uvTextureUniform;
    }
}
