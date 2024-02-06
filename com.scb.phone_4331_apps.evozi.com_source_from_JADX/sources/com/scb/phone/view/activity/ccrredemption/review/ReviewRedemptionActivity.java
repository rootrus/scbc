package com.scb.phone.view.activity.ccrredemption.review;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.lambda$intoSet$2;

public class ReviewRedemptionActivity extends CCRBaseActivity {
    private lambda$intoSet$2 MediaBrowserCompat$SearchResultReceiver;

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, lambda$intoSet$2 lambda_intoset_2) {
        Intent intent = new Intent(context, ReviewRedemptionActivity.class);
        intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.review.ReviewRedemptionActivity.REVIEW_DTO_EXTRA", lambda_intoset_2);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79702131493195);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        setTitle(R.string.review);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
        lambda$intoSet$2 lambda_intoset_2 = (lambda$intoSet$2) getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.review.ReviewRedemptionActivity.REVIEW_DTO_EXTRA");
        this.MediaBrowserCompat$SearchResultReceiver = lambda_intoset_2;
        if (lambda_intoset_2.MediaSessionCompat$Token) {
            mo13676d_("rewards_1point_review");
        } else if (!this.MediaBrowserCompat$SearchResultReceiver.f2885x50fd9e4a) {
            mo13676d_("rewards_review");
        } else if (this.MediaBrowserCompat$SearchResultReceiver.PlaybackStateCompat) {
            mo13676d_("rewards_1point_renew_review");
        } else {
            mo13676d_("rewards_1point_register_review");
        }
    }

    public final void setStackedBackground() {
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        setTitle(R.string.review);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }
}
