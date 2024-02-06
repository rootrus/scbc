package com.scb.phone.view.activity.landingpage;

import android.app.Activity;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.landingpage.PredictiveTilesLearnMoreFragment;
import p040o.AlertController$RecycleListView;

public class PredictiveTilesLearnMoreActivity extends BaseActivity {
    private PredictiveTilesLearnMoreFragment MediaBrowserCompat$SearchResultReceiver;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79312131493156);
        this.MediaBrowserCompat$SearchResultReceiver = PredictiveTilesLearnMoreFragment.write();
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_learn_more_layout, this.MediaBrowserCompat$SearchResultReceiver).write();
    }
}
