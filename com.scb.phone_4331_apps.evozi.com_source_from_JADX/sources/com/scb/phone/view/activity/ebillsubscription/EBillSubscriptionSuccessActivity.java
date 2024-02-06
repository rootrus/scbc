package com.scb.phone.view.activity.ebillsubscription;

import android.app.Activity;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.ebillsubscription.EBillSubscriptionSuccessFragment;
import p040o.AlertController$RecycleListView;
import p040o.CrashlyticsReport;
import p040o.getUuidUtf8Bytes;

public class EBillSubscriptionSuccessActivity extends BaseActivity {
    private EBillSubscriptionSuccessFragment MediaBrowserCompat$MediaItem;

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77692131492994);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) getIntent().getParcelableExtra("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY");
        getUuidUtf8Bytes getuuidutf8bytes = (getUuidUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_SUCCESS");
        if (execution == null || getuuidutf8bytes == null) {
            finish();
        } else {
            this.MediaBrowserCompat$MediaItem = EBillSubscriptionSuccessFragment.read(execution, getuuidutf8bytes);
        }
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_container, this.MediaBrowserCompat$MediaItem).write();
    }
}
