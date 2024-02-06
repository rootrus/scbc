package com.kofax.mobile.sdk._internal.impl.event;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.Image;

public class ImageCapturedBusEvent {
    public Image image;

    public ImageCapturedBusEvent(Bitmap bitmap) {
        this.image = new Image(Bitmap.createBitmap(bitmap));
    }
}
