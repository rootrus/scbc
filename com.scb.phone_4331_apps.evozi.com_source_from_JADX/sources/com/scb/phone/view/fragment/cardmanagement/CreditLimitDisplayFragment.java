package com.scb.phone.view.fragment.cardmanagement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.chain;

public class CreditLimitDisplayFragment extends BaseFragment {
    @BindView
    CustomHorizontalProgressBar mCustomHorizontalProgressBar;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86392131493866, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        chain chain = (chain) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungLandingActivity.KEY_CREDIT_CARD_DISPLAY");
        this.mCustomHorizontalProgressBar.setUsedValue(chain.setHasDecor);
        this.mCustomHorizontalProgressBar.setAvailableValue(chain.MediaBrowserCompat$CustomActionResultReceiver);
        this.mCustomHorizontalProgressBar.setTotalValue(chain.Keep);
        this.mCustomHorizontalProgressBar.setProgressBar(chain.PlaybackStateCompat$CustomAction);
        return inflate;
    }
}
