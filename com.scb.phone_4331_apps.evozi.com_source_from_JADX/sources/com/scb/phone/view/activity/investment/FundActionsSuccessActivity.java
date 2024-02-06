package com.scb.phone.view.activity.investment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.checkForPreviousCrash;

public class FundActionsSuccessActivity extends BaseActivity {
    public void onBackPressed() {
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, checkForPreviousCrash checkforpreviouscrash) {
        Intent intent = new Intent(context, FundActionsSuccessActivity.class);
        intent.putExtra("com.scb.phone.ARGS_SUCCESS_DATA", checkforpreviouscrash);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78072131493032);
    }
}
