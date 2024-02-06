package com.scb.phone.view.activity.investment.redeem;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getOsDisplayVersionString;
import p040o.setTapText;

public class FundRedeemLandingActivity extends BaseActivity {
    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78082131493033);
    }

    public static void MediaBrowserCompat$ItemReceiver(Context context, getOsDisplayVersionString getosdisplayversionstring, int i) {
        Intent intent = new Intent(context, FundRedeemLandingActivity.class);
        if (getosdisplayversionstring != null) {
            intent.putExtra("com.scb.phone.REDEEM_FUND_SEARCH_SELECTED", getosdisplayversionstring);
            intent.putExtra("SELECTED_CLIENT_LIST_POSITION", i);
        }
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void write(Context context, int i) {
        Intent intent = new Intent(context, FundRedeemLandingActivity.class);
        intent.putExtra("SELECTED_CLIENT_LIST_POSITION", i);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null && intent.getStringExtra("com.scb.phone.REDEEM_FUND_ANOTHER_TRANSACTION") != null) {
            setIntent(intent);
        }
    }
}
