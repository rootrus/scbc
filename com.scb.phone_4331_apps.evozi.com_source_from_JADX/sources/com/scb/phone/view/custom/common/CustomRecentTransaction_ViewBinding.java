package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomRecentTransaction_ViewBinding implements Unbinder {
    private CustomRecentTransaction write;

    public CustomRecentTransaction_ViewBinding(CustomRecentTransaction customRecentTransaction, View view) {
        this.write = customRecentTransaction;
        customRecentTransaction.borderView = onStart.IconCompatParcelizer(view, R.id.border, "field 'borderView'");
        customRecentTransaction.dateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recent_transaction_date_text_view, "field 'dateTextView'", TextView.class);
        customRecentTransaction.valueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recent_transaction_value_text_view, "field 'valueTextView'", TextView.class);
    }

    public final void read() {
        CustomRecentTransaction customRecentTransaction = this.write;
        if (customRecentTransaction != null) {
            this.write = null;
            customRecentTransaction.borderView = null;
            customRecentTransaction.dateTextView = null;
            customRecentTransaction.valueTextView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
