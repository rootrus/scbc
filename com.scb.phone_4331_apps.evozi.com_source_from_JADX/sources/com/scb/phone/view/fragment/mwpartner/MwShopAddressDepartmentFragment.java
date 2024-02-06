package com.scb.phone.view.fragment.mwpartner;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.mwpartner.MwSearchMarketMallActivity;
import com.scb.phone.view.activity.mwpartner.MwSubDistrictSearchActivity;
import com.scb.phone.view.custom.common.CustomAddressInput;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.ActivityBuilder_ContributeEasycashReferralProductActivity;
import p040o.ActivityBuilder_ContributeEasycashSpeedyCashIntroductionActivity;
import p040o.ActivityBuilder_ContributeEasycashSubDistrictSearchActivity;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.C10833element;
import p040o.C6311x10c319da;
import p040o.ErrorInfo;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.addDelayedShutdownHook;
import p040o.getProject;
import p040o.setChangedValue;
import p040o.setEventTime;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.standardSize;
import p040o.unsafeCompare;

public class MwShopAddressDepartmentFragment extends BaseShopAddressFragment implements getProject.write {
    public boolean IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$SearchResultReceiver;
    private AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder RatingCompat;
    @BindView
    TextView districtLabel;
    @BindView
    CustomAddressInput floorInput;
    @BindView
    CustomAddressInput lotInput;
    @BindView
    TextView marketMallLabel;
    @BindView
    CustomAddressInput nearbyInput;
    @BindView
    TextView postalCodeLabel;
    @HmlPinActivity
    public ErrorInfo presenter;
    @BindView
    TextView provinceLabel;
    @BindView
    TextView provinceTitle;
    @BindView
    CustomAddressInput roadInput;
    @BindView
    TextView subDistrictLabel;

    public static MwShopAddressDepartmentFragment MediaBrowserCompat$CustomActionResultReceiver() {
        Bundle bundle = new Bundle();
        MwShopAddressDepartmentFragment mwShopAddressDepartmentFragment = new MwShopAddressDepartmentFragment();
        mwShopAddressDepartmentFragment.setArguments(bundle);
        return mwShopAddressDepartmentFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88552131494082, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver();
        this.roadInput.setTitleLabel(getString(R.string.mw_shop_address_road));
        this.provinceTitle.setText(Html.fromHtml(getString(R.string.ntb_province)));
        this.lotInput.setRegexPattern("^[\\p{Thai}\\w-*'\"#&*()@/. ]+$");
        this.lotInput.setErrorMessage(getString(R.string.mw_shop_address_error_inline));
        this.lotInput.setOnInputValidateListener(new ActivityBuilder_ContributeEasycashSubDistrictSearchActivity(this));
        this.floorInput.setRegexPattern("^[\\p{Thai}\\w-*'\"#&*()@/. ]+$");
        this.floorInput.setErrorMessage(getString(R.string.mw_shop_address_error_inline));
        this.floorInput.setOnInputValidateListener(new C6311x10c319da(this));
        this.roadInput.setRegexPattern("^[\\p{Thai}\\w-*'\"#&*()@/. ]+$");
        this.roadInput.setErrorMessage(getString(R.string.mw_shop_address_error_inline));
        this.roadInput.setOnInputValidateListener(new ActivityBuilder_ContributeEasycashReferralProductActivity(this));
        this.nearbyInput.setRegexPattern("^[\\p{Thai}\\w-*'\"#&*()@/. ]+$");
        this.nearbyInput.setErrorMessage(getString(R.string.mw_shop_address_error_inline));
        this.nearbyInput.setOnInputValidateListener(new ActivityBuilder_ContributeEasycashSpeedyCashIntroductionActivity(this));
        ErrorInfo errorInfo = this.presenter;
        setEventTime seteventtime = new setEventTime(!this.lotInput.inputTextField.getText().toString().isEmpty() && (this.marketMallLabel.getText().toString().equals(getString(R.string.mw_shop_address_search_market_hint)) ^ true) && (this.provinceLabel.getText().toString().equals(getString(R.string.select_province)) ^ true));
        if (errorInfo.RatingCompat != null) {
            z = true;
        }
        if (z) {
            seteventtime.IconCompatParcelizer(errorInfo.RatingCompat);
        }
        return inflate;
    }

