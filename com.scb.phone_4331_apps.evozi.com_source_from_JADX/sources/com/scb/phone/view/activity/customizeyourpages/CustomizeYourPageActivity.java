package com.scb.phone.view.activity.customizeyourpages;

import android.app.Activity;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.customizeyourpages.CustomizeYourPageFragment;
import p040o.AlertController$RecycleListView;

public class CustomizeYourPageActivity extends BaseActivity {
    private CustomizeYourPageFragment MediaBrowserCompat$SearchResultReceiver;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77222131492947);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.title_activity_customize_your_pages));
        this.MediaBrowserCompat$SearchResultReceiver = new CustomizeYourPageFragment();
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, this.MediaBrowserCompat$SearchResultReceiver).write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.title_activity_customize_your_pages));
    }
}
