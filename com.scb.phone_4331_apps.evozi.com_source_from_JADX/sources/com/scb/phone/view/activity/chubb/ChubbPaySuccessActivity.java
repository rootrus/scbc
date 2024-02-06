package com.scb.phone.view.activity.chubb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.chubb.ChubbPaySuccessFragment;
import p040o.CycleDetector;
import p040o.ZSYR2K;

public class ChubbPaySuccessActivity extends BaseActivity {
    public void onBackPressed() {
    }

    public static Intent IconCompatParcelizer(Context context, CycleDetector.C33061 r3, String str) {
        Intent intent = new Intent(context, ChubbPaySuccessActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_SUCCESS", r3);
        intent.putExtra("EXTRA_BILL_PAYMENT_PARTNER_SUBTYPE", str);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77132131492938);
        CycleDetector.C33061 r7 = (CycleDetector.C33061) getIntent().getParcelableExtra("com.scb.phone.EXTRA_SUCCESS");
        if (r7 == null) {
            finish();
            return;
        }
        ChubbPaySuccessFragment MediaBrowserCompat$ItemReceiver = ChubbPaySuccessFragment.MediaBrowserCompat$ItemReceiver(r7);
        String stringExtra = getIntent().getStringExtra("EXTRA_BILL_PAYMENT_PARTNER_SUBTYPE");
        if (stringExtra == null) {
            stringExtra = "chubb_travel_tile";
        }
        this.scbAnalytics.write("billpay_slip", new ZSYR2K("source", "partner_api"), new ZSYR2K("subtype", stringExtra));
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, MediaBrowserCompat$ItemReceiver).write();
    }
}
