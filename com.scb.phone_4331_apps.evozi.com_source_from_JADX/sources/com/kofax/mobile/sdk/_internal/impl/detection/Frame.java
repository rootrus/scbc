package com.kofax.mobile.sdk._internal.impl.detection;

import android.graphics.Bitmap;

public interface Frame {
    int getHeight();

    int getWidth();

    Bitmap toBitmap();
}
