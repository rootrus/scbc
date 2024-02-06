package com.kofax.mobile.sdk._internal.impl.camera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.kofax.mobile.sdk._internal.camera.C7893v;
import java.io.ByteArrayOutputStream;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.as */
public class C7931as implements C7893v {
    /* renamed from: b */
    public Bitmap mo54223b(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new YuvImage(bArr, 17, i, i2, (int[]) null).compressToJpeg(new Rect(0, 0, i, i2), 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }
}
