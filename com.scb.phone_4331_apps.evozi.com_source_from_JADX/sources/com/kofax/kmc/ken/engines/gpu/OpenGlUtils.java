package com.kofax.kmc.ken.engines.gpu;

import android.opengl.GLES20;
import com.kofax.mobile.sdk._internal.C0767k;

public class OpenGlUtils {
    public static final int NO_TEXTURE = -1;

    public static int loadShader(String str, int i) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Compilation\n");
        sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
        C0767k.m1791C(sb.toString());
        return 0;
    }

    public static int loadProgram(String str, String str2, int[] iArr, String[] strArr, int i) {
        int[] iArr2 = new int[1];
        int loadShader = loadShader(str, 35633);
        if (loadShader == 0) {
            C0767k.m1793E("Vertex Shader Failed");
            C0767k.m1793E(str);
            return 0;
        }
        int loadShader2 = loadShader(str2, 35632);
        if (loadShader2 == 0) {
            C0767k.m1793E("Fragment Shader Failed");
            C0767k.m1793E("strFSource");
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, loadShader);
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        for (int i2 = 0; i2 < i; i2++) {
            GLES20.glBindAttribLocation(glCreateProgram, iArr[i2], strArr[i2]);
        }
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
        if (iArr2[0] <= 0) {
            C0767k.m1791C("Linking Failed");
            return 0;
        }
        GLES20.glDeleteShader(loadShader);
        GLES20.glDeleteShader(loadShader2);
        return glCreateProgram;
    }
}
