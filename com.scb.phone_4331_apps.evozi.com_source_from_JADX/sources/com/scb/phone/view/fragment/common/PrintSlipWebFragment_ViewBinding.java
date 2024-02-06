package com.scb.phone.view.fragment.common;

import android.view.View;
import android.webkit.WebView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class PrintSlipWebFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PrintSlipWebFragment write;

    public PrintSlipWebFragment_ViewBinding(PrintSlipWebFragment printSlipWebFragment, View view) {
        super(printSlipWebFragment, view);
        this.write = printSlipWebFragment;
        printSlipWebFragment.mWebView = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.webView, "field 'mWebView'", WebView.class);
    }

    public final void read() {
        PrintSlipWebFragment printSlipWebFragment = this.write;
        if (printSlipWebFragment != null) {
            this.write = null;
            printSlipWebFragment.mWebView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
