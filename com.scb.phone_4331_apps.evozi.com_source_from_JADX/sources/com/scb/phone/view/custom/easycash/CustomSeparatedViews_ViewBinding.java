package com.scb.phone.view.custom.easycash;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomSeparatedViews_ViewBinding implements Unbinder {
    private CustomSeparatedViews MediaBrowserCompat$ItemReceiver;

    public CustomSeparatedViews_ViewBinding(CustomSeparatedViews customSeparatedViews, View view) {
        this.MediaBrowserCompat$ItemReceiver = customSeparatedViews;
        customSeparatedViews.items = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linear_layout, "field 'items'", LinearLayout.class);
    }

    public final void read() {
        CustomSeparatedViews customSeparatedViews = this.MediaBrowserCompat$ItemReceiver;
        if (customSeparatedViews != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customSeparatedViews.items = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
