package com.scb.phone.view.activity.justforyou;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CustomViewProgressAnimationFull;
import com.scb.phone.view.custom.webview.SCBWebView;
import p040o.onStart;

public final class JustForYouLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private JustForYouLandingActivity MediaBrowserCompat$CustomActionResultReceiver;

    public JustForYouLandingActivity_ViewBinding(JustForYouLandingActivity justForYouLandingActivity, View view) {
        super(justForYouLandingActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = justForYouLandingActivity;
        justForYouLandingActivity.webViewJustForYou = (SCBWebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.wv_content, "field 'webViewJustForYou'", SCBWebView.class);
        justForYouLandingActivity.customLoading = (CustomViewProgressAnimationFull) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_loading, "field 'customLoading'", CustomViewProgressAnimationFull.class);
    }

    public final void read() {
        JustForYouLandingActivity justForYouLandingActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (justForYouLandingActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            justForYouLandingActivity.webViewJustForYou = null;
            justForYouLandingActivity.customLoading = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
