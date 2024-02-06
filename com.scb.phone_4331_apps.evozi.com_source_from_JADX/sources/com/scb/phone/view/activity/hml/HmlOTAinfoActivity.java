package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;

public final class HmlOTAinfoActivity extends BaseActivity {
    public static final read MediaBrowserCompat$SearchResultReceiver = new read((byte) 0);

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78332131493058);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_ota_info_activity_title));
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_ota_info_activity_title));
        setTabContainer();
    }
}
