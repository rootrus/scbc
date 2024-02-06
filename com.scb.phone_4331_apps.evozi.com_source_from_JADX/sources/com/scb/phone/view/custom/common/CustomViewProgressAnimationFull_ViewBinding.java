package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomViewProgressAnimationFull_ViewBinding implements Unbinder {
    private CustomViewProgressAnimationFull MediaBrowserCompat$ItemReceiver;

    public CustomViewProgressAnimationFull_ViewBinding(CustomViewProgressAnimationFull customViewProgressAnimationFull, View view) {
        this.MediaBrowserCompat$ItemReceiver = customViewProgressAnimationFull;
        customViewProgressAnimationFull.topPoint = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.progress_circle01, "field 'topPoint'", ImageView.class);
        customViewProgressAnimationFull.leftPoint = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.progress_circle02, "field 'leftPoint'", ImageView.class);
        customViewProgressAnimationFull.rightPoint = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.progress_circle03, "field 'rightPoint'", ImageView.class);
        customViewProgressAnimationFull.bottomPoint = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.progress_circle04, "field 'bottomPoint'", ImageView.class);
    }

    public final void read() {
        CustomViewProgressAnimationFull customViewProgressAnimationFull = this.MediaBrowserCompat$ItemReceiver;
        if (customViewProgressAnimationFull != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customViewProgressAnimationFull.topPoint = null;
            customViewProgressAnimationFull.leftPoint = null;
            customViewProgressAnimationFull.rightPoint = null;
            customViewProgressAnimationFull.bottomPoint = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
