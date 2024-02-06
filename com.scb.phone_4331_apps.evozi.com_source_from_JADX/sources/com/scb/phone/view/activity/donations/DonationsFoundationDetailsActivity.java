package com.scb.phone.view.activity.donations;

import android.app.Activity;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.donations.DonationsFoundationDetailsFragment;
import p040o.AlertController$RecycleListView;
import p040o.getBinaryImagesFile;

public class DonationsFoundationDetailsActivity extends BaseActivity {
    private DonationsFoundationDetailsFragment MediaMetadataCompat;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77462131492971);
        if (getIntent().getParcelableExtra("SELECTED_IMAGE_POSITION") != null) {
            this.MediaMetadataCompat = DonationsFoundationDetailsFragment.read((getBinaryImagesFile) getIntent().getParcelableExtra("SELECTED_IMAGE_POSITION"));
        } else {
            finish();
        }
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_donations_foundation_details_layout, this.MediaMetadataCompat).write();
        mo13676d_("donation_details");
    }
}
