package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import butterknife.ButterKnife;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.hml.HmlUserInfoFragment;

public class HmlUserInfoActivity extends BaseActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79092131493134);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.content_layout, HmlUserInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(getIntent().getBooleanExtra("COMES_FROM_DEMO", false))).write();
        setStackedBackground();
        MediaSessionCompat$QueueItem((String) null);
        setTabContainer();
        if (mo11B_() != null) {
            mo11B_().MediaBrowserCompat$CustomActionResultReceiver((float) BitmapDescriptorFactory.HUE_RED);
        }
    }
}
