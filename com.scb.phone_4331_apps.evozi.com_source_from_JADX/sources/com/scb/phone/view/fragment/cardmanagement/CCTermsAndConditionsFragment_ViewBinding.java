package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.webkit.WebView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class CCTermsAndConditionsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CCTermsAndConditionsFragment write;

    public CCTermsAndConditionsFragment_ViewBinding(CCTermsAndConditionsFragment cCTermsAndConditionsFragment, View view) {
        super(cCTermsAndConditionsFragment, view);
        this.write = cCTermsAndConditionsFragment;
        cCTermsAndConditionsFragment.webView = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.web_view_cm_content, "field 'webView'", WebView.class);
    }

    public final void read() {
        CCTermsAndConditionsFragment cCTermsAndConditionsFragment = this.write;
        if (cCTermsAndConditionsFragment != null) {
            this.write = null;
            cCTermsAndConditionsFragment.webView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
