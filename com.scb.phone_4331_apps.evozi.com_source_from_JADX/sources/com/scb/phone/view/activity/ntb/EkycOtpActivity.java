package com.scb.phone.view.activity.ntb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.otppin.OtpPinFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C4177ce;
import p040o.C4261dN;
import p040o.CheckExtractorResponse;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$2200;
import p040o.applyFacade;
import p040o.ce$MediaBrowserCompat$ItemReceiver;
import p040o.getFiles;
import p040o.getKtaExtraction;
import p040o.getOversizeImage;
import p040o.setDay;
import p040o.setTapText;
import p040o.slice;

public class EkycOtpActivity extends BaseActivity implements OtpPinFragment.write, CheckExtractorResponse {
    @HmlPinActivity
    public C4177ce presenter;

    public static Intent read(Activity activity, String str, String str2) {
        Intent putExtra = new Intent(activity, EkycOtpActivity.class).putExtra("com.scb.phone.view.activity.ntb.EkycOtpActivity.EXTRA_MOBILE_NUMBER", str);
        if (true ^ (str2 == null || str2.length() == 0)) {
            putExtra.putExtra("com.scb.phone.view.activity.ntb.EkycOtpActivity.EXTRA_FIREBASE_SOURCE", str2);
        }
        return putExtra;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77722131492997);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        boolean z = true;
        mo11B_().MediaBrowserCompat$CustomActionResultReceiver(true);
        String str = mo3026D_().equalsIgnoreCase("en") ? "FastEasyDefault_EN" : "FastEasyDefault_TH";
        String stringExtra = getIntent().getStringExtra("com.scb.phone.view.activity.ntb.EkycOtpActivity.EXTRA_MOBILE_NUMBER");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        C4177ce ceVar = this.presenter;
        getKtaExtraction getktaextraction = new getKtaExtraction(stringExtra, slice.MediaBrowserCompat$MediaItem(stringExtra), str);
        if (ceVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getktaextraction.IconCompatParcelizer(ceVar.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(String str, String str2, String str3) {
        getSupportFragmentManager().read().write(R.id.container, OtpPinFragment.read(C4261dN.read.EKYC, str, str2, str3, getString(R.string.otp_title)), "OTP_PIN_FRAGMENT_TAG").write();
    }

    public final void write(String str, String str2) {
        C4177ce ceVar = this.presenter;
        if (ceVar.RatingCompat != null) {
            ceVar.RatingCompat.AlertController$RecycleListView();
        }
        ceVar.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(str, str2);
        ceVar.IconCompatParcelizer.IconCompatParcelizer(new ce$MediaBrowserCompat$ItemReceiver(ceVar));
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        write(this, R.id.root_activity, str, getOversizeImage.SUCCESS);
    }

    public final void read() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = ReviewInfoResultActivity.MediaBrowserCompat$CustomActionResultReceiver(this, getString(R.string.ntb_fillinformation_review_info_result_error_title_page), getString(R.string.ntb_fillinformation_review_info_error_title), getString(R.string.ntb_fillinformation_review_info_error_description));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
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
        setResult(-1);
        finish();
    }

    public final void write(getFiles getfiles) {
        String stringExtra = getIntent().getStringExtra("com.scb.phone.view.activity.ntb.EkycOtpActivity.EXTRA_FIREBASE_SOURCE");
        Intent intent = new Intent(this, EkycSuccessActivity.class);
        intent.putExtra("com.scb.phone.view.activity.ntb.EkycSuccessActivity.EXTRA_CONFIRMATION_DISPLAY", getfiles);
        if (true ^ (stringExtra == null || stringExtra.length() == 0)) {
            intent.putExtra("com.scb.phone.view.activity.ntb.EkycSuccessActivity.EXTRA_FIREBASE_SOURCE", stringExtra);
        }
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
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
        setResult(-1);
        finish();
    }

    public final void write(String str) {
        write(this, R.id.root_activity, str, getOversizeImage.ERROR);
    }

    public final void write(access$2200 access_2200) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String str = access_2200.MediaBrowserCompat$ItemReceiver;
        if (!(str == null || str.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(str);
        }
        String str2 = access_2200.IconCompatParcelizer;
        if (!(str2 == null || str2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(str2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.cancel), new applyFacade(this));
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.retry), new setDay(this)).show();
    }
}
