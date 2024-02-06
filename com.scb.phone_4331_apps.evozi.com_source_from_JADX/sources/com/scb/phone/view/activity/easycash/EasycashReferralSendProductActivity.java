package com.scb.phone.view.activity.easycash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.easycash.EasycashReferralSendProductFragment;
import p040o.AlertController$RecycleListView;
import p040o.CrashlyticsBackgroundWorker;

public class EasycashReferralSendProductActivity extends BaseActivity {
    public static Intent write(Context context, CrashlyticsBackgroundWorker.C32131 r3) {
        Intent intent = new Intent(context, EasycashReferralSendProductActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REFERRAL", r3);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77612131492986);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        if (bundle == null) {
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, EasycashReferralSendProductFragment.read((CrashlyticsBackgroundWorker.C32131) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REFERRAL"))).write();
        }
        setStackedBackground();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        if (getIntent().getParcelableExtra("com.scb.phone.EXTRA_REFERRAL") == null || !"COMMERCIAL_LOAN".equals(((CrashlyticsBackgroundWorker.C32131) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REFERRAL")).MediaBrowserCompat$SearchResultReceiver)) {
            MediaSessionCompat$QueueItem(getString(R.string.easycash_loan_request_toolbar));
        } else {
            MediaSessionCompat$QueueItem(getString(R.string.easycash_introduction_business_loan_title));
        }
        setTabContainer();
    }

    public void onBackPressed() {
        if ("CREDIT_POWER".equals(getIntent().getStringExtra("com.scb.phone.view.activity.easycash.PRODUCT_TYPE"))) {
            EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }
}
