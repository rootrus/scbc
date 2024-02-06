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
import p040o.ZSYR2K;
import p040o.isEagerInDefaultApp;
import p040o.zzpf;

public class ProductDetailActivity extends CCRBaseActivity {
    private isEagerInDefaultApp MediaMetadataCompat;
    @BindView
    TextView txvRewardPoints;

    public static Intent IconCompatParcelizer(Context context, isEagerInDefaultApp iseagerindefaultapp) {
        Intent intent = new Intent(context, ProductDetailActivity.class);
        intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.ProductDetailActivity.PRODUCT_DTO_EXTRA", iseagerindefaultapp);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79452131493170);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.MediaMetadataCompat = (isEagerInDefaultApp) getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.ProductDetailActivity.PRODUCT_DTO_EXTRA");
        m2849x50fd9e4a();
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.reward_details));
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
        if (this.MediaMetadataCompat.MediaBrowserCompat$MediaItem) {
            if (this.MediaMetadataCompat.MediaSessionCompat$ResultReceiverWrapper.setHasDecor == zzpf.zza.MILEAGE) {
                this.scbAnalytics.write("rewards_1point_mileage_detail", new ZSYR2K("Airline_name", this.MediaMetadataCompat.MediaSessionCompat$ResultReceiverWrapper.MediaSessionCompat$QueueItem));
                return;
            }
            mo13676d_("rewards_1point_detail");
        } else if (this.MediaMetadataCompat.MediaSessionCompat$ResultReceiverWrapper.setHasDecor == zzpf.zza.MILEAGE) {
            this.scbAnalytics.write("rewards_mileage_detail", new ZSYR2K("Airline_name", this.MediaMetadataCompat.MediaSessionCompat$ResultReceiverWrapper.MediaSessionCompat$QueueItem));
        } else {
            mo13676d_("rewards_details");
        }
    }

    public final void setStackedBackground() {
        m2849x50fd9e4a();
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.reward_details));
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private void m2849x50fd9e4a() {
        this.txvRewardPoints.setText(getString(R.string.you_have_points, new Object[]{this.MediaMetadataCompat.MediaSessionCompat$Token}));
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        this.txvRewardPoints.setTextColor(-13290951);
    }
}
