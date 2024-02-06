package com.scb.phone.view.fragment.deposit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p059me.relex.circleindicator.CircleIndicator;

public class DepositSelectorFragment extends BaseFragment {
    @BindView
    public CircleIndicator mCircleIndicator;
    @BindView
    public ViewPager mViewPager;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86692131493896, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(DepositSelectorFragment depositSelectorFragment, int i) {
        Context context = depositSelectorFragment.getContext();
        if (context != null) {
            context.sendBroadcast(new Intent("com.scb.phone.ACTION_SELECTED_DEPOSIT_UPDATE").putExtra("com.scb.phone.EXTRA_SELECTED_DEPOSIT", i));
        }
    }
}
