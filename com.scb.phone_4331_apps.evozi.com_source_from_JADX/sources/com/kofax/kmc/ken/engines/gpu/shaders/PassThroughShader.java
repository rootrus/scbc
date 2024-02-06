package com.kofax.kmc.ken.engines.gpu.shaders;

import com.kofax.kmc.ken.engines.gpu.OpenGLESContextManager;
import com.kofax.kmc.ken.engines.gpu.OpenGlUtils;

public class PassThroughShader extends SinglePassShader {
    protected static final String FragmentShaderString = "varying highp vec2 textureCoordinate;uniform sampler2D inputImageTexture;void main(){gl_FragColor = texture2D(inputImageTexture, textureCoordinate);}";

    public PassThroughShader(OpenGLESContextManager openGLESContextManager) {
        super(openGLESContextManager);
    }

    public int getProgram() {
        if (this._program == 0) {
            this._program = OpenGlUtils.loadProgram("attribute vec4 position;attribute vec4 inputTextureCoordinate;varying vec2 textureCoordinate;void main(){gl_Position = position;textureCoordinate = inputTextureCoordinate.xy;}", FragmentShaderString, new int[]{0, 1}, new String[]{"position", "inputTextureCoordinate"}, 2);
        }
        return this._program;
    }
}
