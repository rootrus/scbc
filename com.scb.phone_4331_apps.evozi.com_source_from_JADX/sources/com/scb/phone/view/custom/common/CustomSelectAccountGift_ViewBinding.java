package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomSelectAccountGift_ViewBinding implements Unbinder {
    private CustomSelectAccountGift MediaBrowserCompat$ItemReceiver;

    public CustomSelectAccountGift_ViewBinding(CustomSelectAccountGift customSelectAccountGift, View view) {
        this.MediaBrowserCompat$ItemReceiver = customSelectAccountGift;
        customSelectAccountGift.mSelectAccountButton = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.select_account_gift_layout, "field 'mSelectAccountButton'", RelativeLayout.class);
    }

    public final void read() {
        CustomSelectAccountGift customSelectAccountGift = this.MediaBrowserCompat$ItemReceiver;
        if (customSelectAccountGift != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customSelectAccountGift.mSelectAccountButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
