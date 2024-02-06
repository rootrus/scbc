package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomMerchantRecentTransaction_ViewBinding implements Unbinder {
    private CustomMerchantRecentTransaction MediaBrowserCompat$CustomActionResultReceiver;

    public CustomMerchantRecentTransaction_ViewBinding(CustomMerchantRecentTransaction customMerchantRecentTransaction, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customMerchantRecentTransaction;
        customMerchantRecentTransaction.borderView = onStart.IconCompatParcelizer(view, R.id.border, "field 'borderView'");
        customMerchantRecentTransaction.dateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recent_transaction_date_text_view, "field 'dateTextView'", TextView.class);
        customMerchantRecentTransaction.valueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recent_transaction_value_text_view, "field 'valueTextView'", TextView.class);
    }

    public final void read() {
        CustomMerchantRecentTransaction customMerchantRecentTransaction = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customMerchantRecentTransaction != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customMerchantRecentTransaction.borderView = null;
            customMerchantRecentTransaction.dateTextView = null;
            customMerchantRecentTransaction.valueTextView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
