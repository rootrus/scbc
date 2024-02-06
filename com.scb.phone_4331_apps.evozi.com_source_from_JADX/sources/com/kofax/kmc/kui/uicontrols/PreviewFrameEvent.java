package com.kofax.kmc.kui.uicontrols;

import android.graphics.Bitmap;
import com.kofax.mobile.sdk._internal.impl.event.RealtimeVideoEvent;
import java.util.EventObject;

public class PreviewFrameEvent extends EventObject {
    private static final long serialVersionUID = 1;

    /* renamed from: mf */
    private final RealtimeVideoEvent f3533mf;

    public PreviewFrameEvent(Object obj, RealtimeVideoEvent realtimeVideoEvent) {
        super(obj);
        this.f3533mf = realtimeVideoEvent;
    }

    public Bitmap getBitmap() {
        return getBitmap(true);
    }

    public Bitmap getBitmap(boolean z) {
        return this.f3533mf.getBitmap(Boolean.valueOf(z));
    }

    public Bitmap getBitmapLandscape() {
        return this.f3533mf.getBitmapLandscape();
    }

    public int getRotationLandscape() {
        return this.f3533mf.getRotationLandscape();
    }

    public int getRotation() {
        return this.f3533mf.getRotation();
    }

    public byte[] getData() {
        return this.f3533mf.getData();
    }

    public int getWidth() {
        return this.f3533mf.getWidth();
    }

    public int getHeight() {
        return this.f3533mf.getHeight();
    }
}
