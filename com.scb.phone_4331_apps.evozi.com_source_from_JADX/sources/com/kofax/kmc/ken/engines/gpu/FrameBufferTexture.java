package com.kofax.kmc.ken.engines.gpu;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;

class FrameBufferTexture {
    public int mFrameBuffer;
    public int mHeight;
    public int mTexture = -1;
    public int mWidth;

    public FrameBufferTexture(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glGenTextures(1, iArr2, 0);
        this.mFrameBuffer = iArr[0];
        int i3 = iArr2[0];
        this.mTexture = i3;
        GLES20.glBindTexture(3553, i3);
        GLES20.glTexImage2D(3553, 0, 6408, this.mWidth, this.mHeight, 0, 6408, 5121, (Buffer) null);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glBindFramebuffer(36160, this.mFrameBuffer);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mTexture, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public final void destroy() {
        int i = this.mTexture;
        if (i != -1) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.mTexture = -1;
        }
        int i2 = this.mFrameBuffer;
        if (i2 != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
            this.mFrameBuffer = 0;
        }
    }

    public void setTextureBuffer(ByteBuffer byteBuffer) {
        int i = this.mTexture;
        if (i != -1) {
            GLES20.glBindTexture(3553, i);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, this.mWidth, this.mHeight, 6408, 5121, byteBuffer);
        }
    }
}
