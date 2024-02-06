package com.kofax.mobile.sdk._internal.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C7918f;

/* renamed from: com.kofax.mobile.sdk._internal.impl.s */
public class C8194s implements C7918f {
    /* renamed from: a */
    public Bitmap mo54324a(Image image, int i, int i2) throws KmcException {
        if (image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_NONE) {
            throw new KmcRuntimeException(ErrorInfo.KMC_IP_NO_REPRESENTATION);
        } else if (image.getImageFileRep() != Image.ImageFileRep.FILE_BUFFERED) {
            return m4468a(image, m4469y(image), i, i2);
        } else {
            throw new KmcRuntimeException(ErrorInfo.KMC_IP_FILE_AND_BUFFERED_REPRESENTATION);
        }
    }

    /* renamed from: a */
    private Bitmap m4468a(Image image, BitmapFactory.Options options, int i, int i2) throws KmcException {
        int a = m4467a(options, i, i2);
        if (image.getImageRepresentation() != Image.ImageRep.IMAGE_REP_FILE || image.getImageFileRep() != Image.ImageFileRep.FILE_STORED) {
            return Bitmap.createScaledBitmap(image.getImageBitmap(), image.getImageBitmapWidth().intValue() / a, image.getImageBitmapHeight().intValue() / a, false);
        } else if (image.getImageMimeType() == Image.ImageMimeType.MIMETYPE_TIFF) {
            Image image2 = new Image(image.getImageFilePath(), image.getImageMimeType());
            image2.imageReadFromFile(1.0f / ((float) a));
            return image2.getImageBitmap();
        } else {
            options.inJustDecodeBounds = false;
            options.inSampleSize = a;
            return BitmapFactory.decodeFile(image.getImageFilePath(), options);
        }
    }

    /* renamed from: y */
    private BitmapFactory.Options m4469y(Image image) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_FILE) {
            options.outHeight = image.getImageFileHeight().intValue();
            options.outWidth = image.getImageFileWidth().intValue();
        } else {
            options.outHeight = image.getImageBitmapHeight().intValue();
            options.outWidth = image.getImageBitmapWidth().intValue();
        }
        return options;
    }

    /* renamed from: a */
    public static int m4467a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            while (i3 / i5 > i2 && i4 / i5 > i) {
                i5 <<= 1;
            }
        }
        return i5;
    }
}
