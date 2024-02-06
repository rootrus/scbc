package com.kofax.mobile.sdk._internal.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.Serializable;

/* renamed from: com.kofax.mobile.sdk._internal.impl.d */
public class C7942d implements IBase64ImageDecoder, Serializable {
    public Bitmap decode(String str) {
        byte[] decode = Base64.decode(str, 0);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new IllegalArgumentException("Unable to decode image");
    }
}
