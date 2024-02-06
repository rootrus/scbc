package com.scb.phone.view.fragment.common;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p040o.QueueFile;

public final class PrintSlipWebFragment$MediaBrowserCompat$ItemReceiver extends WebViewClient {
    private /* synthetic */ PrintSlipWebFragment MediaBrowserCompat$CustomActionResultReceiver;

    PrintSlipWebFragment$MediaBrowserCompat$ItemReceiver(PrintSlipWebFragment printSlipWebFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = printSlipWebFragment;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.MediaBrowserCompat$CustomActionResultReceiver.write(new QueueFile());
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        PrintSlipWebFragment printSlipWebFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        Dialog dialog = printSlipWebFragment.write;
        if (dialog != null && dialog.isShowing()) {
            printSlipWebFragment.write.dismiss();
            printSlipWebFragment.write = null;
        }
    }
}
