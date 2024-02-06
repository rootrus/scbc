package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DeejungTransferMinFullSummaryFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DeejungTransferMinFullSummaryFragment MediaBrowserCompat$ItemReceiver;

    public DeejungTransferMinFullSummaryFragment_ViewBinding(DeejungTransferMinFullSummaryFragment deejungTransferMinFullSummaryFragment, View view) {
        super(deejungTransferMinFullSummaryFragment, view);
        this.MediaBrowserCompat$ItemReceiver = deejungTransferMinFullSummaryFragment;
        deejungTransferMinFullSummaryFragment.txvTransferAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_amount, "field 'txvTransferAmount'", TextView.class);
        deejungTransferMinFullSummaryFragment.txvFeeAndVat = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fee_and_vat_amount, "field 'txvFeeAndVat'", TextView.class);
        deejungTransferMinFullSummaryFragment.txvAnnualInterestRate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.annual_interest_rate, "field 'txvAnnualInterestRate'", TextView.class);
        deejungTransferMinFullSummaryFragment.vgFromAccount = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.from_account_layout, "field 'vgFromAccount'", ViewGroup.class);
        deejungTransferMinFullSummaryFragment.vgToAccount = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.to_account_layout, "field 'vgToAccount'", ViewGroup.class);
    }

    public final void read() {
        DeejungTransferMinFullSummaryFragment deejungTransferMinFullSummaryFragment = this.MediaBrowserCompat$ItemReceiver;
        if (deejungTransferMinFullSummaryFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            deejungTransferMinFullSummaryFragment.txvTransferAmount = null;
            deejungTransferMinFullSummaryFragment.txvFeeAndVat = null;
            deejungTransferMinFullSummaryFragment.txvAnnualInterestRate = null;
            deejungTransferMinFullSummaryFragment.vgFromAccount = null;
            deejungTransferMinFullSummaryFragment.vgToAccount = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
