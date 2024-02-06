package com.scb.phone.view.activity.bulktransfer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.bulktransfer.BulkTransferSuccessFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setDaemon;
import p040o.setTapText;

public class BulkTransferSuccessActivity extends BaseActivity {
    public void onBackPressed() {
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, setDaemon setdaemon) {
        Intent intent = new Intent(context, BulkTransferSuccessActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_SUCCESS_DISPLAY", setdaemon);
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
        setContentView(R.layout.f76902131492915);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, BulkTransferSuccessFragment.IconCompatParcelizer((setDaemon) getIntent().getParcelableExtra("com.scb.phone.EXTRA_SUCCESS_DISPLAY"))).write();
    }
}
