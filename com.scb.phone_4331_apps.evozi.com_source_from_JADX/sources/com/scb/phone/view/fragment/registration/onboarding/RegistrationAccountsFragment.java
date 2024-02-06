package com.scb.phone.view.fragment.registration.onboarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountConsentActivity;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ActivityBuilder_ContributeNdidIdpShareSuccessActivity;
import p040o.C4955mO;
import p040o.HmlPinActivity;
import p040o.QuickExtractorSettings;
import p040o.getKernelIDDstOver;

public class RegistrationAccountsFragment extends BaseFragment implements QuickExtractorSettings {
    public getKernelIDDstOver MediaBrowserCompat$CustomActionResultReceiver = new getKernelIDDstOver();
    @BindView
    public Button button;
    @HmlPinActivity
    public C4955mO presenter;

    public static RegistrationAccountsFragment MediaBrowserCompat$CustomActionResultReceiver() {
        Bundle bundle = new Bundle();
        RegistrationAccountsFragment registrationAccountsFragment = new RegistrationAccountsFragment();
        registrationAccountsFragment.setArguments(bundle);
        return registrationAccountsFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89292131494156, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.button.setOnClickListener(new ActivityBuilder_ContributeNdidIdpShareSuccessActivity(this));
        getKernelIDDstOver getkerneliddstover = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            getkerneliddstover.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "registration_add_account_start");
        }
        return inflate;
    }

    public final void write() {
        AddAccountConsentActivity.write(getContext());
    }

    public void onResume() {
        super.onResume();
        this.button.setEnabled(true);
    }
}
