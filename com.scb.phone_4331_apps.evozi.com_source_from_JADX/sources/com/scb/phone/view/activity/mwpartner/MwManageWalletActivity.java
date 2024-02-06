package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.privacypolicy.ScbPrivacyPolicyActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PrepaidActivationService;
import p040o.getCalendar;
import p040o.getKernelIDClear;
import p040o.getTaskID;
import p040o.getTaskID$MediaBrowserCompat$ItemReceiver;
import p040o.onBackImageProcessed;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public class MwManageWalletActivity extends BaseActivity implements onBackImageProcessed.read {
    private getKernelIDClear MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public getTaskID presenter;
    @BindView
    TextView tvPrivacyConsent;

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        return new Intent(context, MwManageWalletActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78872131493112);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTabContainer();
        setTitle(R.string.mw_manage_wallet_title);
        this.MediaBrowserCompat$SearchResultReceiver = new getKernelIDClear();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public void onStart() {
        super.onStart();
        getTaskID gettaskid = this.presenter;
        String MediaBrowserCompat$CustomActionResultReceiver = gettaskid.read.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            writeUInt64NoTag.IconCompatParcelizer gettaskid_mediabrowsercompat_itemreceiver = new getTaskID$MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver);
            if (gettaskid.RatingCompat != null) {
                gettaskid_mediabrowsercompat_itemreceiver.IconCompatParcelizer(gettaskid.RatingCompat);
            }
        }
    }

    @OnClick
    public void clickManageShopInfo() {
        this.MediaBrowserCompat$SearchResultReceiver.read("menu", "manage_shop_info");
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "merchant_manageshop");
        Intent IconCompatParcelizer = MwBusinessDetailsActivity.IconCompatParcelizer((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
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

    @OnClick
    public void clickManagePin() {
        this.MediaBrowserCompat$SearchResultReceiver.read("menu", "pin_location");
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "merchant_manageshop");
        Intent MediaBrowserCompat$CustomActionResultReceiver = MwPinShopLocationActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this);
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
    }

    @OnClick
    public void clickManageShopAccount() {
        this.MediaBrowserCompat$SearchResultReceiver.read("menu", "manange_receving_account");
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "merchant_manageshop");
        C5660xaf907d98 mwManageReceivingAccountActivity$MediaBrowserCompat$CustomActionResultReceiver = MwManageReceivingAccountActivity.MediaBrowserCompat$MediaItem;
        onGetStartedClick.write((Object) this, "context");
        Intent intent = new Intent(this, MwManageReceivingAccountActivity.class);
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

    public final void read(String str) {
        TextView textView = this.tvPrivacyConsent;
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setText(Html.fromHtml(str, 0));
        } else {
            textView.setText(Html.fromHtml(str));
        }
        this.tvPrivacyConsent.setMovementMethod(new PrepaidActivationService(new getCalendar(this)));
    }

    public final void IconCompatParcelizer(String str) {
        Intent MediaBrowserCompat$CustomActionResultReceiver = ScbPrivacyPolicyActivity.MediaBrowserCompat$CustomActionResultReceiver(this, str, getString(R.string.auto_gmb_privacy_title));
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
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
