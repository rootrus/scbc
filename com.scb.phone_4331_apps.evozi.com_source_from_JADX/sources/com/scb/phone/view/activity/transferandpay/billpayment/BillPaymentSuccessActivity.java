package com.scb.phone.view.activity.transferandpay.billpayment;

import android.app.Activity;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.transferandpay.billpayment.BillPaymentSuccessFragment;
import p040o.AlertController$RecycleListView;
import p040o.getUuidUtf8Bytes;

public class BillPaymentSuccessActivity extends BaseActivity {
    private BillPaymentSuccessFragment MediaMetadataCompat;

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
        this.MediaMetadataCompat = BillPaymentSuccessFragment.read(getuuidutf8bytes);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, this.MediaMetadataCompat).write();
    }
}
