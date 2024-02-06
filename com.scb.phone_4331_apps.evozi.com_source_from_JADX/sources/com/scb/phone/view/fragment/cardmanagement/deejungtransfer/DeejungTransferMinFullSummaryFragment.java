package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.ImageTextView;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.AnalyticsConnectorImpl;

public class DeejungTransferMinFullSummaryFragment extends BaseFragment {
    @BindView
    TextView txvAnnualInterestRate;
    @BindView
    TextView txvFeeAndVat;
    @BindView
    TextView txvTransferAmount;
    @BindView
    ViewGroup vgFromAccount;
    @BindView
    ViewGroup vgToAccount;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86622131493889, viewGroup, false);
        MediaBrowserCompat$CustomActionResultReceiver((AnalyticsConnectorImpl) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungTransferMinFullSummaryFragment.KEY_TRANSFER_INSTALLMENT_SUMMARY_DISPLAY_MODEL"), inflate, getContext());
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AnalyticsConnectorImpl analyticsConnectorImpl, View view, Context context) {
        ButterKnife.IconCompatParcelizer(this, view);
        this.txvTransferAmount.setText(analyticsConnectorImpl.MediaSessionCompat$ResultReceiverWrapper);
        this.txvAnnualInterestRate.setText(analyticsConnectorImpl.write);
        this.txvFeeAndVat.setText(analyticsConnectorImpl.IconCompatParcelizer);
        ((TextView) this.vgFromAccount.findViewById(R.id.txv_card_label)).setText(context.getString(R.string.from_label));
        ((ImageTextView) this.vgFromAccount.findViewById(R.id.txv_card_type)).setText(analyticsConnectorImpl.MediaBrowserCompat$CustomActionResultReceiver);
        ((TextView) this.vgFromAccount.findViewById(R.id.txv_card_number)).setText(analyticsConnectorImpl.MediaBrowserCompat$ItemReceiver);
        ((TextView) this.vgToAccount.findViewById(R.id.txv_card_label)).setText(context.getString(R.string.to_label));
        ((ImageTextView) this.vgToAccount.findViewById(R.id.txv_card_type)).setText(analyticsConnectorImpl.MediaBrowserCompat$SearchResultReceiver);
        ((TextView) this.vgToAccount.findViewById(R.id.txv_card_number)).setText(analyticsConnectorImpl.RatingCompat);
    }
}
