package com.scb.phone.view.fragment.findus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.verifyPurchaseBondV2;

public class FindUsFragment extends BaseFragment {
    @BindView
    TabLayout mTabLayout;
    @BindView
    NoSwipeViewPager mTabPager;

    public static FindUsFragment IconCompatParcelizer(boolean z) {
        FindUsFragment findUsFragment = new FindUsFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.scb.phone.EXTRA_CARDLESS_FIND_US_ATM", z);
        findUsFragment.setArguments(bundle);
        return findUsFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87492131493976, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.find_branch_atm));
        verifyPurchaseBondV2 verifypurchasebondv2 = new verifyPurchaseBondV2(getChildFragmentManager(), getContext());
        this.mTabPager.setPagingEnabled(false);
        this.mTabPager.setAdapter(verifypurchasebondv2);
        this.mTabLayout.setupWithViewPager(this.mTabPager);
        if (getArguments() != null && getArguments().getBoolean("com.scb.phone.EXTRA_CARDLESS_FIND_US_ATM")) {
            this.mTabPager.setCurrentItem(1);
        }
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.find_branch_atm));
    }
}
