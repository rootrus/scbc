package com.scb.phone.view.custom.remittance;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class TransferOptionView_ViewBinding implements Unbinder {
    private TransferOptionView IconCompatParcelizer;

    public TransferOptionView_ViewBinding(TransferOptionView transferOptionView, View view) {
        this.IconCompatParcelizer = transferOptionView;
        transferOptionView.clTransfer = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cl_transfer_type, "field 'clTransfer'", ConstraintLayout.class);
        transferOptionView.tvTransfer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_transfer_type, "field 'tvTransfer'", TextView.class);
        transferOptionView.ivTransfer = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_transfer_type, "field 'ivTransfer'", ImageView.class);
    }

    public final void read() {
        TransferOptionView transferOptionView = this.IconCompatParcelizer;
        if (transferOptionView != null) {
            this.IconCompatParcelizer = null;
            transferOptionView.clTransfer = null;
            transferOptionView.tvTransfer = null;
            transferOptionView.ivTransfer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
