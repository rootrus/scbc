package com.scb.phone.view.custom.transferandpay;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomScheduleFundItem_ViewBinding implements Unbinder {
    private CustomScheduleFundItem MediaBrowserCompat$CustomActionResultReceiver;

    public CustomScheduleFundItem_ViewBinding(CustomScheduleFundItem customScheduleFundItem, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customScheduleFundItem;
        customScheduleFundItem.effectiveLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.effective_layout, "field 'effectiveLayout'", LinearLayout.class);
        customScheduleFundItem.effectiveLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.effective_label, "field 'effectiveLabel'", TextView.class);
        customScheduleFundItem.transferLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_layout, "field 'transferLayout'", LinearLayout.class);
        customScheduleFundItem.effectiveText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.effective_text, "field 'effectiveText'", TextView.class);
        customScheduleFundItem.effectiveDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.effective_description, "field 'effectiveDescription'", TextView.class);
        customScheduleFundItem.transactionLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_label, "field 'transactionLabel'", TextView.class);
        customScheduleFundItem.transactionText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_text, "field 'transactionText'", TextView.class);
    }

    public final void read() {
        CustomScheduleFundItem customScheduleFundItem = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customScheduleFundItem != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customScheduleFundItem.effectiveLayout = null;
            customScheduleFundItem.effectiveLabel = null;
            customScheduleFundItem.transferLayout = null;
            customScheduleFundItem.effectiveText = null;
            customScheduleFundItem.effectiveDescription = null;
            customScheduleFundItem.transactionLabel = null;
            customScheduleFundItem.transactionText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
