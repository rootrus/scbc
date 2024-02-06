package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.otppin.OtpPinFragment;
import p040o.C4261dN;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.LinkedListMultimap;
import p040o.LinkedListMultimap$2$MediaBrowserCompat$ItemReceiver;
import p040o.PassportCaptureModule;
import p040o.getFiles;
import p040o.getOversizeImage;
import p040o.getWscClientIp;
import p040o.getWscClientIp$MediaBrowserCompat$ItemReceiver;
import p040o.getWscClientIp$MediaSessionCompat$QueueItem;
import p040o.getWscClientIp$MediaSessionCompat$Token;
import p040o.onGetStartedClick;
import p040o.setCradleVerticalOffset;
import p040o.setTitleEnabled;

public class HmlVerifyPhoneActivity extends BaseActivity implements OtpPinFragment.write, PassportCaptureModule.KtaExceptionResponseDeserializer, OtpPinFragment.read {
    protected Boolean MediaBrowserCompat$MediaItem;
    @HmlPinActivity
    public getWscClientIp presenter;

    public void IconCompatParcelizer(getFiles getfiles) {
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, Boolean bool) {
        Intent intent = new Intent(context, HmlVerifyPhoneActivity.class);
        intent.putExtra("IS_NCB_ACCEPTED", bool);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77942131493019);
        boolean z = false;
        this.MediaBrowserCompat$MediaItem = Boolean.valueOf(getIntent().getBooleanExtra("IS_NCB_ACCEPTED", false));
        String str = mo3026D_().equalsIgnoreCase("en") ? "FastEasyDefault_EN" : "FastEasyDefault_TH";
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getWscClientIp getwscclientip = this.presenter;
        onGetStartedClick.write((Object) str, "otpPolicyId");
        if (getwscclientip.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getwscclientip.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.C35722 r0 = getwscclientip.read;
        FundFactSheetActivity getwscclientip_mediasessioncompat_token = new getWscClientIp$MediaSessionCompat$Token(getwscclientip, str);
        FundFactSheetActivity getwscclientip_mediasessioncompat_queueitem = new getWscClientIp$MediaSessionCompat$QueueItem(getwscclientip);
        onGetStartedClick.write((Object) getwscclientip_mediasessioncompat_token, "onSuccess");
        onGetStartedClick.write((Object) getwscclientip_mediasessioncompat_queueitem, "onError");
        setTitleEnabled settitleenabled = r0.read;
        settitleenabled.write(settitleenabled.write(), new LinkedListMultimap.C35722.IconCompatParcelizer(getwscclientip_mediasessioncompat_queueitem, getwscclientip_mediasessioncompat_token));
    }

    public final void write() {
        setResult(-1);
        finish();
    }

    public void write(String str, String str2) {
        getWscClientIp getwscclientip = this.presenter;
        boolean booleanValue = this.MediaBrowserCompat$MediaItem.booleanValue();
        onGetStartedClick.write((Object) str, "tokenUuid");
        onGetStartedClick.write((Object) str2, "otp");
        if (getwscclientip.RatingCompat != null) {
            getwscclientip.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.C35722 r4 = getwscclientip.read;
        FundActionsSuccessActivity write = new getWscClientIp.write(getwscclientip);
        FundFactSheetActivity getwscclientip_mediabrowsercompat_itemreceiver = new getWscClientIp$MediaBrowserCompat$ItemReceiver(getwscclientip);
        onGetStartedClick.write((Object) write, "onSuccess");
        onGetStartedClick.write((Object) getwscclientip_mediabrowsercompat_itemreceiver, "onError");
        onGetStartedClick.write((Object) str, "tokenUuid");
        onGetStartedClick.write((Object) str2, "otp");
        setCradleVerticalOffset setcradleverticaloffset = r4.write;
        setcradleverticaloffset.write(setcradleverticaloffset.IconCompatParcelizer(str, str2, booleanValue), new LinkedListMultimap$2$MediaBrowserCompat$ItemReceiver(getwscclientip_mediabrowsercompat_itemreceiver, write));
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        write(this, R.id.root_activity, str, getOversizeImage.SUCCESS);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public C4261dN.read mo33965x50fd9e4a() {
        return C4261dN.read.EKYC;
    }

    public final void IconCompatParcelizer(String str, String str2, String str3) {
        getSupportFragmentManager().read().write(R.id.container, OtpPinFragment.read(mo33965x50fd9e4a(), str2, str3, str, getString(R.string.hml_otp_title)), "OTP_PIN_FRAGMENT_TAG").write();
    }

    public final void write(String str) {
        write(this, R.id.root_activity, str, getOversizeImage.ERROR);
    }

    public final void IconCompatParcelizer(String str) {
        setResult(0);
        write(this, R.id.root_activity, str, getOversizeImage.ERROR);
    }
}
