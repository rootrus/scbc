package com.scb.phone.view.fragment.profilemanagement.promptpay;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ActivityBuilder_ContributeManageAccountInboundActivity;
import p040o.ActivityBuilder_ContributeManageEmailLandingActivity;
import p040o.C1181x6b6283a1;
import p040o.setUuid;

public class UnlinkAccountFragment extends BaseFragment {
    public CompoundButton.OnCheckedChangeListener IconCompatParcelizer = new ActivityBuilder_ContributeManageEmailLandingActivity(this);
    public C1181x6b6283a1 MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    ImageView accountIcon;
    @BindView
    TextView accountNumber;
    @BindView
    TextView linkedAccount;
    @BindView
    TextView linkedAccountNickname;
    @BindView
    TextView linkedAccountType;
    @BindView
    public CheckBox payAlertToggle;
    @BindView
    Button unlinkButton;

    public static UnlinkAccountFragment write(setUuid setuuid) {
        UnlinkAccountFragment unlinkAccountFragment = new UnlinkAccountFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("linkedAccounts", setuuid);
        unlinkAccountFragment.setArguments(bundle);
        return unlinkAccountFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C1181x6b6283a1) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (C1181x6b6283a1) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90312131494258, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        setUuid setuuid = (setUuid) getArguments().getParcelable("linkedAccounts");
        boolean z = setuuid.MediaMetadataCompat;
        this.payAlertToggle.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.payAlertToggle.setChecked(z);
        this.payAlertToggle.setOnCheckedChangeListener(this.IconCompatParcelizer);
        this.accountIcon.setImageResource(setuuid.MediaBrowserCompat$ItemReceiver == 0 ? R.drawable.ic_mobile : R.drawable.ic_cid);
        this.accountNumber.setText(setuuid.write);
        this.linkedAccount.setText(setuuid.read);
        this.linkedAccountType.setText(setuuid.MediaBrowserCompat$CustomActionResultReceiver);
        this.linkedAccountNickname.setText(setuuid.IconCompatParcelizer);
        this.unlinkButton.setOnClickListener(new ActivityBuilder_ContributeManageAccountInboundActivity(this));
        return inflate;
    }
}
