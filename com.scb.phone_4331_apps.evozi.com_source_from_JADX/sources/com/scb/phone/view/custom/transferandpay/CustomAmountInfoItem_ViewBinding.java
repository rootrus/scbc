package com.scb.phone.view.custom.transferandpay;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomAmountInfoItem_ViewBinding implements Unbinder {
    private CustomAmountInfoItem MediaBrowserCompat$CustomActionResultReceiver;

    public CustomAmountInfoItem_ViewBinding(CustomAmountInfoItem customAmountInfoItem, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customAmountInfoItem;
        customAmountInfoItem.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.additional_info_title, "field 'title'", TextView.class);
        customAmountInfoItem.asideValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.additional_info_aside_value, "field 'asideValue'", TextView.class);
        customAmountInfoItem.value = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.additional_info_value, "field 'value'", TextView.class);
    }

    public final void read() {
        CustomAmountInfoItem customAmountInfoItem = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customAmountInfoItem != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customAmountInfoItem.title = null;
            customAmountInfoItem.asideValue = null;
            customAmountInfoItem.value = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
