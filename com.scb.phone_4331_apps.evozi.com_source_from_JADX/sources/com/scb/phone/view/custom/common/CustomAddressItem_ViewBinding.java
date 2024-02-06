package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomAddressItem_ViewBinding implements Unbinder {
    private CustomAddressItem MediaBrowserCompat$CustomActionResultReceiver;

    public CustomAddressItem_ViewBinding(CustomAddressItem customAddressItem, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customAddressItem;
        customAddressItem.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text_view, "field 'titleTextView'", TextView.class);
        customAddressItem.descriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description_text_view, "field 'descriptionTextView'", TextView.class);
        customAddressItem.divider = onStart.IconCompatParcelizer(view, R.id.divider, "field 'divider'");
    }

    public final void read() {
        CustomAddressItem customAddressItem = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customAddressItem != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customAddressItem.titleTextView = null;
            customAddressItem.descriptionTextView = null;
            customAddressItem.divider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
