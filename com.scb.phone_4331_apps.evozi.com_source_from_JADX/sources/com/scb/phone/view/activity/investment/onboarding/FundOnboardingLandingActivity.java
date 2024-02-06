package com.scb.phone.view.activity.investment.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.discover.DiscoverActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountConsentActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class FundOnboardingLandingActivity extends BaseActivity {
    public static Intent write(Context context) {
        return new Intent(context, FundOnboardingLandingActivity.class);
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78022131493027);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        String string = getString(R.string.mf_onboarding_title_page);
        setStackedBackground();
        MediaSessionCompat$QueueItem(string);
        setTabContainer();
    }

    @OnClick
    public void onNotNowClick() {
        Intent intent = new Intent(this, DiscoverActivity.class);
        intent.putExtra("com.scb.phone.INVESTMENT_TILE", "com.scb.phone.INVESTMENT_TILE");
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

    @OnClick
    public void onOpenAccountClick() {
        Intent intent = new Intent(this, CheckEligibilityActivity.class);
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

    @OnClick
    public void onAddAccountClick() {
        AddAccountConsentActivity.IconCompatParcelizer((Context) this);
    }
}
