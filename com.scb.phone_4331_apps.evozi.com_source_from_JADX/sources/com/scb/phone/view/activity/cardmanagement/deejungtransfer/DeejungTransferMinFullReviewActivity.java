package com.scb.phone.view.activity.cardmanagement.deejungtransfer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.AnalyticsConnectorImpl;
import p040o.ZSYR2K;

public class DeejungTransferMinFullReviewActivity extends CCRBaseActivity {
    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, AnalyticsConnectorImpl analyticsConnectorImpl) {
        Intent intent = new Intent(context, DeejungTransferMinFullReviewActivity.class);
        intent.putExtra("com.scb.phone.view.activity.card_management.DeejungTransferMinFullSummaryFragment.KEY_TRANSFER_INSTALLMENT_SUMMARY_DISPLAY_MODEL", analyticsConnectorImpl);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f80222131493247);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        setTitle(R.string.review);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
        this.scbAnalytics.write("deejung_transfer_review", new ZSYR2K("option", "minorfull"));
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
