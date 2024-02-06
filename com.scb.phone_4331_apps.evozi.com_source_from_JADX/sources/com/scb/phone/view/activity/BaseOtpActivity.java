package com.scb.phone.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.otppin.MobileListFragment;
import com.scb.phone.view.fragment.otppin.OtpPinFragment;
import p040o.C4261dN;
import p040o.CheckCaptureModule;
import p040o.HmlPinActivity;
import p040o.access$2200;
import p040o.getAdditionalBottomScanLinesHeight;
import p040o.getOversizeImage;
import p040o.writeUInt64;
import p040o.writeUInt64NoTag;

public abstract class BaseOtpActivity extends BaseActivity implements CheckCaptureModule.C1151b, getAdditionalBottomScanLinesHeight, OtpPinFragment.write {
    @HmlPinActivity
    public writeUInt64 baseOTPPresenter;

    public void AppCompatDelegateImpl$ListMenuDecorView() {
    }

    /* access modifiers changed from: protected */
    public boolean MediaSessionCompat$QueueItem() {
        return true;
    }

    public void MediaSessionCompat$ResultReceiverWrapper() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78042131493029);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        this.baseOTPPresenter.MediaBrowserCompat$ItemReceiver(this);
        writeUInt64 writeuint64 = this.baseOTPPresenter;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = writeUInt64.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (writeuint64.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(writeuint64.RatingCompat);
        }
        writeUInt64 writeuint642 = this.baseOTPPresenter;
        if (MediaSessionCompat$QueueItem()) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = writeUInt64.write.MediaBrowserCompat$ItemReceiver;
            if (writeuint642.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(writeuint642.RatingCompat);
            }
        }
    }

    /* access modifiers changed from: protected */
    public MobileListFragment RatingCompat(String str) {
        return MobileListFragment.IconCompatParcelizer(str);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public String MediaSessionCompat$Token() {
        return getString(R.string.otp_title);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        String MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo13724x50fd9e4a();
        OtpPinFragment read = OtpPinFragment.read(C4261dN.read.DEFAULT, str2, str3, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, MediaSessionCompat$Token());
        read.MediaMetadataCompat = str2;
        read.IconCompatParcelizer = str3;
        read.MediaBrowserCompat$CustomActionResultReceiver = MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, read).MediaBrowserCompat$CustomActionResultReceiver(str).write();
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String mo13724x50fd9e4a() {
        String stringExtra = getIntent().getStringExtra("EXTRA_OTP_POLICY_ID");
        if (stringExtra == null) {
            return mo3026D_().equalsIgnoreCase("en") ? "FastEasyDefault_EN" : "FastEasyDefault_TH";
        }
        return stringExtra;
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        write(this, R.id.root_activity, str, getOversizeImage.SUCCESS);
    }

    /* renamed from: K_ */
    public void mo13720K_() {
        setResult(-1);
        finish();
    }

    /* renamed from: b_ */
    public void mo13729b_(access$2200 access_2200) {
        Intent intent = new Intent();
        intent.putExtra("OTP_ERROR_TITLE", access_2200.MediaBrowserCompat$ItemReceiver);
        intent.putExtra("OTP_ERROR_MESSAGE", access_2200.IconCompatParcelizer);
        setResult(0, intent);
        finish();
    }

    /* renamed from: i_ */
    public void mo13730i_(String str) {
        write(this, R.id.root_activity, str, getOversizeImage.ERROR);
    }

    /* renamed from: v_ */
    public final void mo13731v_() {
        if (mo11B_() != null) {
            mo11B_().MediaBrowserCompat$CustomActionResultReceiver(true);
        }
    }

    /* renamed from: L_ */
    public final void mo13721L_() {
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, RatingCompat(getString(R.string.mobile_number_not_in_list))).write();
        MediaSessionCompat$ResultReceiverWrapper();
    }
}
