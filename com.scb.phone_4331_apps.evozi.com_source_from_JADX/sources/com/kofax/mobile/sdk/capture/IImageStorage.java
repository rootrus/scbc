package com.kofax.mobile.sdk.capture;

import android.graphics.Bitmap;

public interface IImageStorage {
    Bitmap getImage(String str);

    Bitmap removeImage(String str);

    void setImage(Bitmap bitmap, String str);
}
