package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DeejungTransferConfirmationHeaderFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DeejungTransferConfirmationHeaderFragment MediaBrowserCompat$ItemReceiver;

    public DeejungTransferConfirmationHeaderFragment_ViewBinding(DeejungTransferConfirmationHeaderFragment deejungTransferConfirmationHeaderFragment, View view) {
        super(deejungTransferConfirmationHeaderFragment, view);
        this.MediaBrowserCompat$ItemReceiver = deejungTransferConfirmationHeaderFragment;
        deejungTransferConfirmationHeaderFragment.txvDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'txvDateTime'", TextView.class);
        deejungTransferConfirmationHeaderFragment.txvReferenceId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_reference_id, "field 'txvReferenceId'", TextView.class);
    }

    public final void read() {
        DeejungTransferConfirmationHeaderFragment deejungTransferConfirmationHeaderFragment = this.MediaBrowserCompat$ItemReceiver;
        if (deejungTransferConfirmationHeaderFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            deejungTransferConfirmationHeaderFragment.txvDateTime = null;
            deejungTransferConfirmationHeaderFragment.txvReferenceId = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
