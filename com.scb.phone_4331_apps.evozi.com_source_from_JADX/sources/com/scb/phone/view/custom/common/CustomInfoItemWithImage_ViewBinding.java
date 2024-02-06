package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomInfoItemWithImage_ViewBinding implements Unbinder {
    private CustomInfoItemWithImage MediaBrowserCompat$ItemReceiver;

    public CustomInfoItemWithImage_ViewBinding(CustomInfoItemWithImage customInfoItemWithImage, View view) {
        this.MediaBrowserCompat$ItemReceiver = customInfoItemWithImage;
        customInfoItemWithImage.ivLeftImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivLeftImage, "field 'ivLeftImage'", ImageView.class);
        customInfoItemWithImage.tvRightText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvRightText, "field 'tvRightText'", TextView.class);
    }

    public final void read() {
        CustomInfoItemWithImage customInfoItemWithImage = this.MediaBrowserCompat$ItemReceiver;
        if (customInfoItemWithImage != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customInfoItemWithImage.ivLeftImage = null;
            customInfoItemWithImage.tvRightText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
