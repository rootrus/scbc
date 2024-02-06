package com.scb.phone.view.activity.investment.fundswitch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.ExecutorUtils;

public class FundSwitchReviewActivity extends BaseActivity {
    public static Intent write(Context context, ExecutorUtils.C33371 r3) {
        Intent intent = new Intent(context, FundSwitchReviewActivity.class);
        intent.putExtra("SWITCH_VERIFICATION_DETAILS", r3);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78102131493035);
    }
}
