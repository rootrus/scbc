package com.scb.phone.view.activity.requesttopay;

import android.app.Activity;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.requesttopay.InputDetailsFragment;
import p040o.AlertController$RecycleListView;

public class InputDetailsActivity extends BaseActivity {
    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79782131493203);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_rtp_input_details_layout, InputDetailsFragment.write(getIntent())).write();
    }
}
