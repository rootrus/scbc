package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountConsentActivity;

public class MwCurrentUserEwalletActivity extends BaseActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78842131493109);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.mw_current_ewallet_title);
        setTabContainer();
    }

    @OnClick
    public void onAddWalletClick() {
        AddAccountConsentActivity.IconCompatParcelizer((Context) this);
    }

    public void onBackPressed() {
        RatingCompat(false);
    }
}
