package com.scb.phone.view.activity.investment.onboarding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.findus.FindUsActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.injectRttiCheckDeserializer;
import p040o.setGpsUsage;
import p040o.setTapText;

public class CheckEligibilityActivity extends BaseActivity implements injectRttiCheckDeserializer.IconCompatParcelizer {
    @HmlPinActivity
    public setGpsUsage checkEligibilityPresenter;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78002131493025);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        String string = getString(R.string.mf_onboarding_eligibility_title_page);
        setStackedBackground();
        MediaSessionCompat$QueueItem(string);
        setTabContainer();
        this.checkEligibilityPresenter.MediaBrowserCompat$ItemReceiver(this);
        mo13676d_("mfonboard_checkeligibility");
    }

    @OnClick
    public void onGetStartedClick() {
        setGpsUsage setgpsusage = this.checkEligibilityPresenter;
        if (setgpsusage.RatingCompat != null) {
            setgpsusage.RatingCompat.AlertController$RecycleListView();
        }
        setgpsusage.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        setgpsusage.IconCompatParcelizer.IconCompatParcelizer(new setGpsUsage.write(setgpsusage, (byte) 0));
    }

    @OnClick
    public void onFindUsClick() {
        Intent intent = new Intent(this, FindUsActivity.class);
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

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent(this, FatcaActivity.class);
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
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(this, FundAppFormActivity.class);
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
        finish();
    }
}
