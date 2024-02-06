package com.scb.phone.view.fragment.cardmanagement;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import com.scb.phone.view.fragment.BaseFragment;
import com.squareup.picasso.Picasso;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.chain;

public class TempLimitHomeFragment extends BaseFragment {
    @BindView
    TextView cardFirstFourDigit;
    @BindView
    TextView cardLastFourDigit;
    @BindView
    TextView cardSecondTwoDigit;
    @BindView
    ImageView imvCard;
    @BindView
    CustomHorizontalProgressBar mCustomHorizontalProgressBar;
    @BindView
    TextView txvCardName;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90082131494235, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        chain chain = (chain) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.TempLimitHomeActivity.KEY_CREDIT_CARD_DISPLAY");
        this.txvCardName.setText(chain.setCheckable);
        this.cardFirstFourDigit.setText(chain.MediaBrowserCompat$SearchResultReceiver);
        this.cardSecondTwoDigit.setText(chain.MediaSessionCompat$QueueItem);
        this.cardLastFourDigit.setText(chain.f2806x50fd9e4a);
        this.mCustomHorizontalProgressBar.setUsedValue(chain.setHasDecor);
        this.mCustomHorizontalProgressBar.setAvailableValue(chain.MediaBrowserCompat$CustomActionResultReceiver);
        this.mCustomHorizontalProgressBar.setTotalValue(chain.Keep);
        this.mCustomHorizontalProgressBar.setProgressBar(chain.PlaybackStateCompat$CustomAction);
        if (!TextUtils.isEmpty(chain.MediaSessionCompat$ResultReceiverWrapper)) {
            FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer = Picasso.read().write(chain.MediaSessionCompat$ResultReceiverWrapper).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.default_card_without_logo).IconCompatParcelizer((int) R.drawable.default_card);
            IconCompatParcelizer.write = true;
            IconCompatParcelizer.read(this.imvCard, (FragmentBuilder_BindEkycFragment) null);
        }
        return inflate;
    }
}
