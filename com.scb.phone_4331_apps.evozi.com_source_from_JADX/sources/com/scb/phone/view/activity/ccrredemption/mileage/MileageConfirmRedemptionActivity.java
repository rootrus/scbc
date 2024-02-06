package com.scb.phone.view.activity.ccrredemption.mileage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.cardmanagement.SaveSlipBaseActivity;
import com.scb.phone.view.fragment.ccrredemption.review.MileageRedemptionSlipFragment;
import p040o.AbstractComponentContainer;
import p040o.getScbsOnboardingProductCatalog;

public class MileageConfirmRedemptionActivity extends SaveSlipBaseActivity {
    private AbstractComponentContainer MediaBrowserCompat$MediaItem;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int mo14047x50fd9e4a() {
        return R.layout.f91542131494381;
    }

    public void onBackPressed() {
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, AbstractComponentContainer abstractComponentContainer) {
        Intent intent = new Intent(context, MileageConfirmRedemptionActivity.class);
        intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.mileage.MileageConfirmRedemptionActivity.KEY_CONFIRM_REDEMPTION_DTO", abstractComponentContainer);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78732131493098);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$MediaItem = (AbstractComponentContainer) getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.mileage.MileageConfirmRedemptionActivity.KEY_CONFIRM_REDEMPTION_DTO");
        MediaSessionCompat$QueueItem();
        if (this.MediaBrowserCompat$MediaItem.MediaMetadataCompat) {
            mo13676d_("rewards_1point_mileage_successful");
        } else {
            mo13676d_("rewards_mileage_successful");
        }
    }

    public final Object MediaSessionCompat$ResultReceiverWrapper() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final getScbsOnboardingProductCatalog MediaSessionCompat$Token() {
        return new MileageRedemptionSlipFragment();
    }
}
