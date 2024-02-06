package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class DefaultButton_ViewBinding implements Unbinder {
    private DefaultButton MediaBrowserCompat$ItemReceiver;

    public DefaultButton_ViewBinding(DefaultButton defaultButton, View view) {
        this.MediaBrowserCompat$ItemReceiver = defaultButton;
        defaultButton.mTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.default_button_text_view, "field 'mTextView'", TextView.class);
        defaultButton.mIconImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.default_button_icon_image_view, "field 'mIconImageView'", ImageView.class);
        defaultButton.mIconImageViewRight = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.default_button_icon_image_view_right, "field 'mIconImageViewRight'", ImageView.class);
        defaultButton.mRippleView = onStart.IconCompatParcelizer(view, R.id.default_button_ripple, "field 'mRippleView'");
    }

    public final void read() {
        DefaultButton defaultButton = this.MediaBrowserCompat$ItemReceiver;
        if (defaultButton != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            defaultButton.mTextView = null;
            defaultButton.mIconImageView = null;
            defaultButton.mIconImageViewRight = null;
            defaultButton.mRippleView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
