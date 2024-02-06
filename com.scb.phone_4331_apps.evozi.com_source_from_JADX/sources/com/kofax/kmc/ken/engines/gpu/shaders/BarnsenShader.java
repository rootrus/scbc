package com.kofax.kmc.ken.engines.gpu.shaders;

import android.opengl.GLES20;
import com.kofax.kmc.ken.engines.gpu.OpenGLESContextManager;
import com.kofax.kmc.ken.engines.gpu.OpenGlUtils;
import com.kofax.mobile.sdk.p015ak.C0861f;

public class BarnsenShader extends TwoPassShader {
    protected static final String FirstPassFragmentShaderString = "precision highp float;varying vec2 textureCoordinate[%d];uniform sampler2D inputImageTexture;uniform float threshold;void main(){float minVal = 1.0;float maxVal = 0.0;vec2 color;%svec3 centralColor = texture2D(inputImageTexture, textureCoordinate[0]).rgb;minVal = min(centralColor.r, minVal);maxVal = max(centralColor.g, maxVal);gl_FragColor = vec4(minVal, maxVal, centralColor.b, 1.0);}";
    protected static final String SecondPassFragmentShaderString = "precision highp float;varying vec2 textureCoordinate[%d];uniform sampler2D inputImageTexture;uniform float threshold;void main(){float minVal = 1.0;float maxVal = 0.0;vec2 color;%svec3 centralColor = texture2D(inputImageTexture, textureCoordinate[0]).rgb;minVal = min(centralColor.r, minVal);maxVal = max(centralColor.g, maxVal);float thresholdResult = step(threshold, maxVal - minVal);gl_FragColor = vec4(vec3(thresholdResult), 1.0);}";
    protected static final String VertexShaderString = "attribute vec4 position;attribute vec4 inputTextureCoordinate;varying vec2 textureCoordinate[%d];uniform float texelWidth;uniform float texelHeight;void main(){gl_Position = position;textureCoordinate[0] = inputTextureCoordinate.xy;vec2 src_size = vec2(texelWidth, texelHeight);%s}";
    protected String _firstPassFragmentShader;
    protected int _firstPassTexelHeightUniform = 0;
    protected int _firstPassTexelWidthUniform = 0;
    protected int _firstPassThresholdUniform = 0;
    protected int _radius;
    protected String _secondPassFragmentShader;
    protected int _secondPassTexelHeightUniform = 0;
    protected int _secondPassTexelWidthUniform = 0;
    protected int _secondPassThresholdUniform = 0;
    protected String _vertexShader;

    public BarnsenShader(OpenGLESContextManager openGLESContextManager) {
        super(openGLESContextManager);
    }

    public int getFirstPassProgram() {
        if (this._firstPassProgram == 0) {
            generateShader();
            this._firstPassProgram = OpenGlUtils.loadProgram(this._vertexShader, this._firstPassFragmentShader, new int[]{0, 1}, new String[]{"position", "inputTextureCoordinate"}, 2);
            this._firstPassTexelWidthUniform = GLES20.glGetUniformLocation(this._firstPassProgram, "texelWidth");
            this._firstPassTexelHeightUniform = GLES20.glGetUniformLocation(this._firstPassProgram, "texelHeight");
            this._firstPassThresholdUniform = GLES20.glGetUniformLocation(this._firstPassProgram, "threshold");
        }
        return this._firstPassProgram;
    }

    public int getSecondPassProgram() {
        if (this._secondPassProgram == 0) {
            generateShader();
            this._secondPassProgram = OpenGlUtils.loadProgram(this._vertexShader, this._secondPassFragmentShader, new int[]{0, 1}, new String[]{"position", "inputTextureCoordinate"}, 2);
            this._secondPassTexelWidthUniform = GLES20.glGetUniformLocation(this._secondPassProgram, "texelWidth");
            this._secondPassTexelHeightUniform = GLES20.glGetUniformLocation(this._secondPassProgram, "texelHeight");
            this._secondPassThresholdUniform = GLES20.glGetUniformLocation(this._secondPassProgram, "threshold");
        }
        return this._secondPassProgram;
    }

    public void destroy() {
        this._vertexShader = null;
        this._firstPassFragmentShader = null;
        this._secondPassFragmentShader = null;
        super.destroy();
    }

    public int getFirstPassTexelWidthUniform() {
        return this._firstPassTexelWidthUniform;
    }

    public int getFirstPassTexelHeightUniform() {
        return this._firstPassTexelHeightUniform;
    }

    public int getFirstPassThresholdUniform() {
        return this._firstPassThresholdUniform;
    }

    public int getSecondPassTexelWidthUniform() {
        return this._secondPassTexelWidthUniform;
    }

    public int getSecondPassTexelHeightUniform() {
        return this._secondPassTexelHeightUniform;
    }

    public int getSecondPassThresholdUniform() {
        return this._secondPassThresholdUniform;
    }

    public void setRadius(int i) {
        if (this._radius != i) {
            this._radius = i;
            destroy();
        }
    }

    /* access modifiers changed from: protected */
    public void generateShader() {
        if (this._vertexShader == null || this._firstPassFragmentShader == null || this._secondPassFragmentShader == null) {
            int maxVaryingVectors = this._contextManager.getMaxVaryingVectors() << 1;
            int max = Math.max(this._radius, 1);
            if (maxVaryingVectors % 2 == 0) {
                maxVaryingVectors--;
            }
            float min = (float) Math.min(max, (maxVaryingVectors - 1) / 2);
            String str = "";
            int i = 1;
            int i2 = 1;
            String str2 = str;
            while (true) {
                float f = (float) i;
                if (f <= min) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(C0861f.format("textureCoordinate[%d] = inputTextureCoordinate.xy + (%f * src_size);\n", Integer.valueOf(i2), Float.valueOf(f)));
                    String obj = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    int i3 = i2 + 1;
                    sb2.append(C0861f.format("color = texture2D(inputImageTexture, textureCoordinate[%d]).rg;\n", Integer.valueOf(i2)));
                    String obj2 = sb2.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj2);
                    sb3.append("minVal = min(color.r, minVal);\n");
                    String obj3 = sb3.toString();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(obj3);
                    sb4.append("maxVal = max(color.g, maxVal);\n");
                    String obj4 = sb4.toString();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(obj);
                    sb5.append(C0861f.format("textureCoordinate[%d] = inputTextureCoordinate.xy - (%f * src_size);\n", Integer.valueOf(i3), Float.valueOf(f)));
                    str = sb5.toString();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(obj4);
                    sb6.append(C0861f.format("color = texture2D(inputImageTexture, textureCoordinate[%d]).rg;\n", Integer.valueOf(i3)));
                    String obj5 = sb6.toString();
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(obj5);
                    sb7.append("minVal = min(color.r, minVal);\n");
                    String obj6 = sb7.toString();
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(obj6);
                    sb8.append("maxVal = max(color.g, maxVal);\n");
                    str2 = sb8.toString();
                    i++;
                    i2 = i3 + 1;
                } else {
                    this._vertexShader = C0861f.format(VertexShaderString, Integer.valueOf(i2), str);
                    this._firstPassFragmentShader = C0861f.format(FirstPassFragmentShaderString, Integer.valueOf(i2), str2);
                    this._secondPassFragmentShader = C0861f.format(SecondPassFragmentShaderString, Integer.valueOf(i2), str2);
                    return;
                }
            }
        }
    }
}
