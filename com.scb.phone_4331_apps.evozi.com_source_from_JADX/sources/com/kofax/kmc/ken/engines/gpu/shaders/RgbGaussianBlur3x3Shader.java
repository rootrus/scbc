package com.kofax.kmc.ken.engines.gpu.shaders;

import android.opengl.GLES20;
import com.kofax.kmc.ken.engines.gpu.OpenGLESContextManager;
import com.kofax.kmc.ken.engines.gpu.OpenGlUtils;

public class RgbGaussianBlur3x3Shader extends SinglePassShader {
    protected static final String FragmentShaderString = "precision highp float;varying vec2 textureCoordinate;varying vec2 leftTextureCoordinate;varying vec2 rightTextureCoordinate;varying vec2 topTextureCoordinate;varying vec2 topLeftTextureCoordinate;varying vec2 topRightTextureCoordinate;varying vec2 bottomTextureCoordinate;varying vec2 bottomLeftTextureCoordinate;varying vec2 bottomRightTextureCoordinate;uniform sampler2D inputImageTexture;const vec3 side = vec3(0.0625, 0.1250, 0.0625);const vec3 center = vec3(0.1250, 0.2500, 0.1250);void main(){vec3 centerColor = texture2D(inputImageTexture, textureCoordinate).rgb;vec3 bottomLeftColor = texture2D(inputImageTexture, bottomLeftTextureCoordinate).rgb;vec3 topRightColor = texture2D(inputImageTexture, topRightTextureCoordinate).rgb;vec3 topLeftColor = texture2D(inputImageTexture, topLeftTextureCoordinate).rgb;vec3 bottomRightColor = texture2D(inputImageTexture, bottomRightTextureCoordinate).rgb;vec3 leftColor = texture2D(inputImageTexture, leftTextureCoordinate).rgb;vec3 rightColor = texture2D(inputImageTexture, rightTextureCoordinate).rgb;vec3 bottomColor = texture2D(inputImageTexture, bottomTextureCoordinate).rgb;vec3 topColor = texture2D(inputImageTexture, topTextureCoordinate).rgb;float rBlur = dot(vec3(topLeftColor.r, leftColor.r, bottomLeftColor.r), side) +dot(vec3(topColor.r, centerColor.r, bottomColor.r), center) +dot(vec3(topRightColor.r, rightColor.r, bottomRightColor.r), side);float gBlur = dot(vec3(topLeftColor.g, leftColor.g, bottomLeftColor.g), side) +dot(vec3(topColor.g, centerColor.g, bottomColor.g), center) +dot(vec3(topRightColor.g, rightColor.g, bottomRightColor.g), side);float bBlur = dot(vec3(topLeftColor.b, leftColor.b, bottomLeftColor.b), side) +dot(vec3(topColor.b, centerColor.b, bottomColor.b), center) +dot(vec3(topRightColor.b, rightColor.b, bottomRightColor.b), side);gl_FragColor = vec4(rBlur, gBlur, bBlur, 1.0);}";
    protected int _texelHeightUniform = 0;
    protected int _texelWidthUniform = 0;

    public RgbGaussianBlur3x3Shader(OpenGLESContextManager openGLESContextManager) {
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
