package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DeejungTransferSlipFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DeejungTransferSlipFragment MediaBrowserCompat$ItemReceiver;

    public DeejungTransferSlipFragment_ViewBinding(DeejungTransferSlipFragment deejungTransferSlipFragment, View view) {
        super(deejungTransferSlipFragment, view);
        this.MediaBrowserCompat$ItemReceiver = deejungTransferSlipFragment;
        deejungTransferSlipFragment.vwDividerTotalPayment = onStart.IconCompatParcelizer(view, R.id.vw_divider_total_payment, "field 'vwDividerTotalPayment'");
        deejungTransferSlipFragment.vwDividerMonthlyPayment = onStart.IconCompatParcelizer(view, R.id.vw_divider_monthly_payment, "field 'vwDividerMonthlyPayment'");
        deejungTransferSlipFragment.successOrFailureImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.success_or_failure_icon, "field 'successOrFailureImage'", ImageView.class);
        deejungTransferSlipFragment.txvSuccessfulLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.successful_transaction_label, "field 'txvSuccessfulLabel'", TextView.class);
        deejungTransferSlipFragment.txvFailureLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.failure_transaction_label, "field 'txvFailureLabel'", TextView.class);
        deejungTransferSlipFragment.txvTransactionId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_id, "field 'txvTransactionId'", TextView.class);
        deejungTransferSlipFragment.txvTransactionDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_date_time, "field 'txvTransactionDateTime'", TextView.class);
        deejungTransferSlipFragment.txvTotalPayment = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvTotalPayment, "field 'txvTotalPayment'", TextView.class);
        deejungTransferSlipFragment.txvInterestRateTotal = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvInterest, "field 'txvInterestRateTotal'", TextView.class);
        deejungTransferSlipFragment.txvInterestRateLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.interest_rate_label, "field 'txvInterestRateLabel'", TextView.class);
        deejungTransferSlipFragment.txvInterestRate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.interest_rate, "field 'txvInterestRate'", TextView.class);
        deejungTransferSlipFragment.txvDuration = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.duration, "field 'txvDuration'", TextView.class);
        deejungTransferSlipFragment.txvPrincipal = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvPrincipal, "field 'txvPrincipal'", TextView.class);
        deejungTransferSlipFragment.txvMonthlyPayment = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvMonthlyPayment, "field 'txvMonthlyPayment'", TextView.class);
        deejungTransferSlipFragment.txvPurchaseAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.purchase_amount, "field 'txvPurchaseAmount'", TextView.class);
        deejungTransferSlipFragment.deejungSummaryLayout = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_deejung_summary, "field 'deejungSummaryLayout'", ViewGroup.class);
        deejungTransferSlipFragment.merchantPaymentDetails = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_payment_details_view, "field 'merchantPaymentDetails'", LinearLayout.class);
        deejungTransferSlipFragment.paymentDetails = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.payment_detail, "field 'paymentDetails'", ConstraintLayout.class);
        deejungTransferSlipFragment.headerView = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_deejung_header_view, "field 'headerView'", ConstraintLayout.class);
        deejungTransferSlipFragment.monthlyPaymentHolder = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.monthlyPaymentHolder, "field 'monthlyPaymentHolder'", ViewGroup.class);
        deejungTransferSlipFragment.emailHolder = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.emailHolderConstraint, "field 'emailHolder'", ConstraintLayout.class);
        deejungTransferSlipFragment.txvEmail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvEmail, "field 'txvEmail'", TextView.class);
    }

    public final void read() {
        DeejungTransferSlipFragment deejungTransferSlipFragment = this.MediaBrowserCompat$ItemReceiver;
        if (deejungTransferSlipFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            deejungTransferSlipFragment.vwDividerTotalPayment = null;
            deejungTransferSlipFragment.vwDividerMonthlyPayment = null;
            deejungTransferSlipFragment.successOrFailureImage = null;
            deejungTransferSlipFragment.txvSuccessfulLabel = null;
            deejungTransferSlipFragment.txvFailureLabel = null;
            deejungTransferSlipFragment.txvTransactionId = null;
            deejungTransferSlipFragment.txvTransactionDateTime = null;
            deejungTransferSlipFragment.txvTotalPayment = null;
            deejungTransferSlipFragment.txvInterestRateTotal = null;
            deejungTransferSlipFragment.txvInterestRateLabel = null;
            deejungTransferSlipFragment.txvInterestRate = null;
            deejungTransferSlipFragment.txvDuration = null;
            deejungTransferSlipFragment.txvPrincipal = null;
            deejungTransferSlipFragment.txvMonthlyPayment = null;
            deejungTransferSlipFragment.txvPurchaseAmount = null;
            deejungTransferSlipFragment.deejungSummaryLayout = null;
            deejungTransferSlipFragment.merchantPaymentDetails = null;
            deejungTransferSlipFragment.paymentDetails = null;
            deejungTransferSlipFragment.headerView = null;
            deejungTransferSlipFragment.monthlyPaymentHolder = null;
            deejungTransferSlipFragment.emailHolder = null;
            deejungTransferSlipFragment.txvEmail = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
