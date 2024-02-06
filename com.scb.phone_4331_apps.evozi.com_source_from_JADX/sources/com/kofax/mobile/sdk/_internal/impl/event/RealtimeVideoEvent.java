package com.kofax.mobile.sdk._internal.impl.event;

import android.graphics.Bitmap;

public final class RealtimeVideoEvent {

    /* renamed from: Ji */
    private final PreviewImageReadyBusEvent f3700Ji;

    public RealtimeVideoEvent(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        this.f3700Ji = previewImageReadyBusEvent;
    }

    public final Bitmap getBitmap() {
        return getBitmap(Boolean.TRUE);
    }

    public final Bitmap getBitmap(Boolean bool) {
        return this.f3700Ji.getBitmap(bool.booleanValue());
    }

    public final Bitmap getBitmapLandscape() {
        return this.f3700Ji.getBitmapLandscape();
    }

    public final int getRotationLandscape() {
        return this.f3700Ji.getRotationLandscape();
    }

    public final int getRotation() {
        return this.f3700Ji.rotation;
    }

    public final byte[] getData() {
        return this.f3700Ji.imageData;
    }

    public final int getWidth() {
        return this.f3700Ji.width;
    }

    public final int getHeight() {
        return this.f3700Ji.height;
    }
}
