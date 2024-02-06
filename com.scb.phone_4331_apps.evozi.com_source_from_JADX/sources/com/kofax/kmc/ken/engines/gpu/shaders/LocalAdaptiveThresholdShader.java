package com.kofax.kmc.ken.engines.gpu.shaders;

import android.opengl.GLES20;
import com.kofax.kmc.ken.engines.gpu.OpenGLESContextManager;
import com.kofax.kmc.ken.engines.gpu.OpenGlUtils;
import com.kofax.mobile.sdk.p015ak.C0861f;

public class LocalAdaptiveThresholdShader extends TwoPassShader {
    protected static final String FirstPassFragmentShaderString = "precision highp float;varying vec2 textureCoordinate[%d];uniform sampler2D inputImageTexture;uniform float threshold;const float koef2 = 2.0;void main(){float sum = 0.0;%sfloat centralVal = texture2D(inputImageTexture, textureCoordinate[0]).r;sum += centralVal;float avg = sum / count;gl_FragColor = vec4(vec3(avg), centralVal);}";
    protected static final String SecondPassFragmentShaderString = "precision highp float;varying vec2 textureCoordinate[%d];uniform sampler2D inputImageTexture;uniform float threshold;const float koef2 = 2.0;void main(){float sum = 0.0;%svec2 centralRA = texture2D(inputImageTexture, textureCoordinate[0]).ra;sum += centralRA.x;float avg = sum / count;float thresholdResult = step(avg + threshold, centralRA.y);gl_FragColor = vec4(vec3(thresholdResult), 1.0);}";
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

    public LocalAdaptiveThresholdShader(OpenGLESContextManager openGLESContextManager) {
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
        String obj;
        int i;
        String obj2;
        if (this._vertexShader == null || this._firstPassFragmentShader == null || this._secondPassFragmentShader == null) {
            int maxVaryingVectors = this._contextManager.getMaxVaryingVectors() << 1;
            int max = Math.max(this._radius, 1);
            if (maxVaryingVectors % 2 == 0) {
                maxVaryingVectors--;
            }
            float min = (float) Math.min(max, (maxVaryingVectors - 1) / 2);
            float f = 1.5f;
            String str = "";
            int i2 = 1;
            int i3 = 1;
            String str2 = str;
            while (true) {
                if (f > min) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(C0861f.format("textureCoordinate[%d] = inputTextureCoordinate.xy + (%f * src_size);\n", Integer.valueOf(i2), Float.valueOf(min)));
                    String obj3 = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    int i4 = i2 + 1;
                    sb2.append(C0861f.format("sum += texture2D(inputImageTexture, textureCoordinate[%d]).r;\n", Integer.valueOf(i2)));
                    String obj4 = sb2.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj3);
                    sb3.append(C0861f.format("textureCoordinate[%d] = inputTextureCoordinate.xy - (%f * src_size);\n", Integer.valueOf(i4), Float.valueOf(min)));
                    obj = sb3.toString();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(obj4);
                    i = i4 + 1;
                    sb4.append(C0861f.format("sum += texture2D(inputImageTexture, textureCoordinate[%d]).r;\n", Integer.valueOf(i4)));
                    obj2 = sb4.toString();
                    i3 += 2;
                    break;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(C0861f.format("textureCoordinate[%d] = inputTextureCoordinate.xy + (%f * src_size);\n", Integer.valueOf(i2), Float.valueOf(f)));
                String obj5 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                int i5 = i2 + 1;
                sb6.append(C0861f.format("sum += koef2 * texture2D(inputImageTexture, textureCoordinate[%d]).r;\n", Integer.valueOf(i2)));
                String obj6 = sb6.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(obj5);
                sb7.append(C0861f.format("textureCoordinate[%d] = inputTextureCoordinate.xy - (%f * src_size);\n", Integer.valueOf(i5), Float.valueOf(f)));
                str = sb7.toString();
                StringBuilder sb8 = new StringBuilder();
                sb8.append(obj6);
                int i6 = i5 + 1;
                sb8.append(C0861f.format("sum += koef2 * texture2D(inputImageTexture, textureCoordinate[%d]).r;\n", Integer.valueOf(i5)));
                str2 = sb8.toString();
                f += 2.0f;
                i3 += 4;
                if (f >= 1.0f + min) {
                    obj = str;
                    obj2 = str2;
                    i = i6;
                    break;
                }
                i2 = i6;
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append(obj2);
            sb9.append(C0861f.format("float count = %f;\n", Float.valueOf((float) i3)));
            String obj7 = sb9.toString();
            this._vertexShader = C0861f.format(VertexShaderString, Integer.valueOf(i), obj);
            this._firstPassFragmentShader = C0861f.format(FirstPassFragmentShaderString, Integer.valueOf(i), obj7);
            this._secondPassFragmentShader = C0861f.format(SecondPassFragmentShaderString, Integer.valueOf(i), obj7);
        }
    }
}
