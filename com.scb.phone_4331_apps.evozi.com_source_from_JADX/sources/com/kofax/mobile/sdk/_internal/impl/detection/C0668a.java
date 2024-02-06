package com.kofax.mobile.sdk._internal.impl.detection;

import android.graphics.Bitmap;

/* renamed from: com.kofax.mobile.sdk._internal.impl.detection.a */
public class C0668a implements Frame {
    public final Bitmap _bitmap;

    public C0668a(Bitmap bitmap) {
        if (bitmap != null) {
            this._bitmap = bitmap;
            return;
        }
        throw new IllegalArgumentException("bitmap is null");
    }

    public int getWidth() {
        return this._bitmap.getWidth();
    }

    public int getHeight() {
        return this._bitmap.getHeight();
    }

    public Bitmap toBitmap() {
        return this._bitmap;
    }
}
