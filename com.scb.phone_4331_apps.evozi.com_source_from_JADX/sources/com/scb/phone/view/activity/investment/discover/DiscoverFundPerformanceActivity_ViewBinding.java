package com.scb.phone.view.activity.investment.discover;

import android.view.View;
import android.webkit.WebView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class DiscoverFundPerformanceActivity_ViewBinding extends BaseActivity_ViewBinding {
    private DiscoverFundPerformanceActivity write;

    public DiscoverFundPerformanceActivity_ViewBinding(DiscoverFundPerformanceActivity discoverFundPerformanceActivity, View view) {
        super(discoverFundPerformanceActivity, view);
        this.write = discoverFundPerformanceActivity;
        discoverFundPerformanceActivity.webView = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.web_view_performance, "field 'webView'", WebView.class);
    }

    public final void read() {
        DiscoverFundPerformanceActivity discoverFundPerformanceActivity = this.write;
        if (discoverFundPerformanceActivity != null) {
            this.write = null;
            discoverFundPerformanceActivity.webView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
