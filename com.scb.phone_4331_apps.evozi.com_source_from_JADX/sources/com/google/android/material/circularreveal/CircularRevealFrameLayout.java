package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p040o.nDeviceCreate;
import p040o.nDeviceSetConfig;

public class CircularRevealFrameLayout extends FrameLayout implements nDeviceSetConfig {
    private final nDeviceCreate IconCompatParcelizer;

    public CircularRevealFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CircularRevealFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IconCompatParcelizer = new nDeviceCreate(this);
    }

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer.read();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final nDeviceSetConfig.read read() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    public void setRevealInfo(nDeviceSetConfig.read read) {
        this.IconCompatParcelizer.read(read);
    }

    public final int write() {
        return this.IconCompatParcelizer.write.getColor();
    }

    public void setCircularRevealScrimColor(int i) {
        nDeviceCreate ndevicecreate = this.IconCompatParcelizer;
        ndevicecreate.write.setColor(i);
        ndevicecreate.MediaBrowserCompat$ItemReceiver.invalidate();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        nDeviceCreate ndevicecreate = this.IconCompatParcelizer;
        ndevicecreate.MediaBrowserCompat$CustomActionResultReceiver = drawable;
        ndevicecreate.MediaBrowserCompat$ItemReceiver.invalidate();
    }

    public void draw(Canvas canvas) {
        nDeviceCreate ndevicecreate = this.IconCompatParcelizer;
        if (ndevicecreate != null) {
            ndevicecreate.IconCompatParcelizer(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean isOpaque() {
        nDeviceCreate ndevicecreate = this.IconCompatParcelizer;
        if (ndevicecreate != null) {
            return ndevicecreate.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver() && !ndevicecreate.MediaBrowserCompat$ItemReceiver();
        }
        return super.isOpaque();
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return super.isOpaque();
    }
}
