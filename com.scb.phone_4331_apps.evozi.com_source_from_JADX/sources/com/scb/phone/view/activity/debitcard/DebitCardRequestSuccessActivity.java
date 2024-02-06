package com.scb.phone.view.activity.debitcard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewSuccessfulActivity;
import com.scb.phone.view.fragment.debitcard.DebitCardRequestSuccessFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class DebitCardRequestSuccessActivity extends ReviewSuccessfulActivity {
    public static void MediaBrowserCompat$ItemReceiver(Context context) {
        Intent intent = new Intent(context, DebitCardRequestSuccessActivity.class);
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
        super.onCreate(bundle);
        mo13676d_("atm_request_receipt_screen");
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, DebitCardRequestSuccessFragment.MediaBrowserCompat$SearchResultReceiver()).write();
    }
}
