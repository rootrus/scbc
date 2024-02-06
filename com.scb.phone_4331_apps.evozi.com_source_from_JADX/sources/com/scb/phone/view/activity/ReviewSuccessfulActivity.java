package com.scb.phone.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;
import p040o.standardStartAndWait;

public class ReviewSuccessfulActivity extends BaseActivity {
    public void onBackPressed() {
    }

    public static void write(Context context, standardStartAndWait standardstartandwait) {
        Intent intent = new Intent(context, ReviewSuccessfulActivity.class);
        intent.putExtra("com.scb.phone.PURCHASE_SUCCESS_DISPLAY", standardstartandwait);
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
        setContentView(R.layout.f79512131493176);
        MediaSessionCompat$ResultReceiverWrapper();
    }

    public void MediaSessionCompat$ResultReceiverWrapper() {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, PurchaseSuccessFragment.IconCompatParcelizer((standardStartAndWait) getIntent().getParcelableExtra("com.scb.phone.PURCHASE_SUCCESS_DISPLAY"))).write();
    }
}
