package com.scb.phone.view.fragment.cardmanagement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.getAddress2;
import p040o.normalize;

public class DeejungPlanDetailFragment extends BaseFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    private normalize IconCompatParcelizer;
    public getAddress2 MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    Button btnDeejungReview;
    @BindView
    ViewGroup layoutMonthlyPlanDetails;
    @BindView
    ViewGroup layoutTotalPlanDetails;
    @BindView
    TextView monthlyInterestRate;
    @BindView
    TextView tvRateLabel;
    @BindView
    TextView txvMonthlyPlanValue;

    public static DeejungPlanDetailFragment IconCompatParcelizer(normalize normalize) {
        DeejungPlanDetailFragment deejungPlanDetailFragment = new DeejungPlanDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.view.fragment.card_management.DeejungPlanDetailFragment.KEY_DEEJUNG_INSTALLMENT_PLAN", normalize);
        deejungPlanDetailFragment.setArguments(bundle);
        return deejungPlanDetailFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86542131493881, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.IconCompatParcelizer = (normalize) getArguments().getParcelable("com.scb.phone.view.fragment.card_management.DeejungPlanDetailFragment.KEY_DEEJUNG_INSTALLMENT_PLAN");
        getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungLandingActivity.KEY_CREDIT_CARD_DISPLAY");
        normalize normalize = this.IconCompatParcelizer;
        this.txvMonthlyPlanValue.setText(normalize.f2902x50fd9e4a);
        ((TextView) this.layoutTotalPlanDetails.findViewById(R.id.deejung_plan_chicklet_header_label)).setText(getString(R.string.total_payment));
        ((TextView) this.layoutTotalPlanDetails.findViewById(R.id.deejung_plan_chicklet_header)).setText(normalize.PlaybackStateCompat$CustomAction);
        ((TextView) this.layoutTotalPlanDetails.findViewById(R.id.deejung_plan_chicklet_inner_text_first)).setText(normalize.setHasDecor);
        ((TextView) this.layoutTotalPlanDetails.findViewById(R.id.deejung_plan_chicklet_inner_text_second)).setText(normalize.MediaSessionCompat$Token);
        String str = normalize.MediaMetadataCompat;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        if (z) {
            this.tvRateLabel.setText(R.string.yearly_interest_rate_label);
            this.monthlyInterestRate.setText(normalize.setBackgroundResource);
            this.btnDeejungReview.setText(R.string.see_full_installment_plan);
            this.layoutMonthlyPlanDetails.setVisibility(8);
        } else {
            this.monthlyInterestRate.setText(normalize.RatingCompat);
        }
        return inflate;
    }

    @OnClick
    public void onReviewButtonClick() {
        String str = this.IconCompatParcelizer.MediaMetadataCompat;
        if (str != null && !str.isEmpty()) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.IconCompatParcelizer);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.read(this.IconCompatParcelizer);
        }
    }
}
