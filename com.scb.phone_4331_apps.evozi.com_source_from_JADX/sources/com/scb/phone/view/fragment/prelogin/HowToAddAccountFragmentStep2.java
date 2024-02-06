package com.scb.phone.view.fragment.prelogin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;

public class HowToAddAccountFragmentStep2 extends BaseFragment {
    @BindView
    TextView mTextView1;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88152131494042, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.how_add_account));
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.how_add_account));
    }
}
