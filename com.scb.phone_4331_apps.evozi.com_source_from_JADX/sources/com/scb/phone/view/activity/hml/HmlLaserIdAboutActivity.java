package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;

public class HmlLaserIdAboutActivity extends BaseActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78302131493055);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.hml_laser_id_about_title));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.hml_laser_id_about_title));
    }
}
