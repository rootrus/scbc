package com.scb.phone.view.fragment.ccrredemption.product;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.CardView;
import p040o.eagerInDefaultApp;

public class OPRStatusFragment extends BaseFragment {
    public static OPRStatusFragment MediaBrowserCompat$CustomActionResultReceiver() {
        return new OPRStatusFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88792131494106, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Fragment fragment;
        eagerInDefaultApp eagerindefaultapp = (eagerInDefaultApp) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.OPRStatusRewardsLandingActivity.OPR_LANDING_DTO");
        if (eagerindefaultapp.ParcelableVolumeInfo == null && eagerindefaultapp.f2820x50fd9e4a == null) {
            fragment = new OPRStatusUnregisteredUserFragment();
            str = "OPR_STATUS_UNREGISTERED_FRAGMENT_TAG";
        } else {
            fragment = new OPRStatusRegisteredUserFragment();
            str = "OPR_STATUS_REGISTERED_FRAGMENT_TAG";
        }
        CardView read = getChildFragmentManager().read();
        read.write(R.id.container, fragment, str);
        read.write();
    }
}
