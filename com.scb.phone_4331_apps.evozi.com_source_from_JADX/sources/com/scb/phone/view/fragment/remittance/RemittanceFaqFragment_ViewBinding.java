package com.scb.phone.view.fragment.remittance;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.webview.SCBWebView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class RemittanceFaqFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RemittanceFaqFragment MediaBrowserCompat$CustomActionResultReceiver;

    public RemittanceFaqFragment_ViewBinding(RemittanceFaqFragment remittanceFaqFragment, View view) {
        super(remittanceFaqFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = remittanceFaqFragment;
        remittanceFaqFragment.faqWebView = (SCBWebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.wv_faq, "field 'faqWebView'", SCBWebView.class);
    }

    public final void read() {
        RemittanceFaqFragment remittanceFaqFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (remittanceFaqFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            remittanceFaqFragment.faqWebView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
