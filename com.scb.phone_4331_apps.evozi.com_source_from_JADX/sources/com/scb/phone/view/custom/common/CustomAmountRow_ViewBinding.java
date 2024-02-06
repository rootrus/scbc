package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomAmountRow_ViewBinding implements Unbinder {
    private CustomAmountRow MediaBrowserCompat$ItemReceiver;

    public CustomAmountRow_ViewBinding(CustomAmountRow customAmountRow, View view) {
        this.MediaBrowserCompat$ItemReceiver = customAmountRow;
        customAmountRow.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'title'", TextView.class);
        customAmountRow.amount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_amount, "field 'amount'", TextView.class);
    }

    public final void read() {
        CustomAmountRow customAmountRow = this.MediaBrowserCompat$ItemReceiver;
        if (customAmountRow != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customAmountRow.title = null;
            customAmountRow.amount = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
