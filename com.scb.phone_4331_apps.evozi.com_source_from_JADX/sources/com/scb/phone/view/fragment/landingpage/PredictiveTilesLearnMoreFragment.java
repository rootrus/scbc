package com.scb.phone.view.fragment.landingpage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;

public class PredictiveTilesLearnMoreFragment extends BaseFragment {
    public static PredictiveTilesLearnMoreFragment write() {
        return new PredictiveTilesLearnMoreFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88252131494052, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        super.setTransitioning();
        ActionBarContextView();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.landing_page_learn_more_toolbar_label));
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ActionBarContextView();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.landing_page_learn_more_toolbar_label));
    }
}
