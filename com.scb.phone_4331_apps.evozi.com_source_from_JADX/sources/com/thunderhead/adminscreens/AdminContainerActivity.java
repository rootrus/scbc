package com.thunderhead.adminscreens;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import p040o.C1188xc0532a8d;
import p040o.C6554xc460715d;
import p040o.C6829x6026a3c7;
import p040o.CardView;
import p040o.FragmentBuilder_BindGiftingMoneyTransferInputFragment;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.Keep;

public class AdminContainerActivity extends AppCompatActivity {
    static {
        FragmentBuilder_BindGiftingMoneyTransferInputFragment.MediaBrowserCompat$ItemReceiver(AdminContainerActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6554xc460715d.th_activity_admin_container);
        if (!getIntent().getBooleanExtra("SET_FRAGMENT", false)) {
            CardView read = getSupportFragmentManager().read();
            if (getIntent().getStringExtra("CONTAINER_TYPE").equals("CAPTURE_TYPE")) {
                read.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_container, new AddEditCapturePointFragment());
            } else {
                read.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_container, new AddEditTrackingPointFragment());
            }
            read.write();
            getIntent().putExtra("SET_FRAGMENT", true);
        }
        overridePendingTransition(C1188xc0532a8d.th_slide_from_right, C1188xc0532a8d.th_animation_activity_empty);
        Keep B_ = mo11B_();
        if (B_ != null) {
            B_.MediaSessionCompat$QueueItem();
            B_.MediaBrowserCompat$CustomActionResultReceiver(true);
            B_.mo15750x50fd9e4a();
        }
    }

    public void onPause() {
        super.onPause();
        overridePendingTransition(C1188xc0532a8d.th_animation_activity_empty, C1188xc0532a8d.th_slide_to_right);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(C6829x6026a3c7.IconCompatParcelizer);
        onBackPressed();
        return true;
    }
}
