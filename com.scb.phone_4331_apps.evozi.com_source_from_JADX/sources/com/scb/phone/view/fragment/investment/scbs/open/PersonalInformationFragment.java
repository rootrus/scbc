package com.scb.phone.view.fragment.investment.scbs.open;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;

public class PersonalInformationFragment extends BaseFragment {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89682131494195, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }
}