    public final boolean write() {
        if (this.floorInput.errorInline.getVisibility() == 8) {
            if (this.roadInput.errorInline.getVisibility() == 8) {
                if (this.nearbyInput.errorInline.getVisibility() == 8) {
                    return true;
                }
            }
        }
        return false;
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
            this.MediaBrowserCompat$SearchResultReceiver = true;
        } else if (i == 1888 && i2 == -1 && intent != null) {
            this.RatingCompat = (AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder) intent.getParcelableExtra("MARKET_MALL_DISPLAY");
            this.marketMallLabel.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66092131099764));
            this.marketMallLabel.setText(this.RatingCompat.IconCompatParcelizer);
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
        }
        ErrorInfo errorInfo = this.presenter;
        setChangedValue setchangedvalue = new setChangedValue(this.IconCompatParcelizer && this.MediaBrowserCompat$CustomActionResultReceiver && this.MediaBrowserCompat$SearchResultReceiver);
        if (errorInfo.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setchangedvalue.IconCompatParcelizer(errorInfo.RatingCompat);
        }
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

    @OnClick
    public void selectMarketMallClick() {
        Intent write = MwSearchMarketMallActivity.write(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(write, 1888);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public void onDoneClick() {
        standardSize MediaBrowserCompat$ItemReceiver = this.presenter.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = this.lotInput.inputTextField.getText().toString().trim();
        MediaBrowserCompat$ItemReceiver.read = this.floorInput.inputTextField.getText().toString().trim();
        MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper = this.roadInput.inputTextField.getText().toString().trim();
        MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem = this.subDistrictLabel.getText().toString();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = this.districtLabel.getText().toString();
        MediaBrowserCompat$ItemReceiver.RatingCompat = this.provinceLabel.getText().toString();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = this.postalCodeLabel.getText().toString();
        MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = this.nearbyInput.inputTextField.getText().toString().trim();
        unsafeCompare write = this.presenter.write();
        AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder crashlyticsReportFilesPayloadEncoder = this.RatingCompat;
        if (crashlyticsReportFilesPayloadEncoder != null) {
            write.IconCompatParcelizer = crashlyticsReportFilesPayloadEncoder.read;
            this.presenter.IconCompatParcelizer(write, MediaBrowserCompat$ItemReceiver);
            return;
        }
        write.IconCompatParcelizer = this.presenter.IconCompatParcelizer();
        this.presenter.IconCompatParcelizer(write, MediaBrowserCompat$ItemReceiver);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(C10833element element, String str) {
        standardSize standardsize = element.IconCompatParcelizer;
        if (!TextUtils.isEmpty(str)) {
            this.marketMallLabel.setText(str);
            this.marketMallLabel.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66092131099764));
        }
        this.lotInput.setTextValue(standardsize.MediaBrowserCompat$SearchResultReceiver);
        this.floorInput.setTextValue(standardsize.read);
        this.roadInput.setTextValue(standardsize.MediaSessionCompat$ResultReceiverWrapper);
        this.subDistrictLabel.setText(standardsize.MediaSessionCompat$QueueItem);
        this.districtLabel.setText(standardsize.MediaBrowserCompat$ItemReceiver);
        this.provinceLabel.setText(standardsize.RatingCompat);
        this.postalCodeLabel.setText(standardsize.MediaBrowserCompat$MediaItem);
        this.nearbyInput.setTextValue(standardsize.MediaMetadataCompat);
        boolean z = true;
        this.IconCompatParcelizer = !standardsize.MediaBrowserCompat$SearchResultReceiver.isEmpty();
        this.MediaBrowserCompat$CustomActionResultReceiver = !str.isEmpty();
        boolean z2 = !standardsize.MediaSessionCompat$QueueItem.isEmpty();
        this.MediaBrowserCompat$SearchResultReceiver = z2;
        ErrorInfo errorInfo = this.presenter;
        setChangedValue setchangedvalue = new setChangedValue(this.IconCompatParcelizer && this.MediaBrowserCompat$CustomActionResultReceiver && z2);
        if (errorInfo.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setchangedvalue.IconCompatParcelizer(errorInfo.RatingCompat);
        }
    }
}
