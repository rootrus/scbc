package com.scb.phone.view.activity.cardmanagement.deejungtransfer;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.cardmanagement.SaveSlipBaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DeejungTransferMinFullConfirmationActivity_ViewBinding extends SaveSlipBaseActivity_ViewBinding {
    private DeejungTransferMinFullConfirmationActivity IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public DeejungTransferMinFullConfirmationActivity_ViewBinding(final DeejungTransferMinFullConfirmationActivity deejungTransferMinFullConfirmationActivity, View view) {
        super(deejungTransferMinFullConfirmationActivity, view);
        this.IconCompatParcelizer = deejungTransferMinFullConfirmationActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_account_summary, "method 'onAccountsClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DeejungTransferMinFullConfirmationActivity.this.onAccountsClick();
            }
        });
    }

    public final void read() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
