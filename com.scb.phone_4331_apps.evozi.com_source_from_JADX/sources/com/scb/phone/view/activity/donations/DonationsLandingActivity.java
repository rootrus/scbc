package com.scb.phone.view.activity.donations;

import android.app.Activity;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.donations.DonationsLandingFragment;
import p040o.AlertController$RecycleListView;

public class DonationsLandingActivity extends BaseActivity {
    private DonationsLandingFragment MediaDescriptionCompat;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77472131492972);
        this.MediaDescriptionCompat = DonationsLandingFragment.IconCompatParcelizer();
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_donations_landing_layout, this.MediaDescriptionCompat).write();
    }
}
