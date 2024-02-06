package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import p040o.nDeviceCreate;
import p040o.nDeviceSetConfig;

public class CircularRevealCardView extends CardView implements nDeviceSetConfig {
    private final nDeviceCreate RatingCompat;

    public CircularRevealCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.RatingCompat = new nDeviceCreate(this);
    }

    public final void IconCompatParcelizer() {
        this.RatingCompat.read();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public void setRevealInfo(nDeviceSetConfig.read read) {
        this.RatingCompat.read(read);
    }

    public final nDeviceSetConfig.read read() {
        return this.RatingCompat.IconCompatParcelizer();
    }

    public void setCircularRevealScrimColor(int i) {
        nDeviceCreate ndevicecreate = this.RatingCompat;
        ndevicecreate.write.setColor(i);
        ndevicecreate.MediaBrowserCompat$ItemReceiver.invalidate();
    }

    public final int write() {
        return this.RatingCompat.write.getColor();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        nDeviceCreate ndevicecreate = this.RatingCompat;
        ndevicecreate.MediaBrowserCompat$CustomActionResultReceiver = drawable;
        ndevicecreate.MediaBrowserCompat$ItemReceiver.invalidate();
    }

    public void draw(Canvas canvas) {
        nDeviceCreate ndevicecreate = this.RatingCompat;
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
        nDeviceCreate ndevicecreate = this.RatingCompat;
        if (ndevicecreate != null) {
            return ndevicecreate.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver() && !ndevicecreate.MediaBrowserCompat$ItemReceiver();
        }
        return super.isOpaque();
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return super.isOpaque();
    }
}
