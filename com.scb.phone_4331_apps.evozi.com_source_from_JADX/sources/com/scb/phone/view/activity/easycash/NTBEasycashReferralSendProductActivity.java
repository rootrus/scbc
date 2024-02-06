package com.scb.phone.view.activity.easycash;

import android.content.Context;
import android.content.Intent;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.CrashlyticsBackgroundWorker;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class NTBEasycashReferralSendProductActivity extends EasycashReferralSendProductActivity {
    public static void read(Context context, CrashlyticsBackgroundWorker.C32131 r4) {
        Intent intent = new Intent(context, NTBEasycashReferralSendProductActivity.class);
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
}
