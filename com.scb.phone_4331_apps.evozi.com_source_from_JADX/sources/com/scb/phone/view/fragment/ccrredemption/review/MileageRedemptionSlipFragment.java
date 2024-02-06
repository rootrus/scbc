package com.scb.phone.view.fragment.ccrredemption.review;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.AbstractComponentContainer;
import p040o.Maps;
import p040o.getScbsOnboardingProductCatalog;

public class MileageRedemptionSlipFragment extends BaseFragment implements getScbsOnboardingProductCatalog<AbstractComponentContainer> {
    private Context MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    TextView txvCardNumber;
    @BindView
    TextView txvCardType;
    @BindView
    TextView txvItemDescription;
    @BindView
    TextView txvLastName;
    @BindView
    TextView txvMembershipId;
    @BindView
    TextView txvPoints;
    @BindView
    TextView txvPointsToRedeem;
    @BindView
    TextView txvProductName;
    @BindView
    TextView txvRedemptionDateTime;
    @BindView
    TextView txvReferenceId;
    @BindView
    TextView txvSuccessfulText;
    @BindView
    TextView txvTotalMiles;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f91542131494381, viewGroup, false);
        AbstractComponentContainer abstractComponentContainer = (AbstractComponentContainer) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.mileage.MileageConfirmRedemptionActivity.KEY_CONFIRM_REDEMPTION_DTO");
        abstractComponentContainer.setBackgroundResource = new Maps.MapDifferenceImpl(getResources());
        read(abstractComponentContainer, inflate, getActivity());
        return inflate;
    }

    /* access modifiers changed from: private */
    /* renamed from: IconCompatParcelizer */
    public void read(AbstractComponentContainer abstractComponentContainer, View view, Context context) {
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        ButterKnife.IconCompatParcelizer(this, view);
        this.txvSuccessfulText.setText(this.MediaBrowserCompat$CustomActionResultReceiver.getResources().getString(R.string.redeem_successful));
        this.txvCardNumber.setText(abstractComponentContainer.MediaSessionCompat$QueueItem);
        this.txvCardType.setText(abstractComponentContainer.MediaBrowserCompat$ItemReceiver);
        this.txvLastName.setText(abstractComponentContainer.AppCompatActivity);
        this.txvMembershipId.setText(abstractComponentContainer.AppCompatDialogFragment);
        this.txvRedemptionDateTime.setText(abstractComponentContainer.PlaybackStateCompat$CustomAction);
        this.txvReferenceId.setText(abstractComponentContainer.IconCompatParcelizer());
        this.txvPointsToRedeem.setText(abstractComponentContainer.AppCompatViewInflater);
        this.txvTotalMiles.setText(abstractComponentContainer.setExpandedFormat);
        this.txvProductName.setText(abstractComponentContainer.PlaybackStateCompat);
        this.txvItemDescription.setText(abstractComponentContainer.write());
        if (Integer.parseInt(abstractComponentContainer.AppCompatViewInflater.replace(",", "")) <= 1) {
            this.txvPoints.setText(this.MediaBrowserCompat$CustomActionResultReceiver.getResources().getString(R.string.point_label));
        }
    }
}
