package com.kofax.kmc.ken.engines.gpu.shaders;

import android.opengl.GLES20;
import com.kofax.kmc.ken.engines.gpu.OpenGLESContextManager;
import com.kofax.kmc.ken.engines.gpu.OpenGlUtils;

public class GraySobelShader extends SinglePassShader {
    protected static final String FragmentShaderString = "precision highp float;varying vec2 leftTextureCoordinate;varying vec2 rightTextureCoordinate;varying vec2 topTextureCoordinate;varying vec2 topLeftTextureCoordinate;varying vec2 topRightTextureCoordinate;varying vec2 bottomTextureCoordinate;varying vec2 bottomLeftTextureCoordinate;varying vec2 bottomRightTextureCoordinate;uniform sampler2D inputImageTexture;uniform float edgeStrength;void main(){float bottomLeftIntensity = texture2D(inputImageTexture, bottomLeftTextureCoordinate).r;float topRightIntensity = texture2D(inputImageTexture, topRightTextureCoordinate).r;float topLeftIntensity = texture2D(inputImageTexture, topLeftTextureCoordinate).r;float bottomRightIntensity = texture2D(inputImageTexture, bottomRightTextureCoordinate).r;float leftIntensity = texture2D(inputImageTexture, leftTextureCoordinate).r;float rightIntensity = texture2D(inputImageTexture, rightTextureCoordinate).r;float bottomIntensity = texture2D(inputImageTexture, bottomTextureCoordinate).r;float topIntensity = texture2D(inputImageTexture, topTextureCoordinate).r;float h = -topLeftIntensity - 2.0 * topIntensity - topRightIntensity + bottomLeftIntensity + 2.0 * bottomIntensity + bottomRightIntensity;float v = -bottomLeftIntensity - 2.0 * leftIntensity - topLeftIntensity + bottomRightIntensity + 2.0 * rightIntensity + topRightIntensity;float mag = length(vec2(h, v)) * edgeStrength;gl_FragColor = vec4(vec3(mag), 1.0);}";
    protected int _edgeStrengthUniform = 0;
    protected int _texelHeightUniform = 0;
    protected int _texelWidthUniform = 0;

    public GraySobelShader(OpenGLESContextManager openGLESContextManager) {
        super(openGLESContextManager);
    }

    public int getProgram() {
        if (this._program == 0) {
            this._program = OpenGlUtils.loadProgram("attribute vec4 position;attribute vec4 inputTextureCoordinate;uniform float texelWidth;uniform float texelHeight;varying vec2 leftTextureCoordinate;varying vec2 rightTextureCoordinate;varying vec2 topTextureCoordinate;varying vec2 topLeftTextureCoordinate;varying vec2 topRightTextureCoordinate;varying vec2 bottomTextureCoordinate;varying vec2 bottomLeftTextureCoordinate;varying vec2 bottomRightTextureCoordinate;void main(){gl_Position = position;vec2 widthStep = vec2(texelWidth, 0.0);vec2 heightStep = vec2(0.0, texelHeight);vec2 widthHeightStep = vec2(texelWidth, texelHeight);vec2 widthNegativeHeightStep = vec2(texelWidth, -texelHeight);leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;topTextureCoordinate = inputTextureCoordinate.xy - heightStep;topLeftTextureCoordinate = inputTextureCoordinate.xy - widthHeightStep;topRightTextureCoordinate = inputTextureCoordinate.xy + widthNegativeHeightStep;bottomTextureCoordinate = inputTextureCoordinate.xy + heightStep;bottomLeftTextureCoordinate = inputTextureCoordinate.xy - widthNegativeHeightStep;bottomRightTextureCoordinate = inputTextureCoordinate.xy + widthHeightStep;}", FragmentShaderString, new int[]{0, 1}, new String[]{"position", "inputTextureCoordinate"}, 2);
            this._texelWidthUniform = GLES20.glGetUniformLocation(this._program, "texelWidth");
            this._texelHeightUniform = GLES20.glGetUniformLocation(this._program, "texelHeight");
            this._edgeStrengthUniform = GLES20.glGetUniformLocation(this._program, "edgeStrength");
        }
        return this._program;
    }

    public int getTexelWidthUniform() {
        return this._texelWidthUniform;
    }

    public int getTexelHeightUniform() {
        return this._texelHeightUniform;
    }

    public int getEdgeStrengthUniform() {
        return this._edgeStrengthUniform;
    }
}
