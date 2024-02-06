package com.scb.phone.view.activity.transferandpay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.transferandpay.SuccessFragment;
import p040o.AlertController$RecycleListView;
import p040o.getUuidUtf8Bytes;

public class SuccessActivity extends BaseActivity {
    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f76802131492905);
        getUuidUtf8Bytes getuuidutf8bytes = (getUuidUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_SUCCESS");
        if (getuuidutf8bytes == null) {
            finish();
            return;
        }
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, SuccessFragment.write(getuuidutf8bytes)).write();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Intent mo15316x50fd9e4a() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
        return intent;
    }
}
