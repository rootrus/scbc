package com.scb.phone.view.custom.transferandpay;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomAmountInfo_ViewBinding implements Unbinder {
    private CustomAmountInfo MediaBrowserCompat$ItemReceiver;

    public CustomAmountInfo_ViewBinding(CustomAmountInfo customAmountInfo, View view) {
        this.MediaBrowserCompat$ItemReceiver = customAmountInfo;
        customAmountInfo.itemList = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_list, "field 'itemList'", LinearLayout.class);
    }

    public final void read() {
        CustomAmountInfo customAmountInfo = this.MediaBrowserCompat$ItemReceiver;
        if (customAmountInfo != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customAmountInfo.itemList = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
