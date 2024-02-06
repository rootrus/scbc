package com.scb.phone.view.activity.profilemanagement.promptpay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.profilemanagement.promptpay.ManagePromptpaySuccessFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getBinaries;
import p040o.setTapText;

public class ManagePromptpaySuccessActivity extends BaseActivity {
    public void onBackPressed() {
    }

    public static void read(Context context, getBinaries getbinaries, boolean z) {
        Intent intent = new Intent(context, ManagePromptpaySuccessActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_MANAGE_PROMPTPAY_SUCCESS", getbinaries);
        intent.putExtra("com.scb.phone.EXTRA_MANAGE_PROMPTPAY_FRAGMENT_SUCCESS_SHOW_SUCCESS", z);
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
        setContentView(R.layout.f78672131493092);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, ManagePromptpaySuccessFragment.read((getBinaries) getIntent().getParcelableExtra("com.scb.phone.EXTRA_MANAGE_PROMPTPAY_SUCCESS"))).write();
        if (getIntent().getBooleanExtra("com.scb.phone.EXTRA_MANAGE_PROMPTPAY_FRAGMENT_SUCCESS_SHOW_SUCCESS", false)) {
            setBackgroundResource();
        }
    }
}
