package com.scb.phone.view.custom.easycash;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomInfoItem_ViewBinding implements Unbinder {
    private CustomInfoItem write;

    public CustomInfoItem_ViewBinding(CustomInfoItem customInfoItem, View view) {
        this.write = customInfoItem;
        customInfoItem.item_left = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.overview_item_left, "field 'item_left'", TextView.class);
        customInfoItem.item_right = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.overview_item_right, "field 'item_right'", TextView.class);
        customInfoItem.item_bottom = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.overview_item_bottom, "field 'item_bottom'", TextView.class);
        customInfoItem.infoDetails = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.info_details, "field 'infoDetails'", LinearLayout.class);
    }

    public final void read() {
        CustomInfoItem customInfoItem = this.write;
        if (customInfoItem != null) {
            this.write = null;
            customInfoItem.item_left = null;
            customInfoItem.item_right = null;
            customInfoItem.item_bottom = null;
            customInfoItem.infoDetails = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
