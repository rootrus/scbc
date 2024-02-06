package com.kofax.kmc.ken.engines.iplib;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.service.ImageService;
import java.nio.ByteBuffer;

public class IpFileBuffer {
    public int mBitDepth;
    public ByteBuffer mByteBuffer;
    public String mExifMetadataStr;
    public int mFileBufferLength;
    public int mHeight;
    public int mIpFileType;
    public int mIpRetVal;
    public int mJniFileBufferHandle;
    public int mJpegQuality;
    public int mWidth;

    public IpFileBuffer(Image.ImageMimeType imageMimeType, int i, int i2, String str) {
        this(ImageService.imgMimeTypetoIpFileType(imageMimeType), i, i2, str);
    }

    public IpFileBuffer(int i, int i2, int i3, String str) {
        this.mIpFileType = i;
        this.mBitDepth = i2;
        this.mJpegQuality = i3;
        this.mExifMetadataStr = str;
    }
}
