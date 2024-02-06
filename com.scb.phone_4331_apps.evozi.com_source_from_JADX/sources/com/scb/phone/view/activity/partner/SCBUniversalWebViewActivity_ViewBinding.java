package com.scb.phone.view.activity.partner;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.webview.SCBWebView;
import p040o.onStart;

public class SCBUniversalWebViewActivity_ViewBinding extends BaseActivity_ViewBinding {
    private SCBUniversalWebViewActivity MediaBrowserCompat$ItemReceiver;

    public SCBUniversalWebViewActivity_ViewBinding(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, View view) {
        super(sCBUniversalWebViewActivity, view);
        this.MediaBrowserCompat$ItemReceiver = sCBUniversalWebViewActivity;
        sCBUniversalWebViewActivity.partnerWebView = (SCBWebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.base_webview, "field 'partnerWebView'", SCBWebView.class);
    }

    public final void read() {
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.MediaBrowserCompat$ItemReceiver;
        if (sCBUniversalWebViewActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            sCBUniversalWebViewActivity.partnerWebView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
