package com.scb.phone.view.fragment.findus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;

public class ATMTabFragment extends BaseMapTabFragment {
    @BindView
    View mLine;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85682131493795, viewGroup, false);
        this.IconCompatParcelizer = "ATM";
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.mapTabPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.mLine.setVisibility(8);
        this.mMarkerOpenHour.setVisibility(8);
        this.mMarkerPhone.setVisibility(8);
        return inflate;
    }
}
