package com.google.android.material.floatingactionbutton;

import android.graphics.drawable.Drawable;
import p040o.CreditCardWorkflowActivity;

class FloatingActionButton$MediaBrowserCompat$ItemReceiver implements CreditCardWorkflowActivity {
    private /* synthetic */ FloatingActionButton IconCompatParcelizer;

    FloatingActionButton$MediaBrowserCompat$ItemReceiver(FloatingActionButton floatingActionButton) {
        this.IconCompatParcelizer = floatingActionButton;
    }

    public final float IconCompatParcelizer() {
        FloatingActionButton floatingActionButton = this.IconCompatParcelizer;
        return ((float) floatingActionButton.MediaBrowserCompat$CustomActionResultReceiver(floatingActionButton.RatingCompat)) / 2.0f;
    }

    public final void write(int i, int i2, int i3, int i4) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = this.IconCompatParcelizer;
        floatingActionButton.setPadding(i + floatingActionButton.read, i2 + this.IconCompatParcelizer.read, i3 + this.IconCompatParcelizer.read, i4 + this.IconCompatParcelizer.read);
    }

    public final void MediaBrowserCompat$ItemReceiver(Drawable drawable) {
        FloatingActionButton$MediaBrowserCompat$ItemReceiver.super.setBackgroundDrawable(drawable);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
    }
}
