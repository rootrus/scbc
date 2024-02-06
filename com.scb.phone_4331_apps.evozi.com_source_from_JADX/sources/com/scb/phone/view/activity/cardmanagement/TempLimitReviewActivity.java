package com.scb.phone.view.activity.cardmanagement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.FirebaseNetworkException;

public class TempLimitReviewActivity extends CCRBaseActivity {
    public static Intent read(Context context, FirebaseNetworkException firebaseNetworkException) {
        Intent intent = new Intent(context, TempLimitReviewActivity.class);
        intent.putExtra("com.scb.phone.view.activity.card_management.TempLimitReviewActivity.KEY_TEMP_LIMIT_PRE_APPROVED_DTO", firebaseNetworkException);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f80052131493230);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        setTitle(R.string.review);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
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
