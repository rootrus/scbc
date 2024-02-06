package com.scb.phone.view.activity.hml.promptpay;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.demo.ntb.NTBLandingActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportCaptureModule_GetUriKtaFactory;
import p040o.getFormTypeId;
import p040o.getFormTypeId$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getFormTypeId$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class HmlNTBPromptPayNotFoundActivity extends BaseActivity implements PassportCaptureModule_GetUriKtaFactory {
    public static final HmlNTBPromptPayNotFoundActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver = new HmlNTBPromptPayNotFoundActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    @HmlPinActivity
    public getFormTypeId presenter;

    public final void onCreate(Bundle bundle) {
        Activity activity = this;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(activity);
        super.onCreate(bundle);
        setContentView(R.layout.f78322131493057);
        ButterKnife.MediaBrowserCompat$ItemReceiver(activity);
        getFormTypeId getformtypeid = this.presenter;
        if (getformtypeid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getformtypeid.MediaBrowserCompat$ItemReceiver(this);
        mo13676d_("p10x1_ntb_promptpay_not_found");
    }

    @OnClick
    public final void onContactCallCenterClicked() {
        getFormTypeId getformtypeid = this.presenter;
        if (getformtypeid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getFormTypeId$MediaBrowserCompat$CustomActionResultReceiver.read;
        if (getformtypeid.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getformtypeid.RatingCompat);
        }
    }

    @OnClick
    public final void onReturnHomeClicked() {
        getFormTypeId getformtypeid = this.presenter;
        if (getformtypeid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getFormTypeId$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        if (getformtypeid.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getformtypeid.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent("android.intent.action.DIAL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append(getResources().getString(R.string.easycash_contact_number));
        Intent data = intent.setData(Uri.parse(sb.toString()));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, data).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb2.append(read.getData());
            sb2.append("\n with context ");
            sb2.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb2.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        Intent intent = new Intent(this, NTBLandingActivity.class);
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
    }
}
