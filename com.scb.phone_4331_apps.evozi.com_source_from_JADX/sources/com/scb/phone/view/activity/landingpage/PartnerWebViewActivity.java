package com.scb.phone.view.activity.landingpage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindDeejungPlanErrorFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setCurrentSession;
import p040o.setTapText;

public class PartnerWebViewActivity extends BaseActivity {
    public static void MediaBrowserCompat$ItemReceiver(Context context, setCurrentSession setcurrentsession) {
        Intent putExtra = new Intent(context, PartnerWebViewActivity.class).putExtra("com.scb.phone.EXTRA_DISPLAY", setcurrentsession);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, putExtra).read();
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
        setContentView(R.layout.f79222131493147);
        new FragmentBuilder_BindDeejungPlanErrorFragment(this);
    }
}
