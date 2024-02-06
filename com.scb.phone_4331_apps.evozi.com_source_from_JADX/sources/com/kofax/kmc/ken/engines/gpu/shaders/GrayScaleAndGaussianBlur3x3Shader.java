package com.kofax.kmc.ken.engines.gpu.shaders;

import android.opengl.GLES20;
import com.kofax.kmc.ken.engines.gpu.OpenGLESContextManager;
import com.kofax.kmc.ken.engines.gpu.OpenGlUtils;

public class GrayScaleAndGaussianBlur3x3Shader extends SinglePassShader {
    protected static final String FragmentShaderString = "precision highp float;varying vec2 textureCoordinate;varying vec2 leftTextureCoordinate;varying vec2 rightTextureCoordinate;varying vec2 topTextureCoordinate;varying vec2 topLeftTextureCoordinate;varying vec2 topRightTextureCoordinate;varying vec2 bottomTextureCoordinate;varying vec2 bottomLeftTextureCoordinate;varying vec2 bottomRightTextureCoordinate;uniform sampler2D inputImageTexture;const vec3 side = vec3(0.0625, 0.1250, 0.0625);const vec3 center = vec3(0.1250, 0.2500, 0.1250);const vec3 W = vec3(0.2125, 0.7154, 0.0721);void main(){float topLeftIntensity = dot(texture2D(inputImageTexture, topLeftTextureCoordinate).rgb, W);float leftIntensity = dot(texture2D(inputImageTexture, leftTextureCoordinate).rgb, W);float bottomLeftIntensity = dot(texture2D(inputImageTexture, bottomLeftTextureCoordinate).rgb, W);float sumL = dot(vec3(topLeftIntensity, leftIntensity, bottomLeftIntensity), side);float topIntensity = dot(texture2D(inputImageTexture, topTextureCoordinate).rgb, W);float centerIntensity = dot(texture2D(inputImageTexture, textureCoordinate).rgb, W);float bottomIntensity = dot(texture2D(inputImageTexture, bottomTextureCoordinate).rgb, W);float sumC = dot(vec3(topIntensity, centerIntensity, bottomIntensity), center);float topRightIntensity = dot(texture2D(inputImageTexture, topRightTextureCoordinate).rgb, W);float rightIntensity = dot(texture2D(inputImageTexture, rightTextureCoordinate).rgb, W);float bottomRightIntensity = dot(texture2D(inputImageTexture, bottomRightTextureCoordinate).rgb, W);float sumR = dot(vec3(topRightIntensity, rightIntensity, bottomRightIntensity), side);gl_FragColor = vec4(vec3(sumL + sumC + sumR), 1.0);}";
    protected int _texelHeightUniform = 0;
    protected int _texelWidthUniform = 0;

    public GrayScaleAndGaussianBlur3x3Shader(OpenGLESContextManager openGLESContextManager) {
        super(openGLESContextManager);
    }

    public int getProgram() {
        if (this._program == 0) {
            this._program = OpenGlUtils.loadProgram("attribute vec4 position;attribute vec4 inputTextureCoordinate;uniform float texelWidth;uniform float texelHeight;varying vec2 textureCoordinate;varying vec2 leftTextureCoordinate;varying vec2 rightTextureCoordinate;varying vec2 topTextureCoordinate;varying vec2 topLeftTextureCoordinate;varying vec2 topRightTextureCoordinate;varying vec2 bottomTextureCoordinate;varying vec2 bottomLeftTextureCoordinate;varying vec2 bottomRightTextureCoordinate;void main(){gl_Position = position;vec2 widthStep = vec2(texelWidth, 0.0);vec2 heightStep = vec2(0.0, texelHeight);vec2 widthHeightStep = vec2(texelWidth, texelHeight);vec2 widthNegativeHeightStep = vec2(texelWidth, -texelHeight);textureCoordinate = inputTextureCoordinate.xy;leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;topTextureCoordinate = inputTextureCoordinate.xy - heightStep;topLeftTextureCoordinate = inputTextureCoordinate.xy - widthHeightStep;topRightTextureCoordinate = inputTextureCoordinate.xy + widthNegativeHeightStep;bottomTextureCoordinate = inputTextureCoordinate.xy + heightStep;bottomLeftTextureCoordinate = inputTextureCoordinate.xy - widthNegativeHeightStep;bottomRightTextureCoordinate = inputTextureCoordinate.xy + widthHeightStep;}", FragmentShaderString, new int[]{0, 1}, new String[]{"position", "inputTextureCoordinate"}, 2);
            this._texelWidthUniform = GLES20.glGetUniformLocation(this._program, "texelWidth");
            this._texelHeightUniform = GLES20.glGetUniformLocation(this._program, "texelHeight");
        }
        return this._program;
    }

    public int getTexelWidthUniform() {
        return this._texelWidthUniform;
    }

    public int getTexelHeightUniform() {
        return this._texelHeightUniform;
    }
}
