package com.scb.phone.view.activity.ccrredemption.mileage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import p040o.lambda$of$1;

public class MileageAirlineMembershipDetailsActivity extends CCRBaseActivity {
    private lambda$of$1 MediaBrowserCompat$MediaItem;
    @BindView
    TextView txvRewardPoints;

    public static Intent IconCompatParcelizer(Context context, lambda$of$1 lambda_of_1) {
        Intent intent = new Intent(context, MileageAirlineMembershipDetailsActivity.class);
        intent.putExtra("MileageAirlineMembershipDetailsActivity.MILEAGE_REDEMPTION_DTO_EXTRA", lambda_of_1);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78722131493097);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$MediaItem = (lambda$of$1) getIntent().getParcelableExtra("MileageAirlineMembershipDetailsActivity.MILEAGE_REDEMPTION_DTO_EXTRA");
        MediaSessionCompat$QueueItem();
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.airline_membership_details_title));
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
        if (this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver) {
            mo13676d_("rewards_1point_airline_member_details");
        } else {
            mo13676d_("rewards_airline_member_details");
        }
    }

    public final void setStackedBackground() {
        MediaSessionCompat$QueueItem();
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.airline_membership_details_title));
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }

    private void MediaSessionCompat$QueueItem() {
        this.txvRewardPoints.setText(getString(R.string.you_have_points, new Object[]{this.MediaBrowserCompat$MediaItem.MediaMetadataCompat}));
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        this.txvRewardPoints.setTextColor(-13290951);
    }
}
