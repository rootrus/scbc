package com.scb.phone.view.fragment.landingpage;

import android.view.View;
import android.webkit.WebView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class PartnerWebViewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PartnerWebViewFragment MediaBrowserCompat$ItemReceiver;

    public PartnerWebViewFragment_ViewBinding(PartnerWebViewFragment partnerWebViewFragment, View view) {
        super(partnerWebViewFragment, view);
        this.MediaBrowserCompat$ItemReceiver = partnerWebViewFragment;
        partnerWebViewFragment.mBaseWebView = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.base_webview, "field 'mBaseWebView'", WebView.class);
        partnerWebViewFragment.eKycFab = (FloatingActionButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fab, "field 'eKycFab'", FloatingActionButton.class);
    }

    public final void read() {
        PartnerWebViewFragment partnerWebViewFragment = this.MediaBrowserCompat$ItemReceiver;
        if (partnerWebViewFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            partnerWebViewFragment.mBaseWebView = null;
            partnerWebViewFragment.eKycFab = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
