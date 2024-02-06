package com.kofax.kmc.ken.engines.gpu.shaders;

import android.opengl.GLES20;
import com.kofax.kmc.ken.engines.gpu.OpenGLESContextManager;
import com.kofax.kmc.ken.engines.gpu.OpenGlUtils;

public class RgbSobelShader extends SinglePassShader {
    protected static final String FragmentShaderString = "precision highp float;varying vec2 leftTextureCoordinate;varying vec2 rightTextureCoordinate;varying vec2 topTextureCoordinate;varying vec2 topLeftTextureCoordinate;varying vec2 topRightTextureCoordinate;varying vec2 bottomTextureCoordinate;varying vec2 bottomLeftTextureCoordinate;varying vec2 bottomRightTextureCoordinate;uniform sampler2D inputImageTexture;uniform float edgeStrength;void main(){vec3 bottomLeft = texture2D(inputImageTexture, bottomLeftTextureCoordinate).rgb;vec3 topRight = texture2D(inputImageTexture, topRightTextureCoordinate).rgb;vec3 topLeft = texture2D(inputImageTexture, topLeftTextureCoordinate).rgb;vec3 bottomRight = texture2D(inputImageTexture, bottomRightTextureCoordinate).rgb;vec3 left = texture2D(inputImageTexture, leftTextureCoordinate).rgb;vec3 right = texture2D(inputImageTexture, rightTextureCoordinate).rgb;vec3 bottom = texture2D(inputImageTexture, bottomTextureCoordinate).rgb;vec3 top = texture2D(inputImageTexture, topTextureCoordinate).rgb;vec3 h = (2.0 * (bottom - top)) + (bottomLeft + bottomRight - topLeft - topRight);vec3 v = (2.0 * (right - left)) + (bottomRight + topRight - bottomLeft - topLeft);vec3 mag = edgeStrength * vec3(length(vec2(h.r, v.r)), length(vec2(h.g, v.g)), length(vec2(h.b, v.b)));gl_FragColor = vec4(vec3(mag.r + mag.g + mag.b), 1.0);}";
    protected int _edgeStrengthUniform = 0;
    protected int _texelHeightUniform = 0;
    protected int _texelWidthUniform = 0;

    public RgbSobelShader(OpenGLESContextManager openGLESContextManager) {
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
