package com.scb.phone.view.fragment.mwpartner;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.mwpartner.MwSubDistrictSearchActivity;
import com.scb.phone.view.custom.common.CustomAddressInput;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import org.bouncycastle.asn1.x509.DisplayText;
import p040o.ActivityBuilder_ContributeEtbActivity;
import p040o.ActivityBuilder_ContributeEtbOtpActivity;
import p040o.ActivityBuilder_ContributeEtbSuccessActivity;
import p040o.ActivityBuilder_ContributeFacebookBillPaymentDeeplinkActivity;
import p040o.ActivityBuilder_ContributeFastPayInputActivity;
import p040o.ActivityBuilder_ContributeFastPayOtpActivity;
import p040o.C10833element;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.addDelayedShutdownHook;
import p040o.getDisplayVersion;
import p040o.getErrDesc;
import p040o.getProject;
import p040o.setEndTime;
import p040o.setProcessingProfile;
import p040o.setTapText;
import p040o.standardSize;
import p040o.unsafeCompare;

public class MwShopAddressStandAloneFragment extends BaseShopAddressFragment implements getProject.IconCompatParcelizer {
    public boolean IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    CustomAddressInput addressNoInput;
    @BindView
    CustomAddressInput alleyInput;
    @BindView
    TextView districtLabel;
    @BindView
    CustomAddressInput mooInput;
    @BindView
    CustomAddressInput nearbyInput;
    @BindView
    TextView postalCodeLabel;
    @HmlPinActivity
    public getErrDesc presenter;
    @BindView
    TextView provinceLabel;
    @BindView
    TextView provinceTitle;
    @BindView
    CustomAddressInput roadInput;
    @BindView
    TextView subDistrictLabel;
    @BindView
    CustomAddressInput villageInput;

