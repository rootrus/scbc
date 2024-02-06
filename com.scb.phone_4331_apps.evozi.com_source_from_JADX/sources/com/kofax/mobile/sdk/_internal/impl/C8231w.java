package com.kofax.mobile.sdk._internal.impl;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk._internal.IImageToByteArray;
import java.nio.ByteBuffer;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.w */
public class C8231w implements IImageToByteArray {
    private static final String TAG = C8231w.class.getSimpleName();

    /* renamed from: wM */
    private final C7919g f4350wM;

    @HmlPinActivity
    public C8231w(C7919g gVar) {
        this.f4350wM = gVar;
    }

    public byte[] convert(Image image) {
        if (image.getImageFileRep() == Image.ImageFileRep.FILE_BUFFERED) {
            return m4530A(image);
        }
        C7919g.C7920a aVar = null;
        try {
            aVar = this.f4350wM.mo54325w(image);
            Image image2 = new Image(aVar.getBitmap());
            image2.setImageMimeType(image.getImageMimeType());
            image2.setImageOutputColor(image.getImageOutputColor());
            image2.setImageJpegQuality(image.getImageJpegQuality().intValue());
            if (image.getImageDPI() != null) {
                image2.setImageDPI(image.getImageDPI().intValue());
            }
            return m4531z(image2);
        } finally {
            if (aVar != null) {
                aVar.mo54326be();
            }
        }
    }

    /* renamed from: z */
    private byte[] m4531z(Image image) {
        if (image.getImageBitmap() == null) {
            throw new IllegalArgumentException("image doesn't have a bitmap");
        } else if (image.getImageFileRep() == Image.ImageFileRep.FILE_NONE) {
            try {
                image.imageWriteToFileBuffer();
                byte[] A = m4530A(image);
                try {
                    image.imageClearFileBuffer();
                } catch (KmcException e) {
                    C0767k.m1821e(TAG, "Unable to clear a file buffer", (Throwable) e);
                }
                return A;
            } catch (KmcException e2) {
                throw new RuntimeException(e2);
            } catch (Throwable th) {
                try {
                    image.imageClearFileBuffer();
                } catch (KmcException e3) {
                    C0767k.m1821e(TAG, "Unable to clear a file buffer", (Throwable) e3);
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Cannot convert an image that has a file representation");
        }
    }

    /* renamed from: A */
    private byte[] m4530A(Image image) {
        if (image.getImageFileRep() == Image.ImageFileRep.FILE_BUFFERED) {
            ByteBuffer imageFileBuffer = image.getImageFileBuffer();
            byte[] bArr = new byte[imageFileBuffer.capacity()];
            imageFileBuffer.get(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("image doesn't have a file buffer");
    }
}
