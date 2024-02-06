package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomGiftingView_ViewBinding implements Unbinder {
    private CustomGiftingView MediaBrowserCompat$CustomActionResultReceiver;

    public CustomGiftingView_ViewBinding(CustomGiftingView customGiftingView, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customGiftingView;
        customGiftingView.giftIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_gift_icon, "field 'giftIcon'", ImageView.class);
        customGiftingView.giftTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_gift, "field 'giftTextView'", TextView.class);
    }

    public final void read() {
        CustomGiftingView customGiftingView = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customGiftingView != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customGiftingView.giftIcon = null;
            customGiftingView.giftTextView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
