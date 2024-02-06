package com.scb.phone.view.custom.hml;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomTutorialImageAndText_ViewBinding implements Unbinder {
    private CustomTutorialImageAndText MediaBrowserCompat$CustomActionResultReceiver;

    public CustomTutorialImageAndText_ViewBinding(CustomTutorialImageAndText customTutorialImageAndText, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customTutorialImageAndText;
        customTutorialImageAndText.imageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_image, "field 'imageView'", ImageView.class);
        customTutorialImageAndText.textView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_text, "field 'textView'", TextView.class);
    }

    public final void read() {
        CustomTutorialImageAndText customTutorialImageAndText = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customTutorialImageAndText != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customTutorialImageAndText.imageView = null;
            customTutorialImageAndText.textView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
