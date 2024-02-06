package com.scb.phone.view.fragment.prelogin.quicktopup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;

public class HowToAddFavouriteTopUpFragment extends BaseFragment {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88162131494043, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.how_to_add_favourite_top_up));
        setActionBarVisibilityCallback();
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.how_to_add_favourite_top_up));
        setActionBarVisibilityCallback();
    }
}
