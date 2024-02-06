package com.scb.phone.view.activity.device;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.AlertController$RecycleListView;

public class DeviceSettingsActivity extends BaseActivity {
    public static Intent MediaBrowserCompat$ItemReceiver(Context context) {
        Intent intent = new Intent(context, DeviceSettingsActivity.class);
        intent.putExtra("EXTRA_ALLOW_DELETE_THIS_DEVICE", true);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77372131492962);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
        this.mActionBarTitle.setText(getString(R.string.device_settings));
    }
}
