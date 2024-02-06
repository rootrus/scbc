package com.scb.phone.view.activity.easycash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.easycash.EasycashReferralSendDfwFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.CrashlyticsBackgroundWorker;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class EasycashReferralSendDfwActivity extends BaseActivity {
    public static void MediaBrowserCompat$ItemReceiver(Context context, CrashlyticsBackgroundWorker.C32131 r4) {
        Intent intent = new Intent(context, EasycashReferralSendDfwActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REFERRAL", r4);
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

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77602131492985);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        getSupportFragmentManager().read().write(R.id.container, EasycashReferralSendDfwFragment.MediaBrowserCompat$CustomActionResultReceiver((CrashlyticsBackgroundWorker.C32131) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REFERRAL")), "EasycashReferralSendDfwFragment").write();
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.easycash_referral_dfw_title));
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.easycash_referral_dfw_title));
        setTabContainer();
    }
}
