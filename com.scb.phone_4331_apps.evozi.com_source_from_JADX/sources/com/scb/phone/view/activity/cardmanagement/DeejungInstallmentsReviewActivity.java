package com.scb.phone.view.activity.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import p040o.initializeApp;

public class DeejungInstallmentsReviewActivity extends CCRBaseActivity {
    public static Intent MediaBrowserCompat$ItemReceiver(Context context, initializeApp initializeapp) {
        Intent intent = new Intent(context, DeejungInstallmentsReviewActivity.class);
        intent.putExtra("com.scb.phone.view.activity.card_management.DeejungInstallmentsReviewActivity.KEY_DEEJUNG_INSTALLMENTS_REVIEW_DISPLAY_MODEL", initializeapp);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77312131492956);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        setTitle(R.string.review);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
        mo13676d_("deejung_installment_review");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.review);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }
}
