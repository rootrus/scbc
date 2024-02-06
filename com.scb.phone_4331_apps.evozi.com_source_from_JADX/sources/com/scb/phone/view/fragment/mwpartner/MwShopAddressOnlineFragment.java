package com.scb.phone.view.fragment.mwpartner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomAddressInput;
import p040o.ActivityBuilder_ContributeEkycTermsAndConditionActivity;
import p040o.ActivityBuilder_ContributeErrorGenericActivity;
import p040o.ActivityBuilder_ContributeErrorPageActivity;
import p040o.ActivityBuilder_ContributeEtbHmlLandingActivity;
import p040o.C10833element;
import p040o.HmlPinActivity;
import p040o.getErr;
import p040o.getProject;
import p040o.standardSize;
import p040o.unsafeCompare;

public class MwShopAddressOnlineFragment extends BaseShopAddressFragment implements getProject.read {
    @BindView
    CustomAddressInput facebookInput;
    @BindView
    CustomAddressInput instagramInput;
    @BindView
    CustomAddressInput lineInput;
    @HmlPinActivity
    public getErr presenter;
    @BindView
    CustomAddressInput webInput;

    public static MwShopAddressOnlineFragment MediaBrowserCompat$CustomActionResultReceiver() {
        Bundle bundle = new Bundle();
        MwShopAddressOnlineFragment mwShopAddressOnlineFragment = new MwShopAddressOnlineFragment();
        mwShopAddressOnlineFragment.setArguments(bundle);
        return mwShopAddressOnlineFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88562131494083, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        ParcelableVolumeInfo(getString(R.string.mw_shop_online_title));
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.facebookInput.setRegexPattern("^[\\p{Thai}\\w-*'\"#&*()@/. ]+$");
        this.facebookInput.setErrorMessage(getString(R.string.mw_shop_address_error_inline));
        this.facebookInput.setOnInputValidateListener(new ActivityBuilder_ContributeEkycTermsAndConditionActivity(this));
        this.instagramInput.setRegexPattern("^[\\p{Thai}\\w-*'\"#&*()@/. ]+$");
        this.instagramInput.setErrorMessage(getString(R.string.mw_shop_address_error_inline));
        this.instagramInput.setOnInputValidateListener(new ActivityBuilder_ContributeErrorPageActivity(this));
        this.lineInput.setRegexPattern("^[\\p{Thai}\\w-*'\"#&*()@/. ]+$");
        this.lineInput.setErrorMessage(getString(R.string.mw_shop_address_error_inline));
        this.lineInput.setOnInputValidateListener(new ActivityBuilder_ContributeErrorGenericActivity(this));
        this.webInput.setRegexPattern("^[\\p{Thai}\\w-*'\"#&*()@/. ]+$");
        this.webInput.setErrorMessage(getString(R.string.mw_shop_address_error_inline));
        this.webInput.setOnInputValidateListener(new ActivityBuilder_ContributeEtbHmlLandingActivity(this));
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver();
        return inflate;
    }

    public final boolean write() {
        if (this.facebookInput.errorInline.getVisibility() == 8) {
            if (this.instagramInput.errorInline.getVisibility() == 8) {
                if (this.lineInput.errorInline.getVisibility() == 8) {
                    if (this.webInput.errorInline.getVisibility() == 8) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OnClick
    public void onDoneClick() {
        unsafeCompare write = this.presenter.write();
        write.MediaBrowserCompat$CustomActionResultReceiver = this.facebookInput.inputTextField.getText().toString().trim();
        write.MediaBrowserCompat$ItemReceiver = this.instagramInput.inputTextField.getText().toString().trim();
        write.read = this.lineInput.inputTextField.getText().toString().trim();
        write.MediaSessionCompat$QueueItem = this.webInput.inputTextField.getText().toString().trim();
        this.presenter.IconCompatParcelizer(write, (standardSize) null);
    }

    public final void write(String str) {
        this.lineInput.setTextValue(str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(C10833element element, String str) {
        unsafeCompare unsafecompare = element.MediaBrowserCompat$ItemReceiver;
        this.facebookInput.setTextValue(unsafecompare.MediaBrowserCompat$CustomActionResultReceiver);
        this.instagramInput.setTextValue(unsafecompare.MediaBrowserCompat$ItemReceiver);
        this.webInput.setTextValue(unsafecompare.MediaSessionCompat$QueueItem);
    }
}
