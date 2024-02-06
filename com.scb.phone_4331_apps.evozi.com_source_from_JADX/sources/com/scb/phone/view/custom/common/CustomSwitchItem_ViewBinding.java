package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomSwitchItem_ViewBinding implements Unbinder {
    private CustomSwitchItem MediaBrowserCompat$ItemReceiver;

    public CustomSwitchItem_ViewBinding(CustomSwitchItem customSwitchItem, View view) {
        this.MediaBrowserCompat$ItemReceiver = customSwitchItem;
        customSwitchItem.firstLabelTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.first_label_text_view, "field 'firstLabelTextView'", TextView.class);
        customSwitchItem.firstValueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.first_value_text_view, "field 'firstValueTextView'", TextView.class);
        customSwitchItem.secondLabelTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.second_label_text_view, "field 'secondLabelTextView'", TextView.class);
        customSwitchItem.secondValueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.second_value_text_view, "field 'secondValueTextView'", TextView.class);
        customSwitchItem.imageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.avatar_image_view, "field 'imageView'", ImageView.class);
    }

    public final void read() {
        CustomSwitchItem customSwitchItem = this.MediaBrowserCompat$ItemReceiver;
        if (customSwitchItem != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customSwitchItem.firstLabelTextView = null;
            customSwitchItem.firstValueTextView = null;
            customSwitchItem.secondLabelTextView = null;
            customSwitchItem.secondValueTextView = null;
            customSwitchItem.imageView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
