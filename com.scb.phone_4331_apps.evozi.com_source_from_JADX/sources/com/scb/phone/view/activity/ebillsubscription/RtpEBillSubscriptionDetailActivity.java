package com.scb.phone.view.activity.ebillsubscription;

import android.app.Activity;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.ebillsubscription.EBillSubscriptionDetailFragment;
import p040o.AlertController$RecycleListView;
import p040o.access$1600;

public class RtpEBillSubscriptionDetailActivity extends BaseActivity {
    private EBillSubscriptionDetailFragment MediaBrowserCompat$MediaItem;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77652131492990);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        if (getIntent().getParcelableExtra("com.scb.phone.EXTRA_EBILL_SUBSCRIPTION_ITEM_DISPLAY") != null) {
            this.MediaBrowserCompat$MediaItem = EBillSubscriptionDetailFragment.MediaBrowserCompat$CustomActionResultReceiver((access$1600) getIntent().getParcelableExtra("com.scb.phone.EXTRA_EBILL_SUBSCRIPTION_ITEM_DISPLAY"));
        } else {
            finish();
        }
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_container, this.MediaBrowserCompat$MediaItem).write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.rtp_ebill_subscription_review_title));
    }
}
