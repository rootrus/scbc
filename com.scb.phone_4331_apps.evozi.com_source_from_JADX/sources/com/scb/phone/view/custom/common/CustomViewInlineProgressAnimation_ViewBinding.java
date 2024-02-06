package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomViewInlineProgressAnimation_ViewBinding implements Unbinder {
    private CustomViewInlineProgressAnimation MediaBrowserCompat$CustomActionResultReceiver;

    public CustomViewInlineProgressAnimation_ViewBinding(CustomViewInlineProgressAnimation customViewInlineProgressAnimation, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customViewInlineProgressAnimation;
        customViewInlineProgressAnimation.point1 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.progress_inline_circle01, "field 'point1'", ImageView.class);
        customViewInlineProgressAnimation.point2 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.progress_inline_circle02, "field 'point2'", ImageView.class);
        customViewInlineProgressAnimation.point3 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.progress_inline_circle03, "field 'point3'", ImageView.class);
    }

    public final void read() {
        CustomViewInlineProgressAnimation customViewInlineProgressAnimation = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customViewInlineProgressAnimation != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customViewInlineProgressAnimation.point1 = null;
            customViewInlineProgressAnimation.point2 = null;
            customViewInlineProgressAnimation.point3 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
