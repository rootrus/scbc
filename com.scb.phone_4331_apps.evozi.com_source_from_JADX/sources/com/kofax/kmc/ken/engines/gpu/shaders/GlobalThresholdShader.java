package com.kofax.kmc.ken.engines.gpu.shaders;

import android.opengl.GLES20;
import com.kofax.kmc.ken.engines.gpu.OpenGLESContextManager;
import com.kofax.kmc.ken.engines.gpu.OpenGlUtils;

public class GlobalThresholdShader extends SinglePassShader {
    protected static final String FragmentShaderString = "precision highp float;varying vec2 textureCoordinate;uniform sampler2D inputImageTexture;uniform float threshold;uniform float scaleFactor;void main(){float val = texture2D(inputImageTexture, textureCoordinate).r;float thresholdResult = step(threshold, val * scaleFactor);gl_FragColor = vec4(vec3(thresholdResult), 1.0);}";
    protected int _scaleFactorUniform = 0;
    protected int _thresholdUniform = 0;

    public GlobalThresholdShader(OpenGLESContextManager openGLESContextManager) {
        super(openGLESContextManager);
    }

    public int getProgram() {
        if (this._program == 0) {
            this._program = OpenGlUtils.loadProgram("attribute vec4 position;attribute vec4 inputTextureCoordinate;varying vec2 textureCoordinate;void main(){gl_Position = position;textureCoordinate = inputTextureCoordinate.xy;}", FragmentShaderString, new int[]{0, 1}, new String[]{"position", "inputTextureCoordinate"}, 2);
            this._thresholdUniform = GLES20.glGetUniformLocation(this._program, "threshold");
            this._scaleFactorUniform = GLES20.glGetUniformLocation(this._program, "scaleFactor");
        }
        return this._program;
    }

    public int getThresholdUniform() {
        return this._thresholdUniform;
    }

    public int getScaleFactorUniform() {
        return this._scaleFactorUniform;
    }
}
