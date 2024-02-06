package com.scb.phone.view.activity.ntb.touchpoint;

import android.view.View;
import android.webkit.WebView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class TouchPointWebViewActivity_ViewBinding extends BaseActivity_ViewBinding {
    private TouchPointWebViewActivity MediaBrowserCompat$ItemReceiver;

    public TouchPointWebViewActivity_ViewBinding(TouchPointWebViewActivity touchPointWebViewActivity, View view) {
        super(touchPointWebViewActivity, view);
        this.MediaBrowserCompat$ItemReceiver = touchPointWebViewActivity;
        touchPointWebViewActivity.webView = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.wv_touch_point, "field 'webView'", WebView.class);
    }

    public final void read() {
        TouchPointWebViewActivity touchPointWebViewActivity = this.MediaBrowserCompat$ItemReceiver;
        if (touchPointWebViewActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            touchPointWebViewActivity.webView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
