package com.scb.phone.view.activity.ebillsubscription;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.ebillsubscription.EbillSubscriptionInputFragment;
import p040o.AlertController$RecycleListView;
import p040o.CrashlyticsReport;

public class EBillSubscriptionInputActivity extends BaseActivity {
    private EbillSubscriptionInputFragment MediaDescriptionCompat;

    public static Intent write(Context context, CrashlyticsReport.Session.Event.Application.Execution execution) {
        return new Intent(context, EBillSubscriptionInputActivity.class).putExtra("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77662131492991);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.manage_ebill_subscription_title));
        if (getIntent().getParcelableExtra("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY") != null) {
            this.MediaDescriptionCompat = EbillSubscriptionInputFragment.MediaBrowserCompat$ItemReceiver((CrashlyticsReport.Session.Event.Application.Execution) getIntent().getParcelableExtra("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY"));
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_container, this.MediaDescriptionCompat).write();
            return;
        }
        finish();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.manage_ebill_subscription_title));
    }
}
