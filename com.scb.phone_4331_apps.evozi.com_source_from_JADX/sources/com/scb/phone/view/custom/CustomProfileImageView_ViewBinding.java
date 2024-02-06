package com.scb.phone.view.custom;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomProfileImageView_ViewBinding implements Unbinder {
    private CustomProfileImageView MediaBrowserCompat$ItemReceiver;

    public CustomProfileImageView_ViewBinding(CustomProfileImageView customProfileImageView, View view) {
        this.MediaBrowserCompat$ItemReceiver = customProfileImageView;
        customProfileImageView.ivAvatar = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_avatar, "field 'ivAvatar'", ImageView.class);
        customProfileImageView.vBorder = (CustomDoubleCircleBorderView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.v_border, "field 'vBorder'", CustomDoubleCircleBorderView.class);
    }

    public final void read() {
        CustomProfileImageView customProfileImageView = this.MediaBrowserCompat$ItemReceiver;
        if (customProfileImageView != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customProfileImageView.ivAvatar = null;
            customProfileImageView.vBorder = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
