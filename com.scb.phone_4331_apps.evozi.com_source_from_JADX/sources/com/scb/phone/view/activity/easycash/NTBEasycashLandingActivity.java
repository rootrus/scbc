package com.scb.phone.view.activity.easycash;

import android.content.Context;
import android.content.Intent;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class NTBEasycashLandingActivity extends EasycashLandingActivity {
    public static void MediaBrowserCompat$ItemReceiver(Context context) {
        Intent putExtra = new Intent(context, NTBEasycashLandingActivity.class).addFlags(603979776).putExtra("com.scb.phone.EXTRA_REFRESH", true);
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
}
