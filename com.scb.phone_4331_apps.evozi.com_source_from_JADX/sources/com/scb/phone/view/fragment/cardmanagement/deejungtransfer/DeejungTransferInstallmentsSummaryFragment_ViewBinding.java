package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DeejungTransferInstallmentsSummaryFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DeejungTransferInstallmentsSummaryFragment MediaBrowserCompat$CustomActionResultReceiver;

    public DeejungTransferInstallmentsSummaryFragment_ViewBinding(DeejungTransferInstallmentsSummaryFragment deejungTransferInstallmentsSummaryFragment, View view) {
        super(deejungTransferInstallmentsSummaryFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferInstallmentsSummaryFragment;
        deejungTransferInstallmentsSummaryFragment.fromAccountLayout = onStart.IconCompatParcelizer(view, R.id.from_account_layout, "field 'fromAccountLayout'");
        deejungTransferInstallmentsSummaryFragment.toAccountLayout = onStart.IconCompatParcelizer(view, R.id.to_account_layout, "field 'toAccountLayout'");
        deejungTransferInstallmentsSummaryFragment.txvTransferAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_amount, "field 'txvTransferAmount'", TextView.class);
        deejungTransferInstallmentsSummaryFragment.txvDuration = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.duration, "field 'txvDuration'", TextView.class);
        deejungTransferInstallmentsSummaryFragment.txvInterestRateTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.interest_rate_label, "field 'txvInterestRateTitle'", TextView.class);
        deejungTransferInstallmentsSummaryFragment.txvInterestRateValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.interest_rate_value, "field 'txvInterestRateValue'", TextView.class);
        deejungTransferInstallmentsSummaryFragment.totalPaymentLayout = onStart.IconCompatParcelizer(view, R.id.total_payment_layout, "field 'totalPaymentLayout'");
        deejungTransferInstallmentsSummaryFragment.monthlyPaymentValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.monthly_payment_layout_value, "field 'monthlyPaymentValue'", TextView.class);
        deejungTransferInstallmentsSummaryFragment.monthlyPaymentLayout = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.monthly_payment_layout, "field 'monthlyPaymentLayout'", ViewGroup.class);
        deejungTransferInstallmentsSummaryFragment.emailVerificationLayout = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.email_verification_layout, "field 'emailVerificationLayout'", ViewGroup.class);
        deejungTransferInstallmentsSummaryFragment.txvEmailVerificationValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.email_verification_value, "field 'txvEmailVerificationValue'", TextView.class);
    }

    public final void read() {
        DeejungTransferInstallmentsSummaryFragment deejungTransferInstallmentsSummaryFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (deejungTransferInstallmentsSummaryFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            deejungTransferInstallmentsSummaryFragment.fromAccountLayout = null;
            deejungTransferInstallmentsSummaryFragment.toAccountLayout = null;
            deejungTransferInstallmentsSummaryFragment.txvTransferAmount = null;
            deejungTransferInstallmentsSummaryFragment.txvDuration = null;
            deejungTransferInstallmentsSummaryFragment.txvInterestRateTitle = null;
            deejungTransferInstallmentsSummaryFragment.txvInterestRateValue = null;
            deejungTransferInstallmentsSummaryFragment.totalPaymentLayout = null;
            deejungTransferInstallmentsSummaryFragment.monthlyPaymentValue = null;
            deejungTransferInstallmentsSummaryFragment.monthlyPaymentLayout = null;
            deejungTransferInstallmentsSummaryFragment.emailVerificationLayout = null;
            deejungTransferInstallmentsSummaryFragment.txvEmailVerificationValue = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
