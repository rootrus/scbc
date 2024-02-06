package com.kofax.kmc.ken.engines.gpu.shaders;

import android.opengl.GLES20;
import com.kofax.kmc.ken.engines.gpu.OpenGLESContextManager;
import com.kofax.kmc.ken.engines.gpu.OpenGlUtils;

public class GrayScaleAndLaplacianShader extends SinglePassShader {
    protected static final String FragmentShaderString = "precision highp float;varying vec2 textureCoordinate;varying vec2 leftTextureCoordinate;varying vec2 rightTextureCoordinate;varying vec2 topTextureCoordinate;varying vec2 bottomTextureCoordinate;uniform sampler2D inputImageTexture;const vec3 W = vec3(0.2125, 0.7154, 0.0721);void main(){float leftIntensity = dot(texture2D(inputImageTexture, leftTextureCoordinate).rgb, W);float rightIntensity = dot(texture2D(inputImageTexture, rightTextureCoordinate).rgb, W);float bottomIntensity = dot(texture2D(inputImageTexture, bottomTextureCoordinate).rgb, W);float topIntensity = dot(texture2D(inputImageTexture, topTextureCoordinate).rgb, W);float centerIntensity = dot(texture2D(inputImageTexture, textureCoordinate).rgb, W);float resultIntensity = topIntensity + rightIntensity + bottomIntensity + leftIntensity - 4.0 * centerIntensity;gl_FragColor = vec4(vec3(resultIntensity), 1.0);}";
    protected static final String VertextShaderString = "attribute vec4 position;attribute vec4 inputTextureCoordinate;uniform float texelWidth;uniform float texelHeight;varying vec2 textureCoordinate;varying vec2 leftTextureCoordinate;varying vec2 rightTextureCoordinate;varying vec2 topTextureCoordinate;varying vec2 bottomTextureCoordinate;void main(){gl_Position = position;vec2 widthStep = vec2(texelWidth, 0.0);vec2 heightStep = vec2(0.0, texelHeight);textureCoordinate = inputTextureCoordinate.xy;leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;topTextureCoordinate = inputTextureCoordinate.xy - heightStep;bottomTextureCoordinate = inputTextureCoordinate.xy + heightStep;}";
    protected int _texelHeightUniform = 0;
    protected int _texelWidthUniform = 0;

    public GrayScaleAndLaplacianShader(OpenGLESContextManager openGLESContextManager) {
        super(openGLESContextManager);
    }

    public int getProgram() {
        if (this._program == 0) {
            this._program = OpenGlUtils.loadProgram(VertextShaderString, FragmentShaderString, new int[]{0, 1}, new String[]{"position", "inputTextureCoordinate"}, 2);
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
