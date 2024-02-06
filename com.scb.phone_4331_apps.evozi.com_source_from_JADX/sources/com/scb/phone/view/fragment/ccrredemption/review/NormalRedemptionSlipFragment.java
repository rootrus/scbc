package com.scb.phone.view.fragment.ccrredemption.review;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import java.text.NumberFormat;
import java.util.Locale;
import p040o.AnalyticsConnectorRegistrar;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.Maps;
import p040o.getScbsOnboardingProductCatalog;

public class NormalRedemptionSlipFragment extends BaseFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer, getScbsOnboardingProductCatalog<AnalyticsConnectorRegistrar> {
    private Context IconCompatParcelizer;
    private AnalyticsConnectorRegistrar MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    ConstraintLayout effectiveDateLayout;
    @BindView
    TextView successfulText;
    @BindView
    ViewGroup totalPaidSection;
    @BindView
    TextView txvCardName;
    @BindView
    TextView txvCardNumber;
    @BindView
    TextView txvCurrency;
    @BindView
    TextView txvEffectiveDate;
    @BindView
    TextView txvItemDescription;
    @BindView
    TextView txvPoints;
    @BindView
    TextView txvProductName;
    @BindView
    TextView txvRedemptionDate;
    @BindView
    TextView txvReferenceId;
    @BindView
    TextView txvTotalPaid;
    @BindView
    TextView txvTotalPoints;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f92452131494473, viewGroup, false);
        AnalyticsConnectorRegistrar analyticsConnectorRegistrar = (AnalyticsConnectorRegistrar) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.confirm.ConfirmRedemptionActivity.CONFIRM_REDEMPTION_DTO_EXTRA");
        analyticsConnectorRegistrar.setBackgroundResource = new Maps.MapDifferenceImpl(getResources());
        read(analyticsConnectorRegistrar, inflate, (Context) getActivity());
        return inflate;
    }

    /* access modifiers changed from: private */
    public void read(AnalyticsConnectorRegistrar analyticsConnectorRegistrar, View view, Context context) {
        Context context2;
        this.IconCompatParcelizer = context;
        ButterKnife.IconCompatParcelizer(this, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = analyticsConnectorRegistrar;
        this.txvRedemptionDate.setText(analyticsConnectorRegistrar.PlaybackStateCompat$CustomAction);
        this.txvReferenceId.setText(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer());
        this.txvCardName.setText(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
        this.txvCardNumber.setText(this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem);
        this.txvProductName.setText(this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat);
        this.txvTotalPoints.setText(NumberFormat.getInstance(Locale.getDefault()).format((long) this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token));
        if (Integer.parseInt(NumberFormat.getInstance(Locale.getDefault()).format((long) this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token).replace(",", "")) <= 1 && (context2 = this.IconCompatParcelizer) != null) {
            this.txvPoints.setText(context2.getResources().getString(R.string.point_label));
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper > 0) {
            this.txvTotalPaid.setText(NumberFormat.getInstance(Locale.getDefault()).format((long) this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper));
            this.txvCurrency.setText(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem);
        } else {
            this.totalPaidSection.setVisibility(8);
        }
        if (analyticsConnectorRegistrar.MediaDescriptionCompat) {
            this.successfulText.setText(this.IconCompatParcelizer.getResources().getString(R.string.registration_successful_label));
            this.txvItemDescription.setVisibility(8);
            this.effectiveDateLayout.setVisibility(0);
            this.txvEffectiveDate.setText(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver);
            return;
        }
        this.successfulText.setText(this.IconCompatParcelizer.getResources().getString(R.string.redeem_successful));
        this.txvItemDescription.setVisibility(0);
        this.txvItemDescription.setText(this.MediaBrowserCompat$CustomActionResultReceiver.write());
    }
}
