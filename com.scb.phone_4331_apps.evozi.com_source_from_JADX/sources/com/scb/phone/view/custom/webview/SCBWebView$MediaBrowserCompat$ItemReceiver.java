package com.scb.phone.view.custom.webview;

import android.webkit.ValueCallback;
import p040o.FragmentBuilder_BindEasycashLandingEmptyFragment;

public final class SCBWebView$MediaBrowserCompat$ItemReceiver implements Runnable {
    private /* synthetic */ SCBWebView IconCompatParcelizer;
    private /* synthetic */ FragmentBuilder_BindEasycashLandingEmptyFragment MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ String read;

    public SCBWebView$MediaBrowserCompat$ItemReceiver(SCBWebView sCBWebView, String str, FragmentBuilder_BindEasycashLandingEmptyFragment fragmentBuilder_BindEasycashLandingEmptyFragment) {
        this.IconCompatParcelizer = sCBWebView;
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindEasycashLandingEmptyFragment;
    }

    public final void run() {
        String read2 = this.read.length() == 0 ? this.MediaBrowserCompat$ItemReceiver.read() : null;
        if (read2 == null) {
            read2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.read);
        }
        this.IconCompatParcelizer.evaluateJavascript(read2, (ValueCallback) null);
    }
}
