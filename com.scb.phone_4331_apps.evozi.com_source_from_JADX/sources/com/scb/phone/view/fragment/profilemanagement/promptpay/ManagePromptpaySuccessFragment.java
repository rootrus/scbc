package com.scb.phone.view.fragment.profilemanagement.promptpay;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.profilemanagement.promptpay.ManagePromptpayLandingActivity;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.getBinaries;
import p040o.getKernelIDDstIn;

public class ManagePromptpaySuccessFragment extends BaseFragment {
    private getKernelIDDstIn IconCompatParcelizer = new getKernelIDDstIn();
    @BindView
    TextView accountDetails;
    @BindView
    TextView accountName;
    @BindView
    TextView accountNumber;
    @BindView
    ImageView arrowIcon;
    @BindView
    ImageView citizenIcon;
    @BindView
    TextView citizenNumber;
    @BindView
    TextView informationText;
    @BindView
    TextView titleText;

    @OnClick
    public void onReturnButton() {
        if (getActivity() != null) {
            ManagePromptpayLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getActivity());
            getActivity().finish();
        }
    }

    public static ManagePromptpaySuccessFragment read(getBinaries getbinaries) {
        ManagePromptpaySuccessFragment managePromptpaySuccessFragment = new ManagePromptpaySuccessFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_MANAGE_PROMPTPAY_FRAGMENT_SUCCESS", getbinaries);
        managePromptpaySuccessFragment.setArguments(bundle);
        return managePromptpaySuccessFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88332131494060, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (!(getArguments() == null || getArguments().getParcelable("com.scb.phone.EXTRA_MANAGE_PROMPTPAY_FRAGMENT_SUCCESS") == null)) {
            getBinaries getbinaries = (getBinaries) getArguments().getParcelable("com.scb.phone.EXTRA_MANAGE_PROMPTPAY_FRAGMENT_SUCCESS");
            this.titleText.setText(getbinaries.MediaDescriptionCompat);
            this.informationText.setText(getbinaries.MediaBrowserCompat$MediaItem);
            this.citizenNumber.setText(getbinaries.MediaBrowserCompat$SearchResultReceiver);
            this.accountNumber.setText(getbinaries.MediaBrowserCompat$CustomActionResultReceiver);
            this.accountName.setText(getbinaries.write);
            this.accountDetails.setText(getbinaries.MediaBrowserCompat$ItemReceiver);
            this.arrowIcon.setImageResource(getbinaries.read == 0 ? R.drawable.link_icon : R.drawable.unlink_icon);
            this.citizenIcon.setImageResource(getbinaries.IconCompatParcelizer == 0 ? R.drawable.ic_mobile : R.drawable.ic_cid);
            this.IconCompatParcelizer.read(getbinaries.read == 0 ? "link" : "unlink");
            getKernelIDDstIn getkerneliddstin = this.IconCompatParcelizer;
            if (getActivity() != null) {
                getkerneliddstin.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "managepromptpay_success");
            }
        }
        return inflate;
    }
}
