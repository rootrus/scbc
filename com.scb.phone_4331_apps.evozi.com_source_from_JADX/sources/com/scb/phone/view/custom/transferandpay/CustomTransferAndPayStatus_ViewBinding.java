package com.scb.phone.view.custom.transferandpay;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomTransferAndPayStatus_ViewBinding implements Unbinder {
    private CustomTransferAndPayStatus MediaBrowserCompat$ItemReceiver;

    public CustomTransferAndPayStatus_ViewBinding(CustomTransferAndPayStatus customTransferAndPayStatus, View view) {
        this.MediaBrowserCompat$ItemReceiver = customTransferAndPayStatus;
        customTransferAndPayStatus.mDateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.date_text_view, "field 'mDateTextView'", TextView.class);
        customTransferAndPayStatus.mStatusTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.status_text_view, "field 'mStatusTextView'", TextView.class);
    }

    public final void read() {
        CustomTransferAndPayStatus customTransferAndPayStatus = this.MediaBrowserCompat$ItemReceiver;
        if (customTransferAndPayStatus != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customTransferAndPayStatus.mDateTextView = null;
            customTransferAndPayStatus.mStatusTextView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
