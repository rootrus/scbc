package com.scb.phone.view.activity.ebillsubscription;

import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.ebillsubscription.EbillSubscriptionReviewFragment;
import p040o.CrashlyticsReport;
import p040o.setUuidFromUtf8Bytes;

public class EBillSubscriptionReviewActivity extends BaseActivity {
    private EbillSubscriptionReviewFragment MediaBrowserCompat$MediaItem;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77672131492992);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) getIntent().getParcelableExtra("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY");
        setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW");
        if (execution == null || setuuidfromutf8bytes == null) {
            finish();
        } else {
            this.MediaBrowserCompat$MediaItem = EbillSubscriptionReviewFragment.MediaBrowserCompat$CustomActionResultReceiver(execution, setuuidfromutf8bytes);
        }
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_container, this.MediaBrowserCompat$MediaItem).write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.rtp_ebill_subscription_review_title));
    }
}
