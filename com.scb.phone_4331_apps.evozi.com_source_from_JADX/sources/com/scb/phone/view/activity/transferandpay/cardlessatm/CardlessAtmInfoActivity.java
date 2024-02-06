package com.scb.phone.view.activity.transferandpay.cardlessatm;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.AlertController$RecycleListView;

public class CardlessAtmInfoActivity extends BaseActivity {
    @BindView
    WebView mBenefitsParagraph;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f76762131492901);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.cardless_atm_title);
        this.mBenefitsParagraph.loadDataWithBaseURL((String) null, getString(R.string.cardless_atm_web_view), "text/html", "utf-8", (String) null);
        this.read.MediaBrowserCompat$CustomActionResultReceiver(true);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.cardless_atm_title);
    }
}
