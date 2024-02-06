package com.scb.phone.view.activity.ccrredemption.mileage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import p040o.isEagerInDefaultApp;

public class MileageQuantitySelectionActivity extends CCRBaseActivity {
    private isEagerInDefaultApp MediaDescriptionCompat;
    @BindView
    TextView txvRewardPoints;

    public static Intent IconCompatParcelizer(Context context, isEagerInDefaultApp iseagerindefaultapp) {
        Intent intent = new Intent(context, MileageQuantitySelectionActivity.class);
        intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.KEY_REWARD_PRODUCT_DTO", iseagerindefaultapp);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78742131493099);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.MediaDescriptionCompat = (isEagerInDefaultApp) getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.KEY_REWARD_PRODUCT_DTO");
        m2848x50fd9e4a();
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.redeem_points_for_miles));
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
        mo13676d_("rewards_select_miles");
    }

    public final void setStackedBackground() {
        m2848x50fd9e4a();
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.redeem_points_for_miles));
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private void m2848x50fd9e4a() {
        this.txvRewardPoints.setText(getString(R.string.you_have_points, new Object[]{this.MediaDescriptionCompat.MediaSessionCompat$Token}));
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        this.txvRewardPoints.setTextColor(-13290951);
    }
}
