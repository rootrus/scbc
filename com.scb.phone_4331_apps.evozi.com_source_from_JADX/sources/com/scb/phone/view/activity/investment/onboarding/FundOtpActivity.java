package com.scb.phone.view.activity.investment.onboarding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.otppin.MobileListFragment;
import com.scb.phone.view.fragment.otppin.OtpPinFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C1355x8de47d61;
import p040o.C4261dN;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.addOnAutoFocusResultListener;
import p040o.addPreviewCallbackListener;
import p040o.getAdditionalBottomScanLinesHeight;
import p040o.getInstallerPackageName;
import p040o.getOversizeImage;
import p040o.getTileUrl;
import p040o.setImageResolution;
import p040o.setTapText;

public class FundOtpActivity extends BaseActivity implements getAdditionalBottomScanLinesHeight, OtpPinFragment.write, C1355x8de47d61 {
    @HmlPinActivity
    public setImageResolution presenter;

    public static Intent MediaBrowserCompat$ItemReceiver(Activity activity) {
        return new Intent(activity, FundOtpActivity.class).putExtra("EXTRA_OTP_POLICY_ID", (String) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78042131493029);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        mo11B_().MediaBrowserCompat$CustomActionResultReceiver(true);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, MobileListFragment.IconCompatParcelizer(getString(R.string.mobile_number_not_in_list))).write();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        String stringExtra = getIntent().getStringExtra("EXTRA_OTP_POLICY_ID");
        if (stringExtra == null) {
            stringExtra = mo3026D_().equalsIgnoreCase("en") ? "FastEasyDefault_EN" : "FastEasyDefault_TH";
        }
        OtpPinFragment read = OtpPinFragment.read(C4261dN.read.DEFAULT, str2, str3, stringExtra, getString(R.string.otp_title));
        read.MediaMetadataCompat = str2;
        read.IconCompatParcelizer = str3;
        read.MediaBrowserCompat$CustomActionResultReceiver = stringExtra;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, read).MediaBrowserCompat$CustomActionResultReceiver(str).write();
    }

    public final void write(String str, String str2) {
        setImageResolution setimageresolution = this.presenter;
        if (setimageresolution.RatingCompat != null) {
            setimageresolution.RatingCompat.AlertController$RecycleListView();
        }
        getTileUrl gettileurl = setimageresolution.MediaBrowserCompat$ItemReceiver;
        gettileurl.read(gettileurl.write.read(str, str2), new addOnAutoFocusResultListener(setimageresolution), new addPreviewCallbackListener(setimageresolution));
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        write(this, R.id.root_activity, str, getOversizeImage.SUCCESS);
    }

    public final void read(getInstallerPackageName getinstallerpackagename) {
        Intent MediaBrowserCompat$ItemReceiver = FundOnboardingSuccessActivity.MediaBrowserCompat$ItemReceiver(this, getinstallerpackagename);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void IconCompatParcelizer(String str) {
        write(this, R.id.root_activity, str, getOversizeImage.ERROR);
    }
}
