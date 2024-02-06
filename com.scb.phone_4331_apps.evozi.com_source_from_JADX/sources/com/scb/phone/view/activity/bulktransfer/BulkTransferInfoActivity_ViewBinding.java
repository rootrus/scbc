package com.scb.phone.view.activity.bulktransfer;

import android.view.View;
import android.webkit.WebView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class BulkTransferInfoActivity_ViewBinding extends BaseActivity_ViewBinding {
    private BulkTransferInfoActivity IconCompatParcelizer;

    public BulkTransferInfoActivity_ViewBinding(BulkTransferInfoActivity bulkTransferInfoActivity, View view) {
        super(bulkTransferInfoActivity, view);
        this.IconCompatParcelizer = bulkTransferInfoActivity;
        bulkTransferInfoActivity.bulkTransferWebView = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bulk_transfer_webview, "field 'bulkTransferWebView'", WebView.class);
    }

    public final void read() {
        BulkTransferInfoActivity bulkTransferInfoActivity = this.IconCompatParcelizer;
        if (bulkTransferInfoActivity != null) {
            this.IconCompatParcelizer = null;
            bulkTransferInfoActivity.bulkTransferWebView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
