package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.getScbsOnboardingProductCatalog;
import p040o.initializeAllApis;
import p040o.isDataCollectionDefaultEnabled;
import p040o.setLastBaselineToBottomHeight;

public class DeejungTransferSlipFragment extends BaseFragment implements getScbsOnboardingProductCatalog<initializeAllApis>, CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    private initializeAllApis IconCompatParcelizer;
    private Context MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    ViewGroup deejungSummaryLayout;
    @BindView
    ConstraintLayout emailHolder;
    @BindView
    ConstraintLayout headerView;
    @BindView
    LinearLayout merchantPaymentDetails;
    @BindView
    ViewGroup monthlyPaymentHolder;
    @BindView
    ConstraintLayout paymentDetails;
    @BindView
    ImageView successOrFailureImage;
    @BindView
    TextView txvDuration;
    @BindView
    TextView txvEmail;
    @BindView
    TextView txvFailureLabel;
    @BindView
    TextView txvInterestRate;
    @BindView
    TextView txvInterestRateLabel;
    @BindView
    TextView txvInterestRateTotal;
    @BindView
    TextView txvMonthlyPayment;
    @BindView
    TextView txvPrincipal;
    @BindView
    TextView txvPurchaseAmount;
    @BindView
    TextView txvSuccessfulLabel;
    @BindView
    TextView txvTotalPayment;
    @BindView
    TextView txvTransactionDateTime;
    @BindView
    TextView txvTransactionId;
    @BindView
    View vwDividerMonthlyPayment;
    @BindView
    View vwDividerTotalPayment;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86632131493890, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$CustomActionResultReceiver = getContext();
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            initializeAllApis initializeallapis = (initializeAllApis) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungInstallmentsConfirmationActivity.KEY_DEEJUNG_INSTALLMENTS_CONFIRMATION_DISPLAY_MODEL");
            this.IconCompatParcelizer = initializeallapis;
            read(initializeallapis, inflate, getContext());
        }
        return inflate;
    }

    /* access modifiers changed from: private */
    /* renamed from: MediaBrowserCompat$ItemReceiver */
    public void read(initializeAllApis initializeallapis, View view, Context context) {
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        ButterKnife.IconCompatParcelizer(this, view);
        this.IconCompatParcelizer = initializeallapis;
        if (initializeallapis.IconCompatParcelizer) {
            this.successOrFailureImage.setBackgroundResource(R.drawable.success);
            this.txvSuccessfulLabel.setVisibility(0);
            this.txvSuccessfulLabel.setText(this.IconCompatParcelizer.MediaSessionCompat$Token);
            this.txvFailureLabel.setVisibility(8);
            this.txvTransactionId.setText(this.IconCompatParcelizer.f2867x50fd9e4a);
            this.txvTransactionDateTime.setText(this.IconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView);
        } else if (this.IconCompatParcelizer.read) {
            this.successOrFailureImage.setBackgroundResource(R.drawable.failed);
            this.txvSuccessfulLabel.setVisibility(8);
            this.txvFailureLabel.setVisibility(0);
            this.txvFailureLabel.setText(this.IconCompatParcelizer.write);
            this.txvTransactionId.setText(this.IconCompatParcelizer.f2867x50fd9e4a);
            this.txvTransactionDateTime.setText(this.IconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView);
        } else {
            this.successOrFailureImage.setBackgroundResource(R.drawable.success);
            this.txvSuccessfulLabel.setVisibility(0);
            this.txvSuccessfulLabel.setText(this.IconCompatParcelizer.MediaSessionCompat$Token);
            this.txvFailureLabel.setVisibility(0);
            this.txvFailureLabel.setText(this.IconCompatParcelizer.write);
            this.txvTransactionId.setText(this.IconCompatParcelizer.f2867x50fd9e4a);
            this.txvTransactionDateTime.setText(this.IconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView);
        }
        this.deejungSummaryLayout.setVisibility(0);
        View findViewById = this.headerView.findViewById(R.id.deejung_purchase_payment_details_divider);
        ((TextView) this.headerView.findViewById(R.id.txv_card_type)).setText(this.IconCompatParcelizer.ParcelableVolumeInfo);
        ((TextView) this.headerView.findViewById(R.id.txv_card_number)).setText(this.IconCompatParcelizer.MediaDescriptionCompat);
        ((ConstraintLayout) this.headerView.findViewById(R.id.deejung_monthly_payment_detail_label)).setBackgroundColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$CustomActionResultReceiver, R.color.f70982131100254));
        findViewById.setVisibility(0);
        this.txvPurchaseAmount.setText(this.IconCompatParcelizer.setHasDecor);
        this.txvInterestRateTotal.setText(this.IconCompatParcelizer.AlertController$RecycleListView);
        this.txvTotalPayment.setText(this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper);
        this.txvPrincipal.setText(this.IconCompatParcelizer.PlaybackStateCompat);
        this.txvDuration.setText(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
        this.txvInterestRate.setText(this.IconCompatParcelizer.MediaMetadataCompat);
        if (this.IconCompatParcelizer.RatingCompat != null) {
            this.txvInterestRateLabel.setText(this.MediaBrowserCompat$CustomActionResultReceiver.getText(R.string.yearly_interest_rate_label));
            this.txvMonthlyPayment.setVisibility(8);
            this.monthlyPaymentHolder.setVisibility(8);
            this.vwDividerTotalPayment.setVisibility(4);
        } else {
            this.txvInterestRateLabel.setText(this.MediaBrowserCompat$CustomActionResultReceiver.getText(R.string.monthly_interest_rate_label));
            this.txvMonthlyPayment.setVisibility(0);
            this.txvMonthlyPayment.setText(this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver);
        }
        if (this.IconCompatParcelizer.AppCompatActivity != null) {
            this.emailHolder.setVisibility(0);
            this.txvEmail.setText(this.IconCompatParcelizer.AppCompatActivity);
        } else {
            this.emailHolder.setVisibility(8);
            this.vwDividerMonthlyPayment.setVisibility(4);
        }
        for (isDataCollectionDefaultEnabled next : this.IconCompatParcelizer.MediaBrowserCompat$MediaItem) {
            ViewGroup viewGroup = (ViewGroup) ((LayoutInflater) this.MediaBrowserCompat$CustomActionResultReceiver.getSystemService("layout_inflater")).inflate(R.layout.f91332131494360, this.merchantPaymentDetails, false);
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.confirmation_image);
            TextView textView = (TextView) viewGroup.findViewById(R.id.error_message);
            imageView.setVisibility(0);
            ((TextView) viewGroup.findViewById(R.id.merchant_name_label)).setText(next.write);
            ((TextView) viewGroup.findViewById(R.id.amount_including_interest_value)).setText(next.MediaMetadataCompat);
            if ("1000".equals(next.MediaBrowserCompat$CustomActionResultReceiver)) {
                imageView.setBackgroundResource(R.drawable.success);
            } else {
                imageView.setBackgroundResource(R.drawable.failed);
                textView.setVisibility(0);
                textView.setText(next.MediaBrowserCompat$ItemReceiver);
            }
            this.merchantPaymentDetails.addView(viewGroup);
        }
    }
}
