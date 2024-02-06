package com.scb.phone.view.activity.ccrredemption.mileage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import p040o.lambda$of$1;

public class MileageReviewRedemptionActivity extends CCRBaseActivity {
    private lambda$of$1 MediaMetadataCompat;

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, lambda$of$1 lambda_of_1) {
        Intent intent = new Intent(context, MileageReviewRedemptionActivity.class);
        intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.mileage.MileageReviewRedemptionActivity.KEY_MILEAGE_REDEMPTION_DTO", lambda_of_1);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78752131493100);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.review));
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
        lambda$of$1 lambda_of_1 = (lambda$of$1) getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.mileage.MileageReviewRedemptionActivity.KEY_MILEAGE_REDEMPTION_DTO");
        this.MediaMetadataCompat = lambda_of_1;
        if (lambda_of_1.MediaBrowserCompat$ItemReceiver) {
            mo13676d_("rewards_1point_mileage_review");
        } else {
            mo13676d_("rewards_mileage_review");
        }
    }

    public final void setStackedBackground() {
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.review));
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }
}
