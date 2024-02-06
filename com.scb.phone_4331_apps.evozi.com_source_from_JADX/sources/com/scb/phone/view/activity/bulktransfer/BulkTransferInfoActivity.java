package com.scb.phone.view.activity.bulktransfer;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.AlertController$RecycleListView;

public class BulkTransferInfoActivity extends BaseActivity {
    @BindView
    WebView bulkTransferWebView;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f76872131492912);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.bulk_transfer);
        this.bulkTransferWebView.loadDataWithBaseURL((String) null, getString(R.string.bulk_transfer_info_text), "text/html", "utf-8", (String) null);
        this.read.MediaBrowserCompat$CustomActionResultReceiver(true);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.bulk_transfer);
    }
}
