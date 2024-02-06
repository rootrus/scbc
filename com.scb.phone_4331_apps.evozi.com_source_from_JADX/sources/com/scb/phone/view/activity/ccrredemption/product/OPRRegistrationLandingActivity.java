package com.scb.phone.view.activity.ccrredemption.product;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.ComponentContainer;
import p040o.ZSYR2K;

public class OPRRegistrationLandingActivity extends CCRBaseActivity {
    private ComponentContainer MediaBrowserCompat$MediaItem;
    @BindView
    TextView txvRewardPoints;

    public static Intent write(Context context, ComponentContainer componentContainer) {
        Intent intent = new Intent(context, OPRRegistrationLandingActivity.class);
        intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.OPRRegistrationLandingActivity.REGISTRATION_LANDING_DTO_EXTRA", componentContainer);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79132131493138);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$MediaItem = (ComponentContainer) getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.OPRRegistrationLandingActivity.REGISTRATION_LANDING_DTO_EXTRA");
        MediaSessionCompat$ResultReceiverWrapper();
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.reward_details));
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
        if (!this.MediaBrowserCompat$MediaItem.MediaSessionCompat$ResultReceiverWrapper && !this.MediaBrowserCompat$MediaItem.MediaSessionCompat$QueueItem) {
            this.scbAnalytics.write("rewards_1point_register_landing", new ZSYR2K("Source", this.MediaBrowserCompat$MediaItem.Keep));
        } else if (this.MediaBrowserCompat$MediaItem.MediaSessionCompat$QueueItem) {
            this.scbAnalytics.write("rewards_1point_renew_landing", new ZSYR2K("Source", this.MediaBrowserCompat$MediaItem.Keep));
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.scbAnalytics.write("rewards_1point_register_landing", new ZSYR2K("Product detail page", this.MediaBrowserCompat$MediaItem.Keep));
    }

    public final void setStackedBackground() {
        MediaSessionCompat$ResultReceiverWrapper();
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.reward_details));
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }

    private void MediaSessionCompat$ResultReceiverWrapper() {
        this.txvRewardPoints.setText(getString(R.string.you_have_points, new Object[]{this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver}));
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.txvRewardPoints.setTextColor(-9031231);
        this.mActionBarTitle.setTextColor(-9031231);
    }
}
