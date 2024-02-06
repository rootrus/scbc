package com.scb.phone.view.activity.privacypolicy;

import android.view.View;
import android.webkit.WebView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class ScbPrivacyPolicyActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ScbPrivacyPolicyActivity IconCompatParcelizer;

    public ScbPrivacyPolicyActivity_ViewBinding(ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, View view) {
        super(scbPrivacyPolicyActivity, view);
        this.IconCompatParcelizer = scbPrivacyPolicyActivity;
        scbPrivacyPolicyActivity.wvPrivacyPolicy = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.wv_privacy_policy, "field 'wvPrivacyPolicy'", WebView.class);
    }

    public final void read() {
        ScbPrivacyPolicyActivity scbPrivacyPolicyActivity = this.IconCompatParcelizer;
        if (scbPrivacyPolicyActivity != null) {
            this.IconCompatParcelizer = null;
            scbPrivacyPolicyActivity.wvPrivacyPolicy = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
