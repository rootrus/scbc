package com.scb.phone.view.activity.cardmanagement.deejungtransfer;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.cardmanagement.SaveSlipBaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DeejungTransferInstallmentsConfirmationActivity_ViewBinding extends SaveSlipBaseActivity_ViewBinding {
    private DeejungTransferInstallmentsConfirmationActivity IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public DeejungTransferInstallmentsConfirmationActivity_ViewBinding(final DeejungTransferInstallmentsConfirmationActivity deejungTransferInstallmentsConfirmationActivity, View view) {
        super(deejungTransferInstallmentsConfirmationActivity, view);
        this.IconCompatParcelizer = deejungTransferInstallmentsConfirmationActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_account_summary, "method 'onAccountsClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DeejungTransferInstallmentsConfirmationActivity.this.onAccountsClick();
            }
        });
    }

    public final void read() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
