package com.scb.phone.view.activity.investment.funddetails;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.doBackgroundInitializationAsync;

public class InvestmentFundDetailsActivity extends BaseActivity {
    public static Intent read(Context context, doBackgroundInitializationAsync dobackgroundinitializationasync, int i) {
        Intent intent = new Intent(context, InvestmentFundDetailsActivity.class);
        intent.putExtra("INVESTMENT_DETAILS_CLIENT", dobackgroundinitializationasync);
        intent.putExtra("SELECTED_CLIENT_LIST_POSITION", 0);
        intent.putExtra("SELECTED_FUND_LIST_POSITION", i);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78452131493070);
    }
}
