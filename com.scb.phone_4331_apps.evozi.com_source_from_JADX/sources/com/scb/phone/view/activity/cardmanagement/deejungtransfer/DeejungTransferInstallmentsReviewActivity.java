package com.scb.phone.view.activity.cardmanagement.deejungtransfer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.ZSYR2K;
import p040o.registerAnalyticsConnectorListener;

public class DeejungTransferInstallmentsReviewActivity extends BaseActivity {
    public static Intent IconCompatParcelizer(Context context, registerAnalyticsConnectorListener registeranalyticsconnectorlistener) {
        Intent intent = new Intent(context, DeejungTransferInstallmentsReviewActivity.class);
        intent.putExtra("com.scb.phone.view.activity.card_management.DeejungTransferInstallmentsSummaryFragment.KEY_TRANSFER_INSTALLMENTS_SUMMARY_DISPLAY_MODEL", registeranalyticsconnectorlistener);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f80202131493245);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        setTitle(R.string.review);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
        this.scbAnalytics.write("deejung_transfer_review", new ZSYR2K("option", "installment"));
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
