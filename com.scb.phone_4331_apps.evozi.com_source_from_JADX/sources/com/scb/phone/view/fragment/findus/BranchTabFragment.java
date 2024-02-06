package com.scb.phone.view.fragment.findus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;

public class BranchTabFragment extends BaseMapTabFragment {
    @BindView
    View mLine;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85872131493814, viewGroup, false);
        this.IconCompatParcelizer = "Branch";
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.mapTabPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.mLine.setVisibility(0);
        this.mMarkerOpenHour.setVisibility(0);
        this.mMarkerPhone.setVisibility(0);
        return inflate;
    }
}
