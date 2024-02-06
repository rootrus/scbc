package com.scb.phone.view.activity.sme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.sme.SMELandingFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.CardView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.setTapText;

public class SMELandingPageActivity extends BaseActivity {
    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list) {
        Intent intent = new Intent(context, SMELandingPageActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_LANDING_TILESS", new ArrayList(list));
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79972131493222);
        CardView read = getSupportFragmentManager().read();
        read.write(R.id.container, SMELandingFragment.write(getIntent().getParcelableArrayListExtra("com.scb.phone.EXTRA_LANDING_TILESS")), "LANDING_PAGE_TAG");
        read.MediaBrowserCompat$ItemReceiver();
    }

    public static void MediaBrowserCompat$ItemReceiver(Context context, List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list) {
        Intent intent = new Intent(context, SMELandingPageActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_LANDING_TILESS", new ArrayList(list));
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
}
