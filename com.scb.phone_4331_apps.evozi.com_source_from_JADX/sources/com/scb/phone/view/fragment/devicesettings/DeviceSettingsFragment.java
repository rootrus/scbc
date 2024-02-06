package com.scb.phone.view.fragment.devicesettings;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.scb.phone.view.adapter.devicesettings.DeviceSettingsAdapter;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.C10872writeSessionOs;
import p040o.C6485x62801acb;
import p040o.CheckCaptureModule_GetUriRttiFactory;
import p040o.FragmentBuilder_BindBaseInvestmentSuccessFragment;
import p040o.HmlPinActivity;
import p040o.XVrsMrzDetector;
import p040o.otpBusinessOwnerSubmission;
import p040o.postBusinessProfileInfo;
import p040o.postLandingInfo;
import p040o.updateOfferAcceptance;
import p040o.validateGER;

public class DeviceSettingsFragment extends BaseFragment implements CheckCaptureModule_GetUriRttiFactory, C6485x62801acb {
    private boolean IconCompatParcelizer = false;
    private FragmentBuilder_BindBaseInvestmentSuccessFragment.read MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public XVrsMrzDetector devicePresenter;
    @BindView
    RecyclerView mRecyclerView;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindBaseInvestmentSuccessFragment.read) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindBaseInvestmentSuccessFragment.read) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86702131493897, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.devicePresenter.MediaBrowserCompat$ItemReceiver(this);
        this.IconCompatParcelizer = true;
        if (getActivity().getIntent() != null) {
            this.IconCompatParcelizer = getActivity().getIntent().getBooleanExtra("EXTRA_ALLOW_DELETE_THIS_DEVICE", true);
        }
        this.devicePresenter.read(this.IconCompatParcelizer);
        return inflate;
    }

    public void onDestroy() {
        this.devicePresenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<C10872writeSessionOs> list) {
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRecyclerView.setNestedScrollingEnabled(false);
        validateGER validateger = new validateGER((Parcelable) null);
        this.mRecyclerView.setAdapter(validateger.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) new DeviceSettingsAdapter(this, list, this.IconCompatParcelizer)));
        validateger.IconCompatParcelizer(this.mRecyclerView);
        FragmentBuilder_BindBaseInvestmentSuccessFragment.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (read != null) {
            read.write(list.size());
        }
    }

    public final void IconCompatParcelizer() {
        if (getActivity() != null && (getActivity() instanceof PreLoadCheckActivity)) {
            ((PreLoadCheckActivity) getActivity()).setCustomView();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        String str3;
        boolean equals = str.equals(this.devicePresenter.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver());
        int i = R.string.delete_dialog_title;
        if (!equals) {
            if (!this.IconCompatParcelizer) {
                i = R.string.review_device_delete_title;
            }
            if (this.IconCompatParcelizer) {
                str3 = getString(R.string.delete_message, str2);
            } else {
                str3 = getString(R.string.review_device_delete_confirm, str2);
            }
            CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver(i).MediaBrowserCompat$ItemReceiver(str3);
            CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.delete), new otpBusinessOwnerSubmission(this, str));
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.delete_not_now), postBusinessProfileInfo.read).show();
            return;
        }
        CustomDialog MediaBrowserCompat$ItemReceiver2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.delete_dialog_title).MediaBrowserCompat$ItemReceiver(getString(R.string.delete_message_own_device, str2));
        CustomDialog IconCompatParcelizer3 = MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2.read.getString(R.string.delete_logout), new updateOfferAcceptance(this, str));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.delete_not_now), postLandingInfo.MediaBrowserCompat$CustomActionResultReceiver).show();
    }
}
