package com.scb.phone.view.custom.bulktransfer;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.ImageTextView;
import p040o.onStart;

public class CustomBulkTransferScheduleItem_ViewBinding implements Unbinder {
    private CustomBulkTransferScheduleItem MediaBrowserCompat$ItemReceiver;

    public CustomBulkTransferScheduleItem_ViewBinding(CustomBulkTransferScheduleItem customBulkTransferScheduleItem, View view) {
        this.MediaBrowserCompat$ItemReceiver = customBulkTransferScheduleItem;
        customBulkTransferScheduleItem.mSourceNameTextView = (ImageTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_name_text_view, "field 'mSourceNameTextView'", ImageTextView.class);
        customBulkTransferScheduleItem.mSourceTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_label, "field 'mSourceTextView'", TextView.class);
        customBulkTransferScheduleItem.sourceInfoLayout = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_info_layout, "field 'sourceInfoLayout'", FrameLayout.class);
        customBulkTransferScheduleItem.divider = onStart.IconCompatParcelizer(view, R.id.divider, "field 'divider'");
    }

    public final void read() {
        CustomBulkTransferScheduleItem customBulkTransferScheduleItem = this.MediaBrowserCompat$ItemReceiver;
        if (customBulkTransferScheduleItem != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customBulkTransferScheduleItem.mSourceNameTextView = null;
            customBulkTransferScheduleItem.mSourceTextView = null;
            customBulkTransferScheduleItem.sourceInfoLayout = null;
            customBulkTransferScheduleItem.divider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
