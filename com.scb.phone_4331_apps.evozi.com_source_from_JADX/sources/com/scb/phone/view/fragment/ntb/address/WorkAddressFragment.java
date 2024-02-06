package com.scb.phone.view.fragment.ntb.address;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.scb.phone.R;

public class WorkAddressFragment extends BaseAddressFragment {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RatingCompat(getString(R.string.ntb_fillinformation_occupation_info_work_address));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
