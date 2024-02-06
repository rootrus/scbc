package com.scb.phone.view.activity.transferandpay;

import android.view.View;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class PullSlipActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private PullSlipActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public PullSlipActivity_ViewBinding(final PullSlipActivity pullSlipActivity, View view) {
        super(pullSlipActivity, view);
        this.MediaBrowserCompat$ItemReceiver = pullSlipActivity;
        pullSlipActivity.mContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_item_container, "field 'mContainer'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_scan_qr_again, "method 'btnScanAgainClicked'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PullSlipActivity.this.btnScanAgainClicked();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'btnReturnClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PullSlipActivity.this.btnReturnClicked();
            }
        });
    }

    public final void read() {
        PullSlipActivity pullSlipActivity = this.MediaBrowserCompat$ItemReceiver;
        if (pullSlipActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            pullSlipActivity.mContainer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
