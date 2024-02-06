package com.scb.phone.view.activity.requesttopay;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.AlertController$RecycleListView;

public class RequestToPayInfoActivity extends BaseActivity {
    @BindView
    WebView mBenefitsParagraph;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79662131493191);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.request_money_new));
        this.mBenefitsParagraph.loadDataWithBaseURL((String) null, getString(R.string.request_money_web_view_new), "text/html", "utf-8", (String) null);
        this.read.MediaBrowserCompat$CustomActionResultReceiver(true);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.request_money_new));
    }
}
