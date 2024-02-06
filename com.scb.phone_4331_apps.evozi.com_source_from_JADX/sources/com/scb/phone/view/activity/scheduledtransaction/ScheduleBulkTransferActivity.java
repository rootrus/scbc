package com.scb.phone.view.activity.scheduledtransaction;

import android.app.Activity;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.scheduledtransaction.ScheduleBulkTransferFragment;
import p040o.AlertController$RecycleListView;

public class ScheduleBulkTransferActivity extends BaseActivity {
    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79832131493208);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.fragment_schedule_bulk_transfer_container, ScheduleBulkTransferFragment.MediaBrowserCompat$CustomActionResultReceiver(getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW_DISPLAY"))).write();
        super.setStackedBackground();
        setTitle(R.string.schedule_details_001);
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.schedule_details_001);
        setTabContainer();
    }
}
