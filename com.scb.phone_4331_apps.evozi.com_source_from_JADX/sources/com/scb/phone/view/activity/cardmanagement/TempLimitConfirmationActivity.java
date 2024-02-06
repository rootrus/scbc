package com.scb.phone.view.activity.cardmanagement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.FirebaseApp;

public class TempLimitConfirmationActivity extends CCRBaseActivity {
    public void onBackPressed() {
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, FirebaseApp.UserUnlockReceiver userUnlockReceiver) {
        Intent intent = new Intent(context, TempLimitConfirmationActivity.class);
        intent.putExtra("com.scb.phone.view.activity.card_management.TempLimitConfirmationActivity.KEY_TEMP_LIMIT_CONFIRMATION_DISPLAY_MODEL", userUnlockReceiver);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f80032131493228);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
    }
}