    public static MwShopAddressStandAloneFragment MediaBrowserCompat$CustomActionResultReceiver() {
        Bundle bundle = new Bundle();
        MwShopAddressStandAloneFragment mwShopAddressStandAloneFragment = new MwShopAddressStandAloneFragment();
        mwShopAddressStandAloneFragment.setArguments(bundle);
        return mwShopAddressStandAloneFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88572131494084, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver();
        this.roadInput.setTitleLabel(getString(R.string.mw_shop_address_road));
        this.provinceTitle.setText(Html.fromHtml(getString(R.string.ntb_province)));
        this.addressNoInput.setRegexPattern("^[\\p{Thai}\\w-*'\"#&*()@/. ]+$");
        this.addressNoInput.setErrorMessage(getString(R.string.mw_shop_address_error_inline));
        this.addressNoInput.setOnInputValidateListener(new ActivityBuilder_ContributeEtbOtpActivity(this));
        this.addressNoInput.setMaxCharacter(20);
        this.mooInput.setRegexPattern("^[\\p{Thai}\\w-*'\"#&*()@/. ]+$");
        this.mooInput.setErrorMessage(getString(R.string.mw_shop_address_error_inline));
        this.mooInput.setOnInputValidateListener(new ActivityBuilder_ContributeFacebookBillPaymentDeeplinkActivity(this));
        this.mooInput.setMaxCharacter(20);
        this.villageInput.setRegexPattern("^[\\p{Thai}\\w-*'\"#&*()@/. ]+$");
        this.villageInput.setErrorMessage(getString(R.string.mw_shop_address_error_inline));
        this.villageInput.setOnInputValidateListener(new ActivityBuilder_ContributeFastPayInputActivity(this));
        this.villageInput.setMaxCharacter(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        this.roadInput.setRegexPattern("^[\\p{Thai}\\w-*'\"#&*()@/. ]+$");
        this.roadInput.setErrorMessage(getString(R.string.mw_shop_address_error_inline));
        this.roadInput.setOnInputValidateListener(new ActivityBuilder_ContributeFastPayOtpActivity(this));
        this.roadInput.setMaxCharacter(40);
        this.alleyInput.setRegexPattern("^[\\p{Thai}\\w-*'\"#&*()@/. ]+$");
        this.alleyInput.setErrorMessage(getString(R.string.mw_shop_address_error_inline));
        this.alleyInput.setOnInputValidateListener(new ActivityBuilder_ContributeEtbSuccessActivity(this));
        this.nearbyInput.setRegexPattern("^[\\p{Thai}\\w-*'\"#&*()@/. ]+$");
        this.nearbyInput.setErrorMessage(getString(R.string.mw_shop_address_error_inline));
        this.nearbyInput.setOnInputValidateListener(new ActivityBuilder_ContributeEtbActivity(this));
        this.nearbyInput.setMaxCharacter(50);
        getErrDesc geterrdesc = this.presenter;
        setEndTime setendtime = new setEndTime(!this.addressNoInput.inputTextField.getText().toString().isEmpty() && (this.provinceLabel.getText().toString().equals(getString(R.string.select_province)) ^ true));
        if (geterrdesc.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setendtime.IconCompatParcelizer(geterrdesc.RatingCompat);
        }
        return inflate;
    }

    public final boolean write() {
        if (this.mooInput.errorInline.getVisibility() == 8) {
            if (this.villageInput.errorInline.getVisibility() == 8) {
                if (this.alleyInput.errorInline.getVisibility() == 8) {
                    if (this.roadInput.errorInline.getVisibility() == 8) {
                        if (this.nearbyInput.errorInline.getVisibility() == 8) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OnClick
    public void selectProvinceClick() {
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = MwSubDistrictSearchActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$CustomActionResultReceiver2, 1892);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i == 1892 && i2 == -1 && intent != null) {
            addDelayedShutdownHook adddelayedshutdownhook = (addDelayedShutdownHook) intent.getParcelableExtra("SUB_DISTRICT_DISPLAY");
            this.subDistrictLabel.setText(adddelayedshutdownhook.MediaDescriptionCompat);
            this.districtLabel.setText(adddelayedshutdownhook.read);
            this.provinceLabel.setText(adddelayedshutdownhook.RatingCompat);
            this.postalCodeLabel.setText(adddelayedshutdownhook.MediaBrowserCompat$CustomActionResultReceiver);
            this.IconCompatParcelizer = true;
        }
        getErrDesc geterrdesc = this.presenter;
        setProcessingProfile setprocessingprofile = new setProcessingProfile(this.MediaBrowserCompat$CustomActionResultReceiver && this.IconCompatParcelizer);
        if (geterrdesc.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setprocessingprofile.IconCompatParcelizer(geterrdesc.RatingCompat);
        }
    }

    @OnClick
    public void onDoneClick() {
        standardSize MediaBrowserCompat$ItemReceiver = this.presenter.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = this.addressNoInput.inputTextField.getText().toString().trim();
        MediaBrowserCompat$ItemReceiver.f2969x50fd9e4a = this.mooInput.inputTextField.getText().toString().trim();
        MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo = this.villageInput.inputTextField.getText().toString().trim();
        MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token = this.alleyInput.inputTextField.getText().toString().trim();
        MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper = this.roadInput.inputTextField.getText().toString().trim();
        MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem = this.subDistrictLabel.getText().toString();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = this.districtLabel.getText().toString();
        MediaBrowserCompat$ItemReceiver.RatingCompat = this.provinceLabel.getText().toString();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = this.postalCodeLabel.getText().toString();
        MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = this.nearbyInput.inputTextField.getText().toString().trim();
        this.presenter.IconCompatParcelizer((unsafeCompare) null, MediaBrowserCompat$ItemReceiver);
    }

    public final void read(getDisplayVersion getdisplayversion) {
        this.addressNoInput.setTextValue(getdisplayversion.MediaBrowserCompat$CustomActionResultReceiver);
        this.mooInput.setTextValue(getdisplayversion.write);
        this.villageInput.setTextValue(getdisplayversion.MediaDescriptionCompat);
        this.alleyInput.setTextValue(getdisplayversion.MediaBrowserCompat$MediaItem);
        this.roadInput.setTextValue(getdisplayversion.RatingCompat);
        this.subDistrictLabel.setText(getdisplayversion.MediaBrowserCompat$SearchResultReceiver);
        this.districtLabel.setText(getdisplayversion.IconCompatParcelizer);
        this.provinceLabel.setText(getdisplayversion.read);
        this.postalCodeLabel.setText(getdisplayversion.MediaBrowserCompat$ItemReceiver);
        boolean z = true;
        this.IconCompatParcelizer = !getdisplayversion.MediaBrowserCompat$SearchResultReceiver.isEmpty();
        boolean z2 = !getdisplayversion.MediaBrowserCompat$CustomActionResultReceiver.isEmpty();
        this.MediaBrowserCompat$CustomActionResultReceiver = z2;
        getErrDesc geterrdesc = this.presenter;
        setProcessingProfile setprocessingprofile = new setProcessingProfile(z2 && this.IconCompatParcelizer);
        if (geterrdesc.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setprocessingprofile.IconCompatParcelizer(geterrdesc.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(C10833element element, String str) {
        standardSize standardsize = element.IconCompatParcelizer;
        this.addressNoInput.setTextValue(standardsize.MediaDescriptionCompat);
        this.mooInput.setTextValue(standardsize.f2969x50fd9e4a);
        this.villageInput.setTextValue(standardsize.ParcelableVolumeInfo);
        this.alleyInput.setTextValue(standardsize.MediaSessionCompat$Token);
        this.roadInput.setTextValue(standardsize.MediaSessionCompat$ResultReceiverWrapper);
        this.subDistrictLabel.setText(standardsize.MediaSessionCompat$QueueItem);
        this.districtLabel.setText(standardsize.MediaBrowserCompat$ItemReceiver);
        this.provinceLabel.setText(standardsize.RatingCompat);
        this.postalCodeLabel.setText(standardsize.MediaBrowserCompat$MediaItem);
        this.nearbyInput.setTextValue(standardsize.MediaMetadataCompat);
        boolean z = true;
        this.IconCompatParcelizer = !standardsize.MediaSessionCompat$QueueItem.isEmpty();
        boolean z2 = !standardsize.MediaDescriptionCompat.isEmpty();
        this.MediaBrowserCompat$CustomActionResultReceiver = z2;
        getErrDesc geterrdesc = this.presenter;
        setProcessingProfile setprocessingprofile = new setProcessingProfile(z2 && this.IconCompatParcelizer);
        if (geterrdesc.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setprocessingprofile.IconCompatParcelizer(geterrdesc.RatingCompat);
        }
    }
}
