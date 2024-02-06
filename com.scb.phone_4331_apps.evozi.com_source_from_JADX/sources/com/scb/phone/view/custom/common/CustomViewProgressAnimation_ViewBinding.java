package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomViewProgressAnimation_ViewBinding implements Unbinder {
    private CustomViewProgressAnimation write;

    public CustomViewProgressAnimation_ViewBinding(CustomViewProgressAnimation customViewProgressAnimation, View view) {
        this.write = customViewProgressAnimation;
        customViewProgressAnimation.halfCircleProgressBar = (ProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.progressBar, "field 'halfCircleProgressBar'", ProgressBar.class);
    }

    public final void read() {
        CustomViewProgressAnimation customViewProgressAnimation = this.write;
        if (customViewProgressAnimation != null) {
            this.write = null;
            customViewProgressAnimation.halfCircleProgressBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
