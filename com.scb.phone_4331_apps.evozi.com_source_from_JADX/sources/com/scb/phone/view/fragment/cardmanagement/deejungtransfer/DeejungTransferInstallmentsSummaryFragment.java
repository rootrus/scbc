package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.ImageTextView;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.registerAnalyticsConnectorListener;

public class DeejungTransferInstallmentsSummaryFragment extends BaseFragment {
    @BindView
    protected ViewGroup emailVerificationLayout;
    @BindView
    protected View fromAccountLayout;
    @BindView
    protected ViewGroup monthlyPaymentLayout;
    @BindView
    protected TextView monthlyPaymentValue;
    @BindView
    protected View toAccountLayout;
    @BindView
    protected View totalPaymentLayout;
    @BindView
    protected TextView txvDuration;
    @BindView
    protected TextView txvEmailVerificationValue;
    @BindView
    protected TextView txvInterestRateTitle;
    @BindView
    protected TextView txvInterestRateValue;
    @BindView
    protected TextView txvTransferAmount;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90222131494249, viewGroup, false);
        getContext();
        MediaBrowserCompat$CustomActionResultReceiver((registerAnalyticsConnectorListener) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungTransferInstallmentsSummaryFragment.KEY_TRANSFER_INSTALLMENTS_SUMMARY_DISPLAY_MODEL"), inflate);
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(registerAnalyticsConnectorListener registeranalyticsconnectorlistener, View view) {
        this.read = ButterKnife.IconCompatParcelizer(this, view);
        ((TextView) this.fromAccountLayout.findViewById(R.id.txv_card_label)).setText(R.string.from_label);
        ((ImageTextView) this.fromAccountLayout.findViewById(R.id.txv_card_type)).setText(registeranalyticsconnectorlistener.read);
        ((TextView) this.fromAccountLayout.findViewById(R.id.txv_card_number)).setText(registeranalyticsconnectorlistener.MediaBrowserCompat$CustomActionResultReceiver);
        ((TextView) this.toAccountLayout.findViewById(R.id.txv_card_label)).setText(R.string.to_label);
        ((ImageTextView) this.toAccountLayout.findViewById(R.id.txv_card_type)).setText(registeranalyticsconnectorlistener.MediaSessionCompat$ResultReceiverWrapper);
        ((TextView) this.toAccountLayout.findViewById(R.id.txv_card_number)).setText(registeranalyticsconnectorlistener.MediaMetadataCompat);
        this.txvTransferAmount.setText(registeranalyticsconnectorlistener.write);
        this.txvDuration.setText(registeranalyticsconnectorlistener.IconCompatParcelizer);
        if (registeranalyticsconnectorlistener.MediaBrowserCompat$SearchResultReceiver) {
            this.monthlyPaymentLayout.setVisibility(0);
            this.txvInterestRateTitle.setText(R.string.monthly_interest_rate_label);
        } else {
            this.monthlyPaymentLayout.setVisibility(8);
            this.txvInterestRateTitle.setText(R.string.yearly_interest_rate_label);
        }
        this.txvInterestRateValue.setText(registeranalyticsconnectorlistener.MediaBrowserCompat$ItemReceiver);
        ((TextView) this.totalPaymentLayout.findViewById(R.id.deejung_plan_chicklet_header_label)).setText(R.string.total_payment);
        ((TextView) this.totalPaymentLayout.findViewById(R.id.deejung_plan_chicklet_header)).setText(registeranalyticsconnectorlistener.f2926x50fd9e4a);
        ((TextView) this.totalPaymentLayout.findViewById(R.id.deejung_plan_chicklet_inner_label_first)).setText(R.string.principal_label);
        ((TextView) this.totalPaymentLayout.findViewById(R.id.deejung_plan_chicklet_inner_text_first)).setText(registeranalyticsconnectorlistener.MediaSessionCompat$QueueItem);
        ((TextView) this.totalPaymentLayout.findViewById(R.id.deejung_plan_chicklet_inner_label_second)).setText(R.string.interest_label);
        ((TextView) this.totalPaymentLayout.findViewById(R.id.deejung_plan_chicklet_inner_text_second)).setText(registeranalyticsconnectorlistener.MediaSessionCompat$Token);
        this.monthlyPaymentValue.setText(registeranalyticsconnectorlistener.MediaDescriptionCompat);
        if (TextUtils.isEmpty(registeranalyticsconnectorlistener.Keep)) {
            this.emailVerificationLayout.setVisibility(8);
            return;
        }
        this.emailVerificationLayout.setVisibility(0);
        this.txvEmailVerificationValue.setText(registeranalyticsconnectorlistener.Keep);
    }
}
